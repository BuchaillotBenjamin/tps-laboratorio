import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
		
	int i=1;
	int[] stock= {10,50,50,10,10,10,10,20,10,15,20,10};
	String respuesta;
	String[][] maquina= {
		
			{"KitKat", "32", "10"},
			{"Chicles", "2", "50"},
			{"Caramelos de Menta", "2", "50"},
			{"Huevo Kinder", "25", "10"},
			{"Chetoos", "30", "10"},
			{"Twix", "26", "10"},
			{"M&M'S", "35", "10"},
			{"Papas Lays", "40", "20"},
			{"Milkybar", "30", "10"},
			{"Alfajor Tofi", "20", "15"},
			{"Lata Coca", "50", "20"},
			{"Chitos", "45", "10"}
	};
	
	do {
		
		System.out.println(" ");
		System.out.println("----------------MENU---------------- "); 
		System.out.println("A) Pedir golosina ");
		System.out.println("B) Mostrar golsinas "); 
		System.out.println("C) Rellenar golosinas "); 
		System.out.println("D) Apagar maquina "); 
	
			respuesta=leer.nextLine();
			
			respuesta=respuesta.toUpperCase();
			
			switch(respuesta){
			case"A":
				pedirGolosina(maquina,stock);
				break;		
				
			case"B":
				mostrarGolosinas(maquina,stock);
				break;	
				
			case"C":
				cargarGolosina(maquina,stock);
				break;
				
			case"D":
				i=0;
				System.out.println("Apagando...");
				break;
				
			default:
				System.out.println("Valor ingresado incorrecto intente denuevo ");
				break;
			}
			
		}while(i!=0);
	
	
		}
	
	
	public static void mostrarGolosinas(String[][] golosina,int[] stock) {
		int j=0;
		int i=0;
		
	    System.out.println(" ");
	    System.out.println("Golosina---Precio---Stock "); 
	    System.out.println(" ");
	    
	    for ( i = 0; i <12 ; i++) {
	    	
	    	System.out.println(i+1+") "+golosina[i][0]+"---"+golosina[i][1]+"---"+golosina[i][2]); 
    	    	System.out.println(" "); 
	    	
	        	}
	        System.out.println(" "); 
	        
	    }
	
	public static void pedirGolosina(String[][] maquina,int stock[]) {
		Scanner leer1 = new Scanner(System.in);
		int i=1;
		do {
			System.out.println("ingrese la golosina que quiera "); 	
			
			int golosina=leer1.nextInt();
			
			golosina=golosina-1;
			
			if (golosina >= 0 && golosina < 12) {
			   
			    if (stock[golosina] > 0) {
			    	
			        stock[golosina] = stock[golosina] - 1;
			        maquina[golosina][2] = String.valueOf(stock[golosina]);
			        System.out.println("Retirando " + maquina[golosina][0] + " nuevo stock: " + stock[golosina]);
			        System.out.println(" ");
			        i = 0;
			        break;
			        
			    } else {
			    	
			        System.out.println("No queda stock ");
			        System.out.println(" ");
			        
			    }
			} else {
				
			    System.out.println("Valor incorrecto, intente nuevamente ");
			    System.out.println(" ");
			    
			}
			
		}while(i!=0); 
		
		 System.out.println(" "); 
	        
		} 

	public static void cargarGolosina(String[][] maquina,int[] stock) {
		Scanner leer2 = new Scanner(System.in);
		int j=1;
		int i=0;
		int k=1;
		int golosina;
		int cantidad;
		String contraseña="AdminXYZ";
		String respuesta;
		
		do {
			System.out.println("Ingrese la contraseña, tienes 5 intentos "); 
			respuesta=leer2.nextLine();
			
			if(respuesta.equals(contraseña)) {
				
				do {
					System.out.println("Ingrese la golosina que quiera recargar"); 
					golosina=leer2.nextInt();
					golosina=golosina-1;
					if(golosina>=0 && golosina<12) {
						j=0;
					}else {
						System.out.println("Valor ingresado incorrecto");	
						System.out.println(" ");	
					}
					
				}while(j!=0);
				
				
			do {
				System.out.println("ingrese la cantidad de golosinas que va a ingresar ");
				
				cantidad=leer2.nextInt();
				
				if(cantidad>0) {
					
					stock[golosina]+=cantidad;
					maquina[golosina][2]=String.valueOf(stock[golosina]);
					
					System.out.println("Nueva cantidad disponible: "+ maquina[golosina][2]);
					
					k=0;
					i=99;
				}else {
					System.out.println("Valor ingresado incorrecto");	
					System.out.println(" ");	
				}
				
			}while(k!=0);
			
			}
			i++;
			
			}while(i<5);
		
	        System.out.println(" "); 
	        
	    }
	
	
	
	
	
	
	
	}
	
	
