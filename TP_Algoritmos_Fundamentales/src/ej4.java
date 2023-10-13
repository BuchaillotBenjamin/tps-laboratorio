import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
	int[] arreglo=new int[20];	
	
	llenarArray(arreglo);
	mostrarArray(arreglo);
	
	menu(arreglo);
	
	
	
	
	}
	 public static void menu(int[] arreglo) {
		Scanner leer1=new Scanner(System.in);
		int i=0;
		
		System.out.println("como desea ordenar el arreglo? Asc o Desc ");
		String orden=leer1.nextLine();
		orden=orden.toLowerCase();
		do {
		System.out.println("seleccione el metodo que quiera utilizar "); 	
		System.out.println("1) insercion "); 
		System.out.println("2) burbuja "); 
		System.out.println("3) seleccion "); 
		
		
		int eleccion=leer1.nextInt();
		
		switch(eleccion) {
		case 1:
			insercion(arreglo,orden);
			mostrarArray(arreglo);
			i++;
			break;
		case 2:
			burbuja(arreglo,orden);
			mostrarArray(arreglo);
			i++;
			break;
		case 3:
			seleccion(arreglo,orden);
			mostrarArray(arreglo);
			i++;
			break;
		default:
			System.out.println(" valor incorrecto,intente denuevo "); 	
		
		}
		
	 }while(i==0);
		
	 } 
	    
	 public static void insercion(int[] arreglo, String orden) {
		
	        int n = arreglo.length;
	        System.out.println(" ");
	        for (int i = 1; i < n; i++) {
	            int elementoActual = arreglo[i];
	            int j = i - 1;
	            if (orden.equals("asc")) {
	                while (j >= 0 && arreglo[j] > elementoActual) {
	                    arreglo[j + 1] = arreglo[j];
	                    j--;
	                }
	            } else if (orden.equals("desc")) {
	                while (j >= 0 && arreglo[j] < elementoActual) {
	                    arreglo[j + 1] = arreglo[j];
	                    j--;
	                }
	            }
	            arreglo[j + 1] = elementoActual;
	        }
	    }
	
	 public static void burbuja(int[] arreglo, String orden) {
		 System.out.println(" ");   
		 int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	            	 if (orden.equals("asc") && arreglo[j] > arreglo[j + 1]) {
	                     int temp = arreglo[j];
	                     arreglo[j] = arreglo[j + 1];
	                     arreglo[j + 1] = temp;
	                 } else if (orden.equals("desc") && arreglo[j] < arreglo[j + 1]) {
	                     int temp = arreglo[j];
	                     arreglo[j] = arreglo[j + 1];
	                     arreglo[j + 1] = temp;
	                 }
	            }
	        }
	    }
	
	  public static void seleccion(int[] arreglo, String orden) {
	       
		  System.out.println(" ");
		  int n = arreglo.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	        	  int indice = i;
	              
	              for (int j = i + 1; j < n; j++) {
	                  if ((orden.equals("asc") && arreglo[j] < arreglo[indice]) ||
	                      (orden.equals("desc") && arreglo[j] > arreglo[indice])) {
	                      indice = j;
	                  }
	              }
	            int temp = arreglo[i];
	            arreglo[i] = arreglo[indice];
	            arreglo[indice] = temp;
	        }
	    }
	

	  public static void mostrarArray(int[] arreglo) {
			
			
			System.out.println(" ");
			for(int i=0; i<arreglo.length; i++) {
				
				System.out.println(arreglo[i]);
				
				
			}
			System.out.println(" ");
		}
	  public static void llenarArray (int[] arreglo) {
			
			Scanner leer = new Scanner(System.in);
				System.out.println(" ");
				System.out.println("ingrese los valores del arreglo ");
				for(int i=0; i<20; i++) {
				
					arreglo[i]=leer.nextInt();
					
				}
			}
	
}
