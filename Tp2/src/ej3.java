import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		
		System.out.println("digame un numero de 3 digitos");
		
		int num = Leer.nextInt();
		
		int primero = num % 10;
		
		num = num / 10;
		
		int segundo = num % 10;
		
		num = num / 10;
		
		int tercero = num % 10; 
		
		int suma = primero+ segundo + tercero;
		
		System.out.println(" ");
		System.out.println(primero);
		System.out.println(segundo);
		System.out.println(tercero);
		
		System.out.println(" ");
		System.out.println("la suma es: ");
		System.out.println(suma);
		
		
	}

}
