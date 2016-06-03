<%@page import="Modelo.DatosCotizacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jsp/head.jsp"/> 
<%String dato = (String)request.getAttribute("volver");%>
<title>Formulario | BSeguro</title>
    <link href="css/style_formulario.css" rel="stylesheet" type="text/css"/>
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>
    <script src="js/jquery-2.2.3.js" type="text/javascript"></script>
    <script src="js/jquery.mask.min.js" type="text/javascript"></script>
</head>   
<body style="background: #f7f7f7">
<jsp:include page="jsp/header.jsp"/>
    <!--/#header-->
    
    
       <section id="contenedorindex" >             
        
            <div class="widget-body fuelux">

                <div id="GMMWizard" class="wizard">
                    <ul class="steps">
                        <li data-target="#step1" >
                            <span ></span>Mi auto<span class="chevron"></span>
                        </li>
                        <li data-target="" class="espacio">
                            <span ></span> <span class="chevron"></span>
                        </li>
                        <li data-target="#step2" >
                            <span ></span>Cotizar<span class="chevron"></span>
                        </li>
                         <li data-target="" class="espacio">
                            <span ></span> <span class="chevron"></span>
                        </li>
                        <li data-target="#step3" class="active">
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
                            <span ></span>Mi poliza<span ></span>
                        </li>
                    </ul>
                    
                </div>
                
                <section id="pricePlans"> 
                    <div class="col-sm-12" style="background: #59A3FF; color: #FFF; height: 40px; font-size: 18px; font-weight: 400px; ">
                         <p style="text-align: center; margin-top: 10px"> Mis datos</p>
                            </div>   
                    <div class="col-sm-12" style="background: #ffffff;  ">
                         <div class="col-sm-1" >
                         
                            </div> 
                
<fieldset>     
     <div class="col-sm-10">
     <fieldset>   
    
    <form name="frmDatos" id="frmDatos" action="" method="post" >
        <p style="text-align: left; margin-top: 20px"> Necesitamos preguntarte algunos datos personales para elaborar la cotización. Esta información está protegida con la ley de datos personales. Consulta nuestro aviso de privacidad.
</p>
        <div class="col-sm-4">
            <% if (dato.isEmpty()){%>
            <p>
                <label id="nombre-error" for="username" style="text-align: left;" class="uname" data-icon="u" > Nombre </label></br>
                <input class="letras" type="text" name="nombre" id = "nombre" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Nombre" autocomplete="off" autofocus="true"/>
            </p>
            <p>
                <label id="apaterno-error" for="username" style="text-align: left" class="uname" data-icon="u" > Apellido Paterno </label></br>
            <input class="letras" type="text" name="apaterno" id = "apaterno" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Apellido Paterno" autocomplete="off"/></p>
            <p>
                <label id="amaterno-error" for="username" style="text-align: left" class="uname" data-icon="u" > Apellido Materno </label></br>
            <input class="letras" type="text" name="amaterno" id = "amaterno" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Apellido Materno" autocomplete="off" /></p>
            <p>
                <label id="email-error" for="username" style="text-align: left" class="uname" data-icon="u" > Correo Electronico </label></br>
            <input type="email" name="email" id = "email" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Correo Electronico" autocomplete="off"/></p>
            <p>
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Telefono </label>
            <input type="text" name="telefono" id = "telefono" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Telefono" autocomplete="off"/>     </p>
        </div>
        <div class="col-sm-4">
            <p>
            <label for="celular" style="text-align: left" class="uname" data-icon="u" > Celular</label>
            <input type="text" name="celular" id = "celular" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="celular" autocomplete="off"/>     </p>
            <p id="p-rfc">  
                <label id="rfc-error" for="username" style="text-align: left" class="uname" data-icon="u" > RFC </label><span ></span></br>
                <input class="letras" type="text" name="rfc" id = "rfc" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="RFC" autocomplete="off"/>
            </p>
            
            <p>  
                <label id="cp-error" for="username" style="text-align: left" class="uname" data-icon="u" > Codigo Postal </label></br>
                <input class="letras" type="text" name="cp" id = "cp" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"  placeholder="Codigo Postal" autocomplete="off" onkeypress="return ValidarNumero()"/></p>
            <p>  
                <label id="calle-error" for="username" style="text-align: left" class="uname" data-icon="u" > Calle </label></br>
                <input type="text" name="calle" id = "calle" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"  placeholder="Calle" autocomplete="off"/></p>
            <p>  
                <label for="username" style="text-align: left" class="uname" data-icon="u" > No. Exterior </label></br>
                <input type="text" name="exterior" id = "exterior" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="No. Exterior"/>           </p>
        </div>
        <div class="col-sm-4">
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > No. Interior </label></br>
            <input type="tel" name="interior" id = "interior" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="No. Interior" /></p>
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Estado </label><span id="leer-estado" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;"/></span></br>
            <input type="text" name="estado" id = "estado" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Estado"/></p>
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Delegaci&oacute;n o Municipio </label><span id="leer-delegacion" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;" /></span></br>
            <input type="text" name="delegacion" id = "delegacion" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Delegaci&oacute;n"/></p>
            <p>  
            <label for="username"  class="uname" data-icon="u" > Colonia </label><span id="leer-colonia" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;"/></span></br>
            <select name="cmbColonia" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" id="cmbColonia" class="form-control"><option value="" selected>Colonia</option></select></p>
            <!--<input type="text" name="c" placeholder="Colonia" />-->
            <label style="padding-top: 25px; padding: 25px 5px 0 5px; "><input type="checkbox" id="cbox1" value="first_checkbox">Coberturas Adicionales</label><img src="images/info-icon.png" style="heigh:20px; width:20px;" id="infocobertura" name="infocobertura"/>
            <input type="checkbox" name="autoSiempre" id="autoSiempre" style="display: none">
            <input type="checkbox" name="amanteAuto" id="amanteAuto" style="display: none">
        </div>
            <%}else{
                ServletContext a = getServletContext();
                DatosCotizacion d = (DatosCotizacion) a.getAttribute("datosFormulario");
            %>
            
            <p>
                <label id="nombre-error" for="username" style="text-align: left;" class="uname" data-icon="u" > Nombre </label></br>
                <input class="letras" value="<%=d.getNombre()%>" type="text" name="nombre" id = "nombre" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Nombre" autocomplete="off" autofocus="true"/>
            </p>
            
            
            <p>
                <label id="apaterno-error" for="username" style="text-align: left" class="uname" data-icon="u" > Apellido Paterno </label></br>
            <input class="letras" value="<%=d.getApellidoPaterno()%>" type="text" name="apaterno" id = "apaterno" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Apellido Paterno" autocomplete="off"/></p>
            <p>
                <label id="amaterno-error" for="username" style="text-align: left" class="uname" data-icon="u" > Apellido Materno </label></br>
            <input class="letras" value="<%=d.getAmaterno()%>" type="text" name="amaterno" id = "amaterno" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Apellido Materno" autocomplete="off" /></p>
            <p>
                <label id="email-error" for="username" style="text-align: left" class="uname" data-icon="u" > Correo Electronico </label></br>
            <input type="email" value="<%=d.getEmail()%>" name="email" id = "email" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Correo Electronico" autocomplete="off"/></p>
            <p>
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Telefono </label>
            <input type="text" value="<%=d.getTelefono()%>" name="telefono" id = "telefono" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Telefono" autocomplete="off"/>     </p>
        </div>
        <div class="col-sm-4">
            <p>
            <label for="celular" style="text-align: left" class="uname" data-icon="u" > Celular</label>
            <input type="text" value="<%=d.getCelular()%>" name="celular" id = "celular" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="celular" autocomplete="off"/>     </p>
            <p id="p-rfc">  
                <label id="rfc-error" for="username" style="text-align: left" class="uname" data-icon="u" > RFC </label><span ></span></br>
                <input class="letras" value="<%=d.getRfc()%>" type="text" name="rfc" id = "rfc" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="RFC" autocomplete="off"/>
            </p>
            
            <p>  
                <label id="cp-error" for="username" style="text-align: left" class="uname" data-icon="u" > Codigo Postal </label></br>
                <input class="letras" value="<%=d.getCp()%>" type="text" name="cp" id = "cp" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"  placeholder="Codigo Postal" autocomplete="off" onkeypress="return ValidarNumero()"/></p>
            <p>  
                <label id="calle-error" for="username" style="text-align: left" class="uname" data-icon="u" > Calle </label></br>
                <input type="text" value="<%=d.getCalle()%>" name="calle" id = "calle" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"  placeholder="Calle" autocomplete="off"/></p>
            <p>  
                <label for="username" style="text-align: left" class="uname" data-icon="u" > No. Exterior </label></br>
                <input type="text" value="<%=d.getExterior()%>" name="exterior" id = "exterior" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="No. Exterior"/>           </p>
        </div>
        <div class="col-sm-4">
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > No. Interior </label></br>
            <input type="tel" value="<%=d.getInterior()%>" name="interior" id = "interior" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="No. Interior" /></p>
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Estado </label><span id="leer-estado" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;"/></span></br>
            <input type="text" value="<%=d.getEstado()%>" name="estado" id = "estado" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Estado"/></p>
            <p>  
            <label for="username" style="text-align: left" class="uname" data-icon="u" > Delegaci&oacute;n o Municipio </label><span id="leer-delegacion" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;" /></span></br>
            <input type="text" value="<%=d.getDelegacion()%>" name="delegacion" id = "delegacion" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" placeholder="Delegaci&oacute;n"/></p>
            <p>  
            <label for="username"  class="uname" data-icon="u" > Colonia </label><span id="leer-colonia" style="display: none"><img src="img/icn/LoadingSpin.gif" style="heigh:10px; width:10px;"/></span></br>
            <select name="cmbColonia" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;" id="cmbColonia" class="form-control"><option value="<%=d.getColonia()%>" selected><%=d.getColonia()%></option></select></p>
            <%if(d.isAutosiempre()||d.isAmanteauto()){%>
            <label style="padding-top: 25px; padding: 25px 5px 0 5px; "><input type="checkbox" id="cbox1" value="first_checkbox" checked="true">Coberturas Adicionales</label><img src="images/info-icon.png" style="heigh:20px; width:20px;" id="infocobertura" name="infocobertura"/>
            <%}else{%>
                <label style="padding-top: 25px; padding: 25px 5px 0 5px; "><input type="checkbox" id="cbox1" value="first_checkbox">Coberturas Adicionales</label><img src="images/info-icon.png" style="heigh:20px; width:20px;" id="infocobertura" name="infocobertura"/>
            <%}%>
            <%if(d.isAutosiempre()){%>
            <input type="checkbox" name="autoSiempre" id="autoSiempre" style="display: none" checked="true">
            <%}else{%>
                <input type="checkbox" name="autoSiempre" id="autoSiempre" style="display: none">
            <%}%>
            <%if(d.isAmanteauto()){%>
            <input type="checkbox" name="amanteAuto" id="amanteAuto" style="display: none" checked="true">
            <%}else{%>
                <input type="checkbox" name="amanteAuto" id="amanteAuto" style="display: none">
            <%}%>
        </div>
    <%}%>
    </div>    
    <div class="col-sm-12">
         <div class="col-sm-10">
             <h2>Datos del Vehiculo</h2>  
             <div class="col-sm-4">
                 
              <p>  
                <label id="serie-error" for="username" style="text-align: left" class="uname" data-icon="u" > Nro. Serie del Vehiculo </label></br>
                <%  ServletContext a = getServletContext();
                    DatosCotizacion d = (DatosCotizacion) a.getAttribute("datosFormulario");
                    if (dato.isEmpty()){%>
                    <input class="letras" type="text" name="serie" id = "serie" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"   placeholder="Nro. Serie del Vehiculo" autocomplete="off" /></p>
                <%}else{%>
                    <input class="letras" value="<%=d.getSerie()%>" type="text" name="serie" id = "serie" style="width: 100%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;	width: 100%;box-sizing: border-box;font-family: montserrat;	color: #2C3E50;	font-size: 13px;"   placeholder="Nro. Serie del Vehiculo" autocomplete="off" /></p>
                <%}%>
             </div>
        </div>
         <div class="col-sm-12">
              <p> Puede Consultar nuestro aviso de publicidad <a style=" font-size: 12px; padding-right: 10px"  href="politicas.html">Aqui </a>          </p>
              <% if (dato.isEmpty()){%>
            <p> <input type="checkbox" name="aviso" id="aviso" value="Aceptar" /> He leido y acepto la politica de privacidad de uso <br />            </p>
              <%}else{%>
            <p> <input type="checkbox" name="aviso" id="aviso" value="Aceptar" checked="true" /> He leido y acepto la politica de privacidad de uso <br />            </p>
            <%}%>
         </div>
         <div class="col-sm-12">
             <a id="volver" type="button" class="btn btn-sm btn-primary" style="text-align: left">Volver</a>
         <button type="reset" class="btn btn-sm btn-primary" style="text-align: left">Limpiar</button>
         <% if (dato.isEmpty()){%>
         <input type="button" id="siguiente" name="siguiente" class="btn btn-sm btn-primary" style="text-align: right" value="Siguiente" disabled="true">
          <%}else{%>
         <input type="button" id="siguiente" name="siguiente" class="btn btn-sm btn-primary" style="text-align: right" value="Siguiente">
            <%}%>
               
         </div>
         </form>  
        </div>
 </fieldset>               
                    </div>   
                    </section>  
      </section>
    <!--/#action-->
    <div class="modalPolitica" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
              <fieldset class="" style="padding-top: 10px; margin-left: 7px; text-align: justify;">     
                                  <p class="title" style="font-size: 15px; text-align: center;">Politicas de Privacidad</p>
                                      <div class="divScroll" style="width: 480px; height: 430px;">
                                      
                                      <div  style="width: 450px;">
                            <p style="font-size: 12px; text-align: justify;">
                                    <br /> I. En cumplimiento a las disposiciones legales relacionadas con la Protección de Datos Personales en Posesión de los Particulares en específico a la Ley Federal de Protección de Datos Personales en Posesión de los Particulares (en lo sucesivo la “Ley”) por medio del presente Aviso de Privacidad (en lo sucesivo el “AVISO”), se hace de su conocimiento lo siguiente: “B. Seguro” es una marca comercial perteneciente a la persona Moral denominada UUU Comercializadora S.A de C. V., (en lo sucesivo “B SEGURO”), con domicilio en Emerson número 150, Interior 503, Col. Chapultepec Morales, Delg. Miguel Hidalgo, C. P. 11570, México D. F., es el responsable del tratamiento (se entiende por tratamiento lo señalado por el artículo 3° fracción XVIII de la Ley Federal de Protección de Datos Personales en Posesión de los Particulares.) de los datos personales, aun los sensibles, financieros y patrimoniales, (en lo sucesivo los “DATOS”) que le sean proporcionados por las personas físicas, es decir, sus clientes, proveedores, empleados, y/o cualquier persona (en lo sucesivo el “TITULAR”) que por cualquier motivo entregue o haya entregado información, y estos no tengan la finalidad de uso personal. 
                                    <br /> 
                                    <br /> II. Los “DATOS” pueden ser recabados de forma personal, así como también pueden ser obtenidos por medio de nuestra página de internet www.bseguro.com y/o por cualquier otro medio permitido por la “Ley”.
                                    <br /> 
                                    <br /> III. La finalidad del tratamiento de los “Datos” estará limitada a:
                                    <br /> a) CLIENTES.- Asesorar, orientar, definir, diseñar y ofrecer soluciones innovadoras y específicas en materia de riesgos; Utilizando los datos proporcionados para evaluar su solicitud de seguro, valuación de riesgos, dar trámite a las reclamaciones de siniestros, venta de salvamentos y administrar, mantener o renovar el contrato de seguro en cumplimiento a nuestras obligaciones de la Ley sobre el Contrato de Seguro, Ley General de Instituciones y Sociedades Mutualistas de Seguros, Ley de Instituciones de Seguros y de Fianzas y demás disposiciones que de éstas emanen, así como para estudios estadísticos y evaluar la calidad del servicio.
                                    <br /> b) EMPLEADOS.- Se utilizarán para todos los fines vinculados con la selección, reclutamiento, verificación de referencias, bolsa de trabajo y obligaciones derivadas de la relación laboral, que en su caso se establezca.
                                    <br /> c) DE MAS PERSONAS.- Cualquier persona que ingrese a las instalaciones, oficinas o representaciones de B SEGURO. Se utilizarán para todos los fines vinculados con el acceso, control o video vigilancia/grabación para la seguridad e integridad en las instalaciones
                                    <br /> De manera adicional, utilizaremos su información personal para las siguientes finalidades que no son necesarias para el servicio solicitado, pero que nos permiten y facilitan brindarle una mejor atención: 
                                    <br /> b) Para administrar y operar los servicios y productos que solicita o contrata con nosotros. 
                                    <br /> c) Impulso de productos de nueva creación; 
                                    <br /> d) Entrega y/o recepción de producto; 
                                    <br /> e) Participación en ofertas y/o promociones; 
                                    <br /> f) Invitaciones a evento relacionado en materia de riesgos, seguros y fianzas o cualquier otro análogo a estos; 
                                    <br /> g) Atención al cliente; 
                                    <br /> h) Envío de publicidad a través de cualquier medio de comunicación; 
                                    <br /> i) Investigación de estudios de mercado; 
                                    <br /> j) Celebración de relaciones contractuales o convenios con apego a las legislaciones vigentes en la República Mexicana; 
                                    <br /> k) Registro de información en libros de empleados y/o libros corporativos según la Ley Federal del Trabajo y la Ley General de Sociedades Mercantiles, respectivamente; 
                                    <br /> l) Cualesquier otro análogo a los anteriores.
                                    <br /> 
                                    <br /> IV.- Para llevar a cabo las finalidades descritas en el presente aviso de privacidad, utilizaremos los siguientes datos personales: nombre completo, edad; sexo; domicilio; teléfono y correo electrónico particulares; firma autógrafa; fotografía; empleo actual; número telefónico y correo electrónico personal y/o laboral, por lo que es indispensable recabarlos mediante los documentos que a continuación se describen: (i)Credencial para votar con fotografía expedida por el Instituto Nacional Electoral (INE antes IFE), Cartilla de Liberación del Servicio Nacional Militar expedida por la Secretaria de la Defensa Nacional (SEDENA), pasaporte expedido por la Secretaria de Relaciones Exteriores (SRE) o cualquier identificación oficial vigente; (ii) Registro Federal de Contribuyentes expedido por la Secretaria de Hacienda y Crédito Público (SHCP) principalmente; de manera adicional y con el propósito de llevar a cabo las finalidades secundarias utilizaremos los siguientes datos personales: nombre de la institución financiera (banco) al que pertenece, número de cuenta bancario, número de tarjeta, numero o clave de seguridad y fecha de vencimiento.
                                    <br /> 
                                    <br /> V. En el supuesto de que “B SEGURO” pretenda dar una finalidad distinta a la señalada en el “AVISO” que no sea compatible o análoga con las que se describen con antelación, se informará al “TITULAR” y/o REPRESENTANTE, y en su caso se solicitará su consentimiento, para el ejercicio de la nueva finalidad, dándole a conocer la fecha en la cual surtirá efecto(s) el(los) cambio(s), pudiendo emplear para ello cualesquiera de los siguientes medios: (i) De forma personal a través de un documento escrito; (ii) A través de nuestra página de internet www.bseguro.com; (iii) En cualquier otro medio permitido por la Ley.
                                    <br /> 
                                    <br /> VI. Los “DATOS” que tiene “B SEGURO” o que se recaban en este momento o de forma ulterior al mismo son y serán debidamente resguardados, conservados y protegidos por el Área de Protección de Datos Personales el cual es parte integrante del Departamento Jurídico de “B SEGURO” (en lo sucesivo el “ÁREA”) durante el tiempo del tratamiento, teniendo únicamente el acceso a ellos los integrantes de éste y demás personal debidamente autorizado mediante manifiesto de confidencialidad, quienes en conjunto tienen a su disposición medios físicos y tecnológicos para efectos de impedir su perdida, mal uso, alteración, divulgación y robo.
                                    <br /> 
                                    <br /> VII. Los datos a que se refiere este Aviso podrán ser transferidos a: 
                                    <br /> a) Sociedades relacionadas o subsidiarias, con la finalidad de ofrecerle otros productos y servicios; 
                                    <br /> b) Autoridades financieras mexicanas y extranjeras, con la finalidad de dar cumplimiento a nuestras obligaciones derivadas de leyes o tratados internacionales como institución de seguros, obligaciones tributarias, así como para el cumplimiento de notificaciones o requerimientos oficiales. 
                                    <br /> c) Autoridades judiciales mexicanas y extranjeras, con la finalidad de dar cumplimiento a notificaciones, requerimientos u oficios de carácter judicial. 
                                    <br /> d) IMSS, con la finalidad de dar cumplimiento a obligaciones contenidas en la legislación de seguridad social. 
                                    <br /> e) Instituciones, organizaciones o entidades del sector asegurador (integrantes y auxiliares o de apoyo), para selección de riesgos y prevención de fraudes.
                                    <br /> 
                                    <br /> VII. Con la presente suscripción del “AVISO” usted acepta y otorga su consentimiento expreso para la transferencia de los datos para filiales y/o subsidiarias para llevar acabo las finalidades descritas en la fracción III del presente aviso, así como a terceros nacionales o extranjeros sean personas físicas o morales que sostengan una relación jurídica contractual con “B SEGURO”, señalando que no se requerirá de consentimiento para realizar la(s) transferencia(s) necesaria(s) cuando se presente alguno de los supuestos del artículo 37 de la “Ley”.
                                    <br /> 
                                    <br /> IX. Usted tiene derecho a conocer qué datos personales tenemos de usted, para qué los utilizamos y las condiciones del uso que les damos (ACCESO). Asimismo, es su derecho solicitar la corrección de su información personal en caso de que esté desactualizada, sea inexacta o incompleta (RECTIFICACIÓN); que la eliminemos de nuestros registros o bases de datos cuando considere que la misma no está siendo utilizada conforme a los principios, deberes y obligaciones previstas en la normativa (CANCELACIÓN); así como oponerse al uso de sus datos personales para fines específicos (OPOSICIÓN). Estos derechos se conocen como derechos ARCO. 
                                    <br /> El “TITULAR” de la información por su propio derecho o a través de su representante legal y/o apoderado a partir del día 01 de febrero del 2015 podrá solicitar el Acceso, Rectificación, Cancelación u Oposición (en lo sucesivo “DERECHOS ARCO”) de los “DATOS”, por cualquiera de los siguientes medios: (i) Mediante solicitud escrita dirigida genéricamente al “ÁREA” de “B SEGURO”, al siguiente domicilio Calle Emerson número 150, Interior 503, Col. Chapultepec Morales, Delg. Miguel Hidalgo, C. P. 11570, México D. F., de las 9:00 a las 18:00 horas, en días hábiles;(ii) Por medio de solicitud escrita enviada al correo electrónico contacto@bcseguros.mx, de las 9:00 a las 18:00 horas, en días hábiles. 
                                    <br /> Las solicitudes que se presenten deberán reunir los requisitos del artículo 29 de la “LEY”, es decir: (i) El nombre del titular y domicilio u otro medio para comunicarle la respuesta a su solicitud; (ii) Los documentos que acrediten la identidad o, en su caso, la representación legal del titular; (iii) La descripción clara y precisa de los “DATOS” respecto de los que se busca ejercer alguno de los derechos antes mencionados, y; (iv) Cualquier otro elemento o documento que facilite la localización de los “DATOS”. Después del trámite necesario el responsable a través del “Área” comunicará al “Titular” la determinación tomada en los plazos previstos por el artículo 32 del mismo ordenamiento legal. 
                                    <br /> En caso de que el “TITULAR” no reciba respuesta dentro del término señalado en el párrafo que antecede y/o no se encuentre conforme con la determinación que le haya sido proporcionada, o bien considere que existió alguna violación a sus “DERECHOS ARCO” en términos de la “LEY” podrá interponer queja o denuncia correspondiente ante el Instituto Federal de Acceso a la Información y Protección de Datos (IFAI). www.ifai.org.mx
                                    <br />  
                                    <br /> X. Con objeto de que usted pueda limitar el uso y divulgación de su información personal, le ofrecemos Su inscripción en el Registro Público para Evitar Publicidad, que está a cargo de la Procuraduría Federal del Consumidor, con la finalidad de que sus datos personales no sean utilizados para recibir publicidad o promociones de empresas de bienes o servicios. Para mayor información sobre este registro, usted puede consultar el portal de Internet de la CONDUSEF www.condusef.gob.mx , o bien ponerse en contacto directo con ésta.
                                    <br /> 
                                    <br /> XI, El presente aviso de privacidad puede sufrir modificaciones, cambios o actualizaciones derivadas de nuevos requerimientos legales; de nuestras propias necesidades de acuerdo a los productos o servicios que ofrecemos; de nuestras prácticas de privacidad; de cambios en nuestro modelo de negocio, o por otras causas por lo que nos comprometemos a mantenerlo informado sobre los cambios que pueda sufrir el presente aviso de privacidad, (i) De forma personal a través de un documento escrito; (ii) A través de nuestra página de internet www.bseguro.com ; (iii) En cualquier otro medio permitido por la Ley. 
                                    <br /> AVISO DE PRIVACIDAD SIMPLIFICADO 
                                    <br /> En cumplimiento a lo previsto por la Ley Federal de Protección de Datos Personales en Posesión de los Particulares (en lo sucesivo la “LEY”), por medio del presente Aviso de Privacidad (en lo sucesivo el “AVISO”), se hace de su conocimiento lo siguiente: “B. Seguro” es una marca comercial perteneciente a la persona Moral denominada UUU Comercializadora S.A de C. V., (en lo sucesivo “B SEGURO”), con domicilio Emerson número 150, Interior 503, Col. Chapultepec Morales, Delg. Miguel Hidalgo, C. P. 11570, México D. F., es el responsable del tratamiento (se entiende por tratamiento lo señalado por el artículo 3° fracción XVIII de la Ley Federal de Protección de Datos Personales en Posesión de los Particulares.) de los datos personales, aun los sensibles, financieros y patrimoniales, (en lo sucesivo los “DATOS”) que le sean proporcionados por las personas físicas, es decir, sus clientes, proveedores, empleados, y/o cualquier persona (en lo sucesivo el “TITULAR”) que por cualquier motivo entregue o haya entregado información, y estos no tengan la finalidad de uso personal. Para mayor información acerca del tratamiento y de los derechos que puede hacer valer, usted puede acceder al aviso de privacidad completo a través de nuestra página de internet www.bseguro.com.
                                    <br /> 
                            </p>
                    </div>
				</div>
                                  <br>
                                  
                            </fieldset>
              <input id="aceptar" type="button" value="Aceptar"  class="btn btn-sm btn-primary" style="text-align: right" />
                                    
      </div>
    </div>
        </div>
    
     
    <div class="modalAmante" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
              <fieldset class="contact-inner" style="padding-top: 10px;"> 
                <h2 style="text-align: center" ><b>Tenemos dos paquetes para consentir tu auto</b></h2>
                    <div class="col-sm-6">
                        <img src="img/autosiempre.PNG" />
                        <p style="text-align: center; font-size: 14px">
                            Reposici&oacute;n partes, <br> reparaci&oacute;n en agencia, <br> 0&#37; deducible…<br><br>
                            <a id="autosiempre" style=" font-size: 14px; color: #0066cc; font-weight: 800px; padding-right: 14px; cursor: pointer">M&aacute;s informaci&oacute;n..</a>
                        </p>        
                    </div>
                    <div class="col-sm-6">
                        <img src="img/amantes.PNG" />
                        <p style="text-align: center; font-size: 14px">
                            Reposici&oacute;n partes, <br> reparaci&oacute;n en agencia, <br> 0&#37; deducible…<br><br>
                            <a id="amantes" style=" font-size: 14px; color: #0066cc; font-weight: 800px; padding-right: 14px; cursor: pointer">M&aacute;s informaci&oacute;n..</a>
                            </p>

                    </div>
              <p class="contact-submit">
                  <br> 
                  <br> 
              <p style="text-align: right"><button id="cancelarAmante"  type="button" class="btn btn-sm btn-primary" style="text-align: right">Cancelar</button></p>
              </p>
            </fieldset>
          </div>
      </div>
    </div>
    
<!--    ModalSiempre -->

    <div class="modalPorSiempre" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
            <fieldset class="contact-inner" style="padding-top: 10px;">

                <img src="img/autosiempre.PNG" />
                <h2 style="text-align: left" ><b>El paquete Auto por siempre tiene un precio de $1,799.00 e incluye los siguientes 
                beneficios:</b></h2>

                <div class="col-sm-12">
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                                  <img class ="imgcenter" src="images/Siempre/icon-llantas.png" />
                                  <p style="text-align: center; font-size: 12px">
                                   Reparamos o sustituimos las llantas y rines si sufren daño por accidente o pinchadura.<br><br>
                                                    </p>
                                </div>
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Siempre/icon-auto-sustituto1.png" />
                                  <p style="text-align: center; font-size: 12px">
                                   Auto sustituto hasta por 30 dias consecutivos o diferidos<br><br><br>
                                                    </p>
                                </div>
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Siempre/icon-0-deducible-2.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      0% deduciblo a&uacute;n cuando el tercero no tenga seguro o se d&eacute; a la fuga..<br><br><br>
                                                    </p>
                                </div>
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Siempre/icon-check-up.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      Check up, Revisi&oacute;n de los principales puntos de seguridad de tu auto..<br><br><br>
                                                    </p>
                                </div>
                 <div class="col-sm-2" style="width: 160px;">
                     <img class ="imgcenter" src="images/Siempre/icon-asistencia-vial.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      Asistencia vial sin limites y reparaci&oacute;n de llantas.  Te damos auxilio vial como: paso de corriente, env&iacute;o de cerrajero y m&aacute;s.<br><br>
                                                    </p>
                                </div>
                 <div class="col-sm-2" >

                                </div>
            </div>
            <div class="col-sm-8">


             </div>
            <div class="col-sm-4">

                <button type="button" class="btn btn-sm btn-primary " style="text-align: center; background-color: #07AC55; border-color: #07AC55; color: #ffffff; width: 120px; height: 40px" id="contratar">Contratar</button>
                <button type="button" class="btn btn-sm btn-primary " style="text-align: center; background-color: #000000; border-color: #000000; color: #ffffff; width: 120px; height: 40px" id="no-contratar" >No Contratar</button>

            </div>
            </fieldset>
          </div>
      </div>
    </div>

<!--   Cerrar ModalSiempre -->
    

    <div class="amante" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
            <fieldset class="contact-inner" style="padding-top: 10px;">

                                  <img src="img/amantes.PNG" />
                <h2 style="text-align: left" ><b>El paquete amantes de autos tiene un precio de $1,799.00 e incluye los siguientes 
                beneficios:</b></h2>

                <div class="col-sm-12">
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Amantes/icon-robo-autopartes-1.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      Reposici&oacute;n e instalaci&oacute;n en autopartes de origen robadas al a&uacute;tomovil asegurado.<br>
                                                    </p>
                                </div>
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Amantes/icon-agencia.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      Arregla tu auto en la agencia de tu elecci&oacute;n.<br><br><br><br>
                                                    </p>
                                </div>

                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Amantes/icon-10-mas-1.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      10% m&aacute;s en la indemnizaci&oacute;n por P&eacute;rdida Total a consecuencia de un siniestro.<br>
                                                    </p>
                                </div>    
                <div class="col-sm-2" style="border-right: 1px solid #09cf3e; width: 160px;">
                    <img class ="imgcenter" src="images/Siempre/icon-0-deducible-2.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      0% deducible por P&eacute;rdida Total por Daños Materiales.<br><br><br>
                                                    </p>
                                </div>

                 <div class="col-sm-2" style="width: 160px;">
                     <img class ="imgcenter" src="images/Amantes/icon-encerado-1.png" />
                                  <p style="text-align: center; font-size: 12px">
                                      Encerado profesional Para que tu auto siempre est&eacute; como nuevo.<br><br>
                                                    </p>
                                </div>
                 <div class="col-sm-2" >

                                </div>
            </div>
            <div class="col-sm-8">


             </div>
            <div class="col-sm-4">

                <button type="button" class="btn btn-sm btn-primary " style="text-align: center; background-color: #07AC55; border-color: #07AC55; color: #ffffff; width: 120px; height: 40px" id="contratar2" >Contratar</button>
                <button type="button" class="btn btn-sm btn-primary " style="text-align: center; background-color: #000000; border-color: #000000; color: #ffffff; width: 120px; height: 40px" id="no-contratar2" >No Contratar</button>

            </div>
            </fieldset>
          </div>
      </div>
    </div>

    <!--/#action-->
    
    <div class="modalAlerta" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
              <h3 id="texto"></h3> 
              <img src="img/icn/Alert.png" style="height:50px; width:50px;" /> 
          </div>
      </div>
    </div>
    <!--/#action-->

    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/jquery.easing.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/validarFormulario.js"></script>

        <script src="js/formulario.js"></script>
</body>
</html>

