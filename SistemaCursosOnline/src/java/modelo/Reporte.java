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
public class Reporte {
    private String idReporte;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String Categoria;
    private String nombreCurso;
    private int cantAlumnos;
    private double promedio;

    public Reporte() {
    }

    public Reporte(String idReporte, Date fechaInicio, Date fechaFinalizacion, String Categoria, String nombreCurso, int cantAlumnos, double promedio) {
        this.idReporte = idReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.Categoria = Categoria;
        this.nombreCurso = nombreCurso;
        this.cantAlumnos = cantAlumnos;
        this.promedio = promedio;
    }

    public String getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(String idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
