import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingree el primer numero");
		 int a = sc.nextInt();
		
		 System.out.println("Ingree el segundo numero");
		 int b = sc.nextInt();
		
		System.out.println("a");
		System.out.println(a);
		
		System.out.println(" " );	
		
		System.out.println("b");
		System.out.println(b);
		
		
		if (a>b) {
			System.out.println(" " );	
			System.out.println("el mayor es" );
			System.out.println( a );
		} else if ( a == b) {
			System.out.println(" " );	
			System.out.println("los numeros son iguales" );
			System.out.println( a );
			
		} else {
			System.out.println(" " );	
			System.out.println("el mayor es" );
			System.out.println( b );
		}
		
				
				
		System.out.println(" ");	
		System.out.println("fin");
				
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
