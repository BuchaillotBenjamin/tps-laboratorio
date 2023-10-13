import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingree un numero");
		 double precio = sc.nextDouble();
		 
		 System.out.println("");
			System.out.println("el precio inicial es:");
			System.out.println(precio); 
			
			System.out.println("");
			System.out.println("el precio final es:");
			
			double precioFinal = precio + precio * 21 / 100; 
			
			System.out.println(precioFinal);
		
		
	}
}