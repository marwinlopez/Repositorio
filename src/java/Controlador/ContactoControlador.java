/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CorreoDAO;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KNDY
 */
public class ContactoControlador extends HttpServlet {
    private String nombre;
    private String email;
    private String mensaje;
    private String host;
    private String port;
    private String user;
    private String pass;
    private String destinatario;
  
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
        destinatario = context.getInitParameter("destinatario");
    } 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   //    processRequest(request, response);
        nombre = request.getParameter("nombre");
        System.out.println(nombre);
        email = request.getParameter("email");
        System.out.println(email);
        mensaje = request.getParameter("mensaje");
        System.out.println(mensaje);
        
        System.out.println("Llegue aqui");
        String contenido = "<style type=\"text/css\">\n" +
                            ".tg  {border-collapse:collapse;border-spacing:0;border-width:1px;border-style:solid;}\n" +
                            ".tg td{font-family:Arial, sans-serif;font-size:14px;padding:5px 10px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\n" +
                            ".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:5px 10px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\n" +
                            ".tg .tg-yw4l{vertical-align:top}\n" +
                            "</style>" +
                "<h3>Buen dia, Hay un cliente que desea ponerse en contacto, a continuacion sus datos:</h3> <br> <br>"+
                            "<table class=\"tg\">\n" +
                            "  <tr>\n" +
                            "    <th class=\"tg-u722\">Nombre</th>\n" +
                            "    <th class=\"tg-yw4l\">"+nombre+"</th>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "    <td class=\"tg-u722\">Mensaje</td>\n" +
                            "    <td class=\"tg-yw4l\">"+mensaje+"</td>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "</table>";
        
        
        String contenidocliente = 
                 " <h1>Hola " + nombre + " tu información ha sido recibida</h1> " +
                        "  " +
                              
                        "  " +
                        " <p> En breve nos pondremos en contacto contigo.</p>" +
                        " <p> Para mayor informaci&oacute;n, ponemos a tus ordenes el&nbsp;<strong>Tel. 555-555-555"+ "</strong>&nbsp;con horario de atenci&oacute;n de Lunes a Viernes de 09:00 a 18:00 hrs.</p> " +
                        "  " +
                        " <blockquote> " +
                        " <div><span style='font-weight: bold;'>Agradecemos tu preferencia.</span></div> " +
                        " </blockquote> " +
                        "  " +
                        " <div>&nbsp;</div> " +
                        "  " +
                        " <div> " +
                        " <p><em><strong>Alberto Carranco Limón</strong></em></p> " +
                        "  " +
                        " <p><strong><a href='mailto:acl@bcseguros.mx' target='_blank'></a><a href='mailto:acl@bcseguros.mx' target='_blank'>acl@bcseguros.mx</a></strong></p> " +
                        " </div> ";
                
                
          //      "<h3>Buen dia "+nombre+"</h3> <br>"
         //      + "Hemos recibido la informacion de tu automovil, pronto nos pondremos en contacto con usted.<br><br>"
        //       + "Cualquier Duda o comentario. A los telefono 55-55-55-55-55 <br>"+
        //       "<br><br> Saludos, <br><br> BCSeguros<br> www.bcseguros.mx";
        String resultMessage = "";
        try {
            CorreoDAO.EnviarEmail(host, port, user, pass, destinatario,"Contacto",contenido);
            CorreoDAO.EnviarEmail(host, port, user, pass, email,"BSeguro",contenidocliente);
            resultMessage = "Su mensaje fue enviado exitosamente";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
            System.out.println("Exc:"+resultMessage);
        } finally {
            request.setAttribute("Message", resultMessage);
            System.out.println("Exc:"+resultMessage);
          //  getServletContext().getRequestDispatcher("/contacto.jsp?id=1").forward(request, response);
            
        }
        
        
    }
    
}
