<%-- 
    Document   : indexnew
    Created on : 19-may-2016, 19:08:03
    Author     : KNDY
--%>
 <%@page import="Modelo.Anio"%>
 <%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Inicio | BSeguro</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet"> 
    <link href="css/animate.min.css" rel="stylesheet"> 
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="engine2/style.css" />
	<script type="text/javascript" src="engine2/jquery.js"></script>
        <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
        <script type="text/javascript" src="js/ajaxSeguros.js"></script>
        <link href="css/style_login.css" rel="stylesheet" type="text/css"/>
        <link href="css/modalcss.css" rel="stylesheet" type="text/css"/>
        <link href="engine4/style.css" rel="stylesheet" type="text/css"/>
    <script src="engine4/jquery.js" type="text/javascript"></script>
     <link rel="shortcut icon" href="images/ico/favicon.ico">
	
    <!-- Chatra {literal} -->
<script>
    ChatraID = '6ohGxDCGJfugGjGXi';
    (function(d, w, c) {
        var n = d.getElementsByTagName('script')[0],
            s = d.createElement('script');
        w[c] = w[c] || function() {
            (w[c].q = w[c].q || []).push(arguments);
        };
        s.async = true;
        s.src = (d.location.protocol === 'https:' ? 'https:': 'http:')
            + '//call.chatra.io/chatra.js';
        n.parentNode.insertBefore(s, n);
    })(document, window, 'Chatra');
</script>
<!-- /Chatra {/literal} -->

<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-73081350-1', 'auto');
  ga('send', 'pageview');

</script>
<style type="text/css">
    
* {
	padding: 0;
	margin: 0;
}
body {
	font-family: "lucida sans", verdana, arial, helvetica, sans-serif;
	font-size: 75%;
}
h1 {
	font-size: 1.4em;
	padding: 10px 10px 0;
}
p {
	padding: 0 10px 1em;
}
html, body {
	height: 100%;
}
#container {
	min-height: 100%;
	background-color: #DDD;
	border-left: 2px solid #666;
	border-right: 2px solid #666;
	width: 100%;
	margin: 0 auto;
}
* html #container {
	height: 100%;
}

#footer {
	width: 100%;
	clear: both;
	height: 40px;
	background-color: #000;
	color: #DDD;
	text-align:center;
	margin: -50px auto 0 auto;
	position: relative;
	padding-top: 10px;
}
#clearfooter {
	display: block;
	height: 50px;
}
</style>
</head>


<body>
<div id="container">
	<header id="header" STYLE="background: #fff">      
        <div class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="index">
                        <h1><img src="img/BSeguroLogo.png" alt="logo"></h1>
                    </a>
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        
                        <li class="active"><a href="#">Cotizador</a>
                        </li>                    
                        <li ><a href="aseguradoras.html">Aseguradoras <i class="fa fa-angle-down"></i></a>
                           
                        </li>
                        <li ><a href="quienessomos.do">Quienes Somos</a>
                        </li> 
                        <li ><a href="preguntas.html">Preguntas</a>
                        </li> 
                        <li ><a href="contacto.jsp">Contacto</a>
                            
                        </li> 
                        
                        <li><a  href="#">BLOG</a></li>
                    </ul>
                </div>
                
            </div>
        </div>
    </header>
    <!--/#header-->

    
    <!--/#action-->

   <section id="company-information">
        <div class="container">
            <div class="row" style="padding-top: 10px">
                
                <div class="col-sm-8">
                    
                    
                    <div >
                        <P style="COLOR: #FFFFFF; background-color: #0066cc; height: 40px; text-align: center; font-size: 20px; padding-bottom: 0px">Mi Auto</P>
                    <form action=""  method="POST" id="frmCotizador" style="   padding-top: 0px" class="contact" action="" >
                        <fieldset class="contact-inner" style="padding-top: 1px">
        

      
                            <h4 ><b>Empecemos por seleccionar el año, la marca y el modelo de tu auto, así como
tu código postal.</b></h4>    
          <div class="col-sm-12">
        <label for="select" class="select">
          <select name="cmbAnio" id="Anio">
            <option value="" selected>Año…</option>
            <% List<Anio> Anio = (List<Anio>) request.getAttribute("ListaFecha");
                for(Anio anio: Anio){
            %>
            <option value="<%=anio.getSequence()%>"><%=anio.getAño()%></option>
            <%}%>
          </select>
       
          </div>
          
           <div class="col-sm-12" >
                <label for="select" class="select">
          <select name="cmbMarca" id="Marca">
            <option value="" selected>Marca…</option>
          </select>
        </label>
          </div>
          <div class="col-sm-12">
        <label for="select" class="select">
          <select name="cmbModelo" id="Modelo">
            <option value="" selected>Modelo…</option>
          </select>
        </label>
          
      
      </div>    
          <div class="col-sm-12">
        
          <input type="text" name="txtCodigoPostal" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;" id="CodigoPostal" placeholder="Codigo Postal" autofocus autocomplete="off" maxlength="5"/>
      
      </div>    
<div class="col-sm-12">
      <p class="contact-submit" style="margin-top: 10px">
          
          <!--<a style=" font-size: 12px; padding-right: 10px"  href="#openModal">No encontraste tu automovil?</a>
          <button type="button" class="btn btn-sm btn-primary" style="text-align: right" name="cotizar" value="Cotizar" id="cotizar">Cotizar</button>
          
          <input type="submit" name="cotizar" value="Cotizar" id="cotizar" />-->
          <button type="submit" name="cotizar" value="Cotizar" id="cotizar" class="btn btn-sm btn-primary" style="text-align: right; background: #71cb21; border-color: #71cb21">Continuar</button>
          <h2><span id="errmsg" style="color: red"></span></h2>
          <a class="page-header" style=" font-size: 12px; padding-right: 10px; color:#000;" >No encontraste tu automovil?</a><button href="#openModal" class="btn btn-sm btn-primary" style="text-align: right; background: #71cb21; border-color: #71cb21">Haz click Aqui</button>
          <h1 style="margin-bottom: 5px"><img src="img/aseguradorasfooter2.png" ></h1>
      </p>
      </div>    
    </fieldset>
  </form>
          </div>
                </div>
                <div class="col-sm-4 padding-top" >
 <P style="COLOR: #FFFFFF; background-color: #0066cc; height: 40px; text-align: center; font-size: 20px; padding-bottom: 0px">Otros Seguros</P>                    
                    <!-- Start WOWSlider.com BODY section -->
<div id="wowslider-container4">
<div class="ws_images"><ul>
		<li><img src="data4/images/segurodecasa.png" alt="Seguro de Casa" title="Seguro de Casa" id="wows4_0"/></li>
		<li><img src="data4/images/segurodemoto.png" alt="Seguro de Moto" title="Seguro de Moto" id="wows4_1"/></li>
		<li><a href="#"><img src="data4/images/gastosmedicosmenores.jpg" alt="" title="Gastos Medicos Menores" id="wows4_2"/></a></li>
		<li><img src="data4/images/segurodeauto.png" alt="Seguro de Auto" title="Seguro de Auto" id="wows4_3"/></li>
	</ul></div>
<div class="ws_script" style="position:absolute;left:-90%"><a> </a> </div>
<div class="ws_shadow"></div>
</div>	
<script type="text/javascript" src="engine4/wowslider.js"></script>
<script type="text/javascript" src="engine4/script.js"></script>
<!-- End WOWSlider.com BODY section -->

                  

                </div>
          
   
                
               
            </div>
        </div>
    </section>

    
	<section >
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">

                            <div id="openModal" class="modalDialog">
                                <div>	<a href="#close" title="Close" class="close">X</a>
                              <form id="frmcorreo" name="frmcorreo" method="POST" action="" class="contact">
    <fieldset class="contact-inner" style="padding-top: 10px">
      

      <p class="contact-input" >
          <h2 class="page-header">No encontraste tu automovil?</h2>

          <h3 class="page-header">Envianos tus datos...</h3>
          
        <label style="width: 100px" for=”nombre”>Nombre:</label>
        <input id="nombre" style="width: 300px" type="text" name="name" placeholder="Nombre" autofocus></br>
        <label style="width: 100px" for=”marca”>Marca:</label>
        <input id="marca" style="width: 300px" type="text" name="name" placeholder="Marca" autofocus></br>
        <label style="width: 100px" for=”modelo”>Modelo:</label>
        <input id="modelo" style="width: 300px" type="text" name="name" placeholder="Modelo" autofocus></br>
        <label style="width: 100px" for=”anio”>A&ntilde;o:</label>
        <input id="anio" style="width: 300px" type="text" name="name" placeholder="Año" autofocus onkeypress="ValidarNumero()" ></br>
        <label style="width: 100px" for=”correo”>Correo:</label>
        <input id="correo" style="width: 300px" type="email" name="name" placeholder="Correo" autofocus onkeyup="habilitarEnvio()"></br>
        
      <p class="contact-submit">
        <p style="text-align: right"><button id="btncorreo" name="btncorreo" type="submit" class="btn btn-sm btn-primary" style="text-align: right">Enviar</button></p>
      </p>
      <h2><div id="mensajecorreo"></div></h2>
    </fieldset>
  </form>  
                            </div>
                            
                        </div>                        
                    </div>
                </div>
            </div>
        </div>
   </section>
    <!--/#action-->
    
    <section >
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">

                            <div id="openModalAlerta" class="modalDialog">
                                <div>	<a href="#close" title="Close" class="close">X</a>
                              <form action="#close" class="contact">
    <fieldset class="contact-inner" style="padding-top: 10px">
      

      <p class="contact-input" >
          <h2 class="page-header">Debe llenar todos los campos</h2>
        
      <p class="contact-submit">
       
      </p>
    </fieldset>
  </form>  
                            </div>
                            
                        </div>                        
                    </div>
                </div>
            </div>
        </div>
   </section>
    <!--/#action-->
   <div class="modal" ><!-- Place at bottom of page -->
    <div id="frame"><!-- Place at bottom of page -->
        <div id="container2"><!-- Place at bottom of page -->
          <form class="contact">
    <fieldset class="contact-inner" style="padding-top: 10px">
      

    
      <h3><img src="img/icn/LoadingSpin.gif" style="heigh:20px; width:20px;" /> Cargando... Por favor espere...</h3>      
        
    </fieldset>
  </form>         
    </div>
    </div>
    </div>
    
    
    <script type="text/javascript" src="js/validar.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>   
   
    
    
	
	<div id="clearfooter"></div>
	</div>
<div id="footer" >
      
           
                
                
               
                    <div class="copyright-text text-center">
                        <p style="color: #fff">Contrataci&oacute;n v&iacute;a telef&oacute;nica al: (55) 6378-0326</p>
                        
                    </div>
                   
                  
              
              
        
    </div>
     
    <script type="text/javascript" src="js/validar.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>   
</body>
</html>