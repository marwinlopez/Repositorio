package Modelo;

import java.sql.*;
import java.util.*;

public class CodigoPostalDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public CodigoPostalDAO() {
        con = new conexion();
    }   
    
    public List<CodigoPostal> ListaColonia(String codigoPostal){
        List<CodigoPostal> lista = new ArrayList<CodigoPostal>();
        Connection accesoDB = con.getConexion();
        try {
            ps = accesoDB.prepareStatement("SELECT * FROM vista_estado_municipio_localidad WHERE codpos = ?");
            ps.setString(1, codigoPostal);
            rs = ps.executeQuery();
            while(rs.next()){
                CodigoPostal codigo = new CodigoPostal();
                codigo.setIdedo(rs.getInt(1));
                codigo.setNombedo(rs.getString(2));
                codigo.setIdmcpo(rs.getInt(3));
                codigo.setNombmcpo(rs.getString(4));
                codigo.setCodpos(rs.getString(5));
                codigo.setLocalidad(rs.getString(6));
                lista.add(codigo);
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
