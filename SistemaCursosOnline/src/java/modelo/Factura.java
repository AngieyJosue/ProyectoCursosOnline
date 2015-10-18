/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Josue
 */
public class Factura {
    private int idFactura;
    private Curso Curso;
    private Date fechaEmision;
    private int Cantidad;
    private double subtotal;
    private double iva;
    private double descuento;
    private double total;

    public Factura() {
    }

    public Factura(int idFactura, Curso Curso, Date fechaEmision, int Cantidad, double subtotal, double iva, double descuento, double total) {
        this.idFactura = idFactura;
        this.Curso = Curso;
        this.fechaEmision = fechaEmision;
        this.Cantidad = Cantidad;
        this.subtotal = subtotal;
        this.iva = iva;
        this.descuento = descuento;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
