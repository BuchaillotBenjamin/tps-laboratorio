import java.util.Scanner;

public class ej21 {

	public static int sumaRecursiva(int num) {
		
		 if (num == 1) {
	            return 1;
	        } else {
	            return num + sumaRecursiva(num - 1);
	        }
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("digame un numero mayor entero mayor a 0");
		
		int i = 0;
		do {
		int num = leer.nextInt();
		if (num>0) {
			System.out.print("la suma de todos los numeros naturales desde 0 hasta "+ num+" es = "+ sumaRecursiva(num) );
			
			i++;
			
		}else {
			
			System.out.print("numero ingreasdo incorrecto, intente nuevamente");
			
		}
		
		
		
	} while(i == 0);

		
		
		
		
		
		
		
		
		
		
		
		
}
}




