/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mananatemab;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class GeneraPC {

    static String [][] componentesPc = {{"AAA","Placa Madre", "20000", "S"} , {"BBB","Procesador" , "25000" , "S"} , {"CCC","Memoria RAM", "5000" , "S"} , {"DDD","Placa de Red", "3000" , "N"} , {"EEE","Disco Rigido SSD", "22000" , "S"} , {"FFF"," Placa de Video", "42000" , "N"} , {"GGG", "Monitor Led 21", "32000" , "N"} , {"HHH","Monitor Led 25", "41000" , "N"} , {"JJJ","Kit Teclado - Mouse", "9000" , "N"} , {"KKK","Gabinete", "6500" , "S"}, {"LLL","Fuente Alimentación", "6500" , "S"}, {"MMM","Placa de Sonido", "16500" , "N"}};
    
    public static void main(String[] args) {
        
        Computadora computadora = new Computadora();
        System.out.println("Ingrese la marca");
        computadora.setMarca(new Scanner(System.in).nextLine());
        System.out.println("Ingrese el modelo");
        computadora.setModelo(new Scanner(System.in).nextLine());
        while(true){
            System.out.println("Ingrese el año de fabricacion");
            int anioFab = new Scanner(System.in).nextInt();
            if(anioFab > (new Date().getYear() + 1900)){
                System.out.println("Año invalido");
            }else{
                computadora.setAnioFabricacion(anioFab);
                break;
            }
        }
        while(true){
            System.out.println("Ingrese el código de barras");
            String codBarras = new Scanner(System.in).nextLine();
            if(codBarras.length() < 7 || codBarras.length() > 15){
                System.out.println("Código de barras invalido");
            }else{
                computadora.setCodigoBarras(Long.parseLong(codBarras));
                break;
            }
        }
        
        int cantidadComp = 0;
        while(true){
            System.out.println("Ingrese la cantidad de articulos a facturar");
            cantidadComp = new Scanner(System.in).nextInt();
            if(cantidadComp < 5 || cantidadComp > 12){
                System.out.println("La cantidad ingresada es icorrecta (5 a 12)");
            }else{
                break;
            }
        }
        
        computadora.inicializarArrayComponentes(cantidadComp);
        System.out.println("-----------------------------------");
        System.out.println("Componentes de la Computadora ");
        
        int filaActual = 0;
        while(true){
            System.out.println("Ingrese el código del componente");
            String codigoArticulo = new Scanner(System.in).nextLine();
            String [] filaEncontrada = buscarArticuloXComponente(codigoArticulo);
            if(filaEncontrada != null){
                System.out.println("El componente " + filaEncontrada[1] + " fue encontrado");
                if(yaFueCargado(codigoArticulo)){
                    System.out.println("El componente ya fue agregado anteriormente");
                }else{
                    computadora.cargarFilaArray(filaEncontrada, filaActual);
                    if((filaActual + 1) == cantidadComp){
                        break;
                    }
                    filaActual++;
                }
            }else{
                System.out.println("El código ingresado es incorrecto");
            }
        }
        
        boolean sumaRecargo = false;
        if(computadora.faltanObligatorios()){
            System.out.println("-----------------------------------");
            System.out.println("Cuidado, 1 o más de los componentes obligatorios no fueron agregados, se cobrara un recargo del 20%");
            sumaRecargo = true;
        }
        
        computadora.calcularMontoFinal(sumaRecargo);
        System.out.println("-----------------------------------");
        System.out.println("Computadora:");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Código de Barras: " + computadora.getCodigoBarras());
        System.out.println("Año: " + computadora.getAnioFabricacion());
        String encabezado = completaEspaciosBlanco("Código Ítem") + completaEspaciosBlanco("Denominación")+ completaEspaciosBlanco("Precio");
        System.out.println(encabezado);
        for(int fila=0; fila < computadora.getComponentes().length; fila++){
            System.out.println(completaEspaciosBlanco(computadora.getComponentes()[fila][0]) + completaEspaciosBlanco(computadora.getComponentes()[fila][1]) + completaEspaciosBlanco(computadora.getComponentes()[fila][2]));
        } 
        System.out.println("Total Componentes: " + computadora.getPrecioTotal());
        System.out.println("Recargo: " + computadora.getRecargo());
        System.out.println("Monto Final: " + computadora.getMontoFinal());
        
        System.out.println("-----------------------------------");
                
    }
    
    private static String[] buscarArticuloXComponente(String codigoComponente) {
        for(int fila=0; fila < componentesPc.length; fila++){
            if(componentesPc[fila][0].equals(codigoComponente.toUpperCase())){
                String [] filaEncontrada = new String[4];
                filaEncontrada[0] = componentesPc[fila][0];
                filaEncontrada[1] = componentesPc[fila][1];
                filaEncontrada[2] = componentesPc[fila][2];
                filaEncontrada[3] = componentesPc[fila][3];
                return filaEncontrada;
            }
        }
        return null;
    }
    
    static String codigosCargados = ""; 
    private static boolean yaFueCargado(String codigoComponente) {
        if(codigosCargados.isEmpty()){
            codigosCargados += codigoComponente;
            return false;
        }else{
            if(codigosCargados.contains(codigoComponente)){
                return true;
            }
            codigosCargados += codigoComponente;
            return false;
        }
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
