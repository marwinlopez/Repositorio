$body = $("body");


function enEspera()
{
    $body.addClass("loading"); 
    
    
}
function cargado(){
    $body.removeClass("loading");
}

$(document).ready(function(){
  
     
   $('#btncontacto').on('click',function(){
       enEspera();
       var nombre = document.getElementById("nombre");
         var email = document.getElementById("email");
         var mensaje = document.getElementById("mensaje");
       $.ajax({
            type: 'POST',
            url: 'contacto.do',
            data: 'nombre='+nombre.value+'&email='+email.value+'&mensaje='+mensaje.value,
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada Modelo');
               },
               500: function(){
                   $('Problema con el Servidor');
               }
            },
             success: function(){
                 cargado()
                                       
                }
            
        });
        
        //document.getElementById("frmcorreo").action='index';
       
   });
});

function MensajeModal(mensaje){
    document.getElementById("mensajeModal").innerHTML  = mensaje;
    document.location.href='contacto.jsp#openModalAlerta';
};

