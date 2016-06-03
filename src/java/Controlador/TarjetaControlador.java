/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Tarjeta;
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
public class TarjetaControlador extends HttpServlet {
    
   
     /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
             
            
            String primernombre = request.getParameter("first-name");
            String segundonombre = request.getParameter("last-name");
            String numerotarjeta = request.getParameter("number");
            String fechavencimiento = request.getParameter("expiry");
            String cvc = request.getParameter("cvc");
            String metodopago = request.getParameter("pago");
            String banco = request.getParameter("cmbBancos");
                    
           
            Tarjeta t = new Tarjeta(primernombre,segundonombre,numerotarjeta,fechavencimiento,cvc,metodopago,banco);
            ServletContext a = getServletConfig().getServletContext();
            a.setAttribute("datosTarjeta",t);
            System.out.println("Antes de guardardatos");

           // request.getRequestDispatcher("informacion.jsp").forward(request, response);
            request.getRequestDispatcher("guardardatos.do").forward(request, response);
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
