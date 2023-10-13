import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		
		String stringArreglo= llenarArray();
		
		String[] arregloString = stringArreglo.split("-");
		
		int[] arregloInt=cambiarInt(arregloString);	
		
		mostrarArray(arregloInt);
		
		sumaPromedio(arregloInt);
		
		
		
	}
	public static void sumaPromedio (int[]arreglo) {
		System.out.println(" ");
		
		int suma=0;
		double promedio=0;
	
		for (int i = 0; i < arreglo.length; i++) {
        
    	suma = suma+arreglo[i];
    	
    	}
	
		promedio = suma/arreglo.length;
		
		System.out.println("la suma de todos los numeros es de: "+suma+", y el promedio es de: "+promedio);
		
		}

	public static String llenarArray () {
		
		//77-64-4-7-0-11-21-53-96-99-48-25
		String arregloString;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("ingrese el arrgelo en un mensaje separado por guines medios");
		
		arregloString=leer.nextLine();
		
		return arregloString;
		
		}
	
	public static void mostrarArray(int[] arreglo) {
		
		System.out.println(" ");
		System.out.println("string convertido a array: ");
		for (int subcadena : arreglo) {
			
	        System.out.print(subcadena+ " ");
	        }
		
		}
	
	public static int[] cambiarInt(String[] arreglo) {
	
		int[] arregloInt = new int[arreglo.length];
			
		for (int i = 0; i < arreglo.length; i++) {
        
        	arregloInt[i] = Integer.parseInt(arreglo[i]);
		}
		
		return arregloInt;	
		
		}

}
