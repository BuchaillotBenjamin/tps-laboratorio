import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
	
	int[] arreglo1 =new int[5];
	
	int[] arreglo2 =new int[10];	
		
	int[] resultado =new int[5];	
		
	llenarArray(arreglo1);
	llenarArray(arreglo2);
	resultado = darResultados(arreglo1,arreglo2,resultado);	
	mostrarArray(resultado);	
		
		
		
		
	}

	public static void llenarArray (int arreglo[]) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique "+ arreglo.length +" numeros ");
		
		for(int i=0; i<arreglo.length; i++) {
		
			arreglo[i]=leer.nextInt();
			
		}
	}
	
	public static int[] darResultados (int arreglo1[],int arreglo2[],int resultado[]) {
		
		for(int i=0; i<arreglo1.length; i++) {
			for(int x=0; x<arreglo2.length; x++) {
				
				resultado[i]+=arreglo1[i]*arreglo2[x];
				
			}
		}
		return resultado;
	}
	
	public static void mostrarArray (int arreglo[]) {
		
		System.out.println(" ");
		System.out.println("Resultados:");
		System.out.println(" ");
		
		for(int i=0; i<arreglo.length; i++) {
			
			System.out.println("espacion Nro: "+(i+1));
			
			System.out.println(arreglo[i]);
			
		}
	
}
	
}
