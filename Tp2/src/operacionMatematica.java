

public class operacionMatematica {

	
	private double valor1;	
	private double valor2;		  
	private String operacion;

	public double getvalor1() {
		return valor1;	
	}
	public void setvalor1(double valor1) {
		this.valor1=valor1;
	}
	
	public double getvalor2() {
		return valor2;	
	}
	public void setvalor2(double valor2) {
		this.valor2=valor2;
	}
	
	
	public String getoperacion() {
		return operacion;	
	}
	public void setoperacion(String operacion) {
		this.operacion=operacion;
	}
	
	
	private double sumarNumeros(){ return valor1 + valor2; 
	
	} 
	private double restarNumeros(){ return valor1 - valor2;
	
	} 
	private double multiplicarNumeros(){ return valor1 * valor2; 
	
	} 
	private double dividirNumeros(){ return valor1 / valor2; 
	
	} 
	
	
	
	 public double aplicarOperacion(String operacion) {
	        this.operacion = operacion;
	        switch (operacion) {
	            case "+":
	            	return sumarNumeros();
	            case "-":
	            	return restarNumeros();
	            case "*":
	            	return multiplicarNumeros();
	            case "/":
	            	return dividirNumeros();
	            default:
	                throw new IllegalArgumentException();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
	
	
	
	

