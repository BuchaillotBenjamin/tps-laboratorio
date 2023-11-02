package practicaParcial;

import java.util.List;
import java.util.Scanner;

public class calculoBonoSueldo {

	public static void main(String[] args) {
		
		String[][] haberes = {
			    {"100", "Presentismo", "9"},
			    {"101", "Titulo Profesional", "9"},
			    {"102", "Horas Extraordinarias", "M"},
			    {"103", "Horas Nocturnas", "M"},
			    {"104", "Otros Haberes", "M"}
			};

		String[][] deducciones = {
			    {"200", "Obra Social", "3"},
			    {"201", "Jubilacion", "11"},
			    {"202", "Sindicato", "2"},
			    {"203", "Seguro", "1.5"},
			    {"204", "Otros", "M"}
			};
		
		String[][] bonoCalculado=new String[10][4];
		bonoCalculado[0][0]="Codigo Item";
		bonoCalculado[0][1]="Denominacion";
		bonoCalculado[0][2]="Haberes";
		bonoCalculado[0][3]="Deducciones";
		
		List<Integer> codigosIngresados = null;

		empleado empleadoNuevo=llenarEmpleado();
		System.out.println(" ");
		bonoSueldo bonoNuevo=llenarBono(empleadoNuevo);
		System.out.println(" ");
		bonoCalculado[1][1]="Sueldo basico";
		bonoCalculado[1][2]="Antiguedad";
		bonoCalculado[2][1]=String.valueOf(empleadoNuevo.getSueldoBasico());
		bonoCalculado[2][2]=String.valueOf(empleadoNuevo.getMontoAntiguedad());
		System.out.println(" ");
		bonoCalculado=llenarBonoCalculado(empleadoNuevo,bonoCalculado,codigosIngresados);
	}
	
	public static empleado llenarEmpleado() {
		Scanner leer=new Scanner(System.in);
		boolean salida=false;
		String nombre;
		long cuil;
		int anioIngreso;
		double montoAntiguedad;
		double sueldoBasico;
		
		System.out.println("A continuacion ingrese los datos del empleado ");
		System.out.println("Nombre completo: ");
		nombre=leer.nextLine();
		nombre=nombre.toUpperCase();
		
		do {
		System.out.println("Cuil (solo numeros): ");
		cuil=leer.nextLong();
		
		if(cuil>=99999999 ) {
			salida=true;
		}else {
			System.out.println("Valor incorrecto, intente nuevamente ");
			salida=false;
		}
		
		}while(salida==false);
		
		salida=false;
		
		do {
			System.out.println("Año de ingreso: ");
			anioIngreso=leer.nextInt();
			if (anioIngreso<1960 || anioIngreso>2023) {
				System.out.println("Valor incorrecto, intente nuevamente ");
				salida=false;
			}else {
				salida=true;
			}
			
		}while(salida== false);
		
		salida=false;
				
		do {
			System.out.println("Sueldo basico: ");
			sueldoBasico=leer.nextDouble();
			
			if(sueldoBasico<=0) {
				System.out.println("Valor incorrecto, intente nuevamente ");
				salida=false;
			}else {
				salida=true;
			}
			
			
			
		}while(salida==false);
		
		double aux=(2023-anioIngreso)*2;
		montoAntiguedad=(sueldoBasico*aux)/100;
		
		System.out.println("Monto antiguedad: "+montoAntiguedad);
		
		empleado empleado=new empleado(nombre,cuil,anioIngreso,montoAntiguedad,sueldoBasico);
		
		return empleado;		
	}
	
	
	public static bonoSueldo llenarBono(empleado empleado){
		Scanner leer1=new Scanner(System.in);
		
		int mesLiquidacion;
		int anioLiquidacion;
		double montoLiquidacion;
		boolean salida=false;
		System.out.println("ingrese los datos del bono de sueldo del empleado: "+empleado.getNombreEmpleado()+" Cuil:"+empleado.getCuil());
		
		do {
			System.out.println("Año liquidacion: ");
			anioLiquidacion=leer1.nextInt();
			if (anioLiquidacion<empleado.getAnioIngreso()||anioLiquidacion>2023) {
				System.out.println("Valor incorrecto, intente nuevamente ");
				salida=false;
			}else {
				salida=true;
			}
			
			
		}while(salida==false);
		
		salida=false;
		
		do {
			System.out.println("Mes liquidacion: ");
			mesLiquidacion=leer1.nextInt();
			
			if (mesLiquidacion >12||mesLiquidacion<=0) {
				System.out.println("Valor incorrecto, intente nuevamente");
				salida=false;
			}else {
				
				salida=true;
			}	
		}while(salida==false);
		
			salida=false;
		
		do {
			System.out.println("Monto de liquidacion: ");
			montoLiquidacion=leer1.nextDouble();
			
			if (montoLiquidacion<=0||montoLiquidacion>empleado.getSueldoBasico()+empleado.getMontoAntiguedad()) {
				System.out.println("Valor incorrecto, intente nuevamente ");
				salida=false;
			}else {
				salida=true;
			}
			
		}while(salida==false);
		
		bonoSueldo bonoNuevo=new bonoSueldo(empleado,mesLiquidacion,anioLiquidacion,montoLiquidacion);
		empleado.getBonos().add(bonoNuevo);
		
		return bonoNuevo;
	}
	
	
	public static String[][] llenarBonoCalculado(empleado empleado,String[][] bonoCalculado,List<Integer> codigosIngresados ){
		Scanner leer2= new Scanner(System.in);
		
		String denominacion;
		String haberes;
		int codigoItem;
		boolean salida=false;
		boolean salida2=false;
		int contHaberes=0;
		int i=2;
		
		System.out.println("ingrese los haberes del empleado o 000 para salir "+empleado.getNombreEmpleado());
		do {
			i++;
			System.out.println("Haber: ");
			haberes=leer2.next();
			if(haberes!="000") {
				if(Double.parseDouble(haberes)>0) {
					System.out.println("Denominacion: ");
					denominacion=leer2.next();
					
					do {
						System.out.println("ingrese el codigo de "+ denominacion);	
						codigoItem=leer2.nextInt();
						if (codigoItem>0) {
							
							if (palabraNoEncontrada(bonoCalculado,denominacion)==true ) {
								if(palabraNoEncontrada(bonoCalculado,String.valueOf(codigoItem))==true) {
							bonoCalculado[i][0]=String.valueOf(codigoItem);
							bonoCalculado[i][1]=denominacion;
							bonoCalculado[i][2]=haberes;
							codigosIngresados.add(codigoItem);
							contHaberes++;
								}else {
									System.out.println("El codigo "+codigoItem+" ya fue ingresado");
								}
							
							}else {
								System.out.println("La denominacion "+denominacion+" ya fue ingresada");
							}
							salida2=true;
						}
					}while(salida2=false);
					
					
				}else {
					System.out.println("valor incorrecto, intente nuevamente ");
				}
				
			}else {
				if(contHaberes==0) {
				salida=true;
				}else {
					System.out.println("debe ingresar minimo 1 haber ");

				}
				}
			
		}while(salida==false);
		
		
		
		
		return bonoCalculado;
	}
	
	public static boolean palabraNoEncontrada(String[][] matriz, String palabraBuscada) {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            if (matriz[i][j].equals(palabraBuscada)) {
	                // La palabra fue encontrada en la matriz
	                return false;
	            }
	        }
	    }
	    
	    // La palabra no fue encontrada en la matriz
	    return true;
	}
	
	
	
	
	

}
