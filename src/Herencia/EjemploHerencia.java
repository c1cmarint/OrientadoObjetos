package Herencia;
import miLibreria.Entrada;
public class EjemploHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		Cuadrado cuadrado;
		Triangulo triangulo;
		Rectangulo rectangulo;
		Circulo circulo;
		
		System.out.println("Introduccion de los datos del triangulo");
		triangulo = new Triangulo(entrada.obtenerFloat("Dame la altura:"),entrada.obtenerFloat("Dame la base:"));
		
		System.out.println("Introduccion de los datos del cuadrado");
		cuadrado = new Cuadrado(entrada.obtenerFloat("Dame la longitud del lado:"));
		
		System.out.println("Introduccion de los datos del rectangulo:");
		rectangulo = new Rectangulo(entrada.obtenerFloat("Dame la altura:"),entrada.obtenerFloat("Dame la base:"));
		
		System.out.println("Introduccion de los datos del circulo");
		circulo = new Circulo(entrada.obtenerFloat("Dame la longitud del radio:"));
		
		System.out.println(triangulo.toString());
		System.out.println();
		System.out.println(cuadrado.toString());
		System.out.println();
		System.out.println(rectangulo.toString());
		System.out.println();
		System.out.println(circulo.toString());
		
	}

}
