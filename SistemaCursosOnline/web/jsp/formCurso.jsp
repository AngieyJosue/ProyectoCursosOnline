<%-- 
    Document   : living
    Created on : 05-oct-2015, 8:08:38
    Author     : Angelica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
  <html>
    <head>
        <title>Formulario de Mantenimiento de Cursos</title>
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/css/materialize.min.css">
       <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
       <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/js/materialize.min.js"></script>
       <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
<body>

  <div class="container">
    <h3 class="center-align"><font color="#ee6e73">Formulario de Mantenimiento de Cursos</font></h3>
     <div class="row">
      <form class="col s12">
        <div class="row">
            <div class="input-field col s12 l4">
              <input id="idCurso" type="text" class="validate">
              <label for="idCurso">Id Curso</label>
            </div>
            <div class="input-field col s12 l4">
              <input id="idMultimedia" type="text" class="validate">
              <label for="idMultimedia">Id Multimedia</label>
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
              <input id="nombreCurso" type="text" class="validate">
              <label for="nombreCurso">Nombre del Curso</label>
            </div>            
            <div class="input-field col s12 l4">
              <input id="costo" type="text" class="validate">
              <label for="costo">Costo del Curso</label>
            </div>
            <div class="input-field col s12 l4">
              <input id="costo" type="text" class="validate">
              <label for="costo">Número de Participantes</label>
            </div>   
        </div>
        <div class="row">
            <div class="col s6 l6">
                <label for="fechaInicio">Fecha Inicio</label>
            </div> 
            <div class="col s6 l6">
                <label for="fechaFinalizacion">Fecha Finalización</label>
            </div> 
        </div>
        <div class="row">
             <div class="input-field col s6 l6">                
                <i class="material-icons prefix">perm_contact_calendar</i>
                <input id="fechaInicio" type="date" class="datepicker">
              
            </div>
            <div class="input-field col s6 l6">
              <i class="material-icons prefix">perm_contact_calendar</i>
              <input id="fechaFinalizacion" type="date" class="datepicker">              
            </div>                                    
        </div>  
         <%--
        <div class="row">
          <div class="input-field col s12">
            <input disabled value="No soy editable" id="desactivado" type="text" class="validate">
            <label for="desactivado">Campo desactivado</label>
          </div>
        </div>--%>                  
        <div class="row">
          <div class="input-field col s12">
            <textarea id="textarea" class="materialize-textarea"></textarea>
            <label for="textarea">Requisitos</label>
          </div>
        </div>
        <div class="row">
            <center>
            <div class="input-field col s12 l4">
              <a class="waves-effect waves-light btn"><i class="material-icons left">done</i>Insertar</a>                     
            </div>
               <div class="input-field col s12 l4">           
              <a class="waves-effect waves-light btn"><i class="material-icons left">assignment</i>Modificar</a>                     
            </div>
            <div class="input-field col s12 l4">            
              <a class="waves-effect waves-light btn"><i class="material-icons left">delete</i>Eliminar</a>            
            </div>
            </center>
            
        </div> 
        <!--
        <div class="row">
            <div class="col s12">
                <a href="#modalIngles" class="btn modal-trigger">Ver Detalle</a>
                        <div class="col s12 modal" id="modalIngles">
                            <h4>Curso de Inglés Básico</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laborum eveniet ipsa,
                                molestiae assumenda, optio pariatur omnis qui veniam laudantium temporibus 
                                atque dignissimos id impedit cumque, architecto. Nam inventore distinctio quis.</p>
                            <div class="action-bar">
                                <a href="#" class="btn-flat modal-action modal-close"></a>
                            </div>
                        </div>    
            </div>
        </div>-->
        <div class="row">
            <div class="col s12">            
                <table class="bordered hoverable responsive-table">
                    <thead>
                        <tr>
                            <td>Nombre</td>
                            <td>Apellido</td>
                            <td>Edad</td>
                        </tr>
                    </thead>
                    <thbody>
                        <tr>
                            <td>Angelica</td>
                            <td>Aguilera</td>
                            <td>20</td>
                        </tr>
                        <tr>
                            <td>Angelica</td>
                            <td>Aguilera</td>
                            <td>20</td>
                        </tr>
                        <tr>
                            <td>Angelica</td>
                            <td>Aguilera</td>
                            <td>20</td>
                        </tr>
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