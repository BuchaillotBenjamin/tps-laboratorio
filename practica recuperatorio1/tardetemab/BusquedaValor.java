/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tardetemab;

/**
 *
 * @author Gerardo
 */
public class BusquedaValor {
    private int valorBuscado;
    private int cantidadEncontrada;

    public int getValorBuscado() {
        return valorBuscado;
    }

    public void setValorBuscado(int valorBuscado) {
        this.valorBuscado = valorBuscado;
    }

    public int getCantidadEncontrada() {
        return cantidadEncontrada;
    }

    public void setCantidadEncontrada(int cantidadEncontrada) {
        this.cantidadEncontrada = cantidadEncontrada;
    }
    
    public void incrementarCantidadEncontrada(){
        ++cantidadEncontrada;
    }
}
