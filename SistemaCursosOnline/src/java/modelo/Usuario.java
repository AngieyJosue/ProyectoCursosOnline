/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Josue
 */
public class Usuario {
    private Persona Persona;
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(Persona Persona, String nombreUsuario, String contrasena, String tipoUsuario) {
        this.Persona = Persona;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
}
