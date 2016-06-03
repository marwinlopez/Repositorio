package Controlador;

import Modelo.DatosCotizacion;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PagoControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            
            String nombre = request.getParameter("nombre");
            String apaterno = request.getParameter("apaterno");
            String amaterno = request.getParameter("amaterno");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            String rfc = request.getParameter("rfc");
            String serie = request.getParameter("serie");
            String cp = request.getParameter("cp");
            String calle = request.getParameter("calle");
            String exterior = request.getParameter("exterior");
            String interior = request.getParameter("interior");
            String estado = request.getParameter("estado");
            String delegacion = request.getParameter("delegacion");
            String colonia = request.getParameter("cmbColonia");
            String celular = request.getParameter("celular");
            String autoSiempre = request.getParameter("autoSiempre");
            String amanteAuto = request.getParameter("amanteAuto");
            boolean auto = false;
            boolean amante = false;
            if(autoSiempre!=null){
                auto = true;
            }
            if(amanteAuto!=null){
                amante = true;
            }
            DatosCotizacion datos = new DatosCotizacion(nombre,apaterno,amaterno,email,telefono,rfc,serie,cp,calle,exterior,interior,estado,delegacion,colonia, celular,amante,auto);
            ServletContext a = getServletConfig().getServletContext();
            a.setAttribute("datosFormulario",datos);        
            request.getRequestDispatcher("pago.jsp").forward(request, response);
        } catch (Exception e) {
        }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
