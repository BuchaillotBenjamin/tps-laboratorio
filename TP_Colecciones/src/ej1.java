import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		llenar(numeros);
		mostrarLista(numeros);
		
	}

	public static ArrayList<Integer> llenar( ArrayList<Integer> numeros ) {
		Scanner leer=new Scanner(System.in);
		
		int j = 1;
		do {
			
			System.out.println("ingrese un valor numerico para agregarlo al ArrayList");
			System.out.println("ingrese 0 para dejar de agregar numeros");
			j= leer.nextInt();
			
			if(j!=0) {
				numeros.add(j);
			}else {
				System.out.println("el numero ingresado es 0");
			}
			
			
		}while(j!=0);
		
		return numeros;
		
	}
	public static void mostrarLista( ArrayList<Integer> numeros ) {
		System.out.println(" ");
		
		for(Integer i : numeros){
			
			System.out.println("Nro: " + i );
			
		}
		
		
	}
	
	
	
	
}
