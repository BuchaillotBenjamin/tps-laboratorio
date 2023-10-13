import java.text.SimpleDateFormat;
import java.util.Date;



public class funcionesPrograma{
	
	public static String getFechaString(Date fecha){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		return dateFormat.format(fecha);
		
	}
	
	public static Date getFechaDate(int dia, int mes, int anio) {
		
		Date fechaDate= new Date(anio-1900,mes-1,dia);
		
		return fechaDate;
		
	
		
	}
	
	
}
