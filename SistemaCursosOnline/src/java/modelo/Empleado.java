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
public class Empleado extends Persona{
    private String cargo;
    private String numTelefono;

    public Empleado() {
    }

    public Empleado(String cargo, String numTelefono) {
        this.cargo = cargo;
        this.numTelefono = numTelefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    
}
