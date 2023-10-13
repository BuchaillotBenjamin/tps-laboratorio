import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
	int[] arreglo={2,9,6,7,1,3,6,8,4,5};	
	
	mostrarArray(arreglo);
	
	insercion(arreglo);
	mostrarArray(arreglo);
	
	//burbuja(arreglo);
	//mostrarArray(arreglo);
	
	//seleccion(arreglo);
	//mostrarArray(arreglo);
	
	busquedaSecuencial(arreglo);	
	mostrarArray(arreglo);	
		
		
		
		
		
	}

	 public static void insercion(int[] arreglo) {
	        int n = arreglo.length;
	        System.out.println(" ");
	        for (int i = 1; i < n; i++) {
	            int elementoActual = arreglo[i];
	            int j = i - 1;
	            
	            
	            while (j >= 0 && arreglo[j] > elementoActual) {
	                arreglo[j + 1] = arreglo[j];
	                j--;
	            }
	            arreglo[j + 1] = elementoActual;
	        }
	    }
	
	 public static void burbuja(int[] arreglo) {
		 System.out.println(" ");   
		 int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arreglo[j] > arreglo[j + 1]) {
	                    int temp = arreglo[j];
	                    arreglo[j] = arreglo[j + 1];
	                    arreglo[j + 1] = temp;
	                }
	            }
	        }
	    }
	
	  public static void seleccion(int[] arreglo) {
	       
		  System.out.println(" ");
		  int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int indiceMinimo = i;
	             
	            for (int j = i + 1; j < n; j++) {
	                if (arreglo[j] < arreglo[indiceMinimo]) {
	                    indiceMinimo = j;
	                }
	            }
	           
	            int temp = arreglo[i];
	            arreglo[i] = arreglo[indiceMinimo];
	            arreglo[indiceMinimo] = temp;
	        }
	    }
	
	  public static void busquedaSecuencial(int[] arreglo) {
		  Scanner leer1=new Scanner(System.in);
		  
		  System.out.println(" ");
		  System.out.println("digame el numero que busca ");
		  int elementoBuscado=leer1.nextInt();
		  int j=0;
		  int n = arreglo.length;
	        
	        for (int i = 0; i < n; i++) {
	            if (arreglo[i] == elementoBuscado) {
	        System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + i);
	        j++;
	                   }
	        }
	        if(j==0) {
	        	System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");      
	        }
	        
	
	  }
	  public static void mostrarArray(int[] arreglo) {
			
			
			System.out.println(" ");
			for(int i=0; i<arreglo.length; i++) {
				
				System.out.println(arreglo[i]);
				
				
			}
			System.out.println(" ");
		}
	
	
}
