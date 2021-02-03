
public class Cuenta {

	String titular;
	double cantidadCuenta;
	
	Cuenta(){
		this.titular=null;
		this.cantidadCuenta=0.0;
	}
	
	Cuenta(String ti,double ca){
		this.titular=ti;
		this.cantidadCuenta=ca;
	}
	
	public String toString() {
		return ("El titular "+this.titular+" tiene "+this.cantidadCuenta);
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidadCuenta() {
		return this.cantidadCuenta;
	}

	public void santidadCuenta(double cantidadCuenta) {
		this.cantidadCuenta = cantidadCuenta;
	}
	
	public static double ingresar(double cantidadCuenta, double cantidad) {
		if (cantidad>0) {
			cantidadCuenta=cantidadCuenta+cantidad;
		}
		
		return cantidadCuenta;
	}
	public static double retirar(double cantidadCuenta, double cantidad) {
		if ((cantidadCuenta-cantidad)<0) {
			cantidadCuenta=0;
		}else {
			cantidadCuenta=cantidadCuenta-cantidad;
		}
		return cantidadCuenta;
	}
	
	
}
