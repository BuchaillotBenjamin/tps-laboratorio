package practicaParcial;

import java.util.ArrayList;
import java.util.List;

public class empleado {

	
	private String nombreEmpleado;
	private long cuil;
	private int anioIngreso;
	private double montoAntiguedad;
	private double sueldoBasico;
	private List<bonoSueldo> bonos;
	
	public empleado(String nombreEmpleado,long cuil,int anioIngreso,double montoAntiguedad,double sueldoBasico) {
		this.nombreEmpleado=nombreEmpleado;
		this.cuil=cuil;
		this.anioIngreso=anioIngreso;
		this.montoAntiguedad=montoAntiguedad;
		this.sueldoBasico=sueldoBasico;
		this.bonos = new ArrayList<>();
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long cuil) {
		this.cuil = cuil;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public double getMontoAntiguedad() {
		return montoAntiguedad;
	}

	public void setMontoAntiguedad(double montoAntiguedad) {
		this.montoAntiguedad = montoAntiguedad;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public List<bonoSueldo> getBonos() {
		return bonos;
	}

	public void setBonos(List<bonoSueldo> bonos) {
		this.bonos = bonos;
	}
	
	
	
	
	
	
}
