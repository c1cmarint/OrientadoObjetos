package ejercicio9;

public class Motor {

	private boolean motor;
	
	public Motor(){
		this.motor = true;
	}
	
	public boolean getMotor(){
		return this.motor;
	}
	
	public void encender(){
		this.motor=true;
	}
	
	public void apagar(){
		this.motor=false;
	}
	
	public String toString(){
		String estado;
		if(this.motor==true){
			return "El motor esta encendido. ";
		}else{
			return "El motor esta apagado. ";
		}
	}
}
