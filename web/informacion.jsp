<%@page import="Modelo.PlanSeleccionado"%>
<%@page import="Modelo.Tarjeta"%>
<%@page import="Modelo.CodigoPostal"%>
<%@page import="java.util.List"%>
<%@page import="Cotizador.MyUtil"%>
<%@page import="Modelo.Descripcion"%>
<%@page import="Modelo.DatosCotizacion"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Informacion | BSeguro</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet"> 
    <link href="css/animate.min.css" rel="stylesheet"> 
    <link href="css/informacion.css" rel="stylesheet" type="text/css"/>
    <link href="css/main.css" rel="stylesheet">
    <link href="css/credicard.css" rel="stylesheet" type="text/css"/>
    <link href="css/style_login.css" rel="stylesheet" type="text/css"/>
    <link href="css/style_formulario.css" rel="stylesheet" type="text/css"/>
    <link href="css/responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>
        
    <!--[if lt IE 9]>
	    <script src="js/html5shiv.js"></script>
	    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="js/validar.js"></script>
   <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-73081350-1', 'auto');
  ga('send', 'pageview');

</script>
    <%
        ServletContext a = getServletContext();
        Date date =new Date();

          DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
     Calendar cdos=Calendar.getInstance();
    Date datediamas=new Date();
    Date dateaniomas=new Date();
    cdos.add(Calendar.DATE,1);
    datediamas=cdos.getTime();
    String fechadiamas=df.format(datediamas);
    cdos.add(Calendar.YEAR,1);
    dateaniomas=cdos.getTime();
    String fechavencimiento=df.format(dateaniomas);
        DatosCotizacion d = (DatosCotizacion) a.getAttribute("datosFormulario"); 
        Descripcion des = (Descripcion) a.getAttribute("datos");
        PlanSeleccionado s = (PlanSeleccionado) a.getAttribute("PlanSeleccionado");
        Tarjeta t = (Tarjeta) a.getAttribute("datosTarjeta"); 

    %>
<body style="background: #f7f7f7">
	<header id="header">      
        
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
                                               
                        <li class="active"><a href="index">Cotizador</a>
                        </li>                    
                        <li ><a href="aseguradoras.html">Aseguradoras <i class="fa fa-angle-down"></i></a>
                           
                        </li>
                        <li ><a href="quienessomos.do">Quienes Somos</a>
                        </li> 
                        <li ><a href="preguntas.html">Preguntas</a>
                        </li> 
                        <li ><a href="contacto.jsp">Contacto</a>
                            
                        </li> 
                        
                        <li><a  href="">Blog</a></li>
                    </ul>

                </div>
                
            </div>
        </div>
    </header>
    <!--/#header-->
    
     <section id="contenedorindex" >             
        
            <div class="widget-body fuelux">

                <div id="GMMWizard" class="wizard">
                    <ul class="steps">
                        <li data-target="#step1" class="active">
                            <span ></span>Mi auto<span class="chevron"></span>
                        </li>
                        <li data-target="" class="espacio">
                            <span ></span> <span class="chevron"></span>
                        </li>
                        <li data-target="#step2">
                            <span ></span>Cotizar<span class="chevron"></span>
                        </li>
                         <li data-target="" class="espacio">
                            <span ></span> <span class="chevron"></span>
                        </li>
                        <li data-target="#step3">
                            <span ></span>Mis datos<span class="chevron"></span>
                        </li>
                         <li data-target="" class="espacio">
                            <span class="badge"></span> <span class="chevron"></span>
                        </li>
                        <li data-target="#step4">
                            <span ></span>Comprar<span class="chevron"></span>
                        </li>
                         <li data-target="" class="espacio">
                            <span ></span> <span class="chevron"></span>
                        </li>
                         <li data-target="#step5">
                            <span ></span>Mi póliza<span ></span>
                        </li>
                    </ul>
                    
                </div>
                
                   <section id="company-information">
                    <div class="" style="padding-left: 0px">
            <div  style="padding-top: 10px">
                
                <div class="">
                    <div class="col-sm-12" style="background: #59A3FF; color: #FFF; height: 40px; font-size: 18px; font-weight: 400px; ">
                         <p style="text-align: center; margin-top: 10px"> Mi poliza</p>
                            </div>  
                     <div class="col-sm-12" style="background: #ffffff; padding-right: 0px;">
                       
                             <div class="alert alert-info alert-block">
				<h4 class="alert-heading">DATOS DE TU PÓLIZA FOLIO: <%="BC"+ s.getAseguradora().substring(0, 1)+t.getMetodopago().substring(0, 1)+"0000: "+a.getAttribute("idcotizacion")%></h4>
                <strong>Vigencia de la póliza: Del <%= fechadiamas+" Hasta: "+fechavencimiento %> </strong>
			</div>
            <h2 class="row-seperator-header"><i class="fa fa-user"></i> Datos del Contratante</h2>                       
			<table class="table table-bordered table-striped" STYLE=" padding-left: 20px">
				<tbody class="left">
                         
                    <tr>
                        <td><strong>NOMBRE:</strong></td>
                        <td><%= d.getNombre().toString() +" "+ d.getApellidoPaterno().toString() +" "+ d.getAmaterno().toString()%></td>
                    </tr>
                    <tr>
                        <td><strong>RFC:</strong></td>
                        <td><%= d.getRfc().toString()  %></td>
                    </tr>
					<tr>
                       
                        <td><strong>DIRECCIÓN:</strong></td>
                        <td><%= d.getCalle().toString()+", "+ d.getExterior().toString()+",  "+ d.getInterior().toString() +", "+ d.getColonia().toString() +", "+ d.getDelegacion().toString()+",  "+d.getEstado().toString() +", "+ d.getCp().toString()+"." %></td>
                    </tr>
                    <tr>
                        <td><strong>CORREO ELECTRÓNICO:</strong></td>
                        <td><%= d.getEmail().toString()  %></td>
                    </tr>
                    <tr>
                        <td><strong>TELÉFONO:</strong></td>
                        <td><%= d.getTelefono().toString() +" / " + d.getCelular() %></td>
                    </tr>
                    </tbody>
			</table>
            
            <h2 class="row-seperator-header"><i class="fa fa-truck"></i> Datos del Vehículo</h2>                             
            <table class="table table-bordered table-striped">
                <tbody class="left">
                    <p></p>
                            <p></p>
                            <p></p>
                            <p></p>
                            <p></p>
					<tr>
						<td><strong>MARCA:</strong></td>
						<td><%= des.getMarca().toString()  %></td>                            
					</tr>
					<tr>
						<td><strong>MODELO:</strong></td>
						<td><%= String.valueOf(des.getAnio())   %></td>
					</tr>
					<tr>
						<td><strong>TIPO:</strong></td>
						<td><%= des.getSubmarca().toString() %></td>
					</tr>
					<tr>
						<td><strong>VERSIÓN:</strong></td>
						<td><%= s.getDescripcion()  %></td>
					</tr>
                                        <tr>
						<td><strong>NO. DE SERIE:</strong></td>
						<td><%= d.getSerie().toString() %></td>
					</tr>
                   </tbody>
			</table>
           
            <h2 class="row-seperator-header"><i class="fa fa-info-circle"></i> Información de Póliza</h2>                             
            <table class="table table-bordered table-striped">
                <tbody class="center-block">
                      <p></p>
                            <p></p>
					<tr>
						<td><strong>FRECUENCIA DE PAGO:</strong></td>
						<td><%= s.getPlan() %></td>                            
					</tr>
					<tr>
						<td><strong>ASEGURADORA:</strong></td>
						<td><%= s.getAseguradora()  %></td>
					</tr>
                   </tbody>
			</table>
            
            <h2 class="row-seperator-header"><i class="fa fa-pencil-square-o"></i> Detalles de la Cobertura: Cobertura Amplia</h2>                             
            <table class="table table-bordered table-striped">
		        <thead>
			        <tr>
				        <th>COBERTURAS</th>
				        <th>RESPONSABILIDAD CIVIL</th>
				        <th>DEDUCIBLE</th>
			        </tr>
		        </thead>
		        <tbody>
			        <tr>
                        <td>Daños Materiales</td>
				        <td>Valor comercial</td>
                        <td>5%</td>
			        </tr>
			        <tr>
				        <td>Robo Total</td>
				        <td>Valor comercial</td>
				        <td>10%</td>
			        </tr>
                    <tr>									
				        <td>Responsabilidad Civil</td>
				        <td>$4,000,000.00</td>
                        <td></td>
			        </tr>
			        <tr>
				        <td>Gastos Médicos Ocupantes</td>
				        <td>$500,000.00</td>
                        <td></td>
			        </tr>
			        <tr>
				        <td>Asistencia Legal</td>
				        <td>Amparada</td>
                        <td></td>
			        </tr>
			        <tr>
				        <td>Asistencia Vial</td>
				        <td>Amparada</td>
                        <td></td>
			        </tr>
                                
		        </tbody>
	        </table>

            <h2 class="row-seperator-header"><i class="fa fa-credit-card"></i> Información de Pago</h2>                             
            <table class="table table-bordered table-striped">
		        <thead>
			        <tr>
				        <th>CONCEPTO</th>
				        <th>MONTO</th>
			        </tr>
		        </thead>
		        <tbody>
			        
			        <tr>
				        <td>Prima Total:</td>
				        <td><label id="LBLPrimaTot"><%= "$ "+s.getValor() %></label></td>
			        </tr>
			        <tr>
				        <td>Pago Inicial:</td>
				        <td><label id="LBLPagoInicial"></label></td>
			        </tr>
			        <tr>
				        <td>Pago Subsecuente</td>
				        <td><label id="LBLPagoSub"></label></td>
			        </tr>
		        </tbody>                
	        </table>   
                                
<%if(d.isAmanteauto()==true){%>
 <h2 class="row-seperator-header"><i class="fa fa-plus-square"></i>Modulos HDI Contratados</h2>
                <table id="ModulosHDI" class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>Modulo</th>
                            <th>Contratación</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <tr>
                            <td>Modulo HDI - Amante de los Autos:</td>
                            <td>
                                <label style="text-align: center"><a class='fa fa-check'></a></label></td>
                        </tr>
                        
                    </tbody>
                </table>
           
            <%}else{ if(d.isAutosiempre()==true){ %>
                <h2 class="row-seperator-header"><i class="fa fa-plus-square"></i>Modulos HDI Contratados</h2>
                <table id="ModulosHDI" class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>Modulo</th>
                            <th>Contratación</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <tr>
                            <td>Modulo HDI - Auto por Siempre</td>
                            <td>
                                <label style="text-align: center"><a class='fa fa-check'></a></label></td>
                        </tr>
                        
                    </tbody>
                </table>
                 <%}else{  %>
                 
            <%}%>
 <%}%>


            <h5 class="row-seperator-header btn btn btn-danger" style="color:#fff"><i class="fa fa-info"></i>  * Estarás asegurado a partir de las 12 Hrs. del siguiente día hábil.</h5>
                <h5 class="row-seperator-header" style="text-align:center; font-style:italic;font-size:12px">
                    Sujeto al pago de la prima
                </h5>
           
		</div>
        </div>        
        
		<div class="proxPaso" style="text-align:center">
			<h4>La emisión de tu póliza está en proceso.</h4>
			<p>Los detalles de tu póliza se han enviado a tu correo electrónico. En 2 días hábiles recibirás tu póliza por correo electrónico.</p>
                        <h4>Si existe algún error en tus datos, contáctanos</h4>
		</div>
    
                     </div>  
                    
                 
             
                
                </div>
                            
                           
          
                </div>
              
          
         
                
             
            </div>
        
                
              </div>
    </section>

   
    <!--/#action-->  
    
   
    
    
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/jquery.easing.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/validarFormulario.js"></script>

        <script src="js/formulario.js"></script>
</body>
</html>

