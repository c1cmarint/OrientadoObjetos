package ejercicio5;
import miLibreria.Entrada;
public class Cuenta {
	
	private int numcuenta;
	private int DNI;
	private double saldo;
	private double intereses;
	public int contcuenta=0;
	
	public Cuenta(){
		numcuenta = 100001+contcuenta;
		contcuenta++;
		DNI = 0;
		saldo = 0;
		intereses = 0;
	}
	
	public Cuenta(int DNI,double saldo,double intereses){
		this.DNI = DNI;
		this.saldo = saldo;
		this.intereses = intereses;
	}
	
	public void setDNI(int DNI){
		this.DNI = DNI;
	}
	
	public void setSaldo(double saldo){
		this.saldo= saldo;
	}
	
	public void setIntereses(double intereses){
		this.intereses=intereses;
	}
	
	public int getNumCuenta(){
		return numcuenta;
	}
	
	public int getDNI(){
		return DNI;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public double getIntereses(){
		return intereses;
	}
	
	public double actualizarSaldo(){
		return this.saldo=((this.saldo*this.intereses)/100)/365;
	}
	
	public double ingresar(double ingresar){
		
		return this.saldo=this.saldo + ingresar;
	}
	
	public double retirar(double retirar){
		
		if(this.saldo>0){
			this.saldo=this.saldo - retirar;
		}
		return this.saldo;
	}
	
	public String toString(){
		return "Datos de la cuenta\n" +
				"-------------------------------------"+ "\n"+
				"Numer de cuenta: " + this.numcuenta + "\n" +
				"DNI " + this.DNI + "\n" +
				"Saldo: " + this.saldo + "\n" +
				"Intereses: " + this.intereses;
	}
}
