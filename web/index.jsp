<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jsp/head.jsp"/> 
<title>Inicio | BSeguro</title>
<script type="text/javascript" src="js/ajaxSeguros.js"></script>
<link href="css/style_login.css" rel="stylesheet" type="text/css"/>
</head>
<body style="background: #f7f7f7">
<jsp:include page="jsp/header.jsp"/>
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
                            <span ></span>Hola<span class="chevron"></span>
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
                
                
                <section id="pricePlans"> 
                   
                 
                        
                                         
                
                         <div class="col-sm-8">
                     <div class="col-sm-12" style="background: #59A3FF; color: #FFF; height: 40px; font-size: 18px; font-weight: 400px; ">
                         <p style="text-align: center; margin-top: 10px"> Mi auto</p>
                            </div>
                <form action=""  method="POST" id="frmCotizador" style="   " class="contact2" action="" >
                        <fieldset class="contact-inner" style="padding-top: 1px">
                        <div class="col-sm-12" style=" font-size: small; ">
                         <p style="text-align: left; margin-top: 10px"> Empecemos por seleccionar el año, la marca y el modelo de tu auto, así como tu código postal</p>
                            </div>      
                        <div class="col-sm-12" style="padding-top:5px;">
                            <label for="select" class="select">
                              <select name="cmbAnio" id="Anio">
                                <option value="" selected>Año…</option>
                              </select>
                            </label>    
                        </div>
                            <div style="padding-top:5px;" class="col-sm-12">
                                  <label for="select" class="select">
                              <select name="cmbMarca" id="Marca">
                                <option value="" selected>Marca…</option>
                              </select>
                                      
                            </label></div>
                            <div style="padding-top:5px;" class="col-sm-12">
                                 <label for="select" class="select">
                              <select name="cmbModelo" id="Modelo">
                                <option value="" selected>Modelo…</option>
                              </select>
                            </label> 
                            </div>
                            <div class="col-sm-6" style="padding-top:5px;">
                                 <input type="text" name="txtCodigoPostal" style="width: 60%; border: 1px solid #ccc;border-radius: 3px;padding-top: 1px;height: 30px;" id="CodigoPostal" placeholder="Codigo Postal" autocomplete="off" maxlength="5"/>
                            </div>   
                            <div class="col-sm-2" style="padding-top:5px;">
                                
                            </div> 
                             <div class="col-sm-4" style="padding-top:5px;">
                                <button type="button" class="btn btn-sm btn-primary" style="width: 100%; text-align: center; background-color: #95C21F; border-color: #95C21F" name="cotizar" value="Cotizar" id="cotizar">Continuar</button>
                            </div>  
                            
                            <div class="col-sm-12">
                                <div class="col-sm-5">
                                    <p  style="margin-top: 40px">
                                   
                                    <p style=" font-size: 12px; padding-right: 10px; text-align: left"  >No encontraste tu automovil?</p> 
 <h2><span id="errmsg" style="color: red"></span></h2>
                                </p>
                                </div>
                                <div class="col-sm-7">
                                    
                                <p  style="margin-top: 40px">
                                    <a href="#openModal">
                                  <button type="button" style=" text-align: center; background-color: #95C21F; border-color: #95C21F" href="" class="btn btn-sm btn-primary"  name="" value="" id="">Haz click aquí</button></a>
 <h2><span id="errmsg" style="color: red"></span></h2>
                                </p>
                                
                                </div>
                         </div>    
                            
                            
                            
                            <div class="col-sm-12">
                                <h1 style="margin-bottom: 5px"><img class="imgcenter" src="img/aseguradorasfooter2.png" style="  width: 70%; text-align: center" ></h1>
                         </div>    
                            
                        </div>
                        
                        <div class="col-md-4">
          
                    <div class="col-sm-12" style="background: #59A3FF; color: #FFF; height: 40px; font-size: 18px; font-weight: 400px; ">
                         <p style="text-align: center; margin-top: 10px;"> Otros Seguros</p>
                            </div>   
                    <div style="">
                    <form action=""   class="contact2" >
                        <fieldset class="contact-inner" style="padding-top: 10px; height:100%; background: #ffffff">
                          
                                <h2 class="page-header" style="padding-bottom:0px;">
                                    <div style="width: 100%"><input  style="  width: 70%"  type="image" src="images/segurocasa.png"/></div></h2>
                             <h2 class="page-header" style="padding-bottom:0px;">
                                 <div><input type="image" style="  width: 70%"  src="images/seguromoto.png"/></div></h2>
                             <h2 class="page-header" style="padding-bottom:0px;">
                                    <div><input type="image" style="  width: 70%"  src="images/segurogastos.png"/>                           </div></h2>
                      
                        </fieldset>
                    </form>
                    </div>
                  

            
                        </div>

                        
                    
                    
                    </section>
                
                   <section id="company-information">
                    <div class="container" style="padding-left: 0px">
            <div  style="padding-top: 10px">
                
               
                            
                           
          
          
           
         
                        
                    </fieldset>
                </form>
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
    
    <div class="modalAlerta" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
              <h3 id="texto"></h3> 
              <img src="img/icn/Alert.png" style="height:50px; width:50px;" /> 
          </div>
      </div>
    </div>
    <!--/#action-->
 <jsp:include page="jsp/footer.jsp"/>