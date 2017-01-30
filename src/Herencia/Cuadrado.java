package Herencia;

public class Cuadrado extends Figura{
	
	private double lado;

	
	public Cuadrado(double b){
		
		lado= b;
		
		numeroDeLados=4;
		numeroDeFiguras++;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public String toString(){
		return "Valores del Triángulo\n" +
				"-----------------------"+ "\n" +
				"Lado " + lado + "\n" +
				"Area " + area() + "\n" +
				"Numero de Lados= " + numeroDeLados + "\n" +
				"Figuras Totales= " + numeroDeFiguras;
	}
}
