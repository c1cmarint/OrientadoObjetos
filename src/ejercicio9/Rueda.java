package ejercicio9;

public class Rueda {
	private boolean rueda;
	
	public Rueda(){
		this.rueda=true;
	}
	
	public boolean getRueda(){
		return this.rueda;
	}
	
	public void inflar(){
		this.rueda=true;
	}
	
	public void desinflar(){
		this.rueda=false;
	}
	
	public String toString(){
		String estado;
		if(this.rueda==true){
			return "Las ruedas estan infladas. ";
		}else{
			return "Las ruedas estan desinfladas. ";
		}
	}
}
