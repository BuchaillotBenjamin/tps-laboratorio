
public class fraccion {

	int numerador;
	int denominador;
	
	public fraccion(int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public int getnumerador() {
		return numerador;	
	}
	public void setnumerador(int numerador) {
		this.numerador=numerador;
	}

	public int getdenominador() {
		return denominador;	
	}
	public void setdenominador(int denominador) {
		this.denominador=denominador;
	}
	
	
	
	
	
	public static fraccion sumarFracciones(fraccion f1, fraccion f2){ 
		
		int nuevoDenominador = f1.denominador * f2.denominador;
        int nuevoNumerador = (f1.numerador * f2.denominador) + (f2.numerador * f1.denominador);
        
        return new fraccion(nuevoNumerador, nuevoDenominador);
	}  
	
	public static fraccion restarFracciones(fraccion f1, fraccion f2){ 
		int nuevoNumerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
		int nuevoDenominador = f1.denominador * f2.denominador;
		
		return new fraccion(nuevoNumerador, nuevoDenominador);
	}  
	
	public static fraccion multiplicarFracciones(fraccion f1, fraccion f2){ 
		int nuevoNumerador = f1.numerador * f2.numerador;
        int nuevoDenominador = f1.denominador * f2.denominador;
	
		return new fraccion(nuevoNumerador, nuevoDenominador);	
	}  
	
	public static fraccion dividirFracciones(fraccion f1, fraccion f2){ 
		int nuevoNumerador = f1.numerador * f2.denominador;
        int nuevoDenominador = f1.denominador * f2.numerador;

		return new fraccion(nuevoNumerador, nuevoDenominador);
	}  

	
	
	 public String toString() {
	        return numerador + "/" + denominador;
	    }
	
}
