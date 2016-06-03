<%
  HttpSession sesion=request.getSession();
  
  
 sesion.setAttribute("nombre",request.getParameter("nombre"));
 sesion.setAttribute("apaterno",request.getParameter("apaterno"));
 sesion.setAttribute("amaterno",request.getParameter("amaterno"));
 sesion.setAttribute("email",request.getParameter("email"));
 sesion.setAttribute("telefono",request.getParameter("telefono"));
 sesion.setAttribute("rfc",request.getParameter("rfc"));
 sesion.setAttribute("serie",request.getParameter("serie"));
 sesion.setAttribute("cp",request.getParameter("cp"));
 sesion.setAttribute("calle",request.getParameter("calle"));
 sesion.setAttribute("exterior",request.getParameter("exterior"));
 sesion.setAttribute("interior",request.getParameter("interior"));
 sesion.setAttribute("estado",request.getParameter("estado"));
 sesion.setAttribute("delegacion",request.getParameter("delegacion"));
 sesion.setAttribute("colonia",request.getParameter("cmbColonia"));
 
   
        
        
        

response.sendRedirect("pago.jsp");

%>
