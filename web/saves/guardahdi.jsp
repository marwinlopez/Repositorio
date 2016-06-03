<%
    String valorselect =request.getParameter("hdiselect").toString();
   String hdianual= request.getParameter("HdiAnual").toString();
    String hdisemestral =request.getParameter("HdiSemestral").toString();
    String hdianual2= request.getParameter("HdiAnual2").toString();
    
    HttpSession sesion= request.getSession();
    
    sesion.setAttribute("aseguradorasel","hdi");
    
    out.println(valorselect+" "+hdianual+" "+hdisemestral+" "+hdianual2);
    
    
    
    
    %>
