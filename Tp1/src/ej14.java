import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = new Double(Math.random() * 100).intValue();
		
		System.out.println(x);
		
		int salida = 0 ;
		
		do {
			System.out.println("diga un numero entre 0 y 100");
			int b = sc.nextInt();
			
			if (b>x) {
				System.out.println("");
				System.out.println("es muy alto");
			}else if (b<x) {
				System.out.println("");
				System.out.println("es muy bajo");
			}else {
				System.out.println("");
				System.out.println("Corecto!!!");
				salida=1;
			}
			
		}while (salida == 0);
		
		
		
		
		
		
		
		
		
		
		
	}

}
