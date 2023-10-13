import java.util.Arrays;

import java.util.Scanner;

public class ej7 {

	
	public static void main(String[] args) {
		
		int[] arreglo= new int[10];
		int[] arregloAscendente= new int[10];
		int[] arregloDescendente= new int[10];
		
		llenarArray(arreglo);
		arregloAscendente = ordenarAscendente(arreglo, arregloAscendente);
		arregloDescendente = ordenarDescendente(arreglo,arregloDescendente);
		
		mostrarArray(arregloAscendente);
		mostrarArray(arregloDescendente);
		
		
	}
public static void llenarArray (int[] arreglo) {
	
	Scanner leer = new Scanner(System.in);
		System.out.println(" ");
		
		for(int i=0; i<10; i++) {
		
			arreglo[i]=leer.nextInt();
			
		}
	}

public static int[] ordenarAscendente (int[] arreglo, int[] arregloAscendente) {
	
	arregloAscendente = Arrays.copyOf(arreglo, arreglo.length);
     Arrays.sort(arregloAscendente);
     
     return arregloAscendente;
     
		}

public static int[] ordenarDescendente (int[] arreglo, int[] arregloDescendente) {
	
	arregloDescendente = Arrays.copyOf(arreglo, arreglo.length);
     Arrays.sort(arregloDescendente);
     
     
     for (int i = 0; i < arregloDescendente.length / 2; i++) {
         int temp = arregloDescendente[i];
         arregloDescendente[i] = arregloDescendente[arregloDescendente.length - 1 - i];
         arregloDescendente[arregloDescendente.length - 1 - i] = temp;
         
    
    
	}
     return arregloDescendente;
		}

public static void mostrarArray(int[] arreglo) {
	
	
		System.out.println(" ");
		for(int i=0; i<10; i++) {
			
			System.out.println(arreglo[i]);
			
			
		}
		System.out.println(" ");
	}












	}
