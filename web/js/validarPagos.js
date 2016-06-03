$(document).ready(function(){
    jQuery(function(){
        $.ajax({    
            type: 'POST',
            url: 'banco.do',
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada');
               },
               500: function(){
                   $('select[name=cmbBancos]').append('<option selected>Año</option>');
               }
            },
            success: function(dados){
                var pegados = dados.split(":");
                for(var i=0;i<pegados.length-1;i++){
                    var sequence = pegados[i].split(".")[0];
                    var nombre = pegados[i].split(".")[1];
                     $('select[name=cmbBancos]').append('<option value="'+sequence+'">'+nombre+'</option>');       
                }
            }
        });
    });
    $(".letras").on('keyup',function(){
          $(this).val($(this).val().toUpperCase());
      });
      
    $("#siguiente").on('click',function(){
        nombre = document.getElementById("first-name");
        apellido = document.getElementById("last-name");
        numero = document.getElementById("number");
        expiry = document.getElementById("expiry");
        cvc = document.getElementById("cvc");
        combo=document.getElementById("pago");
        banco=document.getElementById("cmbBancos");
        if(combo.value=="DEPOSITO"){
            document.getElementById("siguiente").type='submit';
            IniciarModal();
            document.getElementById("msform").action='tarjetacontrolador.do';
        }else{
            if (nombre.value==""){
                ModalAlerta('Debe llenar el campo Nombre');
                document.getElementById("first-name").focus();
            }else if (apellido.value==""){
                ModalAlerta('Debe llenar el campo Apellido');
                document.getElementById("last-name").focus();
            }else if(numero.value==""){
                ModalAlerta('Debe llenar el campo Numero de Tarjeta');
                document.getElementById("number").focus();
            }else if(expiry.value==""){
                ModalAlerta('Debe llenar la fecha de expiración');
                document.getElementById("expiry").focus();
            }else if(cvc.value==""){
                ModalAlerta('Debe llenar CVC');
                document.getElementById("cvc").focus();
            }else if(banco.value=="0"){
                ModalAlerta('Debe seleccionar un banco');
                document.getElementById("cmbBancos").focus();
            }else{
                document.getElementById("siguiente").type='submit';
                IniciarModal();
                document.getElementById("msform").action='tarjetacontrolador.do';
            }
        }
        
    });
});

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
