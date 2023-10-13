import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
	 
		int i = 0;
		
		do {
			System.out.println("digame un numero mayor o igual a 0");
			
			int num = sc.nextInt();
			
			if (num<0) {
				System.out.println("el numero es menor que 0");
				System.out.println("intente nuevamente");
				
			} else {
				System.out.println(" ");
				System.out.println("el numero es correcto");
				System.out.println(num);
				i=num;
			
				
			}	 
		} while (i == 0) ;
		
	
	

		
		
		
		
	}	
	}


