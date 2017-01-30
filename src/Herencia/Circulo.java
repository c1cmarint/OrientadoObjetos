package Herencia;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(double r){
		
		radio= r;
		
		numeroDeLados=1;
		numeroDeFiguras++;
	}
	
	public double area(){
		return 3.14*radio*radio;
	}
	
	public double perimetro(){
		return 2*3.14*radio;
	}
	
	public String toString(){
		return "Valores del Rectángulo\n" +
				"-----------------------"+ "\n"+
				"Radio " + radio + "\n" +
				"Area " + area() + "\n" +
				"Perimetro " + perimetro() + "\n" +
				"Numero de Lados= " + numeroDeLados + "\n" +
				"Figuras Totales= " + numeroDeFiguras;
	}
}
