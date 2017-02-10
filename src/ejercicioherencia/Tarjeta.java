package ejercicioherencia;

public abstract class Tarjeta {

	protected int numcuenta;
	protected String titular;
	
	protected Cuenta cuenta;
	
	public Tarjeta(){
		numcuenta=0;
		titular="";
		cuenta = new Cuenta();
	}
	
	public Tarjeta(int numcuenta,double saldo,String titular){
		this.numcuenta=numcuenta;
		this.titular=titular;
		cuenta = new Cuenta(numcuenta,titular);
	}
	
	public void setNumtarjeta(int numtarjeta){
		this.numcuenta=numcuenta;
	}
	
	public void setTitular(String titular){
		this.titular=titular;
	}
	
	public int getNumcuenta(){
		return numcuenta;
	}
	
	public String getTitular(){
		return titular;
	}
}
