import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingree un numero");
		 int a = sc.nextInt();
		 
		 
		if (a == 0) {
			
			System.out.println("");
			System.out.println("el numero es 0");
			
		}  else if (a % 2 ==0) {
			
			System.out.println("");
			System.out.println("el numero es divible por 2");
				
		} else {
			
			System.out.println("");
			System.out.println("el numero no es divible por 2");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
