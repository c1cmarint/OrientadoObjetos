package Herencia;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;

	
	public Rectangulo(double b,double a){
		
		base= b;
		altura= a;
		longitudDeLado=base;
		numeroDeLados=4;
		numeroDeFiguras++;
	}
	
	public double area(){
		return base*altura;
	}
	
	public String toString(){
		return "Valores del Rectángulo\n" +
				"-----------------------"+ "\n"+
				"Base " + base + "\n" +
				"Area " + area() + "\n" +
				"Perimetro " + perimetro() + "\n" +
				"Numero de Lados= " + numeroDeLados + "\n" +
				"Figuras Totales= " + numeroDeFiguras;
	}
}
