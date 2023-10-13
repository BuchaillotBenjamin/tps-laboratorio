import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int j=1;
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		do {
			
			System.out.println("Ingrese el nombre del alumno o ingrese 0 para salir ");
			String nombreAlumno=leer.nextLine();
			
			if(!nombreAlumno.equals("0")) {
				
			System.out.println("Ingrese el legajo del alumno ");
			Long legajo=leer.nextLong();
			
			Alumno alumno = new Alumno(nombreAlumno,legajo,cargarNotas()); 
			alumnos.add(alumno);
			
			}
			else if(nombreAlumno.equals("0")) {
				
				j=0;
				System.out.println(" ");
				System.out.println("Ingreso 0");
				System.out.println("Presione enter");
			}
			
			leer.nextLine();
		}while(j!=0);
		
		
		System.out.println(" ");
		System.out.println("Ahora voy a mostrar todos los alumnos y sus respectivas notas ");
		mostrarAlumnosNotas(alumnos);
	}

	public static ArrayList<Nota> cargarNotas() {
		Scanner leer1=new Scanner(System.in);
		
		ArrayList<Nota> notas = new ArrayList<Nota>();
		int j=1;
		String catedra;
		Double nota;
		
		do {
			int i=0;
			System.out.println("Ingrese la catedra ");
			catedra=leer1.nextLine();
			
			do {
				System.out.println("Ingrese la nota ");
				nota=leer1.nextDouble();
			if(nota>=0 && nota<=10) {
				i=1;
			}else {
				System.out.println("Valor incorrecto, intente nuevamente");
			}
			leer1.nextLine();
			}while(i==0);
			
			Nota notaAlumno = new Nota(catedra, nota);
		    notas.add(notaAlumno);
		    
			System.out.println("Si desea dejar de cargar notas a este alumno ingrese 0, para continuar toque cualquier tecla");
			String valor=leer1.nextLine();
			
			if (valor.equals("0")){
				j=0;
			}
			
		}while(j==1);
		
		return notas; 
	}
	
	public static void mostrarAlumnosNotas(ArrayList<Alumno> alumnos) {
		for (Alumno alumno: alumnos) {
			System.out.println("--------------------------------");
			 ArrayList<Nota> notasAlumno = alumno.getNotasAlumno();
			 System.out.println("Nombre del alumno: "+alumno.getNombreCompleto());
			 System.out.println("Legajo del alumno: "+alumno.getLegajo());
			 
			    for (Nota nota : notasAlumno) {
			    	
			    	 System.out.println("Catedra: "+nota.getCatedra());
					 System.out.println("Nota: "+nota.getNotaExamen());
			}
		}
	}
	
	
}
