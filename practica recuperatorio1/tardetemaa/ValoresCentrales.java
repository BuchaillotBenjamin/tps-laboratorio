/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tardetemaa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class ValoresCentrales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroIngresado = 0;
        while(true){
            System.out.println("Ingrese un numero entre 3 y 15 Impar");
            numeroIngresado = new Scanner(System.in).nextInt();
            if(numeroIngresado < 3 || numeroIngresado > 15){
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
                if(fila == 0){
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
        
        int[] valoresCentrales = obtenerValoresCentrales(matriz);
        
        valoresCentrales = ordenarBurbujaMayorAMenor(valoresCentrales);
        for(int i = 0; i < valoresCentrales.length; i++){
            System.out.print(valoresCentrales[i] + " ");
        }
        System.out.println();
        buscarValorCentralEnMatriz(matriz, valoresCentrales[0]);
        
    }
    
    public static int[] obtenerValoresCentrales(int[][] matriz){
        int[] valoresCentro = new int[9];
        int mitad = (matriz.length - 1) / 2;
        System.out.println("El valor central es " + matriz[mitad][mitad]);
        valoresCentro[0] = matriz[mitad][mitad];
        valoresCentro[1] = matriz[mitad - 1][mitad - 1];
        valoresCentro[2] = matriz[mitad - 1][mitad];
        valoresCentro[3] = matriz[mitad - 1][mitad + 1];
        valoresCentro[4] = matriz[mitad][mitad - 1];
        valoresCentro[5] = matriz[mitad][mitad + 1];
        valoresCentro[6] = matriz[mitad +1][mitad - 1];
        valoresCentro[7] = matriz[mitad + 1][mitad];
        valoresCentro[8] = matriz[mitad + 1][mitad + 1];
        
        return valoresCentro;
    }
    
    public static int[] ordenarBurbujaMayorAMenor(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        
        do {
            intercambio = false;
            
            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        
        return arreglo;
    }
    
    public static void buscarValorCentralEnMatriz (int[][] matriz, int valorBuscado){
        System.out.println("El valor " + valorBuscado + " se encuentra en las posiciones de la matriz");
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[0].length; columna++){
                if(matriz[fila][columna] == valorBuscado){
                    System.out.println("Fila Indice " + fila + " Columna Indice "+ columna);
                }
            }
        }
        
    }
    
}
