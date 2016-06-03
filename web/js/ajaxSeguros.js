$(document).ready(function(){
    jQuery(function(){
        IniciarModal();
        $.ajax({    
            type: 'POST',
            url: 'anio.do',
            data: 'Anio='+'1',
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada');
               },
               500: function(){
                   $('select[name=cmbMarca]').append('<option selected>Año</option>');
               }
            },
            success: function(dados){ 
                var pegados = dados.split(":");
                for(var i=0;i<pegados.length-1;i++){
                    var sequence = pegados[i].split(".")[0];
                    var nombre = pegados[i].split(".")[1];
                     $('select[name=cmbAnio]').append('<option value="'+sequence+'">'+nombre+'</option>');       
                }
                CerrarModal();
                $('select[name=cmbAnio]').focus();
            }
        });
    });
    $('select[name=cmbAnio]').on('change',function(){
        IniciarModal();
        $.ajax({       
            type: 'POST',
            url: 'MarcaControlador',
            data: 'Anio='+$('select[name=cmbAnio]').val(),
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada');
               },
               500: function(){
                   $('select[name=cmbMarca]').append('<option selected>Año</option>');
               }
            },
            success: function(dados){
                $('select[name=cmbMarca] option').remove();
                $('select[name=Modelo] option').remove();
                var pegados = dados.split(":");
                $('select[name=cmbMarca]').append('<option selected>Marca</option>');
                $('select[name=Modelo]').append('<option selected>Modelo</option>');
                for(var i=0;i<pegados.length-1;i++){
                    var sequence = pegados[i].split(".")[0];
                    var nombre = pegados[i].split(".")[1];
                     $('select[name=cmbMarca]').append('<option value="'+sequence+'">'+nombre+'</option>');       
                }
                CerrarModal();
            }
        });
    });
    
    $('select[name=cmbMarca]').on('change',function(){
        IniciarModal();
        $.ajax({
            type: 'POST',
            url: 'ModeloControlador',
            data: 'Marca='+$('select[name=cmbMarca]').val()+'&Anio='+$('select[name=cmbAnio]').val(),
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada Modelo');
               },
               500: function(){
                   $('select[name=cmbModelo]').append('<option selected>Modelo</option>');
               }
            },
            success: function(dados1){
                $('select[name=cmbModelo] option').remove();
                var pegados1 = dados1.split(":");
                 $('select[name=cmbModelo]').append('<option selected>Modelo</option>');
                for(var i=0;i<pegados1.length-1;i++){
                    var sequence1 = pegados1[i].split("-")[0];
                    var nombre1 = pegados1[i].split("-")[1];
                    $('select[name=cmbModelo]').append('<option value="'+sequence1+'">'+nombre1+'</option>');
                }
                CerrarModal();
            }
        });
    });
    $('select[name=cmbModelo]').on('change',function(){
         $('#CodigoPostal').focus();
    });
     
   $('#cotizar').on('click',function(){ 
        anio = document.getElementById("Anio").value;
        marca = document.getElementById("Marca").value;
        modelo = document.getElementById("Modelo").value;
        codigo = document.getElementById("CodigoPostal").value;
        total = anio.length*marca.length*modelo.length*codigo.length;
        if (total > 0){  
            IniciarModal();
//            $.ajax({
//                type: 'POST',
//                url: 'codigo.do',
//                data: 'Codigo='+codigo     
//            });
            document.getElementById("cotizar").type='submit';
            document.getElementById("frmCotizador").action = 'intermediario.do';
        }else{
            ModalAlerta("Debe seleccionar una opción");
        }
        
   }); 
   $('#btncorreo').on('click',function(){
        var nombre = document.getElementById("nombre");
        var marca = document.getElementById("marca");
        var modelo = document.getElementById("modelo");
        var anio = document.getElementById("anio");
        var correo = document.getElementById("correo");
        var boton = document.getElementById("btncorreo");
        if (nombre.value==="" || marca.value==="" || modelo.value==="" || anio==="" || correo===""){
           $('#mensajecorreo').addClass('error').html('Debe llenar todos los campo').show(400).delay(70).hide(70000);
       }
   });
   $('#correoModal').on('click',function(){
       var boton = document.getElementById("btncorreo");
       boton.disabled=true;
   });
   $('#btncorreo').on('click',function(){
        var nombre = document.getElementById("nombre");
        var marca = document.getElementById("marca");
        var modelo = document.getElementById("modelo");
        var anio = document.getElementById("anio");
        var correo = document.getElementById("correo");
       $.ajax({
            type: 'POST',
            url: 'no-encontrado.do',
            data: 'nombre='+nombre.value+'&marca='+marca.value+'&modelo='+modelo.value+'&anio='+anio.value+'&correo='+correo.value,
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada Modelo');
               },
               500: function(){
                   $('Problema con el Servidor');
               }
            }
        });
       document.getElementById("frmcorreo").action='index';
   });
   
   $('#CodigoPostal').keypress(function(e){
       if(e.which !== 8 && e.which !== 0 && (e.which < 48 || e.which > 57 )){
           $("#errmsg").html("Codigo Postal solo digito !!!").show().fadeOut(1600);
           return false;
       }else{
           $('#CodigoPostal').css("border","1px solid #ccc");
       }
    });
});

function habilitarEnvio(){
    var nombre = document.getElementById("nombre");
    var marca = document.getElementById("marca");
    var modelo = document.getElementById("modelo");
    var anio = document.getElementById("anio");
    var correo = document.getElementById("correo");
    var boton = document.getElementById("btncorreo");
    if (nombre.value!=="" && marca.value!=="" && modelo.value!=="" && anio!=="" && correo!==""){
        boton.disabled=false;
    }else{
        boton.disabled=true;
    }
};

function ValidarNumero(){
    if((event.keyCode<48)||(event.keyCode>57)){
        $('#mensajecorreo').addClass('error').html('Solo datos numerico en el campo Anio').show(400).delay(70).hide(70000);
        event.returnValue = false;
    }
}

function IniciarModal() {
    $(".modal").css("display","block");
};

function CerrarModal() {
    $(".modal").css("display","none");
};

function ModalAlerta(texto) {
    document.getElementById("texto").innerHTML=texto;
    $(".modalAlerta").css("display","block");
    setTimeout(function(){ 
        $(".modalAlerta").css("display","none");
    }, 1000);
};