import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int [] arreglo = new int [5];
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println("escribra el Nro del espacio: "+(i+1));
			arreglo[i]=leer.nextInt();
			
			
		}
		
		System.out.println(" ");
		
		for(int i=0;i<5;i++) {
			
			System.out.println("espacio Nro: " + (i+1));
			System.out.println(arreglo[i]);
			
			
		}
		
		
		
		
		
		
		
		
	}

}
