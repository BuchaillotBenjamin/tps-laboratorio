import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int salida = 0; 
		
		
		do {
			System.out.println(" ");
			System.out.println("Ingree el dia de la semana");
		int dia = sc.nextInt();
			
		if (dia >0 && dia <=7 ) {
			
			System.out.println(" ");
			salida = dia;
			
		}else {
			System.out.println("numero incorrecto, intente nuevamente ");
		}
			
		} while(salida == 0);	
		
		
		switch (salida) {
		
		case (1):
			System.out.println(" ");
		System.out.println("lunes, dia laborable ");
		break;
		
		case (2):
			System.out.println(" ");
		System.out.println("martes, dia laborable ");
		break;
		case (3):
			System.out.println(" ");
		System.out.println("miercoles, dia laborable ");
		break;
		case (4):
			System.out.println(" ");
		System.out.println("jueves, dia laborable ");
		break;
		case (5):
			System.out.println(" ");
		System.out.println("viernes, dia laborable ");
		break;
		case (6):
			System.out.println(" ");
		System.out.println("sabado, dia no laborable ");
		break;
		case (7):
			System.out.println(" ");
		System.out.println("domingo, dia no laborable ");
		break;
				
		}

	}

}
