package ejercicio9;

public class Ventana {

private boolean ventana;
	
	public Ventana(){
		this.ventana=true;
	}
	
	public boolean getVentana(){
		return this.ventana;
	}
	
	public void abrirVentana(){
		this.ventana=true;
	}
	
	public void cerrarVentana(){
		this.ventana=false;
	}
	
	public String toString(){
		String estado;
		if(this.ventana==true){
			return "Las ventanas estan abiertas. ";
		}else{
			return "Las ventanas estan cerradas. ";
		}
	}
}
