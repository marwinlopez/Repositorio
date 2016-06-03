<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="jsp/head.jsp"/> 
<title>Contacto | BSeguro</title>
</head>
<body>
<jsp:include page="jsp/header.jsp"/>
    <!--/#header-->

   <section id="page-breadcrumb">
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">
                            <h2 class="page-header"><b>Contacto</b></h2>            
                        </div>                        
                    </div>
                </div>
            </div>
        </div>
   </section>
    <!--/#action-->
    
    <section id="company-information" class="padding wow fadeIn" data-wow-duration="1000ms" data-wow-delay="300ms">
        <div class="container">
            <div class="row">
                
                <div class="col-sm-4" style=" line-height:5px;">
                    <div >

                        <h1><img src="img/trabajoenequipo.jpg" alt="logo"></h1>
        
    
</div>
                </div>
                <div class="col-sm-4">
                    <div >

                     <div class="alert alert-info fade in">
                            
                            <p>Somos un broker enfocado en dar atención y  servicio personalizado,<b> trabajamos con nuestros clientes para definir, diseñar y ofrecer soluciones innovadoras y específicas para proteger su futuro. </b> </p>
                            <p>Ofrecemos asesoría y soluciones en materia de riesgos.<br />
                                <br /> 
                            ¡Llámanos!<br />  
                            Teléfono: (0155) 6378-0326.
</p>
                        </div>
    
</div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="contact-form bottom">
                        <h2>Envie un Mensaje</h2>
                        <form id="frmcontacto" name="frmcontacto" method="post" action="">
                            <div class="form-group">
                                <input type="text" name="nombre" id="nombre" class="form-control" required="required" placeholder="Nombre">
                            </div>
                            <div class="form-group">
                                <input type="email" name="email" id="email" class="form-control" required="required" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <textarea name="mensaje" id="mensaje" required="required" class="form-control" rows="2" placeholder="Su mensaje aqui"></textarea>
                            </div>                        
                            <div class="form-group">
                                <button id="btncontacto" name="btncontacto" class="btn btn-sm btn-primary" style="text-align: right">Enviar</button>
                                
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

    

    

    
	<footer id="footer" style="background: #f9f9f9; ">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 text-center bottom-separator">
                  
                </div>
                <div class="col-md-4 col-sm-5">
                    <div class="testimonial bottom">
                        
                                                
                    </div> 
                </div>
                
                
                <div class="col-sm-12">
                    <div class="copyright-text text-center">
                        <p>&copy; L&R Consultores 2016. All Rights Reserved.</p>
                        
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--/#footer-->
    
    <section >
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">

                            <div id="openModalAlerta" class="modalDialog">
                                <div>	<a href="#close" title="Close" class="close">X</a>
                              <form action="#close" class="contact">
                                  <fieldset class="contact-inner" style="padding-top: 10px;">
      

      
                                  <h2 class="page-header"><div id="mensajeModal"></div></h2>
                                  <br>


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

  <div class="modal" ><!-- Place at bottom of page -->
    <div id="frame"><!-- Place at bottom of page -->
        <div id="container"><!-- Place at bottom of page -->
          <form class="contact">
    <fieldset class="contact-inner" style="padding-top: 10px">
      

    
      <h3><img src="img/icn/LoadingSpin.gif" style="heigh:20px; width:20px;" /> Enviando Correo... Por favor espere...</h3>      
        
    </fieldset>
  </form>         
    </div>
    </div>
    </div>
    
    <script src="js/contacto.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>   
</body>
</html>
