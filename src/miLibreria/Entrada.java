package miLibreria;
import java.util.Scanner;
public class Entrada {

	private Scanner entrada;
		
	public int obtenerEntero(String msg){
		int obtener_entero=0;
		boolean loop=true;		
			Scanner entrada = new Scanner(System.in);
			
		do{
			try {
				System.out.println(msg);
				obtener_entero = entrada.nextInt();
				loop=false;
			}
			catch( java.util.InputMismatchException e){
				System.out.println("El valor introducido no es un entero.");
				entrada.next();
			}
		}while(loop);
		return obtener_entero;
		}
		
		public float obtenerFloat(String msg){
			float obtener_float=0;
			boolean loop=true;
			Scanner entrada = new Scanner(System.in);

			do{
				try{
					System.out.println(msg);
					obtener_float = entrada.nextFloat();
					loop=false;
				}
				catch( java.util.InputMismatchException e){
					System.out.println("EL valor introducido no es un float.");
					entrada.next();
				}
			}while(loop);
			return obtener_float;
		}
		
		public String obtenerString(String msg){
			String obtener_string = null;
			boolean loop=true;
			Scanner entrada= new Scanner(System.in);
			
			do{
				try{
					System.out.println(msg);
					obtener_string = entrada.nextLine();
					loop=false;
				}
				catch(Exception e){
					System.out.println(e);
					entrada.next();
				}
			}while(loop);
			return obtener_string;
		}
		
		public char obtenerChar(String msg){
			String obtener_char = null;
			boolean loop=true;
			Scanner entrada= new Scanner(System.in);
			
			do{
				try{
					System.out.println(msg);
					obtener_char = entrada.nextLine();
					loop=false;
				}
				catch(Exception e){
					System.out.println(e);
					entrada.next();
				}
			}while(loop);
			return obtener_char.charAt(0);
		}
}

