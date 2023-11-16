
import java.util.ArrayList;


public class comprobante {
    
    private long nroComprobante;
    private String fecha;
    private String tipoComprobante;
    private ArrayList<detalleComprobante> ItemsComprobante;

    public long getNroComprobante() {
        return nroComprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    

    public void setNroComprobante(long nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public ArrayList<detalleComprobante> getItemsComprobante() {
        return ItemsComprobante;
    }

    public void setItemsComprobante(ArrayList<detalleComprobante> ItemsComprobante) {
        this.ItemsComprobante = ItemsComprobante;
    }

    public double calcularTotalComprobante(comprobante comprobanteNuevo){
        
        double total=0;
        for( detalleComprobante item : comprobanteNuevo.getItemsComprobante()){
           
            total+=item.calcularSubTotal(item);
          
        }
        
        
        return total;
    }
    
    
    
}
