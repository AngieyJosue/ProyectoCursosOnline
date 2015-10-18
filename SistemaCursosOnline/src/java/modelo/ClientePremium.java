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
public class ClientePremium {
        private String idClientePremium;
        private String descargas;

    public ClientePremium() {
    }

    public ClientePremium(String idClientePremium, String descargas) {
        this.idClientePremium = idClientePremium;
        this.descargas = descargas;
    }

    public String getIdClientePremium() {
        return idClientePremium;
    }

    public void setIdClientePremium(String idClientePremium) {
        this.idClientePremium = idClientePremium;
    }

    public String getDescargas() {
        return descargas;
    }

    public void setDescargas(String descargas) {
        this.descargas = descargas;
    }
        
}
