/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotizador;

import Modelo.Hdi;
import Modelo.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Cotizador.MyUtil;
/**
 *
 * @author Luis
 */
public class HdiCotizadorDAO {
         conexion con;
MyUtil m=new MyUtil();
         
         public HdiCotizadorDAO(){
              con = new conexion();

         }
         
             public List<HdiCotizador> CotizaHdi(String idAuto, String anio ){
        List<HdiCotizador> lista = new ArrayList<HdiCotizador>();
        Connection AccesoDB = con.getConexion();
        int idcoche=Integer.parseInt(idAuto.trim());
        int anios=Integer.parseInt(anio);
        try {
            
            PreparedStatement ps = AccesoDB.prepareStatement("SELECT  Aseguradora.Sequence AS Aseguradora, \n" +
"IdHDI AS ClaveUnidad,\n" +
"   HDIAutos.Descripcion ,\n" +
"   Aseguradora.Nombre AS NombreAseguradora,\n" +
"   FormaPago.Sequence AS IdFormaPago,\n" +
"   FormaPago.Descripcion AS FormaPago,\n" +
"   Zona7 AS PrimaNeta, \n" +
"   (((Zona7 + (Zona7  * Recargo) + DerechosPoliza) * 1.16))  AS PrimaTotal\n" +
"   \n" +
" FROM HDIAutos\n" +
" LEFT JOIN AseguradoraSubMarca ON AseguradoraSubMarca.Marca = HDIAutos.IdMarca AND AseguradoraSubMarca.Submarca = HDIAutos.IdSubmarca AND AseguradoraSubMarca.Referencia::integer = HDIAutos.IdHDI\n" +
" LEFT JOIN Aseguradora ON Aseguradora.Sequence = AseguradoraSubMarca.Aseguradora AND Aseguradora.Activo = AseguradoraSubMarca.Activo\n" +
" LEFT JOIN HDITasas ON HDITasas.Aseguradora = Aseguradora.Sequence  \n" +
"INNER JOIN año ON HDIAutos.modelo=año.sequence\n" +
" LEFT JOIN FormaPago ON FormaPago.Sequence = HDITasas.FormaPago\n" +
" WHERE Aseguradora.Sequence = 2\n" +
" AND Aseguradora.Activo = true\n" +
" AND idhdi=? and año.año=?");
            ps.setInt(1, idcoche);
            ps.setInt(2, anios);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HdiCotizador h = new HdiCotizador();
              //  h.setZona1(rs.getString(10));
                h.setPrimaTotal("$ "+m.formatNumber(formatNumber(rs.getString("primatotal"))));
                lista.add(h);
            }
        } catch (Exception e) {
            System.out.println("Excepcionn: "+e);
        }
        return lista;
    }

             
          public String formatNumber(String entrada){
              double ent=Double.parseDouble(entrada);
              double roundOff = Math.round(ent * 100.0) / 100.0;
              return String.valueOf(roundOff);
          }
}
