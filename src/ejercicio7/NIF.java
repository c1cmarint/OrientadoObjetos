package ejercicio7;
import java.util.Scanner;
public class NIF {

	private int num;
	private String letra;
	
	public NIF(){
		num=0;
		letra="";
	}
	
	public NIF(int num,String letra){
		this.num=num;
		this.letra=letra;
	}
	
	public void setNum(int num){
		this.num=num;
	}
	
	public int getNum(){
		return num;
	}
	
	private String leer(){
		int dni;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu DNI:");
		dni=entrada.nextInt();
		
		String[] letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		this.letra=letras[dni%23];
		
		return this.letra;

	}
	
	public String toString(){
		return this.num + "-" + this.letra;
	}
}
