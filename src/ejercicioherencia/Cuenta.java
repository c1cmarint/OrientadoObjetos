package ejercicioherencia;

public class Cuenta {
	
	private int numcuenta;
	private double saldo;
	private Persona titular;
	
	public Cuenta(){
		numcuenta = 0;
		saldo = 0;
		titular=new Persona();
	}
	
	public Cuenta(double saldo,String nombre){
		this.saldo = saldo;
		this.titular=new Persona(nombre);
		
	}
	
	
	public void setSaldo(double saldo){
		this.saldo= saldo;
	}
	
	public int getNumCuenta(){
		return numcuenta;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void ingresar(double ingresar){
		
		this.saldo=this.saldo + ingresar;
	}
	
	public void retirar(double retirar){
		this.saldo-=retirar;
		
	}
	
	public String toString(){
		return "Datos de la cuenta\n" +
				"-------------------------------------"+ "\n"+
				"Numero de cuenta: " + this.numcuenta + "\n" +
				"Titular: " + this.titular + "\n" +
				"Saldo: " + this.saldo + "\n" ;
				
	}
}
