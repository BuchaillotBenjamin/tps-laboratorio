
public class Nota {

	private String catedra;
	private Double notaExamen;
	
	public Nota (String catedra, Double notaExamen ) {
		this.catedra=catedra;
		this.notaExamen=notaExamen;
	}
	
		public String getCatedra() {
	        return catedra;
	    }
	    public void setCatedra(String catedra) {
	        this.catedra = catedra;
	    }

	    public Double getNotaExamen() {
	        return notaExamen;
	    }
	    public void setNotaExamen(Double notaExamen) {
	        this.notaExamen = notaExamen;
	    }
	
}
