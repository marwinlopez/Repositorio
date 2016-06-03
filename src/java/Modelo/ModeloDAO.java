package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public ModeloDAO() {
        con = new conexion();
    }
    
    public List<Modelo> ListadoModelo(int marca,int anio){
        List<Modelo> modelo = new ArrayList<Modelo>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("SELECT * from vista_modelo_marca_submarca WHERE idmarca=? AND modelo=?");
            ps.setInt(1, marca);
            ps.setInt(2, anio);
            rs = ps.executeQuery();
            while(rs.next()){
                Modelo m = new Modelo();
                m.setIdsubmarca(rs.getInt(2));
                m.setSubmarca(rs.getString(3));
                modelo.add(m);
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
        return modelo;
    }
}
