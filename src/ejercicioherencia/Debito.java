package ejercicioherencia;

public class Debito extends Tarjeta{
	protected double cuota;
	
	public Debito(int numtarjeta,Persona titular,Cuenta cuenta,double cuota){
		super(numtarjeta, titular,cuenta);
		this.cuota = cuota;
	}
	
	public void setCuota(double cuota){
		this.cuota=cuota;
	}
	
	public double getCuota(){
		return cuota;
	}
	
	public void cuotaTarjeta(){
		this.cuenta.ingresar(cuota);
	}
	
	public String toString(){
		return 	"              Datos tarjeta(Debito)                 " + "\n" +
				"-----------------------------------------------" + "\n" +
				"Numero de tarjeta: " + this.numtarjeta + "\n" + 
				"Titular: " + this.titular + "\n" + 
				"Saldo: " + this.cuenta.getSaldo();
	}
}
