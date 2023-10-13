import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		System.out.println("indique el tamaño del array ");
		int tamaño = leer.nextInt();
		
		System.out.println(" ");
		System.out.println("elija un numero");
		int numero=leer.nextInt();
		
		int[] arreglo = new int[tamaño];
		
		llenarArray(arreglo,tamaño,numero);
		
		System.out.println(" ");
		
		mostrarArray(arreglo,tamaño);
		
		
	}
	
public static void llenarArray (int arreglo[],int tamaño,int numero) {
	for(int i=0; i<tamaño; i++) {
		
		arreglo[i]=numero*(i+1);
		
	}
}

public static void mostrarArray (int arreglo[],int tamaño) {
		for(int i=0; i<tamaño; i++) {
			System.out.println("espacion Nro: "+(i+1));
			System.out.println(arreglo[i]);
		}
	
}
	
}
