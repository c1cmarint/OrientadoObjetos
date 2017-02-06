package ejercicio1;

public class Complejo {
	private double real;
	private double imaginario;
	
	public Complejo(){
		real=0;
		imaginario=0;
	}
	
	public Complejo(double real,double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}
	
	public void setReal(double real){
		this.real=real;
	}
	
	public void setImaginario(double imaginario){
		this.imaginario=imaginario;
	}
	
	public double getReal(){
		return real;
	}
	
	public double getImaginario(){
		return imaginario;
	}
	
	
	public Complejo suma(Complejo numero){
		double sumareal,sumaimaginario;
		sumareal=this.real+numero.getReal();
		sumaimaginario=this.imaginario+numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo resta(Complejo numero){
		double sumareal,sumaimaginario;
		sumareal=this.real-numero.getReal();
		sumaimaginario=this.imaginario-numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo multiplicacion(Complejo numero){
		double sumareal,sumaimaginario;
		sumareal=this.real*numero.getReal();
		sumaimaginario=this.imaginario*numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo division(Complejo numero){
		double sumareal,sumaimaginario;
		sumareal=this.real/numero.getReal();
		sumaimaginario=this.imaginario/numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public void print(){
		System.out.println("La parte real es " + this.real + " y la imaginaria " + this.imaginario);
	}
}
