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
public class Docente extends Empleado{
    private String idDocente;
    private String categoriaCurso;
    private String grupoAsignado;

    public Docente() {
    }

    public Docente(String idDocente, String categoriaCurso, String grupoAsignado) {
        this.idDocente = idDocente;
        this.categoriaCurso = categoriaCurso;
        this.grupoAsignado = grupoAsignado;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

    public String getGrupoAsignado() {
        return grupoAsignado;
    }

    public void setGrupoAsignado(String grupoAsignado) {
        this.grupoAsignado = grupoAsignado;
    }
  
}
