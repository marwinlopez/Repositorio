var xmlHttp
function cotizaZurich(str)
{ 
   // alert("pruebaaaaaa");
xmlHttp=GetXmlHttpObject();
if (xmlHttp==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
var url="cotizadores/cotizaZurich.jsp";
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
   j = array[0];
   k = array[1];
   l = array[2];
document.getElementById("zurichanual").innerHTML=j;
document.getElementById("zurichsemestral").innerHTML=k;
document.getElementById("zurichmensual").innerHTML=l;

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