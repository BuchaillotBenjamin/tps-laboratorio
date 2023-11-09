/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mananatemaa;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class CalculoFactura {

    static String [][] articulos = {{"100","Azucar", "20", "U"} , {"101","Leche" , "30" , "U"} , {"102","Aceite", "50" , "U"} , {"103","Sal", "45" , "U"} , {"104"," Fideos", "15" , "U"} , {"105"," Arroz", "28" , "U"} , {"106","Galletas", "26" , "U"} , {"107","Carne Molida", "220" , "Kg"} , {"108","Shampoo", "42" , "U"} , {"109","Queso Mantecoso", "178" , "Kg"} , {"110","Jamon Cocido", "320" , "Kg"} , {"111","Naranjas", "80" , "Kg"}};
    
    public static void main(String[] args) {
        Factura factura = new Factura();
        System.out.println("Ingrese la razón social del cliente");
        factura.setRazonSocial(new Scanner(System.in).nextLine());
        System.out.println("Ingrese el cuit del cliente");
        factura.setCuitCliente(new Scanner(System.in).nextLong());
        System.out.println("Ingrese la fecha de la factura");
        factura.setFecha(new Scanner(System.in).nextLine());
        System.out.println("Ingrese el nro de factura");
        factura.setNroFactura(new Scanner(System.in).nextLong());
        while(true){
            System.out.println("Ingrese la forma de pago contado, tarjeta crédito, tarjeta débito");
            String tipoPago = new Scanner(System.in).nextLine();
            if(tipoPago.toUpperCase().equals("C") || 
                    tipoPago.toUpperCase().equals("TC") || tipoPago.toUpperCase().equals("TD")){
                factura.setTipoPago(tipoPago);
                break;
            }else{
                System.out.println("Tipo de pago incorrecto, valores validos C, TC, TD");
            }
        }
        int cantidadArticulos = 0;
        while(true){
            System.out.println("Ingrese la cantidad de articulos a facturar");
            cantidadArticulos = new Scanner(System.in).nextInt();
            if(cantidadArticulos <=0 || cantidadArticulos >=12){
                System.out.println("La cantidad ingresada es icorrecta (1 a 12)");
            }else{
                break;
            }
        }
        
        factura.inicializarArrayItemsFactura(cantidadArticulos);
        System.out.println("-----------------------------------");
        System.out.println(cantidadArticulos + " Articulos a Facturar ");
        
        int filaActual = 0;
        while(true){
            System.out.println("Ingrese el código del artículo");
            String codigoArticulo = new Scanner(System.in).nextLine();
            String [] filaEncontrada = buscarArticuloXCodigo(codigoArticulo);
            if(filaEncontrada != null){
                factura.cargarFilaArray(filaEncontrada, filaActual);
                System.out.println("Ingrese la cantidad para el artículo " + filaEncontrada[1]);
                double cantidadFactura = new Scanner(System.in).nextInt();
                factura.cargarFilaCantidad(cantidadFactura, filaActual);
                factura.calcularSubtotal(filaActual);
                if((filaActual + 1) == cantidadArticulos){
                    break;
                }
                filaActual++;
            }else{
                System.out.println("El código ingresado es incorrecto");
            }
            
        }
        
        factura.calcularMontoTotalItems();
        factura.calcularRecargo();
        factura.calcularMontoFinal();
        System.out.println("-----------------------------------");
        System.out.println("El ticket a pagar es:");
        System.out.println("Cliente: " + factura.getRazonSocial());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Numero: " + factura.getNroFactura());
        System.out.println("Tipo Pago: " + factura.getTipoPago());
        System.out.println("-----------------------------------");
        String encabezado = completaEspaciosBlanco("Código Ítem") + completaEspaciosBlanco("Denominación")+ completaEspaciosBlanco("Precio") + completaEspaciosBlanco("Cantidad") + completaEspaciosBlanco("Subtotal");
        System.out.println(encabezado);
        for(int fila=0; fila < factura.getItemsFactura().length; fila++){
            System.out.println(completaEspaciosBlanco(factura.getItemsFactura()[fila][0]) + completaEspaciosBlanco(factura.getItemsFactura()[fila][1]) + completaEspaciosBlanco(factura.getItemsFactura()[fila][2]) + 
                    completaEspaciosBlanco(factura.getItemsFactura()[fila][3]) + completaEspaciosBlanco(factura.getItemsFactura()[fila][4]));
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Ítems: " + factura.getMontoTotalItems());
        System.out.println("Recargo: " + factura.getRecargo());
        System.out.println("Total Final: " + factura.getMontoFinal());
        System.out.println("-----------------------------------");
    }
    
    private static String[] buscarArticuloXCodigo(String codigoArticulo) {
        for(int fila=0; fila < articulos.length; fila++){
            if(articulos[fila][0].equals(codigoArticulo)){
                String [] filaEncontrada = new String[4];
                filaEncontrada[0] = articulos[fila][0];
                filaEncontrada[1] = articulos[fila][1];
                filaEncontrada[2] = articulos[fila][2];
                filaEncontrada[3] = articulos[fila][3];
                return filaEncontrada;
            }
        }
        return null;
    }
    
    private static String completaEspaciosBlanco(String palabraNumero) {
        int espacios = 20 - palabraNumero.length();
        while(espacios > 0){
            palabraNumero = " " + palabraNumero;
            --espacios;
        }
        return palabraNumero;
    }
    
}
