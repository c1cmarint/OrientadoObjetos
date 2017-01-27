package ejercicio2;

import java.util.Scanner;
import ejercicio1.Complejo;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional(){
		numerador=0;
		denominador=0;
	}
	
	public Racional(int numerador,int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public void setNumerador(int numerador){
		this.numerador=numerador;
	}
	
	public void setDenominador(int denominador){
		this.denominador=denominador;
	}
	
	public int getNumerador(){
		return numerador;
	}
	
	public int getDenominador(){
		return denominador;
	}
	
	public Racional suma(Racional numero){
		int sumaNumerador,sumaDenominador;
		
		sumaNumerador=(this.numerador*numero.getDenominador())+(numero.getNumerador()*this.denominador);
		sumaDenominador= this.denominador*numero.getDenominador();
		
		return new Racional(sumaNumerador,sumaDenominador);
	}
	
	public Racional resta(Racional numero){
		int restaNumerador,restaDenominador;
		
		restaNumerador=(this.numerador*numero.getDenominador())-(numero.getNumerador()*this.denominador);
		restaDenominador= this.denominador*numero.getDenominador();
		
		return new Racional(restaNumerador,restaDenominador);
	}
	
	public Racional multiplicacion(Racional numero){
		int multiplicaNumerador,multiplicaDenominador;
		
		multiplicaNumerador=this.numerador*numero.getNumerador();
		multiplicaDenominador= this.denominador*numero.getDenominador();
		
		return new Racional(multiplicaNumerador,multiplicaDenominador);
	}
	
	public Racional division(Racional numero){
		int divisionNumerador,divisionDenominador;
		
		divisionNumerador=this.numerador*numero.getDenominador();
		divisionDenominador= this.denominador*numero.getNumerador();
		
		return new Racional(divisionNumerador,divisionDenominador);
	}
	
	public Racional comparar(Racional numero){
		int compararNumerador,compararDenominador;
		
		if(this.numerador*numero.getDenominador()>numero.getNumerador()*this.denominador){
			compararNumerador=this.numerador;
			compararDenominador=this.denominador;
		}else if(this.numerador*numero.getDenominador()<numero.getNumerador()*this.denominador){
			compararNumerador=numero.getNumerador();
			compararDenominador=numero.getDenominador();
		}else{
			compararNumerador=this.numerador;
			compararDenominador=this.denominador;
		}
		
		return new Racional(compararNumerador,compararDenominador);
	}
	
	public void leer(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el numerador:");
		setNumerador(entrada.nextInt());
		System.out.println("Dame el denominador:");
		setDenominador(entrada.nextInt());
	}
	
	public void print(){
		System.out.println("El numerador es " + this.numerador + " y el denominador " + this.denominador);
	}			
}
