import java.util.Random;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		
		int[] arreglo=new int[50];
		llenarArray(arreglo);
		buscarNumero(arreglo);
		
		
	}
public static void llenarArray (int[] arreglo) {
		
		System.out.println(" ");
		
		Random random = new Random();
		
		for(int i=0; i<50; i++) {
		
			arreglo[i]= random.nextInt(75);
			System.out.println(arreglo[i]);
		}
	}
public static void buscarNumero (int[] arreglo) {
	Scanner leer = new Scanner(System.in);
	
	System.out.println("digame el numero a buscar ");
	
	int numero=leer.nextInt();
	int i=0;

	
	do {
	
		if(numero==arreglo[i]) {
			System.out.println("el numero fue encontrado, estaba en la posicion: "+ (i+1));
			break;
		}else if(i==49) {
			System.out.println("el numero NO fue encontrado ");
		}
		
		
		i=i+1;
		
	}while(i<50);
	
	
	
	
	}
}


	
	
	
	

