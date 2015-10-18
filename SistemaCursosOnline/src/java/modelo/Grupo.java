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
public class Grupo {
    private int idGrupo;
    private String nombreGrupo;
    private double promedioGrupo;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nombreGrupo, double promedioGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.promedioGrupo = promedioGrupo;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public double getPromedioGrupo() {
        return promedioGrupo;
    }

    public void setPromedioGrupo(double promedioGrupo) {
        this.promedioGrupo = promedioGrupo;
    }
    
    
    
}
