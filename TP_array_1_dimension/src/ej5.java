import java.util.Random;

public class ej5 {

	public static void main(String[] args) {
		
		int[] arreglo=new int[20];
		llenarArray(arreglo);
		mayorMenor(arreglo);
		
	}
	
	public static void llenarArray (int[] arreglo) {
		
		System.out.println(" ");
		
		Random random = new Random();
		
		for(int i=0; i<20; i++) {
		
			arreglo[i]= random.nextInt(50) * 2 + 2;
			System.out.println(arreglo[i]);
		}
	}
	
public static void mayorMenor(int arreglo[]) {
		int promedio=0;
		int menorPromedio=0;
		int mayorPromedio=0;
		int igualPromedio=0;
		
		for(int i=0; i<20; i++) {
		
		promedio=promedio+ arreglo[i];
		
		}
		
		promedio=promedio/20;
		
		for(int i=0; i<20; i++) {
			
			if (arreglo[i]>promedio){
				mayorPromedio=mayorPromedio+1;
			}else if(arreglo[i]<promedio) {
			menorPromedio=menorPromedio+1;
			
			}else if (arreglo[i]==promedio) {
			igualPromedio=igualPromedio+1;
		
		}
		}
		System.out.println("el promedio es de: "+ promedio);
		System.out.println("los numeros iguales al promedio son: "+igualPromedio);
		System.out.println("los numeros menores al promedio son: "+menorPromedio);
		System.out.println("los numeros mayores al promedio son: "+mayorPromedio);
		
}

}
	

