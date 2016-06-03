package Controlador;

import Modelo.CodigoPostal;
import Modelo.CodigoPostalDAO;
import Modelo.Descripcion;
import Modelo.DescripcionDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Intermediario extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String anio = request.getParameter("cmbAnio");
            String marca = request.getParameter("cmbMarca");
            String modelo = request.getParameter("cmbModelo");       
            String codigo = request.getParameter("txtCodigoPostal");
            List<CodigoPostal> p = ValidarCodigoPostal(codigo);
            Descripcion d = ObtenerDescripcion(Integer.parseInt(marca),Integer.parseInt(modelo),Integer.parseInt(anio)); 
            ServletContext a = getServletConfig().getServletContext();
            if (p.size()>0){
                a.setAttribute("CodigoPostal", p);
                a.setAttribute("datos", d);
                response.sendRedirect("cotizador.do");
            }else{
                request.getRequestDispatcher("index").forward(request, response);
            }  
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
    
    private Descripcion ObtenerDescripcion(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
    DescripcionDAO vehiculo = new DescripcionDAO();
    Descripcion resultado = vehiculo.ObtenerDescripcion(marca, modelo, anio);
    return resultado;
}
    private List<CodigoPostal> ValidarCodigoPostal(java.lang.String codigo){
        CodigoPostalDAO codigoPostal = new CodigoPostalDAO();
            List<CodigoPostal> postal = (List<CodigoPostal>) codigoPostal.ListaColonia(codigo);
        return postal;
    }
}
