
package Controlador;

import Modelo.CodigoPostal;
import Modelo.Cotizacion;
import Modelo.CotizacionDAO;
import Modelo.DatosCotizacion;
import Modelo.Descripcion;
import Modelo.PlanSeleccionado;
import Modelo.Tarjeta;
import java.io.IOException;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GuardarDatos extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext a = getServletConfig().getServletContext();
        List<CodigoPostal> p = (List<CodigoPostal>) a.getAttribute("CodigoPostal");  
        DatosCotizacion d = (DatosCotizacion) a.getAttribute("datosFormulario"); 
        Tarjeta t = (Tarjeta) a.getAttribute("datosTarjeta"); 
        Descripcion des = (Descripcion) a.getAttribute("datos");
        PlanSeleccionado s = (PlanSeleccionado) a.getAttribute("PlanSeleccionado");


        Cotizacion x=new Cotizacion();

        x.setApellido_materno(d.getAmaterno());
        x.setApellido_paterno(d.getApellidoPaterno());
        x.setCall(d.getCalle());
        x.setMail(d.getEmail());
        x.setColonia(d.getColonia());
        x.setCp(d.getCp());
        x.setDelegacion(d.getDelegacion());
        x.setEstado(d.getEstado());

        Calendar c=Calendar.getInstance();
        Date date=new Date();
        date=c.getTime();
        DateFormat df = new SimpleDateFormat("YYYY/MM/dd");
        Date dateobj = new Date();
        String fecha=df.format(dateobj);
        c.add(Calendar.YEAR, 1);
        Date dateobjm = new Date();
        dateobjm=c.getTime();
        String fecham=df.format(dateobjm);
        String fechavencimiento=fecham;

        x.setFecha_cotizacion(fecha);
        x.setForma_pago("");
        x.setId_anio(des.getAnio());
        x.setId_aseguradora(s.getAseguradora());
        x.setId_clave_aseguradora("seleccion");
        x.setId_cotizacion("1");
        x.setId_marca(des.getMarca());
        x.setId_modelo(s.getDescripcion());
        x.setId_submarca(des.getSubmarca());
        x.setMail(d.getEmail());
        x.setMonto(s.getValor());
        x.setNo_ext(d.getExterior());
        x.setNo_int(d.getInterior());
        x.setNombre_contratante(d.getNombre());
        x.setRfc(d.getRfc());
        x.setSerie(d.getSerie());
        x.setTelefono(d.getTelefono());
        x.setTipo_pago(s.getPlan());
        x.setCobertura_auto_amante(d.isAmanteauto());
        x.setCobertura_auto_siempre(d.isAutosiempre());
        x.setMetododepago(t.getMetodopago());
        x.setPrimernombre(t.getprimernombre());
        x.setSegundonombre(t.getSegundonombre());
        x.setFechavencimiento(t.getFechavencimiento());
        x.setNumerotarjeta(t.getNumerotarjeta());
        x.setCvc(t.getCvc());
        x.setBanco(t.getBanco());
        x.setCelular(d.getCelular());
        

        CotizacionDAO cot=new CotizacionDAO();  
        
        int idcotizacion=cot.insertCotizacion(x);
        a.setAttribute("idcotizacion", idcotizacion);
        cot.email(x,idcotizacion);
        cot.emailAdmin(x,idcotizacion);
       // boolean bandera = cot.sendCliente(x,idcotizacion);
       
       // if(bandera||bandera2){   
      
          response.sendRedirect("informacion.jsp");   
      
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
