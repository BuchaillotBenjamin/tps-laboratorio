package practicaParcial;

public class bonoSueldo {

	private empleado empleado;
	private int mesLiquidacion;
	private int anioLiquidacion;
	private double montoLiquidacion;
	
	public bonoSueldo(empleado empleado, int mesLiquidacion, int anioLiquidacion, double montoLiquidacion) {
		
		this.empleado = empleado;
		this.mesLiquidacion = mesLiquidacion;
		this.anioLiquidacion = anioLiquidacion;
		this.montoLiquidacion = montoLiquidacion;
		
	}
	
	public empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(empleado empleado) {
		this.empleado = empleado;
	}
	public int getMesLiquidacion() {
		return mesLiquidacion;
	}
	public void setMesLiquidacion(int mesLiquidacion) {
		this.mesLiquidacion = mesLiquidacion;
	}
	public int getAnioLiquidacion() {
		return anioLiquidacion;
	}
	public void setAnioLiquidacion(int anioLiquidacion) {
		this.anioLiquidacion = anioLiquidacion;
	}
	public double getMontoLiquidacion() {
		return montoLiquidacion;
	}
	public void setMontoLiquidacion(double montoLiquidacion) {
		this.montoLiquidacion = montoLiquidacion;
	}
	
	
	
	
	
	
	
}
