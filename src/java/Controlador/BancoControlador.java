
package Controlador;

import Modelo.Bancos;
import Modelo.BancosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BancoControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        BancosDAO bancos = new BancosDAO();
        List<Bancos> lista = bancos.ObtenerListaBancos();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < lista.size();i++)
            sb.append(lista.get(i).getIdbanco()+"."+lista.get(i).getBanco()+":");
        out.write(sb.toString());
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
