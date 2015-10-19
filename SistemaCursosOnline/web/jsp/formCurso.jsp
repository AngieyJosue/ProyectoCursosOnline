<%-- 
    Document   : living
    Created on : 05-oct-2015, 8:08:38
    Author     : Josue
--%>
<%@page import="java.util.ArrayList" %>
<%@page import="modelo.*" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
  <html>
    <head>
        <title>Formulario de Mantenimiento de Cursos</title>
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/css/materialize.min.css">
       <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
       <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/js/materialize.min.js"></script>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
       <script language="JavaScript">
           function cargar(idCurso, nombreCurso,fechaInicio,fechaFinalizacion,costo,requisitos,numParticipantes,rutaImagen){
            document.frmCurso.txtIdCurso.value=idCurso;            
            document.frmCurso.txtNombreCurso.value=nombreCurso;
            document.frmCurso.fechaInicio.value=fechaInicio;
            document.frmCurso.fechaFinalizacion.value=fechaFinalizacion;
            document.frmCurso.txtCosto.value=costo;           
            document.frmCurso.txtRequisitos.value=requisitos;
            document.frmCurso.txtNumParticipantes.value=numParticipantes;
            document.frmCurso.txtRutaImagen.value=rutaImagen;
        } 
       </script>
    </head>
    <% 
        List<Curso> lst = new ArrayList<>();
        Curso curso= new Curso();
        int tantos=0;
        if(request.getAttribute("respuesta")!=null){
            String resp=(String) request.getAttribute("respuesta");            
            lst=curso.mostrarCurso();
        }else if(request.getAttribute("filtro")!=null){
            tantos=lst.size();
        }else{
            lst=curso.mostrarCurso();
        }
    %>
<body>

  <div class="container">
    <h3 class="center-align"><font color="#ee6e73">Formulario de Mantenimiento de Cursos</font></h3>
     <div class="row">
      <form class="col s12" name="frmCurso" action="NewServlet" method="POST">
        <div class="row">
            <div class="input-field col s12 l4">
              <input id="idCurso" name="txtIdCurso" type="text" class="validate">
              <label for="idCurso">Id Curso</label>
            </div>
            <div class="input-field col s12 l4">
              <input id="idMultimedia" name="txtRutaImagen" type="text" class="validate">
              <label for="idMultimedia">Ruta Imagen</label>
            </div>
            <div class="input-field col s12 l4">
                <select name="idPersona" id="idPersona">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                </select>
                <label for="idPersona">Id Persona</label>
            </div>                       
        </div>
        <div class="row">
            <div class="input-field col s12 l4">
              <input id="nombreCurso" name="txtNombreCurso" type="text" class="validate">
              <label for="nombreCurso">Nombre del Curso</label>
            </div>            
            <div class="input-field col s12 l4">
              <input id="costo" name="txtCosto" type="text" class="validate">
              <label for="costo">Costo del Curso</label>
            </div>
            <div class="input-field col s12 l4">
              <input id="costo" name="txtNumParticipantes" type="text" class="validate">
              <label for="costo">Número de Participantes</label>
            </div>   
        </div>
        <div class="row">
            <div class="col s6 l6">
                <label for="fechaInicio" >Fecha Inicio</label>
            </div> 
            <div class="col s6 l6">
                <label for="fechaFinalizacion">Fecha Finalización</label>
            </div> 
        </div>
        <div class="row">
             <div class="input-field col s6 l6">                
                <i class="material-icons prefix">perm_contact_calendar</i>
                <input id="fechaInicio" name="fechaInicio" type="date" class="datepicker">
              
            </div>
            <div class="input-field col s6 l6">
              <i class="material-icons prefix">perm_contact_calendar</i>
              <input id="fechaFinalizacion" name="fechaFinalizacion" type="date" class="datepicker">              
            </div>                                    
        </div>                          
        <div class="row">
          <div class="input-field col s12">
            <textarea id="textarea" name="txtRequisitos" class="materialize-textarea"></textarea>
            <label for="textarea">Requisitos</label>
          </div>
        </div>
        <div class="row">
            <center>
            <div class="input-field col s12 l4">
              <a class="waves-effect waves-light btn" name="btnInsertar"><i class="material-icons left">done</i>Insertar</a>                     
            </div>
               <div class="input-field col s12 l4">           
              <a class="waves-effect waves-light btn" name="btnModificar"><i class="material-icons left">assignment</i>Modificar</a>                     
            </div>
            <div class="input-field col s12 l4">            
              <a class="waves-effect waves-light btn" name="btnEliminar"><i class="material-icons left">delete</i>Eliminar</a>            
            </div>
            </center>
            
        </div>        
        <div class="row">
            <div class="col s12">            
                <table class="bordered hoverable responsive-table">
                    <tbody>
                        <tr>
                            <td>Campo</td>
                            <td>
                                <select name="txtCampos">
                                    <option value="Id_Curso">Id_Curso</option>                                    
                                    <option value="Nombre_Curso">Nombre_Curso</option>
                                    <option value="Fecha_Inicio">Fecha_Inicio</option>
                                    <option value="Fecha_Finalizacion">Fecha_Finalizacion</option>
                                    <option value="Costo">Costo</option>
                                    <option value="Requisitos">Requisitos</option>
                                    <option value="Num_Participantes">Num_Participantes</option>
                                    <option value="Ruta_Imagen">Ruta_Imagen</option>
                                       
                                </select>
                            </td>
                            <td>Criterio</td>
                            <td><input type="text" name="txtFiltro" value="" /></td>
                             <td>
                                <input type="submit" value="Filtrar" name="btnFiltro" />
                                <input type="submit" value="Reiniciar" name="btnReiniciar" />
                            </td>
                        </tr>
                    </tbody>                    
                </table>    
                <% 
                    if(tantos>0)out.println("se encontraron" + tantos + "registros...");
                %>
        
                <table class="bordered hoverable responsive-table">
                <thead>
                    <tr>                        
                        <th>Id Curso</th>
                        <th>Nombre Curso</th>
                        <th>Fecha Inicio</th>
                        <th>Fecha Finalizacion</th>
                        <th>Costo</th>
                        <th>Requisitos</th>
                        <th>Num Participantes</th>
                        <th>Ruta Imagen</th>  
                        <th>Cargar</th>
                    </tr>
                </thead>
                <thbody>
                    <% 
                        for(Curso fila:lst){
                    %>
                    <tr>
                        <td><%=fila.getIdCurso()%></td>
                        <td><%=fila.getNombreCurso()%></td>
                        <td><%=fila.getFechaInicio()%></td>
                        <td><%=fila.getFechaFinalizacion()%></td>
                        <td><%=fila.getCosto()%></td>
                        <td><%=fila.getRequisitos()%></td>
                        <td><%=fila.getNumParticipantes()%></td>
                        <td><%=fila.getRutaImagen()%></td> 
                        <td>
                            <a href="javascript:cargar('<%=fila.getIdCurso()%>','<%=fila.getNombreCurso()%>','<%=fila.getFechaInicio()%>','<%=fila.getFechaFinalizacion()%>','<%=fila.getCosto()%>','<%=fila.getRequisitos()%>','<%=fila.getNumParticipantes()%>','<%=fila.getRutaImagen()%>')">Cargar</a>
                        </td>
                    </tr>  
                    <%
                        }
                    %>
                </thbody>
            </table>
            </div>
        </div> 
      </form>
        
    </div>
  </div>
       <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/js/materialize.min.js"></script>
       <script>
           $(document).ready(function(){
               $('select').material_select();
               $('.datepicker').pickadate();
               $('.modal-trigger').leanModal();
           })
       </script>
  </body>
</html>