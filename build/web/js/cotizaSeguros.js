
var xmlHttpMapfre;
var xmlHttpZurich;
var xmlHttpAba;
var xmlHttpRsa;
var xmlHttpHdi;

function cotizaHDI(str){ 
    /*
    if(str.equals("0")){
        document.getElementById("InicioHDI").style.display="";
        document.getElementById("ValoresHDI").style.display="none";
    }else{
        
        document.getElementById("ValoresHDI").style.display="";
        document.getElementById("InicioHDI").style.display="none";
    }*/
    document.getElementById("hdiselect").disabled=true;
    if (str=="0"){     
        divC = document.getElementById("InicioHDI");
        divC.style.display = "";

        divT = document.getElementById("ValoresHDI");
        divT.style.display = "none";

        divS = document.getElementById("CargandoHDI");
        divS.style.display = "none";

    } 
    xmlHttpHdi=GetXmlHttpObjectHdi();
    divC = document.getElementById("InicioHDI");
    divC.style.display = "none";

    divT = document.getElementById("ValoresHDI");
    divT.style.display = "none";

    divS = document.getElementById("CargandoHDI");
    divS.style.display = "";
  
    if (xmlHttpHdi==null){
        alert ("Your browser does not support AJAX!");
        return;
    }
  
    var url="cotizadores/cotizaHDI.jsp";
    url=url+"?q="+str;

    xmlHttpHdi.onreadystatechange=stateChangedHdi;
    xmlHttpHdi.open("GET",url,true);
    xmlHttpHdi.send(null);
}

function stateChangedHdi(){ 
    if (xmlHttpHdi.readyState==4){ 
        var array = xmlHttpHdi.responseText.split('|');
        var longarray=array.length;
        //alert("longitd"+array.length);
        switch(longarray){
            case 0:
                a="No disponible";
                b="No disponible";
                c="No disponible";
             //      alert("0");
            break;
            case 1:
                a = xmlHttpHdi.responseText.replace("|","");
                b="No disponible";
                c="No disponible";
                //   alert("1");
            break;
            case 2:
                a = array[0], b = array[1];
                c="No disponible";
                //    alert("2");
            break;
            case 3:
                a = array[0], b = array[1], c = array[2];
                //alert("3");
            break;
       }

        document.getElementById("hdianual").innerHTML=a;
        document.getElementById("hdisemestral").innerHTML=b;
        document.getElementById("hdimensual").innerHTML=c;
        document.getElementById("HdiAnual").value=a;
        document.getElementById("HdiSemestral").value=b;
        document.getElementById("HdiAnual2").value=c;
        divC = document.getElementById("InicioHDI");
        divC.style.display = "none";
        divS = document.getElementById("CargandoHDI");
        divS.style.display = "none";
        divT = document.getElementById("ValoresHDI");
        divT.style.display = "";
        document.getElementById("hdiselect").disabled=false;
    }
}
function GetXmlHttpObjectHdi()
{
var xmlHttpHdi=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttpHdi=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttpHdi=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttpHdi=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttpHdi;
}
function GetXmlHttpObjectRsa()
{
var xmlHttpRsa=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttpRsa=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttpRsa=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttpRsa=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttpRsa;
}
function GetXmlHttpObjectZurich()
{
var xmlHttpZurich=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttpZurich=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttpZurich=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttpZurich=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttpZurich;
}
function GetXmlHttpObjectMapfre()
{
var xmlHttpMapfre=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttpMapfre=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttpMapfre=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttpMapfre=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttpMapfre;
}

function cotizaZurich(str){ 
    document.getElementById("zurichselect").disabled=true;
     if (str=="0"){
           divA = document.getElementById("InicioZURICH");
           divA.style.display = "";

           divB = document.getElementById("ValoresZURICH");
           divB.style.display = "none";
           
             divD = document.getElementById("CargandoZURICH");
           divD.style.display = "none";


      }else{

         
      }
    
xmlHttpZurich=GetXmlHttpObjectZurich();
           divA = document.getElementById("InicioZURICH");
           divA.style.display = "none";

           divB = document.getElementById("ValoresZURICH");
           divB.style.display = "none";
           
             divD = document.getElementById("CargandoZURICH");
           divD.style.display = "";

 //alert ("En espera");
 
if (xmlHttpZurich==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
var url="cotizadores/cotizaZurich.jsp";
url=url+"?q="+str;

xmlHttpZurich.onreadystatechange=stateChangedZurich;
xmlHttpZurich.open("GET",url,true);
xmlHttpZurich.send(null);
}
function stateChangedZurich() 
{ 
if (xmlHttpZurich.readyState==4)
{ 
    
     var array = xmlHttpZurich.responseText.split('|');
   j = array[0];
  // alert(j);
   k = array[1];
  // alert(k);
   l = array[2];
   
     divC = document.getElementById("ValoresZURICH");
           divC.style.display="";

           divT = document.getElementById("InicioZURICH");
           divT.style.display = "none";
document.getElementById("zurichanual").innerHTML=j.replace("<hr/>","");
document.getElementById("zurichsemestral").innerHTML=k;
document.getElementById("zurichmensual").innerHTML=j.replace("<hr/>","");
document.getElementById("ZurichAnual").value=j;
document.getElementById("ZurichSemestral").value=k;
document.getElementById("ZurichAnual2").value=j;
divA = document.getElementById("InicioZURICH");
           divA.style.display = "none";

           divB = document.getElementById("ValoresZURICH");
           divB.style.display = "";
           
             divD = document.getElementById("CargandoZURICH");
           divD.style.display = "none";
           document.getElementById("zurichselect").disabled=false;
}
}


function cotizaMapfre(str){ 
    document.getElementById("mapfreselect").disabled=true;
     if (str=="0"){
           divE = document.getElementById("InicioMAPFRE");
           divE.style.display = "";

           divF = document.getElementById("ValoresMAPFRE");
           divF.style.display = "none";
           
             divG = document.getElementById("CargandoMAPFRE");
           divG.style.display = "none";


      }else{

        
      }
xmlHttpMapfre=GetXmlHttpObjectMapfre();
    divE = document.getElementById("InicioMAPFRE");
           divE.style.display = "none";

           divF = document.getElementById("ValoresMAPFRE");
           divF.style.display = "none";
           
             divG = document.getElementById("CargandoMAPFRE");
           divG.style.display = "";

if (xmlHttpMapfre==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
  
var url="cotizadores/cotizaMapfre.jsp";
url=url+"?q="+str;

xmlHttpMapfre.onreadystatechange=stateChangedMapfre;
xmlHttpMapfre.open("GET",url,true);
xmlHttpMapfre.send(null);
}
function stateChangedMapfre() 
{ 
if (xmlHttpMapfre.readyState==4)
{ 
      var array = xmlHttpMapfre.responseText.split('|');
   d = array[0];
   e = array[1];
    f = array[2];
    
       
document.getElementById("mapfreanual").innerHTML=d;
document.getElementById("mapfresemestral").innerHTML=e;
document.getElementById("mapfremensual").innerHTML=f;
document.getElementById("MapfreAnual").value=d;
document.getElementById("MapfreSemestral").value=e;
document.getElementById("MapfreAnual2").value=f;
    divE = document.getElementById("InicioMAPFRE");
           divE.style.display = "none";

           divF = document.getElementById("ValoresMAPFRE");
           divF.style.display = "";
           
             divG = document.getElementById("CargandoMAPFRE");
           divG.style.display = "none";
           document.getElementById("mapfreselect").disabled=false;

}
}

function cotizaRSA(str){ 
    document.getElementById("rsaselect").disabled=true;
     if (str=="0"){
           divH = document.getElementById("InicioRSA");
           divH.style.display = "";

           divI = document.getElementById("ValoresRSA");
           divI.style.display = "none";
           
             divJ = document.getElementById("CargandoRSA");
           divJ.style.display = "none";


      }else{

         
      }
xmlHttpRsa=GetXmlHttpObjectRsa();
  divH = document.getElementById("InicioRSA");
           divH.style.display = "none";

           divI = document.getElementById("ValoresRSA");
           divI.style.display = "none";
           
             divJ = document.getElementById("CargandoRSA");
           divJ.style.display = "";
           
if (xmlHttpRsa==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
var url="cotizadores/cotizaRSA.jsp";
url=url+"?q="+str;

xmlHttpRsa.onreadystatechange=stateChangedRsa;
xmlHttpRsa.open("GET",url,true);
xmlHttpRsa.send(null);
}
function stateChangedRsa() 
{ 
    
if (xmlHttpRsa.readyState==4 )
{ 
    
    
   var array = xmlHttpRsa.responseText.split('|');
   var longarray=array.length;
   //alert("longitd"+array.length);
   switch(longarray)
   {
       case 0:
               a="No disponible";
           b="No disponible";
           c="No disponible";
         //      alert("0");
       break;
    case 1:
           a = xmlHttpRsa.responseText.replace("|","");
           b="No disponible";
           c="No disponible";
        //   alert("1");
       break;
   case 2:
           a = array[0], b = array[1];
           c="No disponible";
       //    alert("2");
       break;
   case 3:
           a = array[0], b = array[1], c = array[2];
       //alert("3");
       break;
       
   }
    
document.getElementById("rsaanual").innerHTML=a;
document.getElementById("rsasemestral").innerHTML=b;
document.getElementById("rsamensual").innerHTML=c;
  divH = document.getElementById("InicioRSA");
           divH.style.display = "none";

           divI = document.getElementById("ValoresRSA");
           divI.style.display = "";
           
             divJ = document.getElementById("CargandoRSA");
           divJ.style.display = "none";
           document.getElementById("rsaselect").disabled=false;
}}

function cotizaAba(str){ 
    document.getElementById('abaselect').disabled=true;
    if (str=="0"){
        alert('1');
        divL = document.getElementById("InicioABA");
        divL.style.display = "";

        divK = document.getElementById("ValoresABA");
        divK.style.display = "none";

        divP = document.getElementById("CargandoABA");
        divP.style.display = "none";
    }
    xmlHttpAba=GetXmlHttpObjectAba();
    divL = document.getElementById("InicioABA");
    divL.style.display = "none";

    divK = document.getElementById("ValoresABA");
    divK.style.display = "none";

    divP = document.getElementById("CargandoABA");
    divP.style.display = "";
           
    if (xmlHttpAba==null){
      alert ("Your browser does not support AJAX!");
      return;
    } 
  
    var url="cotizadores/cotizaAba.jsp";
    url=url+"?q="+str;

    xmlHttpAba.onreadystatechange=stateChangedAba;
    xmlHttpAba.open("GET",url,true);
    xmlHttpAba.send(null);
}
function stateChangedAba(){ 
if (xmlHttpAba.readyState==4){ 
   var array = xmlHttpAba.responseText.split('|');
  //alert("hola:"+a);
    
    document.getElementById("abaanual").innerHTML=array[0];
    document.getElementById("abasemestral").innerHTML=array[1];
    document.getElementById("abaanual2").innerHTML=array[2];
    divL = document.getElementById("InicioABA");
    divL.style.display = "none";

    divK = document.getElementById("ValoresABA");
    divK.style.display = "";

    divP = document.getElementById("CargandoABA");
    divP.style.display = "none";
    document.getElementById("abaselect").disabled=false;
}
}

function GetXmlHttpObjectAba()
{
var xmlHttpAba=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttpAba=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttpAba=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttpAba=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttpAba;
}


