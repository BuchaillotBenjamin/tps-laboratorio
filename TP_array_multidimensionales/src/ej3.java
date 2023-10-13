import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
Scanner leer = new Scanner(System.in);
		
		System.out.println("indique el tamaño del primer arreglo bidimensional");
		System.out.println("X debe ser mayor o igual que 3 y menor o igual que 10");
		int x=0;
		do {
			int i=1;	
			int aux = leer.nextInt();
			
			if(aux>=3 && aux<=10) {
				i=0;
				x=aux;
			}
		
		}while(x==0);
		
		int[][]arreglo=new int[x][x];
		int[]resultado=new int[x];
		
		arreglo=llenarArray(arreglo);
		mostrarArray(arreglo);
		resultado=sumar(arreglo,resultado);
		mostrarArray2(resultado);
	}
	
	public static int[][] llenarArray (int[][] arreglo) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique los valores del arreglo");
		
		for(int i=0; i<arreglo.length; i++) {
			for(int j=0; j<arreglo.length; j++) {
				
				arreglo[i][j]=leer.nextInt();
				
			}
		}
		
		return arreglo;	
	}
	
	public static int[] sumar(int[][] arreglo,int[]resultado) {
		
		Scanner leer = new Scanner(System.in);
		
		for(int i=0; i<arreglo.length; i++) {
			
			resultado[i]=0;
			
			for(int j=0; j<arreglo.length; j++) {
				
				resultado[i]+=arreglo[j][i];
				
			}
		}
		
		return resultado;	
	}
	
	public static void mostrarArray(int[][] arreglo) {
	    System.out.println(" ");
	    

	    for (int i = 0; i < arreglo.length; i++) {
	        for (int j = 0; j < arreglo.length; j++) {
	        	
	            System.out.print(arreglo[i][j] + " "); 
	            
	        }
	        
	        System.out.println(" "); 
	        
	    }
	}
	
	public static void mostrarArray2(int[] arreglo) {
	    System.out.println(" ");
	    

	    for (int i = 0; i < arreglo.length; i++) {
	        
	            System.out.print(arreglo[i] + " "); 
	            
	        }
	        
	        System.out.println(" "); 
	        
	    
	}
}
