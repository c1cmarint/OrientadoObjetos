package ejercicio3;
import ejercicio1.Complejo;
import java.util.Scanner;

public class Rectangulo {
	private Complejo infizq;
	private Complejo infder;
	private Complejo supizq;
	private Complejo supder;
	
	public Rectangulo(){
		infizq = new Complejo(0.0f,0.0f);
		infder = new Complejo(0.0f,0.0f);
		supder = new Complejo(0.0f,0.0f);
		supizq = new Complejo(0.0f,0.0f);
	}
	
	public Rectangulo(Complejo infizq,Complejo infder,Complejo supder,Complejo supizq){
		this.infizq = infizq;
		this.infder = infder;
		this.supder = supder;
		this.supizq = supizq;
	}
	
	public float superficie(){
		float superficie;
		superficie=supder.getReal()*infder.getReal();
		return superficie;
	}
	
	public void desplazar(){
		Scanner entrada = new Scanner(System.in);
		
		
	}
}
