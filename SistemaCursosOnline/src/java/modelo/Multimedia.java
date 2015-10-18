/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angelica
 */
public class Multimedia {
    private String idMultimedia;
    private String nombreMultimedia;
    private double tamanio;
    private double duracion;
    private String formato;
    private double peso;

    public Multimedia() {
    }

    public Multimedia(String idMultimedia, String nombreMultimedia, double tamanio, double duracion, String formato, double peso) {
        this.idMultimedia = idMultimedia;
        this.nombreMultimedia = nombreMultimedia;
        this.tamanio = tamanio;
        this.duracion = duracion;
        this.formato = formato;
        this.peso = peso;
    }

    public String getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(String idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public String getNombreMultimedia() {
        return nombreMultimedia;
    }

    public void setNombreMultimedia(String nombreMultimedia) {
        this.nombreMultimedia = nombreMultimedia;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
