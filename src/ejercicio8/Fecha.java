package ejercicio8;
import java.util.GregorianCalendar;
import miLibreria.Entrada;
public class Fecha {
	
	private GregorianCalendar fecha;
	
	public Fecha(){
		fecha.set(1,1,1900);
	}
	
	public Fecha(int dia,int mes,int anyo){
		this.fecha.set(dia, mes,anyo);
	}
	
	public void leer(int dia,int mes,int anyo){
		
		Entrada entrada = new Entrada();
		
		fecha.set(entrada.obtenerEntero("Dia(1-31)"), entrada.obtenerEntero("Mes(1-12"),entrada.obtenerEntero("Año(1900-2050)"));
		
	}
	
	public boolean bisiesto() {
		return fecha.isLeapYear(this.fecha.YEAR);
	}
	
	public int diasMes(int dias){
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
	}
	
	
}
