import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int aux = 0;
		int salida=0;
		
		
		do {
			System.out.println("Ingrese un numero mayor a 1 parfa saber si es primo o no");
			 int num = sc.nextInt();
			
			 if(num>1) {
				 salida=num;
			 }else if (num<=1) {
				 System.out.println("");
				 System.out.println("el numero ingresado es incorrecto");
			 }
			 
		}while(salida==0);
		
		
		
		for (int i = 1; i <= salida; i++) {
			
			
			
			if (salida % i == 0) {
				aux = aux+1;
				}
		}
		
		
		if (aux == 2 ) {
			 System.out.println("el numero ingresado es primo");
			
		} else {
			 System.out.println("el numero ingresadom NO es primo");
		}
		
		
	}

	

}


