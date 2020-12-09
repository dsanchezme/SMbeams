/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos;
/**
 * Viga simplemente apoyada en sus extremos con una carga puntual generica aplicada
 * @author SM
 *
 */

public class Puntual extends Viga{
	/**
	 * Distancia desde el apoyo izquierdo hasta la carga puntual
	 */
    public double aa;
    /**
     * Distancia desde la carga puntual hasta el apoyo derecho 
     */
    public double bb;
    /**
     * Valor de la carga puntual aplicada en la viga
     */
    public double F;
    /**
     * Valor de la reaccion en el apoyo izquierdo
     */
    public double Ra;
    /**
     * Valor de la reaccion en el apoyo derecho
     */
    private double Rb;

	public Puntual() {
		super();
	}
	
	public double getAa() {
		return aa;
	}



	public void setAa(double aa) {
		this.aa = aa;
	}



	public double getBb() {
		return bb;
	}



	public void setBb(double bb) {
		this.bb = bb;
	}



	public double getF() {
		return F;
	}



	public void setF(double f) {
		F = f;
	}



	public double getRa() {
		return Ra;
	}



	public void setRa(double ra) {
		Ra = ra;
	}



	public double getRb() {
		return Rb;
	}



	public void setRb(double rb) {
		Rb = rb;
	}



	@Override
    public double[] reacciones() {
        super.reacciones(); //To change body of generated methods, choose Tools | Templates.
        Ra = F*bb/L;
        Rb = F*aa/L;
        double R[] = {Ra,Rb};
		return R;
    }

    @Override
    public double cortante(double x) {
        super.cortante(x); //To change body of generated methods, choose Tools | Templates.
        double v;
        if (x<=aa){
            v = F * bb / L; 
        }else{
            v = -F * aa / L;
        }
        
        return v;
    }

    @Override
    public double cortMax() {
        super.cortMax();
        double vmax;
        if (Ra>Rb){
            vmax = Ra; 
        }else{
            vmax = Rb;
        }
        return vmax;
    }
    /**
     * Cacula la deflexion en el punto x dado
     */
    public double deflPuntual(double x) {
    	double d;
    	if (x<aa) 
    		d = (F*L*bb*x/6) * (1-(bb*bb/(L*L))-(x*x/(L*L)));
    	else
    		d = (F*L*aa*(L-x)/6)*(1-(aa*aa/(L*L))-(L-x)*(L-x)/(L*L));
		return d;    	
    }
}
