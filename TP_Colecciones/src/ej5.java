import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		llenar(numeros);
		mostrarLista(numeros);
		
	}

	public static ArrayList<Integer> llenar( ArrayList<Integer> numeros ) {
		Scanner leer=new Scanner(System.in);
		int j;
		
		System.out.println("ingrese 10 valores");
		
		for(int i=0 ; i<10 ; i++) {
		
		j=leer.nextInt();	
		numeros.add(j) ;
			
		}
		
		return numeros;
		
	}
	
	public static void mostrarLista( ArrayList<Integer> numeros ) {
		System.out.println(" ");
		
		ArrayList<Integer> numerosAsc= new ArrayList<>(numeros);
		Collections.sort(numerosAsc);
		
		ArrayList<Integer> numerosDesc= new ArrayList<>(numerosAsc);
		Collections.reverse(numerosDesc);
		

        System.out.println("Lista Ascendente: " + numerosAsc);
        System.out.println("Lista Descendente: " + numerosDesc);
		
		
	}
	
}
