
package smbeams;

import java.util.ArrayList;

public class SMbeams {      
       
    public static ArrayList<Double> resolver(ArrayList<Double> apoyos,ArrayList<Double> cargaPos,ArrayList<Double> cargaVal) {
    	
    	Reaccion reac = new Reaccion();
    	
        reac.apoyos = apoyos;
        reac.cargaPos = cargaPos;
        reac.cargaVal = cargaVal;
    	
    	ArrayList<Double> defCBT = reac.deflexPuntual();
        ArrayList<ArrayList<Double>> Q = reac.factoresQ();
        ArrayList<Double> defCB = new ArrayList<>(); 
        
        for (int i = 0;i<defCBT.size()-2;i++) {
        	defCB.add(defCBT.get(i+1));
        }
        	
        
        double[][] m = new double[defCB.size()][defCB.size()];
        double[] r = new double[defCB.size()];
        
        for (int i = 0; i< defCB.size();i++) {
        	for (int j = 0;j<defCB.size();j++) {
        		m[i][j] = Q.get(j).get(i);
        	}
        	r[i] = -defCB.get(i);       	
        }
        ArrayList<Double> reacciones = reac.solucionRint(m, r);
        
		return reacciones;
    }

    
}
