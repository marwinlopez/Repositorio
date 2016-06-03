
package Controlador;

import Modelo.Anio;
import Modelo.AnioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnioControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        String dato = request.getParameter("Anio");
        if (dato.length()>0){
            AnioDAO anio = new AnioDAO();
            List<Anio> lista = (List<Anio>) anio.ListaAnio();
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < lista.size();i++)
                sb.append(lista.get(i).getSequence()+"."+lista.get(i).getAño()+":");
            out.write(sb.toString());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
