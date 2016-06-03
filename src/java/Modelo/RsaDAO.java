package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RsaDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public RsaDAO() {
       con = new conexion();
    }
    
    public List<Rsa> ObtenerListaRsa(int marca, int modelo, int anio){
        List<Rsa> lista = new ArrayList<Rsa>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select clave, descripcion from vista_catalogo_rsa where idmarca=? and idsubmarca=? and modelo=?");
            ps.setInt(1, marca);
            ps.setInt(2, modelo);
            ps.setInt(3, anio);
            rs = ps.executeQuery();
            while(rs.next()){
                Rsa r = new Rsa();
                r.setClave(rs.getString(1));
                r.setDescripcion(rs.getString(2));
                lista.add(r);
            }
        } catch (SQLException e) {
            System.err.printf("error "+ e.getMessage());
        //Se cierra la conexion y el Stantement
        }finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(bd != null){
                    bd.close();
                }
            } catch (Exception e) {
                System.out.println("Error en Consulta");
            }
        }
        return lista;
    }
     public String getMarcaID(String modelo, String anio){
         System.out.println("Marcaid "+modelo+anio);
       bd = con.getConexion();
       String res="";
        try {
            
            ps = bd.prepareStatement("select distinct(descripcion) from rsaautos where anio=? and clave=?");
            ps.setString(1, anio);
            ps.setString(2, modelo);
            rs = ps.executeQuery();
            while(rs.next()){
                res=rs.getString("descripcion");
             //   System.out.println("DESC"+res);
            }
        } catch (SQLException e) {
            System.err.printf("error "+ e.getMessage());
        //Se cierra la conexion y el Stantement
        }finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(bd != null){
                    bd.close();
                }
            } catch (Exception e) {
                System.out.println("Error en Consulta");
            }
        }
      return res;  
    }
}