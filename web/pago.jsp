<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metodo de Pago</title>
        <link href="css/tarjeta.css" rel="stylesheet" type="text/css"/>
        <link href="css/style_formulario.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet"> 
    <link href="css/animate.min.css" rel="stylesheet"> 
	<link href="css/main.css" rel="stylesheet">
      <link href="css/responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <link href="css/style_login.css" rel="stylesheet" type="text/css"/>
       <link href="css/estilosmodal.css" rel="stylesheet" type="text/css"/>
       <script src="js/jquery-2.2.3.js" type="text/javascript"></script>
        
        <script src="js/validarPagos.js" type="text/javascript"></script>
        
    
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
                        <li ><a href="quienessomos">Quienes Somos</a>
                        </li> 
                        <li ><a href="preguntas.html">Preguntas</a>
                        </li> 
                        <li ><a href="contacto.html">Contacto</a>
                            
                        </li> 
                        
                        <li><a  href="login.html">Iniciar Sesion</a></li>
                    </ul>
                </div>
                
            </div>
        </div>
    </header>
    
    <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-73081350-1', 'auto');
  ga('send', 'pageview');

</script>
    </head>
    <body style="background: #f7f7f7">

    
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
                         <p style="text-align: center; margin-top: 10px"> Comprar</p>
                            </div>  
                     <div class="col-sm-12" style="background: #ffffff; ">
                       
                            <div class="row">
 <form id="msform" action="" method="POST" >
  

    <div style="padding-top: 20px; padding-left: 30px; padding-bottom: 30px;">
           Forma de pago:
           <SELECT name="pago" id="pago" onChange="pagoOnChange(this)">
              <OPTION VALUE="DEPOSITO">Deposito Bancario</OPTION>
              <OPTION VALUE="TARJETA">Tarjeta de Credito</OPTION> 
           </SELECT>
      </div>
    
    <div class="col-sm-12" id="nTargeta" style="display:none; padding-left: 30px;" >
        
        <h4> Indique los datos a continuacion:</h4>
      
            <div class="col-sm-2">
            </div>
            <div class="col-sm-4" style="padding-right: 15px; padding-top: 10px">
            
                <input style="border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;	color: #2C3E50;	font-size: 13px;" class="letras" type="text" name="first-name" id="first-name" placeholder="Nombre"/>

                <input style="border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;	color: #2C3E50;	font-size: 13px;" class="letras" type="text" name="last-name" id="last-name" placeholder="Apellido"/>

                <input style="border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;	color: #2C3E50;	font-size: 13px;" type="text" name="number" id="number" placeholder="Numero de la tarjeta"/>

                <input style="border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;	color: #2C3E50;	font-size: 13px;" type="text" name="expiry" id="expiry" placeholder="MM / AA"/>

                <input style="border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;	color: #2C3E50;	font-size: 13px;" type="text" name="cvc" id="cvc" placeholder="CCV"/>
                <select class="select" name="cmbBancos" id="cmbBancos" style="width: 100%; font-size: 13px; height: 35px;border: 1px solid #ccc;	border-radius: 3px; box-sizing: border-box;	font-family: montserrat;">
                    <option value="0" selected="" disabled="">Banco</option>
                </select>
    
            </div>
         
    
          
          
            <div class="card-wrapper col-sm-4 " style="padding-left: 20px">
            
            </div>
            <div class="col-sm-2">
            </div>
          <div id="alert-container">
      
                <div class="row">
                    
                    <div class="col-md-12">
                        <h2 class="page-header"></h2>
                    </div>
                    <div class="col-md-2">
                          
                       
                    </div>

                    
                    
                    <div class="col-md-2">
                          
                       
                    </div>
                </div>
            </div><!--/#alert-container-->
        
        
    </div>
    
    <div   id="nCuenta" style="display:display;" class="col-sm-12"  >
    <div class="col-sm-2">
        </div>
        <div class="col-sm-8" >
           <div class="alert alert-info fade in">
                            
                            <p>Junto con tu póliza vienen los recibos con la información necesaria para que puedas pagar en la sucursal del Banco. En 2 días hábiles recibirás tu póliza por correo electrónico.   </b> </p>
                            
</p>
                        </div> 
    
    </div>
        
    
        
    <div class="col-sm-2">
        </div>
        </div>
    
    <div class="col-sm-12" style="padding-left: 30px;">
         <a href="volver.do"><button  type="button" class="btn btn-sm btn-primary" style="text-align: center">Volver</button></a>
         <button type="reset" class="btn btn-sm btn-primary" style="text-align: center">Limpiar</button>
         <button id="siguiente"  type="button" class="btn btn-sm btn-primary" style="text-align: center">Siguiente</button>
        
            </div>
 
  

   
    
  

  
</form>
                </div>
                            </div>  
                    
                 
             
                
                </div>
                            
                           
          
                </div>
              
          
         
                
             
            </div>
        
                
              </div>
    </section>
        
        
         <section id="page-breadcrumb">
        <div class="vertical-center sun">
             <div class="container">
                
            </div>
        </div>
   </section>
        
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
              <h3>Procesando la transacción... <br/>Por favor espere...</h3>   
            <img src="img/animated.gif" style="height:50px; width:50px;" /> 
          </div>
      </div>
    </div>
    
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/card.js" type="text/javascript"></script>
        <script src="js/jquery.card.js" type="text/javascript"></script>


        <script src="js/pago.js"></script>

    
    
    
  </body>
    
    
    
</html>
