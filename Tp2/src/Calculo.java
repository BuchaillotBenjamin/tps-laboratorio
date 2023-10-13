

public class Calculo {

	public static void main(String[] args) {
		 
	        
	      
		operacionMatematica operacion1 = new operacionMatematica();
		operacion1.setvalor1(25.25); 
		operacion1.setvalor2(15.15);
		operacion1.setoperacion(null);
		
	    double resultado=0.0;
	    int i = 0;
		for (i =0;i<4;i++) {
			
			switch(i){
			 
		case 0 :
		operacion1.setoperacion("+");
		resultado = operacion1.aplicarOperacion("+");
		System.out.println("Resultado de " + operacion1.getvalor1() + " " + "+" + " " + operacion1.getvalor2() + " = " + resultado);
		break;
		case 1 :
		operacion1.setoperacion("-");
		resultado = operacion1.aplicarOperacion("-");
		System.out.println("Resultado de " + operacion1.getvalor1() + " " + "-" + " " + operacion1.getvalor2() + " = " + resultado);
		break;
		case 2 :
		operacion1.setoperacion("*");
		resultado = operacion1.aplicarOperacion("*");
		System.out.println("Resultado de " + operacion1.getvalor1() + " " + "*" + " " + operacion1.getvalor2() + " = " + resultado);
		break;	
		case 3 :
		operacion1.setoperacion("/");
		resultado = operacion1.aplicarOperacion("/");
		System.out.println("Resultado de " + operacion1.getvalor1() + " " + "/" + " " + operacion1.getvalor2() + " = " + resultado);
		break;
			
		}
			
		}
	}
}		
			
	
		
		
		
		
		
		
		
		
		
		
		
	

	


