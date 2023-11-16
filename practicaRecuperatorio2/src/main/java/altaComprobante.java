
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class altaComprobante {

    static String [][] tiposComprobante = {{"FV","Factura Venta"}, {"R","Remito"}, {"P","Presupuesto"},
    {"PV","Pedido Venta"}, {"FO","Factura Compra"}};
    static HashMap<Integer, String> articulos = new HashMap<>();
    static Scanner leer =new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        articulos.put(100,"Arroz");
        articulos.put(200,"Lavandina");
        articulos.put(300,"Fideos");
        articulos.put(400,"Leche");
        articulos.put(500,"Harina");
        articulos.put(600,"Aceite");
        articulos.put(700,"Sal");
        articulos.put(800,"Pimienta");
        articulos.put(900,"Detergente");
        articulos.put(1000,"Yerba");
        articulos.put(1100,"Shampoo");
        articulos.put(1200,"Jabon");
        articulos.put(1300,"Cepillo de Dientes");
        articulos.put(1400,"Pasta Dental");
        articulos.put(1500,"Lentejas");
        
        System.out.println("Llene los datos del comprobante");
        System.out.println(" ");
        comprobante nuevoComprobante =comprobanteLlenar();
        System.out.println(" ");
        mostrar(nuevoComprobante);



    }
    
    
    public static comprobante comprobanteLlenar(){
        boolean salida=false;
        long nroComprobante;
        String fecha;
        String tipoComprobante;
        ArrayList<detalleComprobante> itemsComprobante = new ArrayList<>();
        
        System.out.println(" ");
        do{
        System.out.println("Ingrese el numero del comprobante");
        nroComprobante=leer.nextLong();
        if (nroComprobante>0){
            salida=true;
        }else{
            System.out.println("Valor incorrecto ");
        }
        
        
        }while (salida==false);
        salida=false;
        System.out.println(" ");
        System.out.println("Ingrese la fecha xx/xx/xxxx ");
        fecha=leer.next();
        System.out.println(" ");
        do{
            System.out.println("Ingrese el tipo de comprobante(FV,R,P,PV,FO) ");
            tipoComprobante=leer.next();
            tipoComprobante=tipoComprobante.toUpperCase();
            if (tipoComprobante.equals("FV")||tipoComprobante.equals("R") ||tipoComprobante.equals("P") ||tipoComprobante.equals("PV") ||tipoComprobante.equals("FO")){
                salida=true;
            }else{
                  System.out.println("Valor incorrecto ");
            }
          
        }while(salida==false);
        salida=false; 
        
        comprobante nuevoComprobante=new comprobante();
        nuevoComprobante.setNroComprobante(nroComprobante);
        nuevoComprobante.setFecha(fecha);
        nuevoComprobante.setTipoComprobante(tipoComprobante);
        nuevoComprobante.setItemsComprobante(llenarItems(itemsComprobante));
        
        return nuevoComprobante;

        
    }
    
    public static ArrayList<detalleComprobante> llenarItems(ArrayList<detalleComprobante> lista){
        
        boolean salida=false;
        boolean salida1=false;
        double cantidad;
        double precio;
        int codigo;
        String desicion;
        String articulo;
        do{
        System.out.println(" ");    
        do {
        System.out.println(articulos);
        System.out.println("Ingrese el codigo del articulo a agregar");
        codigo=leer.nextInt();
        
        if (articulos.containsKey(codigo)==true){
            salida=true;
            
        }else{
            System.out.println("Valor incorrecto ");
        }
        
        }while(salida==false);
        
        articulo=articulos.get(codigo);
        salida=false;
        System.out.println(" ");
        
        do{
            System.out.println("Ingrese el precio de cada unidad ");
            precio=leer.nextDouble();
            if (precio>0){
                salida=true;
            }else{
                System.out.println("Valor incorrecto ");
            }
            
        }while(salida==false);
        
        System.out.println(" ");
        salida=false;
        
        do{
            System.out.println("Ingrese la cantidad que va a llevar ");
            cantidad=leer.nextDouble();
            
            if (cantidad>0){
                salida=true;
            }else{
                System.out.println("Valor incorrecto ");
            }        
           
        }while(salida==false);
        
        salida=false;
        
        detalleComprobante item=new detalleComprobante();
        item.setArticulo(articulo);
        item.setCantidad(cantidad);
        item.setPrecio(precio);
        
        lista.add(item);
        
        System.out.println(" ");
        System.out.println("Para seguir cargando items al comprobante ingrese 1, para salir presione cualquier tecla ");
        desicion=leer.next();
        
        if(desicion.equals("1")){
            
            salida1=false;
        }else{
            return lista;
        }
        
        
        
        
        }while(salida1==false);
        
        return lista;
    }
    
    public static void mostrar(comprobante comprobante){
        
        System.out.println(" ");
        System.out.println("Comprobante tipo: "+comprobante.getTipoComprobante());
        System.out.println("Nro comprobante: "+comprobante.getNroComprobante()+" Fecha: "+comprobante.getFecha());
        System.out.println("------------------- Items del Comprobante ------------------");
        System.out.println("Articulo      Cantidad      Precio      Unidad      Subtotal");
        for(detalleComprobante item : comprobante.getItemsComprobante()){
            
          
           System.out.println(item.getArticulo()+"      "+item.getCantidad()+"      "+item.getPrecio()+"      "+item.calcularSubTotal(item));       
            
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total comprobante: "+comprobante.calcularTotalComprobante(comprobante));
        
    }
}
