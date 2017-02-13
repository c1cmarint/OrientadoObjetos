package ejercicioherencia;

public abstract class Tarjeta {

	protected int numtarjeta;
	protected Persona titular;	
	protected Cuenta cuenta;
	
	public Tarjeta(int numtarjeta,Persona titular,Cuenta cuenta){
		this.numtarjeta=numtarjeta;
		this.titular = titular;
		this.cuenta=cuenta;
	}
	
	public void setNumtarjeta(int numtarjeta){
		this.numtarjeta=numtarjeta;
	}
	
	public void setTitular(Persona titular){
		this.titular=titular;
	}
	
	public void setCuenta(Cuenta cuenta){
		this.cuenta=cuenta;
	}
	
	public int getNumTarjeta(){
		return numtarjeta;
	}
	
	public Persona getTitular(){
		return titular;
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
}
