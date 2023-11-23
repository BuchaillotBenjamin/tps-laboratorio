
import java.util.ArrayList;


public class vivienda {
    
    private String calle;
    private String provincia;
    private Integer nroCalle;
    private ArrayList<ambiente>ambientes; 

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setNroCalle(Integer nroCalle) {
        this.nroCalle = nroCalle;
    }

    public void setAmbientes(ArrayList<ambiente> ambientes) {
        this.ambientes = ambientes;
    }

    public String getCalle() {
        return calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public Integer getNroCalle() {
        return nroCalle;
    }

    public ArrayList<ambiente> getAmbientes() {
        return ambientes;
    }
    
    
    
    
    
    
    
    
    
    
    
}
