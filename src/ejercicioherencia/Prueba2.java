package ejercicioherencia;

public class Prueba2 {
	
	public static void main(String[] args){
		Cuenta cuenta = new Cuenta(5000,"");
		Persona persona = new Persona("Carlos");
		//Debito debito = new Debito(4564675,persona,cuenta,20);
		
		//debito.pagoDebito(50);
		//debito.cuotaTarjeta();
		
		//System.out.println(debito.toString());
		
		Credito credito = new Credito(54186486,persona,cuenta,1000);
		
		credito.pagoCredito(2000);
		
		System.out.println(credito.toString());
	}
}
