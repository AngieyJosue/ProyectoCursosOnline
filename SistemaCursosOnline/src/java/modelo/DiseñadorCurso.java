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
public class DiseñadorCurso extends Empleado{
    private String idDiseñador;
    private String nombreCurso;

    public DiseñadorCurso() {
    }

    public DiseñadorCurso(String idDiseñador, String nombreCurso) {
        this.idDiseñador = idDiseñador;
        this.nombreCurso = nombreCurso;
    }

    public String getIdDiseñador() {
        return idDiseñador;
    }

    public void setIdDiseñador(String idDiseñador) {
        this.idDiseñador = idDiseñador;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
}
