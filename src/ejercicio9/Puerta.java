package ejercicio9;

public class Puerta {
	
	private boolean puerta;
	private Ventana ventana;
	
	public Puerta(){
		this.puerta=true;
		this.ventana = new Ventana();
	}
	
	public boolean getPuerta(){
		return this.puerta;
	}
	
	public Ventana getVentana(){
		return this.ventana;
	}
	
	public void abrirPuerta(){
		this.puerta=true;
	}
	
	public void cerrarPuerta(){
		this.puerta=false;
	}
	
	public String toString(){
		String estado;
		if(this.puerta==true){
			return "Alguna puerta esta abierta. ";
		}else{
			return "Las puertas estan cerradas. ";
		}
	}
}
