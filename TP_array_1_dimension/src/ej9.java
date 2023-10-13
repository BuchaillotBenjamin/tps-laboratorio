import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		
		int dni= pedirDni();
		
		String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"} ;
		
		String letraDni = encontrarLetra(dni,letra);
		
		agregarLetra(dni,letraDni);
		
	}
	
	public static int pedirDni () {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("ingrese su numero de DNI sin letra");
		
		int dni=leer.nextInt();
		return dni;
		
		}
	
	public static String encontrarLetra (int dni,String[] letra) {
		
		dni=dni%23;
		
		return letra[dni];
		
		}
	
	public static void agregarLetra (int dni,String letra) {
		
		String dniConLetra = dni + letra;
		
		imprimir(dniConLetra,letra);
		
		}
	
	public static void imprimir (String dniNuevo,String letra) {
		
		System.out.println("la letra que le corresponde a su DNI es: "+letra);
		System.out.println("su DNI con letra es: "+dniNuevo);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
