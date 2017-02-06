package ejercicio3;
import ejercicio1.Complejo;
import java.util.Scanner;

public class Rectangulo {
	private Complejo infizq;
	private Complejo infder;
	private Complejo supizq;
	private Complejo supder;
	
	public Rectangulo(Complejo infizq,Complejo infder,Complejo supder,Complejo supizq){
		this.infizq = infizq;
		this.infder = infder;
		this.supder = supder;
		this.supizq = supizq;
	}
	
	public Rectangulo(double base, double altura){
		this.infizq = new Complejo(0,0);
		this.infder = new Complejo(0,base);
		this.supder = new Complejo(altura,base);
		this.supizq = new Complejo(altura,0);
	}
	
	public double area(){
		return (supder.getReal()-infizq.getImaginario()*supder.getImaginario()-infizq.getReal());
	}
	
	public void desplazar(Complejo desplazar){
		this.infder = desplazar.suma(this.infder);
		this.infizq = desplazar.suma(this.infizq);
		this.supder = desplazar.suma(this.supder);
		this.supizq = desplazar.suma(this.supizq);
	}
}
