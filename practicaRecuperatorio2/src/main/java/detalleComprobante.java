
import java.util.ArrayList;


public class detalleComprobante {
    
    private String articulo;
    private double cantidad;
    private double precio;

    public String getArticulo() {
        return articulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularSubTotal(detalleComprobante item){
        double total;
        
        total=item.getCantidad()*item.getPrecio();
        
        return total;
    }
    
}
