$(document).ready(function(){
     $("#nombre,#apaterno,#amaterno").keypress(function (key) {
            if ((key.charCode < 97 || key.charCode > 122)//letras mayusculas
                && (key.charCode < 65 || key.charCode > 90) //letras minusculas
                && (key.charCode !== 45) //retroceso
                && (key.charCode !== 241) //ñ
                 && (key.charCode !== 209) //Ñ
                 && (key.charCode !== 32) //espacio
                 && (key.charCode !== 225) //á
                 && (key.charCode !== 233) //é
                 && (key.charCode !== 237) //í
                 && (key.charCode !== 243) //ó
                 && (key.charCode !== 250) //ú
                 && (key.charCode !== 193) //Á
                 && (key.charCode !== 201) //É
                 && (key.charCode !== 205) //Í
                 && (key.charCode !== 211) //Ó
                 && (key.charCode !== 218) //Ú
                )
                return false;
      });
      $("#apaterno,#amaterno").keypress(function (key) {
            if ((key.charCode < 97 || key.charCode > 122)//letras mayusculas
                && (key.charCode < 65 || key.charCode > 90) //letras minusculas
                && (key.charCode !== 45) //retroceso
                && (key.charCode !== 241) //ñ
                 && (key.charCode !== 209) //Ñ
                 && (key.charCode !== 225) //á
                 && (key.charCode !== 233) //é
                 && (key.charCode !== 237) //í
                 && (key.charCode !== 243) //ó
                 && (key.charCode !== 250) //ú
                 && (key.charCode !== 193) //Á
                 && (key.charCode !== 201) //É
                 && (key.charCode !== 205) //Í
                 && (key.charCode !== 211) //Ó
                 && (key.charCode !== 218) //Ú
                )
                return false;
      });
      $(".letras").on('keyup',function(){
          $(this).val($(this).val().toUpperCase());
      });
      
    $('#nombre').on('keyup',function(){
        nombre = $('#nombre').val();
        label = document.getElementById("nombre-error");
        if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("nombre").value="";
            x.focus();
        }else if(nombre.length===0){
           $("#nombre-error").css("color","black");
           label.innerHTML  = "Nombre";
        }else if(nombre.length<3){
            label.innerHTML  = "Nombre Minimo 3 caracteres";
            $("#nombre-error").css("color","red");
        }else{
            label.innerHTML  = "Nombre";
            $("#nombre-error").css("color","black");
        }
    });
   
    $('#apaterno').on('keyup',function(){
        apaterno = $('#apaterno').val();
        label = document.getElementById("apaterno-error");
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("apaterno").value="";
            x.focus();
        }else if(apaterno.length===0){
           $("#apaterno-error").css("color","black");
           label.innerHTML  = "Apellido Paterno";
        }else if(apaterno.length<3){
            label.innerHTML  = "Apellido Paterno Minimo 3 caracteres";
            $("#apaterno-error").css("color","red");
        }else{
            $("#apaterno-error").css("color","black");
            label.innerHTML  = "Apellido Paterno";
        }
    });
   
    $('#amaterno').on('keyup',function(){
        amaterno = $('#amaterno').val();
        label = document.getElementById("amaterno-error");
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("amaterno").value="";
            x.focus();
        }else if(amaterno.length===0){
           $("#amaterno-error").css("color","black");
           label.innerHTML  = "Apellido Materno";
        }else if(amaterno.length<3){
            label.innerHTML  = "Apellido Materno Minimo 3 caracteres";
            $("#amaterno-error").css("color","red");
        }else{
            $("#amaterno-error").css("color","black");
            label.innerHTML  = "Apellido Materno";
        }
    });
    $('#email').on('keyup',function(){
        correo = $('#email').val();
        label = document.getElementById("email-error");
        var expresion =/\w+@\w+\.+[a-z]/;
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("email").value="";
            x.focus();
        }else if (correo.length===0||expresion.test(correo)){
           label.innerHTML  = "Correo Electronico";
                $("#email-error").css("color","black");
        }else if (!expresion.test(correo)) {
             label.innerHTML  = "Correo Electronico Invalidado !!!";
           $("#email-error").css("color","red");
               
        }
        
    });
    $('#email').on('blur',function(){
        correo=$('#email').val();
        var expresion =/\w+@\w+\.+[a-z]/;
        for(i = 0; i<correo.length;i++){
            if (!expresion.test(correo)) {
                ModalAlerta("Error <br/>Dirección de correo electrónico no válida");
                document.getElementById("email").focus();
            }
        }
    });
    $("#telefono").mask('(000)0000-0000', {placeholder: '(000)0000-0000'}); //placeholder
    $('#rfc').on('keyup',function(){
        rfc = $('#rfc').val();
        label = document.getElementById("rfc-error");
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("rfc").value="";
            x.focus();
        }else if(rfc.length===0){
           $("#rfc-error").css("color","black");
           label.innerHTML  = "RFC";
        }else if(rfc.length<10){
            label.innerHTML  = "RFC Minimo 10 caracteres";
            $("#rfc-error").css("color","red");
        }else{
            $("#rfc-error").css("color","black");
            label.innerHTML  = "RFC";
        }
    });
    $('#serie').on('keyup',function(){
        serie = $('#serie').val();
        label = document.getElementById("serie-error");
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("serie").value="";
            x.focus();
        }else if(serie.length===0){
           $("#serie-error").css("color","black");
           label.innerHTML  = " Nro. Serie del Vehiculo ";
        }else if(serie.length<17){
            label.innerHTML  = " Nro. Serie del Vehiculo Minimo 17 caracteres";
            $("#serie-error").css("color","red");
        }else{
            $("#serie-error").css("color","black");
            label.innerHTML  = " Nro. Serie del Vehiculo ";
        }
        if(serie.length>=17){
            document.getElementById("siguiente").disabled=false;
        }
    });
    $("#cp").mask('99999');
    $('#cp').on('keyup',function(){
        label = document.getElementById("cp-error");
        cp = $('#cp').val();
         if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            document.getElementById("cp").value="";
            x.focus();
        }else if(cp.length===0){
           $("#cp-error").css("color","black");
           label.innerHTML  = "Codigo Postal";
        }else if(cp.length<5){
            label.innerHTML  = "Codigo Postal Minimo 5 caracteres";
            $("#cp-error").css("color","red");
        }else{
            $("#cp-error").css("color","black");
            label.innerHTML  = "Codigo Postal";
        }
    });
    $('#cp').on('blur',function(){
        cp=$('#cp').val();
        if(cp.length<5){
            document.getElementById("cp").focus();
        }else{
            BuscarCodigo();
            $('#leer-estado').css("display","block");
            $('#leer-delegacion').css("display","block");
            $('#leer-colonia').css("display","block");
        }
    });
    $('#calle').on('keyup',function(){
        $(this).val($(this).val().toUpperCase());
    });
//     $('#calle').focusout(function(){
//         calle=$('#calle').val();
//         if(calle.length<2){
//             document.getElementById("calle").focus();
//         }
//    });
    $('#exterior').on('keyup',function(){
        $(this).val($(this).val().toUpperCase());
    });
     $('#interior').on('keyup',function(){
        $(this).val($(this).val().toUpperCase());
    });
    $('#estado').focusin(function(){
        document.getElementById("cmbColonia").focus();
    });
    $('#delegacion').focusin(function(){
        document.getElementById("cmbColonia").focus();
    });
    $('#cmbColonia').change(function(){
        document.getElementById("serie").focus();
    });
    $('#volver').on('click',function(){
        document.location.href='cotizador.do';
    });
    $('#siguiente').on('click',function(){
        x = document.getElementById("aviso");
        if (!x.checked){
            ModalAlerta('Debe aceptar las politicas de privacidad');
            x.focus();
        }else{
            nombre = document.getElementById('nombre');
            apellido1 = document.getElementById('apaterno');
            apellido2 = document.getElementById('amaterno');
            correo = document.getElementById('email');
            telefono = document.getElementById('telefono');
            rfc = document.getElementById('rfc');
            serie = document.getElementById('serie');
            cp = document.getElementById('cp');
            calle = document.getElementById('calle');
            exterior = document.getElementById('exterior');
            interior = document.getElementById('interior');
            estado = document.getElementById('estado');
            delegacion = document.getElementById('delegacion');
            cmbColonia = document.getElementById('cmbColonia');
            option1 = document.getElementById("option1");
            option2 = document.getElementById("option2");
            if (nombre.value == 0){
                ModalAlerta('Debe llenar el campo Nombre');
                nombre.focus();
            }else if (apellido1.value==0){
                ModalAlerta('Debe llenar el campo Apellido Paterno');
                apellido1.focus();
            }else if (apellido2.value==0){
                ModalAlerta('Debe llenar el campo Apellido Materno');
                apellido2.focus();
            }else if (correo.value==0){
                ModalAlerta('Debe llenar el campo Correo');
                correo.focus();
            }else if (telefono.value==0){
                ModalAlerta('Debe llenar el campo Telefono');
                telefono.focus();
            }else if (rfc.value==0){
                ModalAlerta('Debe llenar el campo RFC');
                rfc.focus();
            }else if (serie.value==0){
                ModalAlerta('Debe llenar el campo Nro Serie del Vehiculo');
                serie.focus();
            }else if (cp.value==0){
                ModalAlerta('Debe llenar el campo Codigo Postal');
                cp.focus();
            }else if (calle.value==0){
                ModalAlerta('Debe llenar el campo Calle');
                calle.focus();
            }else if (exterior.value==0){
                ModalAlerta('Debe llenar el campo Nro Exterior');
                exterior.focus();
            }else if (interior.value==0){
                ModalAlerta('Debe llenar el campo Nro Interior');
                interior.focus();
            }else if (cmbColonia.value==0){
                ModalAlerta('Debe llenar el campo Colonia');
                cmbColonia.focus();
            }else{
                IniciarModal();
                document.getElementById("siguiente").type='submit';
                document.getElementById("frmDatos").action = 'pago.do';
            }
        }
    });
    $('#aceptar').click(function(){
        x.checked=true;
        $(".modalPolitica").css("display","none");
    });
    jQuery(function(){
        IniciarModal();
        x = document.getElementById("aviso");
        if (!x.checked){
            CerrarModal();
            $(".modalPolitica").css("display","block");
        }
    });
    $('#infocobertura').click(function(){
        $(".modalAmante").css("display","block"); 
    });
    $('#cancelarAmante').click(function(){
        $(".modalAmante").css("display","none");
    });
    $('#autosiempre').click(function(){
        $(".modalPorSiempre").css("display","block");
        $(".modalAmante").css("display","none");
       
    });
    $('#amantes').click(function(){
        $(".amante").css("display","block");
        $(".modalAmante").css("display","none");
       
    });
    $('#no-contratar').click(function(){
        document.getElementById("cbox1").checked=false;
        $(".modalPorSiempre").css("display","none");
    });
    $('#contratar').click(function(){
        document.getElementById("cbox1").checked=true;
        document.getElementById("autoSiempre").checked=true;
        $(".modalPorSiempre").css("display","none");
    });
    $('#no-contratar2').click(function(){
        document.getElementById("cbox1").checked=false;
        $(".amante").css("display","none");
    });
    $('#contratar2').click(function(){
        document.getElementById("amanteAuto").checked=true;
        document.getElementById("cbox1").checked=true;
        $(".amante").css("display","none");
    });
    $('#cbox1').change(function(){
        if(!document.getElementById("cbox1").checked){
            document.getElementById("amanteAuto").checked=false;
            document.getElementById("autoSiempre").checked=false;
        }
    });
    $('#cbox1').click(function(){
        $(".modalAmante").css("display","block");
        if(!document.getElementById("amanteAuto").checked||!document.getElementById("autoSiempre").checked)
            document.getElementById("cbox1").checked=false;
    });
});
function ValidarInput(){
    x = document.getElementById("aviso");
    if (!x.checked){
        document.location.href='#openModalAlerta';
        return false;
    }
};

function BuscarCodigo(){
    codigo = document.getElementById("cp").value;
    $.ajax({
            type: 'GET',
            url: 'VerificarCodigo',
            data: 'Codigo='+codigo,
            statusCode:{
               404: function(){
                   alert('Pagina no encontrada');
               },
               500: function(){
                   alert('Error de Servidor');
               }
            },
            success: function(dados1){
                var pegados = dados1.split(":");
                label = document.getElementById("cp-error");
                $('#estado').val(pegados[0].split("-")[0]);
                $('#leer-estado').css("display","none");
                $('#delegacion').val(pegados[0].split("-")[1]); 
                $('#leer-delegacion').css("display","none");
                $('select[name=cmbColonia] option').remove();
                $('select[name=cmbColonia]').append('<option value="">Seleccione</option>');
                for(var i = 0; i < pegados.length - 1; i++){
                    var localidad = pegados[i].split("-")[2];
                    $('select[name=cmbColonia]').append('<option value="'+localidad+'">'+localidad+'</option>');
                }
               if(pegados.length<2){
                   label.innerHTML  = "Codigo Postal No existe!!!";
                   $("#cp-error").css("color","red");
                   document.getElementById("cp").focus();
                    document.getElementById("cp").value="";
                    
               }
                $('#leer-colonia').css("display","none");
            }
        });
};
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
    }, 2000);
};
