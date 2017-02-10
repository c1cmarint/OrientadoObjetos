package ejercicio5;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta = new Cuenta(73102135,500,5);
		cuenta.ingresar(50);
		cuenta.retirar(5.7);
		System.out.println(cuenta.toString());
	}

}
