import java.util.Scanner;

public class OperacionesFraccion {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("ingrese el numerador y denominador de la primera fraccion");
		fraccion f1 = new fraccion(leer.nextInt(), leer.nextInt());
		
		System.out.print("ingrese el numerador y denominador de la segunda fraccion");
		fraccion f2 = new fraccion(leer.nextInt(), leer.nextInt());
		
		System.out.println("fraccion 1= "+f1);
		System.out.println("fraccion 2= "+f2);
		
		System.out.println(" ");
		fraccion suma = fraccion.sumarFracciones(f1,f2);
		System.out.print("suma = " + suma);
		
		System.out.println(" ");
		fraccion resta = fraccion.restarFracciones(f1,f2);
		System.out.print("resta = " + resta);
		 
		System.out.println(" ");
		fraccion multiplicacion = fraccion.multiplicarFracciones(f1,f2);
		System.out.print("multiplicacion = " + multiplicacion);
		
		System.out.println(" ");
		fraccion division = fraccion.dividirFracciones(f1,f2);
		System.out.print("division = " + division);
		 
		System.out.println(" ");
	}

}
