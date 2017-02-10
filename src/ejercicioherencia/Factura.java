package ejercicioherencia;

public class Factura extends Precio{
	private String emisor;
	private String cliente;
	
	public Factura(){
		emisor="";
		cliente="";
		precio=0;
	}
	
	public Factura(String emisor,String cliente,double euros){
		super(euros);
		this.emisor=emisor;
		this.cliente=cliente;
	}
	
	public void setEmisor(String emisor){
		this.emisor=emisor;
	}
	
	public void setCliente(String cliente){
		this.cliente=cliente;
	}
	
	public String getEmisor(){
		return emisor;
	}
	
	public String getCliente(){
		return cliente;
	}
	
	public String toString(){
		return "     Detalles Factura    " + "\n" +
				"--------------------------" + "\n"+
				"Emisor: " + this.emisor + "\n" + 
				"Cliente: " + this.cliente + "\n" +
				"Precio: " + this.precio;
	}
}
