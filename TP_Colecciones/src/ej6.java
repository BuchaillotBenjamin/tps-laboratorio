import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while (true) {
            System.out.print("Ingrese un valor para la celda (o 'FIN' para salir): ");
            String valor = leer.nextLine();

            if (valor.toUpperCase().equals("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = leer.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = leer.nextInt();

            leer.nextLine(); 

            Celda celda = new Celda(fila, columna, valor);
            matriz.agregarCelda(celda);
        }

        System.out.println("Valores cargados en matrizCuadrada:");
        matriz.mostrarMatriz();

        System.out.print("Ingrese la fila y la columna para obtener el valor: ");
        int fila = leer.nextInt();
        int columna = leer.nextInt();

        String valorObtenido = matriz.obtenerValor(fila, columna);

        if (valorObtenido != null) {
            System.out.println("Valor en la fila " + fila + ", columna " + columna + ": " + valorObtenido);
        } else {
            System.out.println("La fila y/o columna especificada no existen en la matriz.");
        }

        
    }
}