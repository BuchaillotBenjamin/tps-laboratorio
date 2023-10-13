import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		double mayor=.0;
		double menor=.0;
		double[] arreglo= new double[20];
		
		llenarArray(arreglo);
		mayorMenor(arreglo,mayor,menor);
		
		
	}
	
	public static void llenarArray (double arreglo[]) {
		Scanner leer = new Scanner(System.in);
		System.out.println("indique 20 numeros ");
		for(int i=0; i<20; i++) {
		
			arreglo[i]=leer.nextDouble();
			
		}
	}
	public static void mayorMenor(double arreglo[], double mayor, double menor) {
		
		for(int i=0; i<20; i++) {
		
			if(arreglo[i]>mayor) {
				mayor=arreglo[i];
			}else if(arreglo[i]<menor);{
				menor=arreglo[i];
			}
		}
		
		System.out.println("el numero mas grande es: "+ mayor);
		System.out.println("el numero mas chico es: "+menor);
		System.out.println("la diferencia entre estos 2 es de: "+ (mayor-menor));
		
	}
	
	
	
	
	
	
	
}
