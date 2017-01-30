package ejercicio4;
import ejercicio1.Complejo;
import miLibreria.Entrada;
public class Linea {
	
	private Complejo puntoA;
	private Complejo puntoB;
	
	public Linea(){
		puntoA = new Complejo(0.0f,0.0f);
		puntoB = new Complejo(0.0f,0.0f);
	}
	
	public Linea(Complejo puntoA,Complejo puntoB){
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public void mueveArriba(){
		Entrada entrada = new Entrada();
		Complejo desplazar = new Complejo(0.0f,entrada.obtenerFloat("Cuanto quieres desplazar?"));
		
		this.puntoA = this.puntoA.suma(desplazar);
		this.puntoB = this.puntoB.suma(desplazar);
	}
	
	public void mueveAbajo(){
		Entrada entrada = new Entrada();
		Complejo desplazar = new Complejo(0.0f,entrada.obtenerFloat("Cuanto quieres desplazar?"));
		
		this.puntoA = this.puntoA.resta(desplazar);
		this.puntoB = this.puntoB.resta(desplazar);
	}
	
	public void mueveDerecha(){
		Entrada entrada = new Entrada();
		Complejo desplazar = new Complejo(entrada.obtenerFloat("Cuanto quieres desplazar?"),0.0f);
		
		this.puntoA = this.puntoA.suma(desplazar);
		this.puntoB = this.puntoB.suma(desplazar);
	}
	
	public void mueveIzquierda(){
		Entrada entrada = new Entrada();
		Complejo desplazar = new Complejo(entrada.obtenerFloat("Cuanto quieres desplazar?"),0.0f);
		
		this.puntoA = this.puntoA.resta(desplazar);
		this.puntoB = this.puntoB.resta(desplazar);
	}
	
	public String toString(){
		return "[(" + this.puntoA + "),(" + this.puntoB +")]";
	}
}
