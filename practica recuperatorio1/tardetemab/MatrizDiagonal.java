/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tardetemab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class MatrizDiagonal {

    /**
     * @param args the command line arguments
     */
    static BusquedaValor busquedaValor = new BusquedaValor();
    
    public static void main(String[] args) {
        
        while(true){
        
            int numeroIngresado = 0;
            while(true){
                System.out.println("Ingrese un numero entre 5 y 21 Impar");
                numeroIngresado = new Scanner(System.in).nextInt();
                if(numeroIngresado < 5 || numeroIngresado > 21){
                    System.out.println("Numero ingresado incorrecto");
                }else if(numeroIngresado % 2 == 0){
                    System.out.println("Numero ingresado incorrecto");
                }else{
                    break;
                }
            }
            int [][] matriz = new int[numeroIngresado][numeroIngresado];

            for(int fila = 0; fila < numeroIngresado; fila++){
                for(int columna = 0; columna < numeroIngresado; columna++){
                    if(fila == columna){
                        System.out.println("Ingrese un numero para la fila " + fila + " columna " + columna);
                        int valorIngresado = new Scanner(System.in).nextInt();
                        matriz[fila][columna] = valorIngresado;
                    }else{
                        Random rnd = new Random();
                        int numero = (int)(rnd.nextDouble() * 90 + 10);
                        matriz[fila][columna] = numero;
                    }
                }
            }

            for(int fila = 0; fila < numeroIngresado; fila++){
                System.out.println();
                for(int columna = 0; columna < numeroIngresado; columna++){
                    System.out.print(matriz[fila][columna] + " ");
                }
            }

            System.out.println();

            int[] valoresDiagonal = obtenerValoresDiagonal(matriz);

            for(int i = 0; i < matriz.length; i++){
                System.out.print(valoresDiagonal[i] + " ");
            }
            System.out.println();
            int valorPromedio = promedioMatriz(valoresDiagonal);
            System.out.println("El valor promedio es " + valorPromedio);

            buscarValorPromedioEnMatriz(matriz, valorPromedio);

            if(busquedaValor.getCantidadEncontrada() == 0){
                System.out.println("No se encontraron coincidencias");
            }else{
                System.out.println("El valor " + busquedaValor.getValorBuscado() + " se encontro " + busquedaValor.getCantidadEncontrada());
            }
            
            System.out.println("Desea iniciar nuevamente la ejecución del programa?");
            String respuesta = new Scanner(System.in).nextLine();
            if(!respuesta.toUpperCase().equals("SI")){
                break;
            }
            
        }
        
    }
    
    public static int[] obtenerValoresDiagonal(int[][] matriz){
        int[] valoresDiagonal = new int[matriz.length];
        int diagonal = 0;
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[0].length; columna++){
                if(fila == columna){
                    valoresDiagonal[diagonal++] = matriz[fila][columna];
                }
            }
        }
        
        return valoresDiagonal;
    }
    
    public static int promedioMatriz(int[] matriz){
        int sumaDiagonal = 0;
        for(int i=0; i < matriz.length; i++){
            sumaDiagonal += matriz[i];
        }
        return sumaDiagonal / matriz.length;
    }
    
    public static void buscarValorPromedioEnMatriz (int[][] matriz, int valorPromedio){
        System.out.println("El valor " + valorPromedio + " se encuentra en las posiciones de la matriz");
        busquedaValor.setValorBuscado(valorPromedio);
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[0].length; columna++){
                if(matriz[fila][columna] == valorPromedio){
                    System.out.println("Fila Indice " + fila + " Columna Indice "+ columna);
                    busquedaValor.incrementarCantidadEncontrada();
                }
            }
        }
        
    }
    
}
