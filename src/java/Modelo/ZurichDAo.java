package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ZurichDAo {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public ZurichDAo() {
        con = new conexion();
    }
    
    public List<Zurich> ObtenerLista(int marca, int modelo, int anio){
        List<Zurich> lista = new ArrayList<Zurich>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select clave, descripcion from vista_catalogo_zurich where idmarca=? and idsubmarca=? and modelo=?");
            ps.setInt(1, marca);
            ps.setInt(2, modelo);
            ps.setInt(3, anio);
            rs = ps.executeQuery();
            while(rs.next()){
                Zurich z = new Zurich();
                z.setClave(rs.getString(1));
                z.setDescripcion(rs.getString(2));
                lista.add(z);
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
