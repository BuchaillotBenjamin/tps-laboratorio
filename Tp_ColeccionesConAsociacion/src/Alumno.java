import java.util.ArrayList;

public class Alumno {

	private String nombreCompleto;
	private long legajo;
	ArrayList<Nota> notasAlumno = new ArrayList<Nota>();
	
	public Alumno(String nombreCompleto,long legajo,ArrayList<Nota> notasAlumno) {
		
		this.nombreCompleto=nombreCompleto;
		this.legajo=legajo;
		this.notasAlumno=notasAlumno;
	}
		public String getNombreCompleto() {
	        return nombreCompleto;
	    }
	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	    }

	    public long getLegajo() {
	        return legajo;
	    }
	    public void setLegajo(long legajo) {
	        this.legajo = legajo;
	    }

	    public ArrayList<Nota> getNotasAlumno() {
	        return notasAlumno;
	    }
	    public void agregarNota(Nota nota) {
	        notasAlumno.add(nota);
	    }
	
}
