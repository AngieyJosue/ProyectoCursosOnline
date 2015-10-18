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
public abstract class Persona {
    private String nombrePersona;
    private String apellidoPersona;
    private String foto;
    private int edad;
    private String genero;
    private String correo;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, String foto, int edad, String genero, String correo) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.foto = foto;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
