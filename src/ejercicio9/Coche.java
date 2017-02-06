package ejercicio9;

public class Coche {
	
	private Motor motor = new Motor();
	private Rueda rueda[] = new Rueda[4];
	private Puerta puerta[] = new Puerta[2];
	
	public Coche(){
		this.motor = new Motor();
		
		for(int i=0;i<rueda.length;i++){
			rueda[i]=new Rueda();
		}
		
		for(int j=0;j<puerta.length;j++){
			puerta[j]=new Puerta();
		}
	}
	
	public void encenderMotor(){
		this.motor.encender();
	}
	
	public void apagarMotor(){
		this.motor.apagar();
	}
	
	public void inflarRueda(){
		for(int i=0;i<rueda.length;i++){
			this.rueda[i].inflar();
		}
	}
	
	public void desinflarRueda(){
		for(int i=0;i<rueda.length;i++){
			this.rueda[i].desinflar();
		}
	}
	
	public void abrirPuerta(){
		for(int i=0;i<puerta.length;i++){
			this.puerta[i].abrirPuerta();
		}
	}
	
	public void cerrarPuerta(){
		for(int i=0;i<puerta.length;i++){
			this.puerta[i].cerrarPuerta();
		}
	}
	
	public void abrirVentana(){
		for(int i=0;i<puerta.length;i++){
			this.puerta[i].getVentana().abrirVentana();
		}
	}
	
	public void cerrarVentana(){
		for(int i=0;i<puerta.length;i++){
			this.puerta[i].getVentana().cerrarVentana();
		}
	}
	
	public String toString(){
		String ruedas = null ;
		String puertas = null ;
		String ventanas = null;
		
		for(int i=0;i<rueda.length;i++){
			ruedas = rueda[i].toString();
		}
		
		for(int j=0;j<puerta.length;j++){
			puertas = this.puerta[j].toString();
		}
		
		for(int i=0;i<puerta.length;i++){
			ventanas = this.puerta[i].getVentana().toString();
		}
		
		return this.motor.toString() + "\n" +
			 ruedas + "\n" +
			 puertas + "\n" +
			 ventanas;
				
	}
}
