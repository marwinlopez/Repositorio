
package Controlador;

import Modelo.PlanSeleccionado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlanAseguradoraControler extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
//        request.getRequestDispatcher("formulario.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String aseguradora = request.getParameter("aseguradora");
        String plan = request.getParameter("plan");
        String valor = request.getParameter("valor");
        String descripcion = request.getParameter("descripcion");
        PlanSeleccionado p = new PlanSeleccionado(aseguradora,descripcion,plan,valor);  
        ServletContext a = getServletConfig().getServletContext();
        a.setAttribute("PlanSeleccionado", p);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}