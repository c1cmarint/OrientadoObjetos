package ejercicio1;

public class Complejo {
	private float real;
	private float imaginario;
	
	public Complejo(){
		real=0;
		imaginario=0;
	}
	
	public Complejo(float real,float imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}
	
	public void setReal(float real){
		this.real=real;
	}
	
	public void setImaginario(float imaginario){
		this.imaginario=imaginario;
	}
	
	public float getReal(){
		return real;
	}
	
	public float getImaginario(){
		return imaginario;
	}
	
	
	public Complejo suma(Complejo numero){
		float sumareal,sumaimaginario;
		sumareal=this.real+numero.getReal();
		sumaimaginario=this.imaginario+numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo resta(Complejo numero){
		float sumareal,sumaimaginario;
		sumareal=this.real-numero.getReal();
		sumaimaginario=this.imaginario-numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo multiplicacion(Complejo numero){
		float sumareal,sumaimaginario;
		sumareal=this.real*numero.getReal();
		sumaimaginario=this.imaginario*numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public Complejo division(Complejo numero){
		float sumareal,sumaimaginario;
		sumareal=this.real/numero.getReal();
		sumaimaginario=this.imaginario/numero.getImaginario();
		
		return new Complejo(sumareal,sumaimaginario);
	}
	
	public void print(){
		System.out.println("La parte real es " + this.real + " y la imaginaria " + this.imaginario);
	}
}
