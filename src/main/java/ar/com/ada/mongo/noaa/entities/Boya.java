package ar.com.ada.mongo.noaa.entities;

import java.util.*;




import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Boyas")
public class Boya {
   
    private ObjectId _id;

   
    private String colorLuz;

   
    private Double longitudInstalacion;
    
    private Double latitudInstalacion;

   
    private List<Muestra> muestras = new ArrayList<>();

    
  
    
    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getColorLuz() {
        return colorLuz;
    }

    public void setColorLuz(String colorLuz) {
        this.colorLuz = colorLuz;
    }

    public Double getLongitudInstalacion() {
        return longitudInstalacion;
    }

    public void setLongitudInstalacion(Double longitudInstalacion) {
        this.longitudInstalacion = longitudInstalacion;
    }

    public Double getLatitudInstalacion() {
        return latitudInstalacion;
    }

    public void setLatitudInstalacion(Double latitudInstalacion) {
        this.latitudInstalacion = latitudInstalacion;
    }

    public List<Muestra> getMuestras() {
        return muestras;
    }

    public void setMuestras(List<Muestra> muestras) {
        this.muestras = muestras;
    }

    /*
     * public AlertaEnum getAlertaId() { return AlertaEnum.parse(alertaId); }
     * 
     * public void setAlertaId(ColorLuzEnum alertaId) { this.alertaId =
     * alertaId.getValue(); }
     */

    public enum AlertaEnum {

        ALERTA_DE_KAIJU(1), ALERTA_DE_IMPACTO(2);

        private final Integer value;

        private AlertaEnum(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public static AlertaEnum parse(Integer id) {
            AlertaEnum status = null;
            for (AlertaEnum item : AlertaEnum.values()) {
                if (item.getValue().equals(id)) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    }

}
