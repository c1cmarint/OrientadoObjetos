package ejercicioherencia;

public class Debito extends Tarjeta{
	
	public Debito(int numtarjeta,Persona titular,Cuenta cuenta){
		super(numtarjeta, titular,cuenta);
		this.numtarjeta=numtarjeta;
		this.titular=titular;
		this.cuenta=cuenta;
	}
	
	public void pagoDebito(double pago){
		if(pago<=this.cuenta.getSaldo()){
			this.cuenta.retirar(pago);
		}else{
			System.out.println("No hay suficiente dinero.");
		}
	}
	
	public void cuotaAnual(){
		
	}
	
	public String toString(){
		return "Numero de tarjeta: " + this.numtarjeta + "\n" + 
				"Titular: " + this.titular + "\n" + 
				"Saldo: " + this.cuenta.getSaldo();
	}
}
