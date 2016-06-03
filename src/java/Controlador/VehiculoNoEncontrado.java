
package Controlador;

import Modelo.CorreoDAO;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VehiculoNoEncontrado extends HttpServlet {
    private String nombre;
    private String marca;
    private String modelo;
    private String anio;
    private String correo;
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
//        processRequest(request, response);
        nombre = request.getParameter("nombre");
        marca = request.getParameter("marca");
        modelo = request.getParameter("modelo");
        anio = request.getParameter("anio");
        correo = request.getParameter("correo");
        
        String contenido = "<style type=\"text/css\">\n" +
                            ".tg  {border-collapse:collapse;border-spacing:0;border-width:1px;border-style:solid;}\n" +
                            ".tg td{font-family:Arial, sans-serif;font-size:14px;padding:5px 10px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\n" +
                            ".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:5px 10px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}\n" +
                            ".tg .tg-yw4l{vertical-align:top}\n" +
                            "</style>" +
                "<h3>Buen dia, Hay un cliente que ha enviado informacion para cotizar su automovil, a continuacion sus datos:</h3> <br> <br>"+
                            "<table class=\"tg\">\n" +
                            "  <tr>\n" +
                            "    <th class=\"tg-u722\">Nombre</th>\n" +
                            "    <th class=\"tg-yw4l\">"+nombre+"</th>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "    <td class=\"tg-u722\">Marca</td>\n" +
                            "    <td class=\"tg-yw4l\">"+marca+"</td>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "    <td class=\"tg-u722\">Modelo</td>\n" +
                            "    <td class=\"tg-yw4l\">"+modelo+"</td>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "    <td class=\"tg-u722\">Anio</td>\n" +
                            "    <td class=\"tg-yw4l\">"+anio+"</td>\n" +
                            "  </tr>\n" +
                            "  <tr>\n" +
                            "    <td class=\"tg-u722\">Correo</td>\n" +
                            "    <td class=\"tg-yw4l\">"+correo+"</td>\n" +
                            "  </tr>\n" +
                            "</table>";
        
        
        String contenidocliente = 
                 " <h1>Hola " + nombre + " tu información ha sido recibida</h1> " +
                        "  " +
                        " <p>Detalles de la información recibida</p>" +
                        "  " +
                        " <p>&nbsp; <b>Nombre:</b> " + "<b>" + nombre + "</b> " + "</p> " +
                        "  " +
                        " <p>&nbsp; <b>Email:</b> " + "<b>" + correo + "</b> " + "</p> " +
                        "  " +
                        " <p>&nbsp; <b>Marca:</b> " + "<b>" + marca + "</b> " + "</p> " +
                        "  " +
                        " <p>&nbsp; <b>Modelo:</b> " + "<b>" + modelo + "</b> " + "</p> " +
                        "  " +
                        " <p>&nbsp; <b>Anio:</b> " + "<b>" + anio + "</b> " + "</p> " +
                              
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
            CorreoDAO.EnviarEmail(host, port, user, pass, destinatario,"No encontraste tu automovil",contenido);
            CorreoDAO.EnviarEmail(host, port, user, pass, correo,"BSeguro",contenidocliente);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
            System.out.println("Exc:"+resultMessage);
        } finally {
            request.setAttribute("Message", resultMessage);
            System.out.println("Exc:"+resultMessage);
//            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            
        }
    }
    
}
