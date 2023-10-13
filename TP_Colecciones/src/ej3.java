import java.util.ArrayList;
import java.util.Random;


public class ej3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		llenar(numeros);
		mostrarLista(numeros);
		promedio(numeros);
		
		
	}

	public static ArrayList<Integer> llenar( ArrayList<Integer> numeros ) {
		Random rand = new Random();
		int j;
		int i=0;
		
		do {
			
			j=rand.nextInt(100) + 1;
			
			if(j%2==0 && j>0) {
			numeros.add(j);
			i++;
			}
			
				
			}while(i<20);
			
		
		return numeros;
		
	}
	
	public static void mostrarLista( ArrayList<Integer> numeros ) {
		System.out.println("lista llena con los numeros aleatorios: ");
		
		for(Integer i : numeros){
			
			System.out.println("Nro: " + i );
			
		}
		
		
	}
	
	public static void promedio( ArrayList<Integer> numeros ) {
		
		int promedio=0;
		int mayores=0;
		int menores=0;
		int iguales=0;
		
		for(Integer i : numeros){
			
			promedio+=i;
			
		}
		
		promedio=promedio/20;
		
		for(Integer i : numeros){
			
			if (i>promedio) {
				mayores++;
				
			}else if(i<promedio) {
				menores++;
				
			}else if(i==promedio) {
				iguales++;
				
			}
			
		}
		System.out.println("promedio: "+promedio+", cantidad de numeros mayores al promedio: "+mayores+", iguales: "+iguales+" y menores: "+menores);
		
	}
	
}
