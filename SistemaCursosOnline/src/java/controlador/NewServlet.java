/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Curso;

/**
 *
 * @author Josue
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           Curso curso = new Curso();
            List<Curso> lst = new ArrayList();
            String respuesta="";
            RequestDispatcher rd=null;
             try {
                if(request.getAttribute("btnInsertar")!=null){
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date fechaInicio=null;
                    Date fechaFinal=null;
                    fechaInicio = df.parse(request.getParameter("fechaInicio"));
                    fechaFinal = df.parse(request.getParameter("fechaFinal"));
                   
                    curso.setIdCurso(request.getParameter("txtIdCurso"));
                    curso.setNombreCurso(request.getParameter("txtNombreCurso"));
                    curso.setFechaInicio(fechaInicio);
                    curso.setFechaFinalizacion(fechaFinal);
                    curso.setCosto(Double.parseDouble(request.getParameter("txtCosto")));
                    curso.setRequisitos(request.getParameter("txtRequisitos"));
                    curso.setNumParticipantes(Integer.parseInt(request.getParameter("txtNumParticipantes")));
                    curso.setRutaImagen(request.getParameter("txtRutaImagen"));                    
                    respuesta=curso.insertarCurso(curso);
                    request.setAttribute("respuesta",respuesta);
                }else if(request.getAttribute("btnEliminar")!=null){
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date fechaInicio=null;
                    Date fechaFinal=null;
                    fechaInicio = df.parse(request.getParameter("fechaInicio"));
                    fechaFinal = df.parse(request.getParameter("fechaFinal"));
                   
                    curso.setIdCurso(request.getParameter("txtIdCurso"));
                    curso.setNombreCurso(request.getParameter("txtNombreCurso"));
                    curso.setFechaInicio(fechaInicio);
                    curso.setFechaFinalizacion(fechaFinal);
                    curso.setCosto(Double.parseDouble(request.getParameter("txtCosto")));
                    curso.setRequisitos(request.getParameter("txtRequisitos"));
                    curso.setNumParticipantes(Integer.parseInt(request.getParameter("txtNumParticipantes")));
                    curso.setRutaImagen(request.getParameter("txtRutaImagen"));                    
                    respuesta=curso.eliminarCurso(curso);
                    request.setAttribute("respuesta",respuesta);
                }else if(request.getAttribute("btnModificar")!=null){
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date fechaInicio=null;
                    Date fechaFinal=null;
                    fechaInicio = df.parse(request.getParameter("fechaInicio"));
                    fechaFinal = df.parse(request.getParameter("fechaFinal"));
                   
                    curso.setIdCurso(request.getParameter("txtIdCurso"));
                    curso.setNombreCurso(request.getParameter("txtNombreCurso"));
                    curso.setFechaInicio(fechaInicio);
                    curso.setFechaFinalizacion(fechaFinal);
                    curso.setCosto(Double.parseDouble(request.getParameter("txtCosto")));
                    curso.setRequisitos(request.getParameter("txtRequisitos"));
                    curso.setNumParticipantes(Integer.parseInt(request.getParameter("txtNumParticipantes")));
                    curso.setRutaImagen(request.getParameter("txtRutaImagen"));                    
                    respuesta=curso.modificarCurso(curso);
                    request.setAttribute("respuesta",respuesta);
                }
                rd=request.getRequestDispatcher("formCurso.jsp");
            } catch (Exception e) {
            }
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
