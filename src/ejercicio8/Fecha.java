package ejercicio8;
import java.util.GregorianCalendar;
import miLibreria.Entrada;
import java.time.*;
public class Fecha {
	
	private GregorianCalendar fecha;
	private LocalDate fecha1;
	
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
	
	
	
}
