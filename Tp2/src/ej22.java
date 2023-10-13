
import java.util.Scanner;

public class ej22 {

	public static int sumaDigitos(int num) {
		
		if (num==0) {
			
			return num;
			
		}else {
			
			return num%10+sumaDigitos(num/10);
		}
		
			
		
		
	}

	
	public static void main(String[] args) {


		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("digame un numero mayor entero mayor a 0");
		
		int i = 0;
		
		do {
			
		int num = leer.nextInt();
		
		if (num>0) {
			
			System.out.print("la suma de todos los digitos de "+ num+" es = "+ sumaDigitos(num) );
			
			i++;
			
		}else {
			
			System.out.print("numero ingreasdo incorrecto, intente nuevamente");
			
		}
		
	} while(i == 0);
		
		
}
}