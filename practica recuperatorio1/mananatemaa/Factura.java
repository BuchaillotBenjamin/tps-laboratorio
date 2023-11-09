/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mananatemaa;

/**
 *
 * @author Gerardo
 */
public class Factura {
    
    private String fecha;
    private long nroFactura;
    private String razonSocial;
    private long cuitCliente;
    private String tipoPago;
    private double montoTotalItems;
    private double recargo;
    private double montoFinal;
    private String [][] itemsFactura;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(long cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getMontoTotalItems() {
        return montoTotalItems;
    }

    public void setMontoTotalItems(double montoTotalItems) {
        this.montoTotalItems = montoTotalItems;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String[][] getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(String[][] itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

    void inicializarArrayItemsFactura(int cantidadArticulos) {
        this.itemsFactura = new String[cantidadArticulos][5];
    }

    void cargarFilaArray(String[] filaEncontrada, int fila) {
        this.itemsFactura[fila][0] = filaEncontrada[0];
        this.itemsFactura[fila][1] = filaEncontrada[1];
        this.itemsFactura[fila][2] = filaEncontrada[2];
    }
    
    void cargarFilaCantidad(double cantidad, int fila) {
        this.itemsFactura[fila][3] = Double.toString(cantidad);
    }
    
    void calcularSubtotal(int fila){
        double subtotal = Double.parseDouble(this.itemsFactura[fila][2]) * Double.parseDouble(this.itemsFactura[fila][3]);
        this.itemsFactura[fila][4] = Double.toString(subtotal);
    }

    void calcularMontoTotalItems() {
        double montoTotal = 0;
        for(int fila=0; fila < this.itemsFactura.length; fila++){
            montoTotal += Double.parseDouble(this.itemsFactura[fila][4]);
        }
        this.montoTotalItems = montoTotal;
    }
    
    void calcularRecargo() {
        switch (this.tipoPago.toUpperCase()) {
            case "TD":
                this.recargo = this.montoTotalItems * 0.05;
                break;
            case "TC":
                this.recargo = this.montoTotalItems * 0.1;
                break;
            default:
                this.recargo = 0;
                break;
        }
    }
    
    void calcularMontoFinal() {
        this.montoFinal = this.montoTotalItems + this.recargo;
    }
    
}
