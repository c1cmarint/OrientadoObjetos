package Herencia;

public abstract class Figura {
	protected static int numeroDeFiguras = 0;
	protected int numeroDeLados;
	protected double longitudDeLado;
	
	abstract protected double area();
	
	protected double perimetro(){
		return numeroDeLados*longitudDeLado;
	}
}
