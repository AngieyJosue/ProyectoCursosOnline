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
public class Supervisor extends Empleado{
    private String idSupervisor;

    public Supervisor() {
    }

    public Supervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
    
}
