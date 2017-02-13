package ejercicioherencia;

public class Persona {
	
	private String nombre;
	private int 	DNI;
	
	public Persona(){
		nombre	= "";
		DNI		= generaDNI();
	}
	
	
	public Persona(String nombre){
		this.nombre	= nombre;
		this.DNI	= generaDNI();
	}
	
	
	public String toString(){
		
		return  this.nombre + "\n" +
				"DNI : " + this.DNI;
	}
	
	
	private int generaDNI(){
		return (int)(Math.random()*100000000);
	}
}
