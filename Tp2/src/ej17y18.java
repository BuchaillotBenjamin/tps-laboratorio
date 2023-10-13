import java.util.Date;

public class ej17y18 {

	public static void main(String[] args) {

		Date fechaActual = new Date();
		String fechaString = funcionesPrograma.getFechaString(fechaActual);
		
		
		int dia= 25;
		int mes= 8;
		int anio= 2023;
		Date fechaDate = funcionesPrograma.getFechaDate(dia, mes, anio);
		
		
		System.out.println("la fecha actual es: "+ fechaString);	
		
		System.out.println("la fecha actual es: "+ fechaDate);	
			
		
		
		
		
		
		
		
	}

}