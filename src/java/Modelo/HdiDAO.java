package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HdiDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public HdiDAO() {
     con = new conexion();
    }
    
    public List<Hdi> ObtenerListaHdi(int marca, int modelo, int anio){
        List<Hdi> lista = new ArrayList<Hdi>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select clave, descripcion from vista_catalogo_hdi where idmarca=? and idsubmarca=? and modelo=?");
            ps.setInt(1, marca);
            ps.setInt(2, modelo);
            ps.setInt(3, anio);
            rs = ps.executeQuery();
            while(rs.next()){
                Hdi h = new Hdi();
                h.setClave(rs.getString(1));
                h.setDescripcion(rs.getString(2));
                lista.add(h);
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
}
