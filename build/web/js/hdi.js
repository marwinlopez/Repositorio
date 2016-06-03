var xmlHttp
function cotizaHDI(str)
{ 
xmlHttp=GetXmlHttpObject();
if (xmlHttp==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
var url="cotizadores/cotizaHDI.jsp";
url=url+"?q="+str;

xmlHttp.onreadystatechange=stateChanged;
xmlHttp.open("GET",url,true);
xmlHttp.send(null);
}
function stateChanged() 
{ 
if (xmlHttp.readyState==4)
{ 
   var array = xmlHttp.responseText.split('|');
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
           a = xmlHttp.responseText.replace("|","");
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

}
}
function GetXmlHttpObject()
{
var xmlHttp=null;
try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttp=new XMLHttpRequest();
  }
catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
return xmlHttp;
}