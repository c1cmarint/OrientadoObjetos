package ejercicioherencia;

public class Precio {
	
	protected double precio;
	
	public Precio(){
		precio=0;
	}
	
	public Precio(double precio){
		this.precio=precio;
	}
	
	public void setPrecio(double precio){
		this.precio=precio;
	}
	
	public double getPrecio(){
		return precio;
	}
}
