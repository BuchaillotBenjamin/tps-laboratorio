import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ej4 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		llenar(numeros);
		encontrarNum(numeros);
		
	}
	
	public static ArrayList<Integer> llenar( ArrayList<Integer> numeros ) {
		Random rand = new Random();
		int j;
		int i=0;
		
		do {
			
			j=rand.nextInt(100);
			
			numeros.add(j);
			i++;
				
			}while(i<50);
			
		
		return numeros;
		
	}
	
	public static void encontrarNum( ArrayList<Integer> numeros ) {
		Scanner leer= new Scanner(System.in);
		
		System.out.println("indique el numero que desea buscar en la lista ");
		int num =leer.nextInt();
		int j=0;
		
		for(int i=0 ; i<50; i++){
			
			if ( num == numeros.get(i) ) {
				System.out.println("el numero fue encontrado en el lugar "+ (i + 1)+" de la lista");
				j++;
			}
			
		}
		if(j==0) {
			System.out.println("el numero no fue encontrado dentro de la lista ");
		}
		
	}
	
	
}
