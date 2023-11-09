/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mananatemab;

/**
 *
 * @author Gerardo
 */
public class Computadora {
    
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private long codigoBarras;
    private double precioTotal;
    private double porcentajeAumento;
    private double montoFinal;
    private String [][] componentes;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String[][] getComponentes() {
        return componentes;
    }

    public void setComponentes(String[][] componentes) {
        this.componentes = componentes;
    }

    void inicializarArrayComponentes(int cantidadComp) {
        this.componentes = new String[cantidadComp][5];
    }
    
    void cargarFilaArray(String[] filaEncontrada, int fila) {
        this.componentes[fila][0] = filaEncontrada[0];
        this.componentes[fila][1] = filaEncontrada[1];
        this.componentes[fila][2] = filaEncontrada[2];
        this.componentes[fila][3] = filaEncontrada[3];
    }
    
    public boolean faltanObligatorios() {
        int cant = 0;
        for(int fila=0; fila < this.componentes.length; fila++){
            if(this.componentes[fila][3].equals("S")){
                ++cant;
            }
        }
        if(cant == 5){
            return false;
        }
        return true;
    }
    
    void calcularMontoFinal(boolean sumaRecargo) {
        double montoTotal = 0;
        for(int fila=0; fila < this.componentes.length; fila++){
            montoTotal += Double.parseDouble(this.componentes[fila][2]);
        }
        this.precioTotal = montoTotal;
        if(sumaRecargo){
            this.porcentajeAumento = 20;
            this.montoFinal = montoTotal + (montoTotal * 0.2);
        }else{
            this.porcentajeAumento = 0;
            this.montoFinal = montoTotal;
        }
        
    }

    String getRecargo() {
        if(this.porcentajeAumento > 0){
            return String.valueOf((this.precioTotal * this.porcentajeAumento) / 100);
        }
        return "0";
    }

    
}
