package ejercicio6;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual 	= 0;
	}
	
	public Cafetera(int capacidadMaxima){
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual){
		if(cantidadActual>capacidadMaxima){
			this.capacidadMaxima=capacidadMaxima;
			this.cantidadActual=this.capacidadMaxima;
		}else{
			this.cantidadActual=cantidadActual;
			this.capacidadMaxima=capacidadMaxima;
		}
	}
	
	public void setCapacidadMaxima(int capacidadMaxima){
		this.capacidadMaxima=capacidadMaxima;
	}
	
	public void setCantidadActual(int cantidadActual){
		this.cantidadActual=cantidadActual;
	}
	
	public int getCapacidadMaxima(){
		return capacidadMaxima;
	}
	
	public int getCantidadMaxima() {
		return cantidadActual;
	}
	
	public void llenarCafetera(){
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public int servirTaza(int cafe){
		int devuelta;
		if(cantidadActual<cafe){
			devuelta=this.cantidadActual;
			this.cantidadActual=0;
			return devuelta;
		}else{
			this.cantidadActual=this.cantidadActual-cafe;
			return cafe;
		}
	}
	
	public void vaciarCafetera(){
		this.cantidadActual=0;
	}
	
	public int agregarCafe(int cafe){
		this.cantidadActual=this.cantidadActual+cafe;
		return this.cantidadActual;
	}
}
