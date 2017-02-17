package ejercicioherencia;

public class Credito extends Tarjeta{
	private double limite;
	
	public Credito(int numtarjeta,Persona titular,Cuenta cuenta,double limite){
		super(numtarjeta, titular,cuenta);
		this.limite=limite;
	}
	
	public void setLimite(double limite){
		this.limite=limite;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void pagoCredito(double pago){
		if(pago<=this.limite){
			this.cuenta.retirar(pago);
		}else{
			System.out.println("Has superado el límite de crédito y no se puede efectuar el pago.");
		}
	}
	
	public String toString(){
		return 	"              Datos tarjeta(Credito)                 " + "\n" +
				"-----------------------------------------------" + "\n" +
				"Numero de tarjeta: " + this.numtarjeta + "\n" + 
				"Titular: " + this.titular + "\n" + 
				"Saldo: " + this.cuenta.getSaldo();
	}
}
