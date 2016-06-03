

package Controlador;

import Modelo.ZurichDAo;
import Modelo.Zurich;
import Modelo.Aba;
import Modelo.AbaDAO;
import Modelo.Descripcion;
import Modelo.Hdi;
import Modelo.HdiDAO;
import Modelo.Mapfre;
import Modelo.MapfreDAO;
import Modelo.Rsa;
import Modelo.RsaDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CotizadorControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
            ServletContext a = getServletConfig().getServletContext();
            Descripcion d = (Descripcion)a.getAttribute("datos"); 
            request.setAttribute("Anio", d);
            
//                Obtenemos el Recorset para Aba
            List<Aba> aba = CatalogoAba(d.getIdmarca(),d.getIdsubmarca(),d.getModelo());
            request.setAttribute("AbaLista", aba);
            
            //                Obtenemos el Recorset para Hdi
            List<Hdi> hdi = CatalogoHdi(d.getIdmarca(),d.getIdsubmarca(),d.getModelo());
            request.setAttribute("HdiLista", hdi);
            
            //                Obtenemos el Recorset para Mapfre
            List<Mapfre> Mapfre = CatalogoMapfre(d.getIdmarca(),d.getIdsubmarca(),d.getModelo());
            request.setAttribute("MapfreLista", Mapfre);
            
            //                Obtenemos el Recorset para HDI
            List<Rsa> rsa = CatalogoRsa(d.getIdmarca(),d.getIdsubmarca(),d.getModelo());
            request.setAttribute("RsaLista", rsa);
            
            //                Obtenemos el recorset para Zurich
            List<Zurich> zurich = CatalogoZurich(d.getIdmarca(),d.getIdsubmarca(),d.getModelo());
            request.setAttribute("Lista", zurich);
            
            request.getRequestDispatcher("cotizador.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
//        PrintWriter out = response.getWriter();
//        int Marca = Integer.parseInt(request.getParameter("Marca"));
//        int Anio = Integer.parseInt(request.getParameter("Anio"));
//        request.setAttribute("Marca", Marca);
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
    private List<Aba> CatalogoAba(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
        AbaDAO Aba = new AbaDAO();
        List<Aba> ListaAba = Aba.ObtenerListaAba(marca, modelo, anio);
        return ListaAba;
    } 
    
    private List<Hdi> CatalogoHdi(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
        HdiDAO Hdi = new HdiDAO();
        List<Hdi> ListaHdi = Hdi.ObtenerListaHdi(marca, modelo, anio);
        return ListaHdi;
    } 
    
    private List<Mapfre> CatalogoMapfre(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
        MapfreDAO Mapfre = new MapfreDAO();
        List<Mapfre> ListaMapfre = Mapfre.ObtenerListaMapfre(marca, modelo, anio);
        return ListaMapfre;
    } 
    
    private List<Rsa> CatalogoRsa(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
        RsaDAO Rsa = new RsaDAO();
        List<Rsa> ListaRsa = Rsa.ObtenerListaRsa(marca, modelo, anio);
        return ListaRsa;
    } 
    
    private List<Zurich> CatalogoZurich(java.lang.Integer marca,java.lang.Integer modelo,java.lang.Integer anio){
        ZurichDAo zurich = new ZurichDAo();
        List<Zurich> ListaZurich = zurich.ObtenerLista(marca, modelo, anio);
        return ListaZurich;
    }
}
