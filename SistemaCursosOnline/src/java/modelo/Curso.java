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
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Josue
 */
public class Curso {
    private String idCurso;      
    private String nombreCurso;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private double costo;
    private String requisitos;   
    private int numParticipantes;
    private String rutaImagen;
    PreparedStatement pst;
    ResultSet rs;
    ResultSetMetaData meta;
    Connection conex;
    Conectar bd = new Conectar();
    public Curso() {
    }

    public Curso(String idCurso, String nombreCurso, Date fechaInicio, Date fechaFinalizacion, double costo, String requisitos, int numParticipantes, String rutaImagen) {
        this.idCurso = idCurso;        
        this.nombreCurso = nombreCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.costo = costo;
        this.requisitos = requisitos;
        this.numParticipantes = numParticipantes;
        this.rutaImagen = rutaImagen;       
    }        

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
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

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }            

    public List<Curso> mostrarCurso (){
    String consu="select * from curso";
    List<Curso> lst=new ArrayList<>();
    
        try {            
            conex=DriverManager.getConnection
            (
                bd.getUrl(),
                bd.getUser(),
                bd.getPass()                
            );
            
            pst=conex.prepareStatement(consu);
            rs=pst.executeQuery();
            
            while(rs.next()){
                lst.add(new Curso(
                    rs.getString("Id Curso"),
                    rs.getString("Nombre Curso"),
                    rs.getDate("Fecha Inicio"),
                    rs.getDate("Fecha Finalizacion"),    
                    rs.getDouble("Costo"),
                    rs.getString("Requisitos"),
                    rs.getInt("Numero Participantes"),
                    rs.getString("Ruta Imagen")
                ));
            }
            
            conex.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al mostrar datos en la tabla Curso "+ e);
           
        }
     return lst;
    }
    public List<Curso> filtrarCurso(String campo, String criterio){
        List<Curso> lst = new ArrayList<>();       
         String sql="select * from curso where  " + campo + " like '%"+criterio +"%'";
           try {
               Class.forName(bd.getDriver());
               conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
               pst = conex.prepareStatement(sql);
               rs = pst.executeQuery();//ejecuta la consulta y guarda la consulta en la variable resulset.
               while(rs.next()){
                lst.add(new Curso(
                    rs.getString("Id Curso"),
                    rs.getString("Nombre Curso"),
                    rs.getDate("Fecha Inicio"),
                    rs.getDate("Fecha Finalizacion"),    
                    rs.getDouble("Costo"),
                    rs.getString("Requisitos"),
                    rs.getInt("Numero Participantes"),
                    rs.getString("Ruta Imagen")
                ));
                }
                conex.close();
           } catch (Exception e) {
           } 
        return lst;
   }
    public String insertarCurso(Object obj){
        Curso curso= (Curso) obj;       
        String sql="insert into curso values(?,?,?,?,?,?,?,?)";
        String respuesta;
        try {
            Class.forName(bd.getDriver());
            conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
            pst=conex.prepareStatement(sql);
            pst.setString(1,curso.getIdCurso());                        
            pst.setString(2,curso.getNombreCurso());
            pst.setString(3,String.valueOf(curso.getFechaInicio())); 
            pst.setString(4,String.valueOf(curso.getFechaFinalizacion())); 
            pst.setDouble(5,curso.getCosto());
            pst.setString(6,curso.getRequisitos());
            pst.setInt(7,curso.getNumParticipantes());
            pst.setString(8,curso.getRutaImagen());
            int registros=pst.executeUpdate();//exectuteQuery solo para select
            //executeUpdate es para insert delete update
            //se declara entero porqe puede dividir el numero de valores eliminados
            respuesta=registros +" insertados correctamente en la tabla Curso";
        } catch (Exception e) {
            respuesta=e.getMessage();             
        }
        return respuesta;
    }
    
    public String modificarCurso(Object obj){
        Curso curso= (Curso) obj;      
        String sql="update curso set idPersona=?,nombreCurso=?,fechaInicio=?,fechaFinalizacion=?,costo=?,requisitos=?,numParticipantes=?,rutaImagen=? where idCurso=?";
        String respuesta;
        try {
            Class.forName(bd.getDriver());
            conex=DriverManager.getConnection(bd.getUrl(),bd.getUser(),bd.getPass());
            pst=conex.prepareStatement(sql);
            pst.setString(8,curso.getIdCurso());                        ;
            pst.setString(1,curso.getNombreCurso());
            pst.setString(2,String.valueOf(curso.getFechaInicio())); 
            pst.setString(3,String.valueOf(curso.getFechaFinalizacion())); 
            pst.setDouble(4,curso.getCosto());
            pst.setString(5,curso.getRequisitos());
            pst.setInt(6,curso.getNumParticipantes());           
            pst.setString(7,curso.getRutaImagen());
            
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
