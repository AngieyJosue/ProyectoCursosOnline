<%-- 
    Document   : index
    Created on : 04-oct-2015, 20:25:50
    Author     : Angelica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Duhoot Bootstarp Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="javaScript/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="javaScript/login.js"></script>
<script src="javaScript/jquery.easydropdown.js"></script>
<!--Animation-->
<script src="javaScript/wow.min.js"></script>
<link href="css/animate.css" rel='stylesheet' type='text/css' />
<script>
	new WOW().init();
</script>
</head>
<body>
<div class="header">
		   <div class="col-sm-8 header-left">
					 <div class="logo">
						<a href="index.jsp"><img src="multimedia/imagenes/logo.png" alt=""/></a>
					 </div>
					 <div class="menu">
						  <a class="toggleMenu" href="#"><img src="multimedia/imagenes/nav.png" alt="" /></a>
						    <ul class="nav" id="nav">
						    	<li class="active"><a href="index.jsp">INICIO</a></li>
						    	<li><a href="jsp/cursos.jsp">CURSOS</a></li>
						    	<li><a href="jsp/diplomados.jsp">DIPLOMADOS</a></li>
						    	<li><a href="jsp/ofertas.jsp">OFERTAS</a></li>
						    	<li><a href="jsp/404.jsp">CONTACTO</a></li>
								<div class="clearfix"></div>
                                                    </ul>
							<script type="text/javascript" src="javaScript/responsive-nav.js"></script>
				    </div>	
				     <!-- start search-->
				      <div class="search-box">
							<div id="sb-search" class="sb-search">
								<form>
									<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
									<input class="sb-search-submit" type="submit" value="">
									<span class="sb-icon-search"> </span>
								</form>
							</div>
						</div>
						<!----search-scripts---->
						<script src="javaScript/classie.js"></script>
						<script src="javaScript/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
						<!----//search-scripts---->						
	    		    <div class="clearfix"></div>
	    	    </div>
	            <div class="col-sm-4 header_right">
	    		      <div id="loginContainer"><a href="#" id="loginButton"><img src="multimedia/imagenes/login.png"><span>Login</span></a>
						    <div id="loginBox">                
						        <form id="loginForm">
						                <fieldset id="body">
						                	<fieldset>
						                          <label for="email">Email Address</label>
						                          <input type="text" name="email" id="email">
						                    </fieldset>
						                    <fieldset>
						                            <label for="password">Password</label>
						                            <input type="password" name="password" id="password">
						                     </fieldset>
						                    <input type="submit" id="login" value="Sign in">
						                	<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
						            	</fieldset>
						                 <span><a href="#">Forgot your password?</a></span>
							      </form>
				              </div>
			             </div>
		                 <div class="clearfix"></div>
	                 </div>
	                <div class="clearfix"></div>
   </div>
   <div class="banner">
   	  <div class="container_wrap">
   		<h1>What are you looking for?</h1>
   	       <div class="dropdown-buttons">   
            		  <div class="dropdown-button">           			
            			<select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}'>
            			<option value="0">Dubai</option>	
						<option value="1">Australia</option>
						<option value="2">Sri Lanka</option>
						<option value="3">Newziland</option>
						<option value="4">Pakistan</option>
						<option value="5">United Kingdom</option>
						<option value="6">United states</option>
						<option value="7">Russia</option>
						<option value="8">Mirum</option>
					  </select>
					</div>
				     <div class="dropdown-button">
					  <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}'>
            			<option value="0">Education</option>	
						<option value="1">tempor</option>
						<option value="2">congue</option>
						<option value="3">mazim </option>
						<option value="4">mutationem</option>
						<option value="5">hendrerit </option>
						<option value="5"></option>
						<option value="5"></option>
					  </select>
					 </div>
				   </div>  
		    <form>
				<input type="text" value="Keyword, name, date, ..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Keyword, name, date, ...';}">
			    <div class="contact_btn">
	               <label class="btn1 btn-2 btn-2g"><input name="submit" type="submit" id="submit" value="Search"></label>
	            </div>
			</form>        		
   		    <div class="clearfix"></div>
         </div>
   </div>
   <div class="content_top">
   	  <div class="container">
   		<div class="col-md-4 bottom_nav">
   		   <div class="content_menu">
				<ul>
					<li class="active"><a href="#">Contenido</a></li> 
					<li><a href="#">Foros </a></li> 
					<li><a href="#">Highlights</a></li> 
				</ul>
			</div>
		</div>
		<div class="col-md-4 content_dropdown1">
		   <div class="content_dropdown">    
		       <select class="dropdown" tabindex="10" data-settings='{"wrapperClass":"metro"}'>
            			<option value="0">Dubai</option>	
						<option value="1">tempor</option>
						<option value="2">congue</option>
						<option value="3">mazim </option>
						<option value="4">mutationem</option>
						<option value="5">hendrerit </option>
						<option value="5"></option>
						<option value="5"></option>
		        </select>
		     </div>
		     <div class="content_dropdown">    
		       <select class="dropdown" tabindex="10" data-settings='{"wrapperClass":"metro"}'>
            			<option value="0">Show Map</option>	
						<option value="1">tempor</option>
						<option value="2">congue</option>
						<option value="3">mazim </option>
						<option value="4">mutationem</option>
						<option value="5">hendrerit </option>
						<option value="5"></option>
						<option value="5"></option>
		        </select>
		       </div>
		</div>
		<div class="col-md-4 filter_grid">
			<ul class="filter">
				<li class="fil">Filter :</li>
				<li><a href=""> <i class="icon1"> </i> </a></li>
				<li><a href=""> <i class="icon2"> </i> </a></li>
				<li><a href=""> <i class="icon3"> </i> </a></li>
				<li><a href=""> <i class="icon4"> </i> </a></li>
				<li><a href=""> <i class="icon5"> </i> </a></li>
			</ul>
		</div>
   	</div>
   </div>
   <div class="content_middle">
   	  <div class="container">
   	    <div class="content_middle_box">
          <div class="top_grid">
   			<div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/idiomas2.png" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">IDIOMAS</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
   	<div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/manualidades.jpg"  class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">MANUALIDADES</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  <div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/dibujo4.jpg" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">DIBUJO</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  <div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/programacion4.png" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">PROGRAMACIÓN</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
   			<div class="clearfix"> </div>
   		</div>
                                  
                                  
   	    <div class="middle_grid wow fadeInUp" data-wow-delay="0.4s">
   			<div class="col-md-6">
   			   <div class="grid1">
   			     <div class="index_img1"><img src="multimedia/imagenes/comentario5.jpg" class="img-responsive" alt=""/></div>
   				  <i class="m_home1"> </i>
                  <ul class="vision">
                  	 <li>Testimonio</li>
                  	 <li class="desc"><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
                  </ul>
   				  <div class="inner_wrap1">
   				 	<ul class="item_module">
   				 	 	<li class="module_left"><img src="multimedia/imagenes/m1.jpg" class="img-responsive" alt=""/></li>
   				 	 	<li class="module_right">
   				 	 		<img src="multimedia/imagenes/m_star.png" class="img-responsive" alt=""/>
   				 	 		<h5>Angélica Aguilera.</h5>
   				 	 		<p>"Aprender Inglés en Duhoot fue la mejor decisión para hablar un segundo idioma."</p>
   				 	 		<%--<a href="#" class="content_btn">....read more</a>--%>
   				 	 	</li>
   				 	 	<div class="clearfix"> </div>
   				 	 </ul>
   				  </div>
   			   </div>
   			</div>
   			<div class="col-md-6">
   			   <div class="grid1">
   			     <div class="index_img1"><img src="multimedia/imagenes/comentario5.jpg" class="img-responsive" alt=""/></div>
   				  <i class="m_home1"> </i>
                  <ul class="vision">
                  	 <li>TESTIMONIO</li>
                  	 <li class="desc"><a href="#"> <img src="multimedia/imagenes/star2.png" alt="">(236)</a></li>
                  </ul>
   				  <div class="inner_wrap1">
   				 	<ul class="item_module">
   				 	 	<li class="module_left"><img src="multimedia/imagenes/m2.jpg" class="img-responsive" alt=""/></li>
   				 	 	<li class="module_right">
   				 	 		<img src="multimedia/imagenes/m_star1.png" class="img-responsive" alt=""/>
   				 	 		<h5>Josué Cruz.</h5>
   				 	 		<p>"La programación con JSP es increible, la forma en que aprendi fue integrando el patrón de diseño MVC."</p>
   				 	 		<%--<a href="#" class="content_btn">....read more</a>--%>
   				 	 	</li>
   				 	 	<div class="clearfix"> </div>
   				 	 </ul>
   				  </div>
   			   </div>
   			</div>
   			<div class="clearfix"> </div>
   		</div>
   		<div class="top_grid wow fadeInRight" data-wow-delay="0.4s">
   			<div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/diseño5.jpg" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">DISEÑO</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  <div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/ofimatica1.png" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">OFIMÁTICA</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  <div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/cocina1.jpg" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">COCINA</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  <div class="col-md-3">
   			  <div class="grid1">
   				<div class="view view-first">
                  <div class="index_img"><img src="multimedia/imagenes/bisuteria.jpg" class="img-responsive" alt=""/></div>
   				    <%--<div class="sale"></div>Precio --%>
   			          <div class="mask">
                        <div class="info"><i class="search"> </i> Prerrequisitos del curso</div>
                        <ul class="mask_img">
                        	<li class="star"><img src="multimedia/imagenes/star.png" alt=""/></li>
                        	<li class="set"><img src="multimedia/imagenes/set.png" alt=""/></li>
                        	<div class="clearfix"> </div>
                        </ul>
                       </div>
                   </div> 
                   <i class="home"></i>
   				 <div class="inner_wrap">
   				 	<h3> Inscribete ya!</h3>
   				 	<ul class="star1">
   				 	  <h4 class="green">BISUTERÍA</h4>
   				 	  <li><a href="#"> <img src="multimedia/imagenes/star1.png" alt="">(236)</a></li>
   				 	</ul>
   				 </div>
   			   </div>
   			</div>
                                  
   			<div class="clearfix"> </div>
   		</div>
   		<div class="bottom_grid wow bounce" data-wow-delay="0.4s">
   		  <div class="col-md-6">
   			   <div class="grid1">
   			     <div class="index_img1"><img src="multimedia/imagenes/comentario6.jpg" class="img-responsive" alt=""/></div>
   				  <i class="m_home1"> </i>
                  <ul class="vision">
                  	 <li>TESTIMONIO</li>
                  	 <li class="desc"><a href="#"> <img src="multimedia/imagenes/star2.png" alt="">(236)</a></li>
                  </ul>
   				  <div class="inner_wrap1">
   				 	<ul class="item_module">
   				 	 	<li class="module_left"><img src="multimedia/imagenes/m1.jpg" class="img-responsive" alt=""/></li>
   				 	 	<li class="module_right">
   				 	 		<img src="multimedia/imagenes/m_star.png" class="img-responsive" alt=""/>
   				 	 		<h5>Mariela Rodruiguez</h5>
   				 	 		<p>"Gracias al curso de manualidades en Duhoot ahora tengo mi propia empresa ofreciendo productos innovadores y de calidad."</p>
   				 	 		<%--<a href="#" class="content_btn">....read more</a>--%>
   				 	 	</li>
   				 	 	<div class="clearfix"> </div>
   				 	 </ul>
   				  </div>
   			   </div>
   			</div>
   			<div class="col-md-6">
   			   <div class="grid1">
   			     <div class="index_img1"><img src="multimedia/imagenes/comentario6.jpg" class="img-responsive" alt=""/></div>
   				  <i class="m_home1"> </i>
                  <ul class="vision">
                  	 <li>TESTIMONIO</li>
                  	 <li class="desc"><a href="#"> <img src="multimedia/imagenes/star2.png" alt="">(236)</a></li>
                  </ul>
   				  <div class="inner_wrap1">
   				 	<ul class="item_module">
   				 	 	<li class="module_left"><img src="multimedia/imagenes/m2.jpg" class="img-responsive" alt=""/></li>
   				 	 	<li class="module_right">
   				 	 		<img src="multimedia/imagenes/m_star.png" class="img-responsive" alt=""/>
   				 	 		<h5>Giovanni Chávez</h5>
   				 	 		<p>"Duhoot ofrece unos cursos únicos para utilizar Ilustrator y ser un profesional sofisticado."</p>
   				 	 		<%--<a href="#" class="content_btn">....read more</a>--%>
   				 	 	</li>
   				 	 	<div class="clearfix"> </div>
   				 	 </ul>
   				  </div>
   			   </div>
   			</div>
   			<div class="clearfix"></div>
   			</div>
   		  </div>
   		  <div class="offering">
   		  	  <h2>¿Qué puede ofrecerte CourseDemy a ti ?</h2>
   		  	  <h3>¡Somos lideres en enseñanza virtual!</h3>
   		  	  <ul class="icons wow fadeInUp" data-wow-delay="0.4s">
   		  	  	 <li><i class="icon1"> </i><span class="one"> </span></li>
   		  	  	 <li><i class="icon2"> </i><span class="two"> </span></li>
   		  	  	 <li><i class="icon3"> </i><span class="three"> </span></li>
   		  	  	 <li><i class="icon4"> </i><span class="four"> </span></li>
   		  	  	 <li><i class="icon5"> </i></li>
   		  	  </ul>
   		  	  <div class="real">
   		  	  	<h4>¿Quienes somos?</h4>
   		  	  	<div class="col-sm-6">
   		  	  	  <ul class="service_grid">
   	   				<i class="s1"> </i>
   	   				 <li class="desc1 wow fadeInRight" data-wow-delay="0.4s">
   	   				   <p>CourseDemy es una plataforma educativa asociada con las universidades y organizaciones más renombradas de todo el mundo que ofrece cursos en línea que cualquiera puede realizar.</p>
   	   				 </li>
   	   				 <div class="clearfix"> </div>
   	   			   </ul>
   	   			 </div>
   	   			 <div class="col-sm-6">
   		  	  	  <ul class="service_grid">
   	   				<i class="s2"> </i>
   	   				 <li class="desc1 wow fadeInRight" data-wow-delay="0.4s">
   	   				   <p>Queremos ayudarte a aprender mejor y más rápido. Por eso hemos diseñado nuestra plataforma basada en métodos de enseñanza probados por los mejores investigadores.</p>
   	   				 </li>
   	   				 <div class="clearfix"> </div>
   	   			   </ul>
   	   			 </div>
   	   			 <div class="clearfix"> </div>
   	   			 </div>
   		  	  </div>
   		  </div>
   	  </div>
   </div>
   <div class="footer">
   	<div class="container">
   	 <div class="footer_top">
   	   <h3>Suscribete para recibir información de nuestros nuevos cursos.</h3>
   	   <form>
		<span>
			<i><img src="multimedia/imagenes/mail.png" alt=""></i>
		    <input type="text" value="Escribe tu correo" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter your email';}">
		    <label class="btn1 btn2 btn-2 btn-2g"> <input name="submit" type="submit" id="submit" value="Enviar"> </label>
		    <div class="clearfix"> </div>
		</span>			 	    
	   </form>
	  </div>
	  <div class="footer_grids">
	     <div class="footer-grid">
			<h4>Menú</h4>
			<ul class="list1">
				<li><a href="contact.html">Inicio</a></li>
				<li><a href="#">Cursos</a></li>
				<li><a href="#">Diplomados</a></li>
				<li><a href="#">Ofertas</a></li>
				<li><a href="#">Contacto </a></li>
			</ul>
		  </div>
		  <div class="footer-grid">
			<h4>Más</h4>
			<ul class="list1">
				<li><a href="#">Términos</a></li>
				<li><a href="#">Privacidad</a></li>
				<li><a href="#">Ayuda </a></li>
				<li><a href="#">Docentes</a></li>
				<li><a href="#">Plataforma Virtual</a></li>
			</ul>
		  </div>
		  <div class="footer-grid last_grid">
			<h4>Siguenos!</h4>
			<ul class="footer_social wow fadeInLeft" data-wow-delay="0.4s">
			  <li><a href=""> <i class="fb"> </i> </a></li>
			  <li><a href=""><i class="tw"> </i> </a></li>
			  <li><a href=""><i class="google"> </i> </a></li>
			  <li><a href=""><i class="u_tube"> </i> </a></li>
		 	</ul>
		 	<div class="copy wow fadeInRight" data-wow-delay="0.4s">
              <p>&copy; 2015 CourseDemy Inc. Todos los derechos reservado.</p>
	        </div>
		  </div>
		  <div class="clearfix"> </div>
	   </div>
      </div>
   </div>
</body>
</html>		