
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class altaAmbiente {

    static String [][] tiposAmbiente = {{"P","Pieza"}, {"B","Baño"}, {"C","Cocina"}, {"PA","Patio"},
{"L","Lavanderia"}};
    static HashMap<String, String> provinciasMap = new HashMap<>();
    static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args) {
        provinciasMap.put("1","Buenos Aires");
        provinciasMap.put("2","Catamarca");
        provinciasMap.put("3","Chaco");
        provinciasMap.put("4","Chubut");
        provinciasMap.put("5","Córdoba");
        provinciasMap.put("6","Corrientes");
        provinciasMap.put("7","Entre Ríos");
        provinciasMap.put("8","Formosa");
        provinciasMap.put("9","Jujuy");
        provinciasMap.put("10","La Pampa");
        provinciasMap.put("11","La Rioja");
        provinciasMap.put("12","Mendoza");
        provinciasMap.put("13","Misiones");
        provinciasMap.put("14","Neuquén");
        provinciasMap.put("15","Río Negro");
        provinciasMap.put("16","Salta");
        provinciasMap.put("17","San Juan");
        provinciasMap.put("18","San Luis");
        provinciasMap.put("19","Santa Cruz");
        provinciasMap.put("20","Santa Fe");
        provinciasMap.put("21","Santiago del Estero");
        provinciasMap.put("22","Tierra del Fuego");
        provinciasMap.put("23","Tucumán"); 
        
        System.out.println("");
        vivienda nuevaCasa=llenarVivienda();
        
        
        
    }
    
    public static vivienda llenarVivienda(){
        vivienda nuevaCasa = new vivienda();
        String calle;
        String provincia;
        int nroCalle;
        ArrayList<ambiente>ambientes= new ArrayList<>();
        boolean salida=false;
        
        System.out.println("Ingrese el nombre de la calle:");
        calle=leer.nextLine();
        
        do{
        System.out.println("Ingrese el numero de la calle:");
        nroCalle=leer.nextInt();
        if(nroCalle>0){
            salida=true;
        }else{
            System.out.println("Valor ingresado incorrecto");
        }
        
        }while(salida==false);
        salida=false;
        
        
        do{
        System.out.println(provinciasMap);    
           System.out.println("");
           System.out.println("Ingrese el codigo de la provincia");
           provincia=leer.next();
           if (provinciasMap.containsKey(provincia)==true){
               provincia =provinciasMap.get(provincia);
               salida=true;
           }else{
               System.out.println("Valor ingresado incorrecto");
           }
        }while(salida==false);
        salida=false;
        ambientes=llenarAmbientes();
        
        
        return nuevaCasa;
    }
    public static ArrayList<ambiente>llenarAmbientes(){
        ArrayList<ambiente>ambientes= new ArrayList<>();
        boolean salida=false;
        String tipoAmbiente;
        double metrosCuadrados;
        ambiente ambienteAgregar=new ambiente();
        String salida1;
        int cantAmbientes=0;
        int cantBaños=0;
        do{
        do {
            
            System.out.println("Ingrese el tipo de ambientes que desea agregar, minimo debe haber un baño");
            mostrarAmbientes();
            
            String tipo=leer.next();
            tipoAmbiente=tipoAmbiente(tipo);
            if (tipoAmbiente.equals("0")){
                System.out.println("Valor incorrecto");
            }else{
                salida=true;
                 if(tipoAmbiente.equals("Baño")){
                    cantBaños++;
        }
            }
        }while(salida==false);
        salida=false;
        do {
            System.out.println("Ingrese los metros cuadrados de este ambiente");
            metrosCuadrados=leer.nextDouble();
            if(metrosCuadrados>0){
                salida=true;
            }else{
                System.out.println("Valor incorrecto");
            }
            
            
        }while(salida==false);
        
        ambienteAgregar.setTipoAmbiente(tipoAmbiente);
        ambienteAgregar.setMetrosCuadrados(metrosCuadrados);
        ambientes.add(ambienteAgregar);
        cantAmbientes++;
        
        
        
        
        salida=false;
        if (cantAmbientes>=2&&cantBaños>=1){
        System.out.println("Para ingresar otro ambiente pulse 1, para salir ingrese cualquier tecla");
        salida1=leer.next();
        if(salida1.equals("1")){
            salida=false;
        }else{
            salida=true;
        }
        }
        }while(salida==false);
        
        return ambientes;
    }
    
    public static String tipoAmbiente(String tipo){
        String tipoAmbiente;
        tipo=tipo.toUpperCase();
                
        for(int i=0;i<5;i++){
            
            if (tipo.equals(tiposAmbiente[i][0])){
               tipoAmbiente=tiposAmbiente[i][1];
               return tipoAmbiente;
            }
        }
        tipoAmbiente="0";
        
        
        return tipoAmbiente;
    }
    public static void mostrarAmbientes(){
        
        for (int i=0;i<5;i++){
            System.out.println(tiposAmbiente[i][0]+" = "+tiposAmbiente[i][1]);
        }
        
    }
}
