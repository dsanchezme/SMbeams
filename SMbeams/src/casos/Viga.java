
package casos;
/**
 * Viga generica, de la cual heredaran todos los casos particulares
 * @author USUARIO
 *
 */
public class Viga {
	/**
	 * Longitud de la viga entre los apoyos extremos
	 */
    public double L;
    public double fpc;
    public double fy;
    public double b;
    public double h;

    public Viga() {
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }
        
    public double getFpc() {
		return fpc;
	}

	public void setFpc(double fpc) {
		this.fpc = fpc;
	}

	public double getFy() {
		return fy;
	}

	public void setFy(double fy) {
		this.fy = fy;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	/**
     * Encuentra el valor de las reacciones en cada uno de sus apoyos
     */
    public double[] reacciones(){
    	double r[] = {};
    	return r;
    }
   /**
    * Calcula el valor del cortante para la viga en un punto dado
    * @param x la distancia desde el apoyo izquierdo donde se desea calcular el cortante
    * @return El valor de cortante en el punto x
    */
    public double cortante(double x){
        double v = 0;
        return v;
    }
    /**
     * Calcula el valor del cortante maximo para a viga dada
     * @return El valor del cortante maximo
     */
    
    public double cortMax(){
        double vm = 0;
        return vm;
    }
    
    //Crear y sobreescribir los metodos para momento y momento maximo y flexion y flexion maxima
    
    
}
