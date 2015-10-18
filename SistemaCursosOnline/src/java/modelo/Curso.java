/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import conexion.Conectar;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Josue
 */
public class Curso {
    private String idCurso;
    private Multimedia Multimedia;
    private Persona Persona;    
    private String nombreCurso;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private double costo;
    private String requisitos;   
    private int numParticipantes;
    
    PreparedStatement pst;
    ResultSet rs;
    ResultSetMetaData meta;
    Connection conex;
    Conectar bd = new Conectar();
    public Curso() {
    }

    public Curso(String idCurso, Multimedia Multimedia, Persona Persona, String nombreCurso, Date fechaInicio, Date fechaFinalizacion, double costo, String requisitos, int numParticipantes) {
        this.idCurso = idCurso;
        this.Multimedia = Multimedia;
        this.Persona = Persona;
        this.nombreCurso = nombreCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.costo = costo;
        this.requisitos = requisitos;
        this.numParticipantes = numParticipantes;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public Multimedia getMultimedia() {
        return Multimedia;
    }

    public void setMultimedia(Multimedia Multimedia) {
        this.Multimedia = Multimedia;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {        
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public ArrayList<Object[]> mostrarCurso (){
    String consu="select * from curso";
    ArrayList<Object[]> datos=new ArrayList<>();
    
        try {
            conex=DriverManager.getConnection
            (
                bd.getUrl(),
                bd.getUser(),
                bd.getPass()                
            );
            
            pst=conex.prepareStatement(consu);
            rs=pst.executeQuery();
            meta=rs.getMetaData();
            
            while (rs.next()) {   
                Object[] filas=new Object[meta.getColumnCount()];
                for (int i = 0; i < filas.length; i++) {
                    filas[i]=rs.getObject(i+1);
                }
                datos.add(filas);
            }
            rs.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al mostrar datos en la tabla Curso "+ e);
           
        }
     return datos;
    }
    public ArrayList<Object[]> filtrarCurso(String campo, String criterio){
        ArrayList<Object[]> datos = new ArrayList<>();       
         String sql="select * from curso where  " + campo + " like '%"+criterio +"%'";
           try {
               Class.forName(bd.getDriver());
               conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
               pst = conex.prepareStatement(sql);
               rs = pst.executeQuery();//ejecuta la consulta y guarda la consulta en la variable resulset.
               meta = rs.getMetaData();
               while (rs.next()) {
                   Object[] fila = new Object[meta.getColumnCount()];//recorriendo el resulset lo guardo en la variable fila
                   for(int i=0; i < fila.length; i++)
                   {
                       fila[i]= rs.getObject(i+1); 
                   }
                   datos.add(fila);
               }
               rs.close();
           } catch (Exception e) {
           } 
        return datos;
   }
    public String insertarCurso(Object obj){
        Curso curso= (Curso) obj;//Estamos haciendo un casting porque el objeto
        //lo convertimos en una variable tipo empleado        
        String sql="insert into curso values(?,?,?,?,?,?,?,?,?)";
        String respuesta;
        try {
            Class.forName(bd.getDriver());
            conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
            pst=conex.prepareStatement(sql);
            pst.setString(1,curso.getIdCurso());
            pst.setString(2,curso.getMultimedia().getIdMultimedia());
            pst.setString(3,curso.getPersona().getNombrePersona());
            pst.setString(4,curso.getNombreCurso());
            pst.setString(5,String.valueOf(curso.getFechaInicio())); 
            pst.setString(6,String.valueOf(curso.getFechaFinalizacion())); 
            pst.setDouble(7,curso.getCosto());
            pst.setString(8,curso.getRequisitos());
            pst.setInt(9,curso.getNumParticipantes());
            
            int registros=pst.executeUpdate();//exectuteQuery solo para select
            //executeUpdate es para insert delete update
            //se declara entero porqe puede dividir el numero de valores eliminados
            respuesta=registros +" insertados correctamente en la tabla Cliente";
        } catch (Exception e) {
            respuesta=e.getMessage();             
        }
        return respuesta;
    }
    
    public String modificarCurso(Object obj){
        Curso curso= (Curso) obj;//Estamos haciendo un casting porque el objeto
        //lo convertimos en una variable tipo empleado       
        String sql="update curso set idMultimedia=?,idPersona=?,nombreCurso=?,fechaInicio=?,fechaFinalizacion=?,costo=?,requisitos=?,numParticipantes=? where idCurso=?";
        String respuesta;
        try {
            Class.forName(bd.getDriver());
            conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
            pst=conex.prepareStatement(sql);
            pst.setString(9,curso.getIdCurso());
            pst.setString(1,curso.getMultimedia().getIdMultimedia());
            pst.setString(2,curso.getPersona().getNombrePersona());
            pst.setString(3,curso.getNombreCurso());
            pst.setString(4,String.valueOf(curso.getFechaInicio())); 
            pst.setString(5,String.valueOf(curso.getFechaFinalizacion())); 
            pst.setDouble(6,curso.getCosto());
            pst.setString(7,curso.getRequisitos());
            pst.setInt(8,curso.getNumParticipantes());           
            
            int registros=pst.executeUpdate();
            //executeUpdate es para insert delete update
            //se declara entero porqe puede dividir el numero de valores eliminados
            respuesta=registros +" modificados correctamente en la tabla Curso";
        } catch (Exception e) {
            respuesta=e.getMessage();             
        }
        return respuesta;
    }
    
    public String eliminarCurso(Object obj){
        Curso curso= (Curso) obj;//Estamos haciendo un casting porque el objeto
        //lo convertimos en una variable tipo empleado        
        String sql="delete from curso where idCurso=?";
        String respuesta;
        try {
            Class.forName(bd.getDriver());
            conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
            pst=conex.prepareStatement(sql);
            pst.setString(1,curso.getIdCurso());//Asignar las columnas de la tabla
     
            int registros=pst.executeUpdate();//exectuteQuery solo para select
            //executeUpdate es para insert delete update
            //se declara entero porqe puede dividir el numero de valores eliminados
            respuesta=registros +" eliminados correctamente en la tabla Curso";
        } catch (Exception e) {
            respuesta=e.getMessage();             
        }
        return respuesta;
    }
    
}
