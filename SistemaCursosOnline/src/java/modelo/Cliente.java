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
public class Cliente extends Persona{   
    private String pais;

    public Cliente() {
    }

    public Cliente(String pais) {       
        this.pais = pais;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
     
}
