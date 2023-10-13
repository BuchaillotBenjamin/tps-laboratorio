import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique el tamaño del primer arreglo");
		System.out.println("X e Y deben ser igual o mayor que 2");
		int x=0;
		int y=0;
		
		do {
				
			int aux = leer.nextInt();
			int aux2 = leer.nextInt();
			if(aux>=2 && aux2>=2) {
				x=aux;
				y=aux2;
			}
		
		}while(x==0 && y==0);
		
		int[][]arreglo= new int[x][y];
		
		arreglo=llenarArray(arreglo,x,y);
		sacarPromedio(arreglo,x,y);
		
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
	
	public static int[][] llenarArray (int[][] arreglo,int x, int y) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique los valores del arreglo");
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				
				arreglo[i][j]=leer.nextInt();
				
			}
		}
		
		return arreglo;	
	}
	
	public static void buscarPromedio(int[][] arreglo,int x, int y, int promedio) {
		  Scanner leer1=new Scanner(System.in);
		  
		  System.out.println("el promedio entero es= "+promedio);
		 
		  int elementoBuscado=promedio;
		  int n=0;
		  
	        
	        for (int i = 0; i < x ; i++) {
	        	for(int j = 0; j < y ; j++) {
	        		
	            if (arreglo[i][j] == elementoBuscado) {
	            	
	        System.out.println("El valor "+promedio+" se encuentra en la posición con índice ("+i+","+j+") o Fila "+(i+1)+ ", Columna "+(j+1) );
	        n++;
	                
	            }
	        }
	        }
	        
	        
	        if(n==0) {
	        	System.out.println("No se encontró ninguna coincidencia");      
	        }
	        
	
	  }

	public static void sacarPromedio(int[][] arreglo,int x,int y) {
		Scanner leer1=new Scanner(System.in);
		  
		System.out.println(" ");
		int promedio=0;
	    int n = x*y;    
	        for (int i = 0; i < x ; i++) {
	           for(int j = 0; j < y ; j++) {
	        	   promedio=promedio+arreglo[i][j];
	           }
	        }
	    promedio=promedio/n;
	    
	    buscarPromedio(arreglo,x,y,promedio);  
	
	  }
	
	
}
