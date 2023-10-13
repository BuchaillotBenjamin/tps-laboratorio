import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String contraseña = "contraseña";
		System.out.println(contraseña);
		
		
		int i = 1;
		
		
		do {
			
			System.out.println(" ");
			System.out.println("intento numero:");
			System.out.println(i);
			System.out.println(" ");
			System.out.println("introduzca la contraseña");
			String contraseñaIntento= sc.nextLine();
			
			String validar = contraseña;
			
			
			if(validar.equals(contraseñaIntento)) {
				
				System.out.println(" ");
				System.out.println("contraseña correcta");
				i=4;
			}else {
				System.out.println(" ");
				System.out.println("contraseña incorrecta");
				i++;
				if (i>=3) {
					System.out.println(" ");
					System.out.println("no quedan mas intentos ");
					} 
			}
			
			
		
		}while( i != 4 );
		
		
		

	}

	
		
	}


