package ejercicioherencia;

public class Prueba2 {
	
	public static void main(String[] args){
		Cuenta cuenta = new Cuenta(5000,"");
		Persona persona = new Persona("Carlos");
		Debito debito = new Debito(4564675,persona,cuenta);
		
		debito.pagoDebito(50);
		
		System.out.println(debito.toString());
	}
}
