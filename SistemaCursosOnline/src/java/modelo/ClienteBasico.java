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
public class ClienteBasico extends Cliente{
        private String idClienteBasico;
        private String descargas;

    public ClienteBasico() {
    }

    public ClienteBasico(String idClienteBasico, String descargas) {
        this.idClienteBasico = idClienteBasico;
        this.descargas = descargas;
    }

    public String getIdClienteBasico() {
        return idClienteBasico;
    }

    public void setIdClienteBasico(String idClienteBasico) {
        this.idClienteBasico = idClienteBasico;
    }

    public String getDescargas() {
        return descargas;
    }

    public void setDescargas(String descargas) {
        this.descargas = descargas;
    }
       
        
    
    
}
