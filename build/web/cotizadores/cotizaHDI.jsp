<%@page import="Modelo.Descripcion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Cotizador.HdiCotizadorDAO"%>
<%@page import="Cotizador.HdiCotizador"%>
<%@page import="java.util.List"%>
<%
String idAuto=(String)request.getParameter("q");
HdiCotizadorDAO hdicotiza=new HdiCotizadorDAO();
ServletContext a = getServletConfig().getServletContext();
 Descripcion des = (Descripcion) a.getAttribute("datos");
 String aniobc=String.valueOf(des.getAnio());
List<HdiCotizador> lista =hdicotiza.CotizaHdi(idAuto,aniobc);
HdiCotizador respuesta;
HdiCotizador respuesta2;

System.out.println(idAuto);

int listalength=lista.size();
if(listalength==0){
      out.print("No disponible|No disponible|No disponible");
}else{
    if(listalength==1){
            
                respuesta=lista.get(0);
                out.print(respuesta.getPrimaTotal()+"|No disponible|"+respuesta.getPrimaTotal());
            
     }else{
         if(listalength==2){
             
                respuesta=lista.get(0);
                respuesta2=lista.get(1);
             
              out.print(respuesta.getPrimaTotal()+"|"+respuesta2.getPrimaTotal()+"|"+respuesta.getPrimaTotal());
         }else{
          if(listalength>=3)   {
                respuesta=lista.get(0);
                respuesta2=lista.get(1);
               
              out.print(respuesta.getPrimaTotal()+"|"+respuesta2.getPrimaTotal()+"|"+respuesta.getPrimaTotal());
              
          }
             
         }
    }    
            
     }

    

%>