import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {

		Scanner Leer = new Scanner(System.in);

		String frase = "HoLa MuNdO";
		
		System.out.println("convertir la siguiente frase,"+ frase+". minuscula o mayuscula");
		
		
		System.out.println("1 = MAYUSCULAS , 0 = minusculas");
		
		int rta = Leer.nextInt();
		
		if (rta==1) {
			
			frase=frase.toUpperCase();
			System.out.println(frase);
			
		} else if(rta==0) {
			
			frase=frase.toLowerCase();
			System.out.println(frase);
			
		}else {
			
			System.out.println("respuesta incorrecta");
		}
		
		
		
		
		
		
		
		
		
	}

}
