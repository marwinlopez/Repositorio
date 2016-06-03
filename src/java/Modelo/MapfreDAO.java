package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MapfreDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public MapfreDAO() {
        con = new conexion();
    }
    
    public List<Mapfre> ObtenerListaMapfre(int marca, int modelo, int anio){
        List<Mapfre> lista = new ArrayList<Mapfre>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select clave, descripcion from vista_catalogo_mapfre where modelo =? and idmarca =? and idsubmarca = ?");
            ps.setInt(1, anio);
            ps.setInt(2, marca);
            ps.setInt(3, modelo);
            
            rs = ps.executeQuery();
            while(rs.next()){
                Mapfre m = new Mapfre();
                m.setClave(rs.getInt(1));
                m.setDescripcion(rs.getString(2));
                lista.add(m);
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
    public String getMarcaID(String modelo, String anio,String marcacb){
    //   public String getMarcaID(String modelo){
       bd = con.getConexion();
       int res=0;
        try {
            System.out.println(" modelo:"+modelo);
        //    System.out.println(" anio:"+anio);
       //     System.out.println(" marcacb:"+marcacb);
            ps = bd.prepareStatement("select distinct(idmarca) from catalogo_mapfre_combo where idmodelo = ? and anio=? and idmarcabc=?");
         //   ps = bd.prepareStatement("select distinct(idmarca) from catalogo_mapfre_combo where idmodelo = ?" );
            
            ps.setInt(1, Integer.parseInt(modelo));
            ps.setInt(2, Integer.parseInt(anio));
            ps.setString(3, marcacb);
            
            rs = ps.executeQuery();
            while(rs.next()){
                res=rs.getInt("idmarca");
                
                System.out.println("marca nueva"+res);
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
      return String.valueOf(res);  
      
    }
    
   public UbicacionMapfre getPoblacionID(String codigopostal){
    //   public String getMarcaID(String modelo){
       bd = con.getConexion();
UbicacionMapfre ubi=new UbicacionMapfre();
       int res=0;
        try {
            System.out.println(" modelo:"+codigopostal);
        //    System.out.println(" anio:"+anio);
       //     System.out.println(" marcacb:"+marcacb);
            ps = bd.prepareStatement("select codigociudad, codigoestado from MAPFRECatalogoCP where codigopostal = ? ");
         //   ps = bd.prepareStatement("select distinct(idmarca) from catalogo_mapfre_combo where idmodelo = ?" );
            
            ps.setString(1, codigopostal);
           
            
            rs = ps.executeQuery();
            while(rs.next()){
                        ubi.setEdo(String.valueOf(rs.getInt("codigoestado")));
                                       ubi.setPob(String.valueOf(rs.getInt("codigociudad")));
                
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
      return ubi;  
      
    }
    
    public String getAnioID(String anio){
      //  public String getMarcaID(String modelo){
       bd = con.getConexion();
       int res=0;
        try {
           
           
           ps = bd.prepareStatement("SELECT sequence FROM vista_modelo WHERE año = ?");
            
            ps.setInt(1, Integer.parseInt(anio));
            
            
            rs = ps.executeQuery();
            while(rs.next()){
                res=rs.getInt("sequence");
                System.out.println("sec"+res);
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
                System.out.println("Error en Consulta "+e);
            }
        }
      return String.valueOf(res);  
    }
    
    
}
