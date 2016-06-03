<%@page import="Modelo.Mapfre"%>
<%@page import="Modelo.Rsa"%>
<%@page import="Modelo.Hdi"%>
<%@page import="Modelo.Aba"%>
<%@page import="Modelo.Zurich"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Descripcion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <% Descripcion d = (Descripcion) request.getAttribute("Anio");%>
<jsp:include page="jsp/head.jsp"/> 
<title>Cotizador | BSeguro</title>
<script src="js/cotizaSeguros.js" type="text/javascript"></script>
<link href="css/style_login.css" rel="stylesheet" type="text/css"/>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<script >
    function muestrahover(tipo,valorentrada)
    {
        var valor=valorentrada.trim();
        
        if(valor!="No disponible"){
            var valorrev=valor.substring(1,valor.length);
            valorrev=valorrev.replace(".","");
            valorrev=valorrev.replace(",",".");
      var valornum=parseInt(valorrev);
            
           switch(tipo){
               case 1:  
                  alert("Prima total: "+valor+"\nPago Inicial: "+valor+"\nPago subsecuente: $0.00"); 
               break;
           case 2:
                  alert("Prima total: "+valor+"\nPago Inicial: "+valor+"\nPago subsecuente: $0.00"); 
               break;
           case 3:
                  alert("Prima total: "+valor+"\nPago Inicial: $"+(valornum/12).toFixed(2)+"\n11 pagos subsecuentes: $"+(valornum/12).toFixed(2)); 
              break;
              
           }
        }else{
            
      
    }
    }
    
</script>
<body style="background: #f7f7f7">
<jsp:include page="jsp/header.jsp"/>
    <!--/#header-->

  
    <!--/#action-->

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
                        <li data-target="#step2" class="active">
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
                
                <section id="pricePlans"> 
                    <div class="col-sm-12" style="background: #59A3FF; color: #FFF; height: 40px; font-size: 18px; font-weight: 400px; ">
                         <p style="text-align: center; margin-top: 10px"> Cotizar</p>
                            </div>   
                    <div class="col-sm-12" style="background: #ffffff;  ">
                        
                        <ul id="plans">
            
            <!--ABA-->

            <li class="plan">
                <ul class="planContainer">
                    <li class="title"><span> <img src="img/ABA.png"/> </span></li>                 
                    <% List<Aba> Aba = (List<Aba>) request.getAttribute("AbaLista");
                    if (Aba.size()>0){ %><!--   Si existe Registro -->
                        <li class="price"><p><span> <select class="" id="abaselect" style="width:95% " onchange="cotizaAba(this.value)">
                        <option value="0" selected>Seleccione</option>
                        <% for(Aba l: Aba){%>
                            <option value="<%=d.getAnio()+"|"+l.getClave()%>"><%=l.getDescripcion()%></option>
                        <%}%>
                        </select></span></p> </li>
                        <div id="CargandoABA" style="display:none; height: 215px">           
                           <div style="text-align: center;">
                               <br><br><br>
                               <strong>Actualizando las opciones para esta aseguradora, por favor espere...</strong>
                               <br>
                               <img src="img/animated.gif" style="display: block; width: 25%; margin: 0px auto;" /></div>
                        </div>
                                <div id="InicioABA" style="height: 215px">           
                                    <li>
                                        <br><br><br><br><br>
                                        <p>Seleccione un modelo para ver las opciones que brinda RSA</p>
                                        <br><br><br><br>
                                    </li>
                                </div>
                        <div id="ValoresABA" style="display:none;height: 215px; font-size: 12px">           
                            <li>
                                <ul class="options">
                                <li> <input id="AbaAnual" type="checkbox" name="field" > <label for="option">Pago Anual</label> </li>
                                <li style="border-bottom: 2px solid #e2e2e2;"> <div  id="abaanual"></div> </li>
                                <li style="padding-top: 15px"> <input id="AbaSemestral" type="checkbox" name="field"> <label for="option">Pago Semestral</label> </li>
                                <li style="border-bottom: 2px solid #e2e2e2;"> <div id="abasemestral"></div> </li>
                                <li style="padding-top: 15px"> <input id="AbaAnual2" type="checkbox" name="field"> <label  for="option">Pago Anual sin Intereses</label> </li>
                                <li style="border-bottom: 2px solid #e2e2e2;">  <div id="abaanual2"></div> </li>		      
                                </ul>
                            </li>
                        </div>
                        <li class="button" ><a id="Aba">Contratar</a></li>
                    <%}else{%><!--   Si no existe Registro -->
                        <li class="price">
                            <p><span><select class="" id="abaselect" style="width:95% " onchange="" disabled="true"><option value="">No Disponible</option></select></span></p>
                        </li>
                        <li>
                            <div id="NoDisponibleABA" style="height: 290px; margin-top: 5px;">           
                                <strong>Cotización online no disponible.</strong>
                                <p></p><p>Favor de contactarnos a los Teléfonos:</p><p>(55) 6378 0326 Ext. 109</p><p>o al </p><p>(044) 55 7010 4226</p><p>de</p><p>Lunes a Viernes de 09:00 a 18:00 hrs.</p>
                            </div>
                        </li>  
                    <%}%>
                </ul>
            </li>

            <!--HDI-->


            <li class="plan">
                <ul class="planContainer">
                    <li class="title"><span> <img src="img/HDI.png"/> </span></li>                 
                    <% List<Hdi> Hdi = (List<Hdi>) request.getAttribute("HdiLista");
                        if (Hdi.size()>0){ %><!--   Si existe Registro -->
                            <li class="price"><p><span> <select class="" id="hdiselect" style="width:95% " onchange="cotizaHDI(this.value)">
                            <option value="0" selected>Seleccione</option>
                            <% for(Hdi l: Hdi){%>
                                <option value="<%=l.getClave()%>"><%=l.getDescripcion()%></option>
                            <%}%>
                                </select></span></p> </li>
                            <div id="CargandoHDI" style="display:none; height: 215px">           
                           <div style="text-align: center;">
                               <br><br><br>
                               <strong>Actualizando las opciones para esta aseguradora, por favor espere...</strong>
                               <br>
                               <img src="img/animated.gif" style="display: block; width: 25%; margin: 0px auto;" /></div>
                        </div>
                                <div id="InicioHDI" style="height: 215px">           
                                    <li>
                                        <br><br><br><br><br>
                                        <p>Seleccione un modelo para ver las opciones que brinda HDI</p>
                                        <br><br><br><br>
                                    </li>
                                </div>
                                <div id="ValoresHDI" style="display:none;height: 215px;font-size: 12px">           
                                    <li>
                                        <ul class="options">
                                            <li> <input id="HdiAnual" type="checkbox" name="field" > <label for="option">Pago Anual</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div  id="hdimensual"></div> </li>
                                            <li style="padding-top: 15px"> <input id="HdiSemestral" type="checkbox" name="field" > <label for="option">Pago Semestral</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div id="hdisemestral"></div> </li>
                                            <li style="padding-top: 15px"> <input id="HdiAnual2" type="checkbox" name="field" > <label for="option">Pago Anual Sin Intereses</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;">  <div id="hdianual"></div> </li>
                                        </ul>
                                    </li>
                                </div>
                            <li class="button" ><a id="Hdi">Contratar</a></li>
                                <%
                        }else{%><!--   Si no existe Registro -->
                            <li class="price">
                <p><span><select class="" id="hdiselect" style="width:95% " onchange="" disabled="true"><option value="">No Disponible</option></select></span></p>
            </li>
            <li>
            <div id="NoDisponibleHDI" style="height: 290px; margin-top: 5px;">           
            
            <strong>Cotización online no disponible.</strong>
            <p></p><p>Favor de contactarnos a los Teléfonos:</p><p>(55) 6378 0326 Ext. 109</p><p>o al </p><p>(044) 55 7010 4226</p><p>de</p><p>Lunes a Viernes de 09:00 a 18:00 hrs.</p>
            </div>
            </li>  
                     <%}
                    %>

                </ul>
            </li>

            <!--MAPFRE-->

            <li class="plan">
                <ul class="planContainer">
                    <li class="title"><span> <img src="img/Mapfre.png"/> </span></li>                 
                    <% List<Mapfre> Mapfre = (List<Mapfre>) request.getAttribute("MapfreLista");
                        if (Mapfre.size()>0){ %>
                            <li class="price"><p><span> <select class="" id="mapfreselect" style="width:95% " onchange="cotizaMapfre(this.value);">
                            <option value="0" selected>Seleccione</option>
                            <% for(Mapfre l: Mapfre){%>
                                <option value="<%=d.getAnio()+"|"+l.getClave()%>"><%=l.getDescripcion()%></option>
                            <%}%>
                                </select></span></p> </li>
                            <div id="CargandoMAPFRE" style="display:none; height: 215px">           
                           <div style="text-align: center;">
                               <br><br><br>
                               <strong>Actualizando las opciones para esta aseguradora, por favor espere...</strong>
                               <br>
                               <img src="img/animated.gif" style="display: block; width: 25%; margin: 0px auto;" /></div>
                        </div>
                                <div id="InicioMAPFRE" style="height: 215px">           
                                    <li>
                                        <br><br><br><br><br>
                                        <p>Seleccione un modelo para ver las opciones que brinda MAPFRE</p>
                                        <br><br><br><br>
                                    </li>
                                </div>
                                <div id="ValoresMAPFRE" style="display:none;height: 215px; font-size: 12px">           
                                    <li>
                                        <ul class="options">
                                            <li> <input id="MapfreAnual" type="checkbox" name="field" > <label for="option">Pago Anual</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div  id="mapfremensual"></div> </li>
                                            <li style="padding-top: 15px"> <input id="MapfreSemestral" type="checkbox" name="field"> <label for="option">Pago Semestral</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div id="mapfresemestral"></div> </li>
                                            <li style="padding-top: 15px"> <input id="MapfreAnual2" type="checkbox" name="field"> <label for="option">Pago Anual Sin Intereses</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;">  <div id="mapfreanual"></div> </li>		      
                                        </ul>
                                    </li>
                                </div>
                            <li class="button" ><a id="Mapfre">Contratar</a></li>
                                <%
                        }else{%><!--   Si no existe Registro -->
                            <li class="price">
                <p><span><select class="" id="mapfreselect" style="width:95% " onchange="" disabled="true"><option value="">No Disponible</option></select></span></p>
            </li>
            <li>
            <div id="NoDisponibleMAPFRE" style="height: 290px; margin-top: 5px;">           
            
            <strong>Cotización online no disponible.</strong>
            <p></p><p>Favor de contactarnos a los Teléfonos:</p><p>(55) 6378 0326 Ext. 109</p><p>o al </p><p>(044) 55 7010 4226</p><p>de</p><p>Lunes a Viernes de 09:00 a 18:00 hrs.</p>
            </div>
            </li>  
                     <%}
                    %>

                </ul>
            </li>              
            <!--RSA-->
            <li class="plan">
                <ul class="planContainer">
                    <li class="title"><span> <img src="img/RSA.png"/> </span></li>                 
                    <% List<Rsa> Rsa = (List<Rsa>) request.getAttribute("RsaLista");
                        if (Rsa.size()>0){ %><!--   Si existe Registro -->
                            <li class="price"><p><span> <select class="" id="rsaselect" style="width:95% " onchange="cotizaRSA(this.value)">
                            <option value="" selected>Seleccione</option>
                            <% for(Rsa l: Rsa){%>
                                <option value="<%=d.getAnio()+"|"+l.getClave()%>"><%=l.getDescripcion()%></option>
                            <%}%>
                                </select></span></p> </li>
                            <div id="CargandoRSA" style="display:none; height: 215px">           
                           <div style="text-align: center;">
                               <br><br><br>
                               <strong>Actualizando las opciones para esta aseguradora, por favor espere...</strong>
                               <br>
                               <img src="img/animated.gif" style="display: block; width: 25%; margin: 0px auto;" /></div>
                        </div>
                                <div id="InicioRSA" style="height: 215px">           
                                    <li>
                                        <br><br><br><br><br>
                                        <p>Seleccione un modelo para ver las opciones que brinda RSA</p>
                                        <br><br><br><br>
                                    </li>
                                </div>
                                <div id="ValoresRSA" style="display:none;height: 215px; font-size: 12px">           
                                    
                                    <li>
                                        <ul class="options">
                                            <li> <input id="RsaAnual" type="checkbox" name="field" > <label for="option">Pago Anual</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div  id="rsamensual"></div> </li>
                                            <li style="padding-top: 15px"> <input id="RsaSemestral" type="checkbox" name="field"> <label for="option">Pago Semestral</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div id="rsasemestral"></div> </li>
                                            <li style="padding-top: 15px"> <input id="RsaAnual2" type="checkbox" name="field"> <label for="option">Pago Anual Sin Intereses</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;">  <div id="rsaanual"></div> </li>		      
                                        </ul>
                                    </li>
                                </div>
                            <li class="button" ><a id="Rsa">Contratar</a></li>
                                <%
                        }else{%><!--   Si no existe Registro -->
                            <li class="price">
                <p><span><select class="" id="rsaselect" style="width:95% " onchange="" disabled="true"><option value="">No Disponible</option></select></span></p>
            </li>
            <li>
            <div id="NoDisponibleRSA" style="height: 290px; margin-top: 5px;">           
            
            <strong>Cotización online no disponible.</strong>
            <p></p><p>Favor de contactarnos a los Teléfonos:</p><p>(55) 6378 0326 Ext. 109</p><p>o al </p><p>(044) 55 7010 4226</p><p>de</p><p>Lunes a Viernes de 09:00 a 18:00 hrs.</p>
            </div>
            </li>  
                     <%}
                    %>

                </ul>
            </li>

            <!--ZURICH-->
            <li class="plan">
                <ul class="planContainer">
                    <li class="title"><span> <img src="img/Zurich.png"/> </span></li>
                        <% List<Zurich> Zurich = (List<Zurich>) request.getAttribute("Lista");
                        if (Zurich.size()>0){ %>
                            <li class="price"><p><span> <select class="" name="zurichselect" id="zurichselect" style="width:95% " onchange="cotizaZurich(this.value)">
                                <option value="0" selected>Seleccione</option>
                                <% for(Zurich l: Zurich){%>
                                <option value="<%=d.getAnio()+"|"+l.getClave()%>"><%=l.getDescripcion()%></option>
                            <%}%>
                                </select></span></p> </li>
                            <div id="CargandoZURICH" style="display:none; height: 215px">           
                           <div style="text-align: center;">
                               <br><br><br>
                               <strong>Actualizando las opciones para esta aseguradora, por favor espere...</strong>
                               <br>
                               <img src="img/animated.gif" style="display: block; width: 25%; margin: 0px auto;" /></div>
                        </div>
                                <div id="InicioZURICH" style="height: 215px">           
                                    <li>
                                        <br><br><br><br><br>
                                        <p>Seleccione un modelo para ver las opciones que brinda ZURICH</p>
                                        <br><br><br><br>
                                    </li>
                                </div>
                                <div id="ValoresZURICH" style="display:none;height: 215px; font-size: 12px">           
                                    <li>
                                        <ul class="options">
                                            <li> <input id="ZurichAnual" type="checkbox" name="field" > <label for="option">Pago Anual</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div  id="zurichmensual"></div> </li>
                                            <li style="padding-top: 15px"> <input id="ZurichSemestral" type="checkbox" name="field"> <label for="option">Pago Semestral</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;"> <div id="zurichsemestral"></div> </li>
                                            <li style="padding-top: 15px"> <input id="ZurichAnual2" type="checkbox" name="field"> <label for="option">Pago Anual Sin Intereses</label> </li>
                                            <li style="border-bottom: 2px solid #e2e2e2;">  <div id="zurichanual"></div> </li>		      
                                        </ul>
                                    </li>
                                </div>
                            <li class="button" ><a id="Zurich">Contratar</a></li>
                                <%
                        }else{%><!--   Si no existe Registro -->
                            <li class="price">
                <p><span><select class="" id="zurichselect" style="width:95% " onchange="" disabled="true"><option value="">No Disponible</option></select></span></p>
            </li>
            <li>
            <div id="NoDisponibleZURICH" style="height: 290px; margin-top: 5px;">           
            
            <strong>Cotización online no disponible.</strong>
            <p></p><p>Favor de contactarnos a los Teléfonos:</p><p>(55) 6378 0326 Ext. 109</p><p>o al </p><p>(044) 55 7010 4226</p><p>de</p><p>Lunes a Viernes de 09:00 a 18:00 hrs.</p>
            </div>
            </li>  
                     <%}
                    %>

                </ul>
            </li>
        </ul> 
                    
                
                        <div class="col-md-8">
            
                        </div>
                        <div class="col-md-4">
                            <a href="#openCobertura">
                            <button type="button" class="btn btn-sm btn-primary" style="width: 100%; text-align: center; font-size: 20px; font-weight: 500; background-color: #95C21F; height: 60px; border-color: #95C21F" href="" value="" id="">Cobertura Amplia</button></a>
                        </div>

                        <div id="alert-container">
      
                <div class="row">
                    
                    <div class="col-md-12">
                        <h2 class="page-header"></h2>
                    </div>
                    <div class="col-md-1">
                          
                       
                    </div>

                    <div class="col-md-10">
                        <div class="alert alert-info fade in">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true"></button>
                            <h4> <B> Condiciones Meses Sin Intereses </B></h4>
                            <p><B> ABA SEGUROS: </B> No aplica</p>
                            <p><B> MAPFRE SEGUROS: </B> No aplica</p>
                            <p><B> HDI SEGUROS: </B> 6 Meses sin Intereses con Banamex, Bancomer, HSBC, Scotiabank, American Express y Santander</p>
                            <p><B> RSA SEGUROS: </B> 3 y 6 Meses sin Intereses con American Express, BBVA Bancomer, Banamex Y HSBC</p>
                        
                        </div>
                        
                        
                        
                    </div>
                    
                    <div class="col-md-1">
                          
                       
                    </div>
                </div>
            </div>
                    
                    
                    </section>
                    </div>  
        
                  
     
      </section>
    
    
    

    
            
            
    <!--/#footer-->
    <div class="modalAlerta" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo2">
              <h3 id="texto"></h3> 
              <img src="img/icn/Alert.png" style="height:50px; width:50px;" /> 
          </div>
      </div>
    </div>
    
    <div class="modal" ><!-- Place at bottom of page -->
      <div>
          <div class="cuerpo">
            <h3>Cargando... Por favor espere...</h3>   
            <img src="img/animated.gif" style="height:50px; width:50px;" /> 
          </div>
      </div>
    </div>
    
  
   <section >
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">

                            <div id="openCobertura" class="modalCoberturas">
                                <div >	<a href="#close" title="Close" class="close">X</a>
                              <form id="" name="" method="POST" action="" class="contact">
    <fieldset class="contact-inner" style="padding-top: 10px; ">
      

      
          <h2  style="text-align: center;padding-bottom: 30px">Cobertura Amplia</h2>
          <div class="col-sm-12" style="padding-bottom: 20px">
              <div class="col-sm-4">
               <h2 class="page-header" style="color: #006DC0; text-align: center;">Coberturas</h2>
               <p style="color: #0a5a90; text-align: center; padding-top: 5px">Daños Materiales</p>
               <p style="color: #0a5a90; text-align: center; padding-top: 5px">Robo Total</p>
               <p style="color: #0a5a90; text-align: center; padding-top: 5px">Responsabilidad Civil</p>
               <p style="color: #0a5a90; text-align: center; padding-top: 5px">Gastos Medicos Ocupantes</p>
                 <p style="color: #0a5a90; text-align: center; padding-top: 5px">Asistencia Legal</p>
                   <p style="color: #0a5a90; text-align: center; padding-top: 5px">Asistencia Vial</p>
               
          </div>
              <div class="col-sm-4">
               <h2 class="page-header" style="color: #006DC0; text-align: center;">Limite de Responsabilidad</h2>
               <p style="text-align: center; padding-top: 5px">Valor Comercial</p>
               <p style=" text-align: center; padding-top: 5px">Valor Comercial</p>
               <p style=" text-align: center; padding-top: 5px">$ 4,000,000.00</p>
               <p style=" text-align: center; padding-top: 5px">$ 500,000.00</p>
               <p style=" text-align: center; padding-top: 5px">Amparada</p>
               <p style=" text-align: center; padding-top: 5px">Amparada</p>
          </div>
              <div class="col-sm-4">
               <h2 class="page-header" style="color: #006DC0; text-align: center;">Deducible</h2>
               <p style="text-align: center; padding-top: 5px">5%</p>
               <p style=" text-align: center; padding-top: 5px">10%</p>
               <p style=" text-align: center; padding-top: 5px"></p>
               <p style=" text-align: center; padding-top: 5px"></p>
               <p style=" text-align: center; padding-top: 5px"></p>
               <p style=" text-align: center; padding-top: 5px"></p>
          </div>
              
          </div>
                     <p style=" color:crimson; text-align: center; padding-top: 40px ">* Las condiciones y coberturas no pueden modificarse.</p>
       <a href="#close">
            <button type="button" class="btn btn-sm btn-primary pull-right" style="width: 30%; text-align: center; font-size: 16px; font-weight: 300; background-color: #95C21F; height: 40px; border-color: #95C21F" href="" value="" id="">Aceptar</button></a>
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
    
    <script type="text/javascript" src="js/validarcotizador.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>   

