package ar.com.ada.mongo.noaa.entities;

import java.util.*;




public class Muestra {

   
   
    private Date horario;

    private Double longitud;

    private Double latitud;
    
    private String matricula;

    
    private Double alturaNivelDelMar;

    
    
    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getAlturaNivelDelMar() {
        return alturaNivelDelMar;
    }

    public void setAlturaNivelDelMar(Double alturaNivelDelMar) {
        this.alturaNivelDelMar = alturaNivelDelMar;
    }

}
