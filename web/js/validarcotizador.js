/* global RsaAnual, RsaSemanal, RsaAnual2, ZurichAnual, ZurichSemanal, ZurichAnual2, Seguro */
function enEspera() {
    $(".modal").css("display","block");
};

function CerrarModal() {
    setTimeout(function(){ 
        $(".modalAlerta").css("display","none");
    }, 1000);
};

function ModalAlerta(texto) {
    document.getElementById("texto").innerHTML=texto;
    $(".modalAlerta").css("display","block");
    setTimeout(function(){ 
        $(".modalAlerta").css("display","none");
    }, 1000);
};
$(document).ready(function(){
    DeclararVariables();
    RsaSeguros();
    AbaSeguros();
    ZurichSeguros();
    MapfreSeguros();
    HdiSeguros();
    Enviar();
});

function DeclararVariables(){
    RsaAnual = document.getElementById("RsaAnual");
    RsaSemanal = document.getElementById("RsaSemestral"); 
    RsaAnual2 = document.getElementById("RsaAnual2");
    ZurichAnual = document.getElementById("ZurichAnual");
    ZurichSemanal = document.getElementById("ZurichSemestral"); 
    ZurichAnual2 = document.getElementById("ZurichAnual2");
    AbaAnual = document.getElementById("AbaAnual");
    AbaSemanal = document.getElementById("AbaSemestral"); 
    AbaAnual2 = document.getElementById("AbaAnual2");
    MapfreAnual = document.getElementById("MapfreAnual");
    MapfreSemanal = document.getElementById("MapfreSemestral"); 
    MapfreAnual2 = document.getElementById("MapfreAnual2");
    HdiAnual = document.getElementById("HdiAnual");
    HdiSemanal = document.getElementById("HdiSemestral"); 
    HdiAnual2 = document.getElementById("HdiAnual2");
};

function RsaSeguros(){
    
    $('#RsaAnual').on('click',function(){
            RsaSemanal.checked = false;
            RsaAnual2.checked = false;
            ZurichAnual.checked = false;
            ZurichSemanal.checked = false; 
            ZurichAnual2.checked = false;
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
    $('#RsaSemestral').on('click',function(){
            RsaAnual.checked = false;
            RsaAnual2.checked = false;
            ZurichAnual.checked = false;
            ZurichSemanal.checked = false; 
            ZurichAnual2.checked = false;
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
    $('#RsaAnual2').on('click',function(){
            RsaAnual.checked = false;
            RsaSemanal.checked = false;
            ZurichAnual.checked = false;
            ZurichSemanal.checked = false; 
            ZurichAnual2.checked = false;
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
}

function ZurichSeguros(){
    
    $('#ZurichAnual').on('click',function(){
            RsaAnual.checked = false;
            RsaSemanal.checked = false;
            RsaAnual2.checked = false;
            ZurichSemanal.checked = false; 
            ZurichAnual2.checked = false;
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
    $('#ZurichSemestral').on('click',function(){
           RsaAnual.checked = false;
            RsaSemanal.checked = false;
            RsaAnual2.checked = false;
            ZurichAnual.checked = false;
            ZurichAnual2.checked = false;
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
    $('#ZurichAnual2').on('click',function(){
            RsaAnual.checked = false;
            RsaSemanal.checked = false;
            RsaAnual2.checked = false;
            ZurichAnual.checked = false;
            ZurichSemanal.checked = false; 
            AbaAnual.checked = false;
            AbaSemanal.checked = false ;
            AbaAnual2.checked = false;
            MapfreAnual.checked = false;
            MapfreSemanal.checked = false; 
            MapfreAnual2.checked = false;
            HdiAnual.checked = false;
            HdiSemanal.checked = false; 
            HdiAnual2.checked = false;
    });
}

function AbaSeguros(){
    $('#AbaAnual').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;
    });
    $('#AbaAnual2').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;  
    });
    $('#AbaSemestral').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;    
    });
}

function HdiSeguros(){
    $('#HdiAnual').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;   
    });
    $('#HdiAnual2').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false;     
    });
    $('#HdiSemestral').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false; 
        HdiAnual2.checked = false;    
    });
}

function MapfreSeguros(){
    $('#MapfreAnual').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreSemanal.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;   
    });
    $('#MapfreAnual2').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false;
        MapfreSemanal.checked = false; 
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;    
    });
    $('#MapfreSemestral').on('click',function(){
        RsaAnual.checked = false;
        RsaSemanal.checked = false;
        RsaAnual2.checked = false;
        ZurichAnual.checked = false;
        ZurichSemanal.checked = false; 
        ZurichAnual2.checked = false;
        AbaAnual.checked = false;
        AbaSemanal.checked = false ;
        AbaAnual2.checked = false;
        MapfreAnual.checked = false; 
        MapfreAnual2.checked = false;
        HdiAnual.checked = false;
        HdiSemanal.checked = false; 
        HdiAnual2.checked = false;    
    });
}

function Enviar(){
    $('#Aba').on('click',function(){
        var combo = document.getElementById('abaselect');
        var descripcion = combo.options[combo.selectedIndex].text;
        var seguro = "Aba";
        var plan = null;
        var valor = null;
        var enviar = false;
        if (AbaAnual.checked){
            enviar = true;
            plan =  'ANUAL';
            valor =  document.getElementById("abaanual").innerHTML;         
        }else if (AbaSemanal.checked){
                enviar = true;
                plan = 'SEMESTRAL';
                valor =  document.getElementById("abasemestral").innerHTML;
        }else if(AbaAnual2.checked) {
                enviar = true;
                plan = 'ANUALMSI';
                valor =  document.getElementById("abaanual2").innerHTML;
        }else{
             ModalAlerta("Seleccione una opción para ABA|SEGUROS");
        }
        if (enviar){
            enEspera();
            $.ajax({
                type: 'POST',
                url: 'plan.do',
                data: 'aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim(),
                statusCode:{
                   404: function(){
                       alert('Pagina no encontrada');
                   },
                   500: function(){
                       alert('Problema de servidor');
                   }
                }
            });
            document.location.href = 'formulario.do';
        }
    });
    $('#Hdi').on('click',function(){
        var combo = document.getElementById('hdiselect');
        var descripcion = combo.options[combo.selectedIndex].text;
        var seguro = "Hdi";
        var plan = null;
        var valor = null;
        var enviar = false;
        if (HdiAnual.checked){
            enviar = true;
            plan =  'ANUAL';
            valor =  document.getElementById("hdianual").innerHTML;         
        }else if (HdiSemanal.checked){
                enviar = true;
                plan = 'SEMESTRAL';
                valor =  document.getElementById("hdisemestral").innerHTML;
        }else if(HdiAnual2.checked) {
                enviar = true;
                plan = 'ANUALMSI';
                valor =  document.getElementById("hdimensual").innerHTML;
        }else{
                ModalAlerta("Seleccione una opción para<br/> HDI SEGUROS");
        }
//        confirm('aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim());
        if (enviar){
            $.ajax({
                type: 'POST',
                url: 'plan.do',
                data: 'aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim(),
                statusCode:{
                   404: function(){
                       alert('Pagina no encontrada');
                   },
                   500: function(){
                       alert('Problema de servidor');
                   }
                }
            });
            document.location.href = 'formulario.do';
        }
    });
    $('#Mapfre').on('click',function(){
        var combo = document.getElementById('mapfreselect');
        var descripcion = combo.options[combo.selectedIndex].text;
        var seguro = "Mapfre";
        var plan = null;
        var valor = null;
        var enviar = false;
        if (MapfreAnual.checked){
            enviar = true;
            plan =  'ANUAL';
            valor =  document.getElementById("mapfreanual").innerHTML;         
        }else if (MapfreSemanal.checked){
                enviar = true;
                plan = 'SEMESTRAL';
                valor =  document.getElementById("mapfresemestral").innerHTML;
        }else if(MapfreAnual2.checked) {
                enviar = true;
                plan = 'ANUALMSI';
                valor =  document.getElementById("mapfremensual").innerHTML;
        }else{
                ModalAlerta("Seleccione una opción para<br/> MAPFRE");
        }
        if (enviar){
            $.ajax({
                type: 'POST',
                url: 'plan.do',
                data: 'aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim(),
                statusCode:{
                   404: function(){
                       alert('Pagina no encontrada');
                   },
                   500: function(){
                       alert('Problema de servidor');
                   }
                }
            });
            document.location.href = 'formulario.do';
        }
    });
    $('#Rsa').on('click',function(){
        var combo = document.getElementById('rsaselect');
        var descripcion = combo.options[combo.selectedIndex].text;
        var seguro = "Rsa";
        var plan = null;
        var valor = null;
        var enviar = false;
        if (RsaAnual.checked){
            enviar = true;
            plan =  'ANUAL';
            valor =  document.getElementById("rsaanual").innerHTML;         
        }else if (RsaSemanal.checked){
                enviar = true;
                plan = 'SEMESTRAL';
                valor =  document.getElementById("rsasemestral").innerHTML;
        }else if(RsaAnual2.checked) {
                enviar = true;
                plan = 'ANUALMSI';
                valor =  document.getElementById("rsamensual").innerHTML;
        }else{
             ModalAlerta("Seleccione una opción para<br/> RSA SEGUROS");
        }
        if (enviar){
            $.ajax({
                type: 'POST',
                url: 'plan.do',
                data: 'aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim(),
                statusCode:{
                   404: function(){
                       alert('Pagina no encontrada');
                   },
                   500: function(){
                       alert('Problema de servidor');
                   }
                }
            });
            document.location.href = 'formulario.do';
        }
    });
    $('#Zurich').on('click',function(){
        var combo = document.getElementById('zurichselect');
        var descripcion = combo.options[combo.selectedIndex].text;
        var seguro = "Zurich";
        var plan = null;
        var valor = null;
        var enviar = false;
        if (ZurichAnual.checked){
            enviar = true;
            plan =  'ANUAL';
            valor =  document.getElementById("zurichanual").innerHTML;         
        }else if (ZurichSemanal.checked){
                enviar = true;
                plan = 'SEMESTRAL';
                valor =  document.getElementById("zurichsemestral").innerHTML;
        }else if(ZurichAnual2.checked) {
                enviar = true;
                plan = 'ANUALMSI';
                valor =  document.getElementById("zurichmensual").innerHTML;
        }else{
             ModalAlerta("Seleccione una opción para<br/> ZURICH");
        }
        if (enviar){
            $.ajax({
                type: 'POST',
                url: 'formulario.do',
                data: 'aseguradora='+seguro+'&descripcion='+descripcion+'&plan='+plan+'&valor='+valor.trim(),
                statusCode:{
                   404: function(){
                       alert('Pagina no encontrada');
                   },
                   500: function(){
                       alert('Problema de servidor');
                   }
                }
            });
            document.location.href = 'formulario.do';
        }
    });
}