import java.util.ArrayList;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		ArrayList<Double> numeros= new ArrayList<Double>();
		llenar(numeros);
		menorMayor(numeros);
		
	}
	
	public static ArrayList<Double> llenar( ArrayList<Double> numeros ) {
		Scanner leer=new Scanner(System.in);
		double j;
		
		System.out.println("ingrese 20 valores");
		
		for(int i=0 ; i<20 ; i++) {
		
		j=leer.nextDouble();	
		numeros.add(j);
			
		}
		
		return numeros;
		
	}
	
	public static void menorMayor( ArrayList<Double> numeros ) {
		System.out.println(" ");
		double mayor= numeros.get(0);
		double menor= numeros.get(0);
		
		for(Double i : numeros){
			
			if(i<menor) {
				
				menor=i;
				
			}else if(i>mayor){
				
				mayor=i;
				
			}
			
		}
		
		System.out.println("el numero mas grande de la lista es: "+ mayor +" y el mas chico es: "+ menor );
		
	}
	
}
