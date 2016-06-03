package Modelo;

import java.sql.*;

public class DescripcionDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public DescripcionDAO() {
        con = new conexion();
    }
    
    public Descripcion ObtenerDescripcion(int marca, int modelo ,int anio){
        Descripcion vehiculo = null;
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("SELECT * FROM vista_descripcion_vehiculo WHERE idmarca = ? AND idsubmarca = ? AND modelo = ?");
            ps.setInt(1, marca);
            ps.setInt(2, modelo);
            ps.setInt(3, anio);
            rs = ps.executeQuery();
           if(rs.next()){
                vehiculo = new Descripcion();
                vehiculo.setIdmarca(rs.getInt(1));
                vehiculo.setMarca(rs.getString(2));
                vehiculo.setIdsubmarca(rs.getInt(3));
                vehiculo.setSubmarca(rs.getString(4));
                vehiculo.setModelo(rs.getInt(5));
                vehiculo.setAnio(rs.getInt(6));
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
        return vehiculo;
    }
    
}
