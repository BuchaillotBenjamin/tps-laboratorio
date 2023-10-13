import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);		
		
		System.out.println("digame el valor total");
		
		double valorTotal = leer.nextDouble();
		double centavos = (double) (valorTotal % 1);

		int valor = (int) (valorTotal - centavos);
		
		short billete200=0;
		short billete100=0; 
		short billete50=0;
		short billete20=0;
		short billete10=0;
		short billete5=0;
		short billete2=0;
		short billete1=0;
		short moneda050=0;
		short moneda025=0;
		short moneda010=0;
		short moneda005=0;
				
		do {
			
			
			if (valor >= 200) {
				valor = valor-200;
				billete200++;		
			}else if (valor>=100) {
				valor=valor-100;
				billete100++;
			}else if (valor>=50) {
				valor=valor-50;
				billete50++;
			}else if (valor>=20) {
				valor=valor-20;
				billete20++;
			}else if (valor>=10) {
				valor=valor-10;
				billete10++;
			}else if(valor>=5) {
				valor=valor-5;
				billete5++;
			}else if(valor>=2) {
				valor=valor-2;
				billete2++;
			}else if(valor>=1) {
				valor=valor-1;
				billete1++;
			}
			if(centavos>=0.50) {
				centavos = (double)(centavos-0.50);
				moneda050++;
			}else if(centavos>=0.25) {
				centavos=(double)(centavos-0.25);
				moneda025++;
			}else if(centavos>=0.10) {
				centavos=(double)(centavos-0.10);
				moneda010++;
			}else if(centavos>=0.05) {
				centavos=(double)(centavos-0.05);
				moneda005++;
			}
			
			
			
		} while( centavos!=0 && valor!=0);
		
		System.out.println("valor total: "+valorTotal);	
		
		
		System.out.println("");
		
		
		System.out.println("se necesitan "+billete200+" billetes de 200 ");
		
		
		System.out.println("se necesitan "+billete100+" billetes de 100 ");
	
		
		System.out.println("se necesitan "+billete50+" billetes de 50 ");

		
		System.out.println("se necesitan "+billete20+" billetes de 20 ");

		
		System.out.println("se necesitan "+billete10+" billetes de 10 ");

		
		System.out.println("se necesitan "+billete5+" billetes de 5 ");

		
		System.out.println("se necesitan "+billete2+" billetes de 2 ");

		
		System.out.println("se necesitan "+billete1+" billetes de 1 ");

		
		System.out.println("se necesitan "+moneda050+" monedas de 0,50 ");

		
		System.out.println("se necesitan "+moneda025+" monedas de 0,25 ");

		
		System.out.println("se necesitan "+moneda010+" monedas de 0,10 ");

		
		System.out.println("se necesitan "+moneda005+" monedas de 0,05 ");

		
		
		
		
		
		
		
		
	}

}
