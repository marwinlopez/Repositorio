package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbaDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public AbaDAO() {
    con = new conexion();
    }
    
    public List<Aba> ObtenerListaAba(int marca, int modelo, int anio){
        List<Aba> lista = new ArrayList<Aba>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select clave, descripcion from vista_catalogo_aba_id where idmarca=? and idsubmarca=? and modelo=?");
            ps.setInt(1, marca);
            ps.setInt(2, modelo);
            ps.setInt(3, anio);
            rs = ps.executeQuery();
            while(rs.next()){
                Aba a = new Aba();
                a.setClave(rs.getInt(1));
                a.setDescripcion(rs.getString(2));
                lista.add(a);
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
