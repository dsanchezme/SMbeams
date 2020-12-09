package smbeams;

import java.util.ArrayList;

import casos.Puntual;

public class Reaccion {
	/**
	 * Contiene las posiciones en la que se tiene apoyos, incluyendo los bordes
	 */
	ArrayList<Double> apoyos = new ArrayList<>();
	/**
	 * Contiene las posiciones en las que se tienen cargas concentradas
	 */
	ArrayList<Double> cargaPos = new ArrayList<>();
	/**
	 * Contiene el valor de las cargas en orden
	 */
	ArrayList<Double> cargaVal = new ArrayList<>();
	/**
	 * Contiene las reacciones en los apoyos extremos
	 */
	double[] reacExt = {(double)0,(double)0};
	
	/**
	 * Encuentra la deflexion en cada punto de interes (donde hay apoyos) por las cargas puntuales aplicadas. Al tiempo calcula el aporte de carga carga a las reacciones extremas
	 */
	public ArrayList<Double> deflexPuntual() {
		//Debe retornar un arreglo con la deflexion en cada punto dada por el caso base
		ArrayList<Double> deflexionCB = new ArrayList<>();
		for (int j = 0; j<apoyos.size() ; j++) {
			deflexionCB.add((double) 0); 
		}
		Puntual viga = new Puntual();
		viga.setL(apoyos.get(apoyos.size()-1));
		for (int i = 0 ; i < cargaVal.size() ; i++) {
			viga.setAa(cargaPos.get(i));
			viga.setBb(viga.getL()-cargaPos.get(i));
			viga.setF(cargaVal.get(i));
			for (int j = 1; j<apoyos.size() - 1 ; j++) {
				deflexionCB.set(j,deflexionCB.get(j) + viga.deflPuntual(apoyos.get(j)));
			}
			//Calcular el aporte de la carga a la reaccion en cada apoyo extremo
			reacExt[0] = reacExt[0] + viga.reacciones()[0];
			reacExt[1] = reacExt[1] + viga.reacciones()[1];
		}
		return deflexionCB;		
	}
	/**
	 * Calcula los coeficientes Q de la superposicion para encontrar las reacciones internas
	 * @return la matriz del sistema de ecuaciones
	 */
	public ArrayList<ArrayList<Double>> factoresQ(){
		ArrayList<ArrayList<Double>> Q = new ArrayList<ArrayList<Double>>();
		Puntual viga = new Puntual();
		viga.setL(apoyos.get(apoyos.size()-1));
		viga.setF(-1);
		for (int i = 1;i<apoyos.size()-1;i++) {
			viga.setAa(apoyos.get(i));
			viga.setBb(viga.getL()-viga.getAa());
			ArrayList<Double> temp = new ArrayList<>();
			for (int j = 1;j<apoyos.size()-1;j++) {
				temp.add(viga.deflPuntual(apoyos.get(j)));
			}
			Q.add(temp);
			
		}
		return Q;
	}
	
	/**
	 * Calcula las reacciones para los apoyos internos. El algoritmo fue adaptado de: https://es.scribd.com/doc/34853795/Metodos-para-la-solucion-de-Sistemas-de-Ecuaciones-lineales-en-Java
	 * @param m es la matriz que contiene los coeficientes Q de la solucion
	 * @param r el vector de terminos independientes que contiene la deformacion asociada a las cargas externas
	 * @return el vector de las reacciones en los apoyos internos
	 */
	public ArrayList<Double> solucionRint(double[][] m, double[] r){
		ArrayList<Double> reacciones = new ArrayList<>();
		int n = m.length;
		int i,s, x, y;
		double d, c;
		
		for (i = 0; i <= n - 1; i++) {
			d = m[i][i];
			for (s = 0; s <= n - 1; s++) {
				m[i][s] = ((m[i][s]) / d);
			}
			r[i] = ((r[i]) / d);
			for (x = 0; x <= n - 1; x++) {
				if (i != x) {
					c = m[x][i];
					for (y = 0; y <= n - 1; y++) {
						m[x][y] = m[x][y] - c * m[i][y];

					}
					r[x] = r[x] - c * r[i];
				}
			}
		}
		for (i = 0; i <= n - 1; i++) {
			reacciones.add(r[i]);
		}
		
		Puntual viga = new Puntual();
		viga.setL(apoyos.get(apoyos.size()-1));
		for ( i = 1;i<apoyos.size()-1;i++) {
			viga.setAa(apoyos.get(i));
			viga.setBb(viga.getL()-viga.getAa());
			viga.setF(reacciones.get(i-1));		
			//Calcular el aporte de cada apoyo interno a la reaccion en cada apoyo extremp
			reacExt[0] = reacExt[0] - viga.reacciones()[0];
			reacExt[1] = reacExt[1] - viga.reacciones()[1];
			
		}
		
		reacciones.add(0,reacExt[0]);
		reacciones.add(reacExt[1]);
		
		return reacciones;
	}
	
	//Crear pagina de inicio
	//Generar ejercicios fáciles para validacion
		
}
