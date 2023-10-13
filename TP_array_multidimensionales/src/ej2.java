import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
	Scanner leer = new Scanner(System.in);
		
		System.out.println("indique el tamaño del primer arreglo bidimensional");
		System.out.println("X");
		int x = leer.nextInt();
		System.out.println("Y");
		int y = leer.nextInt();
		
		int [] [] arreglo1= new int [x][y];
		int [] [] arreglo2= new int [y][x];
		int [] [] resultado= new int [x][y];
		
		arreglo1=llenarArray(arreglo1,x,y);
		arreglo2=llenarArray(arreglo2,y,x);
		
		mostrarArray(arreglo1,x,y,"arreglo1");
		mostrarArray(arreglo2,y,x,"arreglo2");
		
		resultado=sumar(arreglo1,arreglo2,resultado,x,y);
		
		mostrarArray(resultado,x,y,"resultado");
		
	}
	
	public static int[][] llenarArray (int[][] arreglo,int x,int y ) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique los valores del arreglo");
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				
				arreglo[i][j]=leer.nextInt();
				
			}
		}
		
		return arreglo;	
	}
	
	public static int[][] sumar(int[][] arreglo1, int[][] arreglo2, int[][] resultado, int x, int y) {
		
	    for (int i = 0; i < x; i++) {
	        for (int k = 0; k < y; k++) {
	        	
	            resultado[i][k] = 0; 
	            
	            for (int j = 0; j < arreglo2.length; j++) {
	            	
	                resultado[i][k] += arreglo1[i][j] * arreglo2[j][k];
	                
	            }
	        }
	    }
	    return resultado;
	}
		
	public static void mostrarArray(int[][] arreglo, int x, int y, String palabra) {
	    System.out.println(" ");
	    System.out.println(palabra + ":");

	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	        	
	            System.out.print(arreglo[i][j] + " "); 
	            
	        }
	        
	        System.out.println(" "); 
	        
	    }
	}
	
}
	
	
	
	
	
	

