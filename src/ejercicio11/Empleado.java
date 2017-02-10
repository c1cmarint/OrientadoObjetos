package ejercicio11;

public class Empleado {
	
	private int nif;
	private double sueldo_base;
	private double pago_horaextra;
	private int horas_extras_realizadas;
	private double irpf;
	private boolean casado;
	private int hijos;
	
	public Empleado(){
		nif=0;
		sueldo_base=0;
		pago_horaextra=0;
		horas_extras_realizadas=0;
		irpf=20;
		casado=true;
		hijos=0;
	}
	
	public Empleado(int nif,double sueldo_base,double pago_horaextra,int horas_extras_realizadas,double irpf,boolean casado,int hijos){
		this.nif=nif;
		this.sueldo_base=sueldo_base;
		this.pago_horaextra=pago_horaextra;
		this.horas_extras_realizadas=horas_extras_realizadas;
		this.irpf=irpf;
		this.casado=casado;
		this.hijos=hijos;
	}
	
	public void setNif(int nif){
		this.nif=nif;
	}
	
	public void setSueldoBase(double sueldo_base){
		this.sueldo_base=sueldo_base;
	}
	
	public void setPagoHoraExtra(double pago_hora_extra){
		this.pago_horaextra=pago_hora_extra;
	}
	
	public void setHorasExtraRealizadas(int horas_extra_realizadas){
		this.horas_extras_realizadas=horas_extras_realizadas;
	}
	
	public void setIrpf(double irpf){
		this.irpf=irpf;
	}
	
	public void setCasado(boolean casado){
		this.casado=casado;
	}
	
	public void setHijos(int hijos){
		this.hijos=hijos;
	}
	
	public int getNif(){
		return nif;
	}
	
	public double getSueldoBase(){
		return sueldo_base;
	}
	
	public double getPagoHoraExtra(){
		return pago_horaextra;
	}
	
	public int getHorasExtraRealizadas(){
		return horas_extras_realizadas;
	}
	
	public double getIrpf(){
		return irpf;
	}
	
	public boolean getCasado(){
		return casado;
	}
	
	public int getHijos(){
		return hijos;
	}
	
	public double calculoHorasExtras(){
		return this.horas_extras_realizadas*this.pago_horaextra;
	}
	
	public double sueldoBruto(){
		return this.sueldo_base+(this.horas_extras_realizadas*this.pago_horaextra);
	}
	
	public double calcularIrpf(){
		double irpftotal = this.irpf;
		
		if(casado==true){
			irpftotal = irpftotal-2;
		}
		
		irpftotal = irpftotal-this.hijos;
		
		return irpftotal;
	}
	
	public String println(){
		return "DNI: " + this.nif +"\n" +
				"Estado civil: " + this.casado + "\n" + 
				"Hijos: " + this.hijos +"\n";
	}
	
	public String printAll(){
		return "DNI: " + this.nif +"\n" +
				"Estado civil: " + this.casado + "\n" + 
				"Hijos: " + this.hijos +"\n" +
				"Sueldo base: " + this.sueldo_base + "\n" +
				"Complemento por horas extra: " + calculoHorasExtras() + "\n" + 
				"Sueldo Bruto: " + sueldoBruto() + "\n" +
				"Retención IRPF: " + calcularIrpf() + "\n" +
				"Sueldo neto: " + (sueldoBruto()-(sueldoBruto()*calcularIrpf()/100));
	}
	
	public Empleado copia(Empleado empleado){
		return new Empleado(empleado.getNif(),empleado.getSueldoBase(),empleado.getPagoHoraExtra(),empleado.getHorasExtraRealizadas(),empleado.getIrpf(),empleado.getCasado(),empleado.getHijos());
	}
}
