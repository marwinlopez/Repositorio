package Controlador;

import Modelo.CodigoPostal;
import Modelo.CodigoPostalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerificarCodigo extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String codigo = request.getParameter("Codigo");
        CodigoPostalDAO codigoPostal = new CodigoPostalDAO();
        List<CodigoPostal> postal = codigoPostal.ListaColonia(codigo);
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < postal.size(); i++)
            sb.append(postal.get(i).getNombedo()+"-"+postal.get(i).getNombmcpo()+"-"+postal.get(i).getLocalidad()+":");
        out.write(sb.toString());
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    

}
