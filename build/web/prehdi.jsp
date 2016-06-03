 <%@page import="Modelo.Anio"%>
 <%@page import="java.util.List"%>
<%
    
    
    HttpSession sesion= request.getSession();     
        
        try{
     String valorselect =request.getParameter("hdiselect").toString();
   String hdianual= request.getParameter("HdiAnual").toString();
   // String hdisemestral =request.getParameter("HdiSemestral").toString();
   // String hdianual2= request.getParameter("HdiAnual2").toString();
    
       
    sesion.setAttribute("aseguradorasel","hdi");
    
    //out.println(valorselect+" "+hdianual+" "+hdisemestral+" "+hdianual2);
        }catch(Exception ex){
            out.println("ex" +ex);
        }
   response.sendRedirect("formulario.jsp");
    
    
    %>