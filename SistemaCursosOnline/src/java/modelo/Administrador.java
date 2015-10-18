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
public class Administrador extends Empleado{
    private String idAdministrador;

    public Administrador() {
    }

    public Administrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    
}
