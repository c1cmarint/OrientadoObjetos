package ejercicioherencia;

public class Credito extends Tarjeta{
	
	public Credito(int numtarjeta,Persona titular,Cuenta cuenta){
		super(numtarjeta, titular,cuenta);
		this.numtarjeta=numtarjeta;
		this.titular=titular;
		this.cuenta=cuenta;
	}
	
	public String toString(){
		return "Numero de tarjeta: " + this.numtarjeta + "\n" + 
				"Titular: " + this.titular + "\n";
	}
}
