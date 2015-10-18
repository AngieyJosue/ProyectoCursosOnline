/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Angelica
 */
public class Oferta {
    private String idOferta;
    private String descripcion;
    private Date fechaExpiracion;
    private double valorOferta;

    public Oferta() {
    }

    public Oferta(String idOferta, String descripcion, Date fechaExpiracion, double valorOferta) {
        this.idOferta = idOferta;
        this.descripcion = descripcion;
        this.fechaExpiracion = fechaExpiracion;
        this.valorOferta = valorOferta;
    }

    public String getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(String idOferta) {
        this.idOferta = idOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public double getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(double valorOferta) {
        this.valorOferta = valorOferta;
    }
    
}
