import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Indique el tamaño de la matriz");
		System.out.println("X debe ser mayor o igual que 4 y menor o igual que 10");
		
		int x=0;
		int i = 1;
		boolean arregloLleno=false;
		int fila=-1;
		int columna=-1;
		String respuesta;
		
		do {
				
			int aux = leer1.nextInt();
			
			if(aux>=4 && aux<=10) {
				
				x=aux;
			}
		
		}while(x==0);
		
		int[][]arreglo=new int[x][x];
	
		leer1.nextLine();
		
		do {
			
		System.out.println(" ");
		System.out.println("----------------MENU---------------- "); 
		System.out.println("A) Llenar Matriz ");
		System.out.println("B) Sumar fila especifica "); 
		System.out.println("C) Sumar una columna especifica "); 
		System.out.println("D) Sumar diagonal principal "); 
		System.out.println("E) Sumar diagonal inversa "); 
		System.out.println("F) Media de todos los valores "); 
		System.out.println("G) Salir "); 
		System.out.println(" ");
		
		
			
			respuesta=leer1.nextLine();
			
			respuesta=respuesta.toUpperCase();
			
			switch(respuesta){
			case"A":
				
				if(arregloLleno==false) {
					
					arreglo=llenarArray(arreglo);
					arregloLleno=true;
					break;
					
				} else if(arregloLleno==true){
					
					System.out.println("La matriz ya esta llena ");
					break;
					
				}
				
			case"B":
				if(arregloLleno==false) {
					
					System.out.println("Primero debez llenar la matriz ");
					break;
					
				} else {
					
				System.out.print("Ingrese el número de la fila a sumar, mayor o igual que 0 y menor o igual que "+(x-1));
				
				do {
						
					int j = leer1.nextInt();
					
					if(j>=0 && j<=x) {
						fila=j;
					}
				
				}while(fila==-1);
				 	leer1.nextLine();

                	System.out.println("La suma de la fila " + fila + " es: " + sumarFila(arreglo, fila, x));
                	break;
                	
				}     
				
				
				
			case"C":
				if(arregloLleno==false) 
				{
					System.out.println("Primero debez llenar la matriz ");
					break;
					
				} else {
					
					System.out.print("Ingrese el número de la columna a sumar, debe ser mayor o igual que 0 y menor o igual que "+(x-1));
					
					do {
						
						int j = leer1.nextInt();
						
						if(j>=0 && j<=x) {
							columna=j;
						}
					
					}while(columna==-1);
					
					 leer1.nextLine();

                    System.out.println("La suma de la columna " + columna + " es: " +  sumarColumna(arreglo, columna, x));
                    break;
                    
                    } 
					
				
				
			case"D":
				if(arregloLleno==false) {
					
					System.out.println("Primero debez llenar la matriz ");
					break;
					
				} else {
				      
					System.out.println("La suma de la diagonal principal es: " +sumarDiagonalPrincipal(arreglo, x));
					break;
				}
				
			case"E":
				if(arregloLleno==false) {
					
					System.out.println("Primero debez llenar la matriz ");
					break;
					
				} else {
					
				    System.out.println("La suma de la diagonal inversa es: " + sumarDiagonalInversa(arreglo, x));
				    break;
				    
				}
				
			case"F":
				if(arregloLleno==false) {
					
					System.out.println("Primero debez llenar la matriz ");
					break;
					
				} else {
					
					System.out.println("La media de todos los valores de la matriz es: " + calcularMediaMatriz(arreglo, x));
					break;
				}
				
			case"G":
				i=0;
				break;
			default:
				System.out.println("Valor ingresado incorrecto intente denuevo ");
				break;
			}
			
		}while(i!=0);
		}
		
	public static int[][] llenarArray (int[][] arreglo) {
		
		Scanner leer3 = new Scanner(System.in);
		
		System.out.println("indique los valores del arreglo");
		
		for(int i=0; i<arreglo.length; i++) {
			for(int j=0; j<arreglo.length; j++) {
				
				arreglo[i][j]=leer3.nextInt();
				
			}
		}
		
		return arreglo;	
	}
	
	 public static int sumarFila(int[][] matriz, int fila, int x) {
		 
	        int suma = 0;
	        
	        for (int j = 0; j < x; j++) {
	        	
	            suma += matriz[fila][j];
	            
	        }
	        return suma;
	    }
	
	 public static int sumarColumna(int[][] matriz, int columna, int x) {
		 
	        int suma = 0;
	        
	        for (int i = 0; i < x; i++) {
	        	
	            suma += matriz[i][columna];
	            
	        }
	        return suma;
	    }
	
	  public static int sumarDiagonalPrincipal(int[][] matriz, int x) {
		  
	        int suma = 0;
	        
	        for (int i = 0; i < x; i++) {
	        	
	            suma += matriz[i][i];
	            
	        }
	        return suma;
	    }
	 
	  public static int sumarDiagonalInversa(int[][] matriz, int x) {
		  
	        int suma = 0;
	        
	        for (int i = 0; i < x; i++) {
	        	
	            suma += matriz[i][x - 1 - i];
	            
	        }
	        return suma;
	    }
	  
	  public static double calcularMediaMatriz(int[][] matriz, int x) {
		  
	        int sumaTotal = 0;
	        
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < x; j++) {
	            	
	                sumaTotal += matriz[i][j];
	                
	            }
	        }
	        return (double) sumaTotal / (x * x);
	    }
	  
	  
	 
	 
	 
	 
	 
	}
	
	
