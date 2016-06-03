package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public MarcaDAO() {
        con = new conexion();
    }
    
    public List<Marca> ListadoMarca(int modelo){
        List<Marca> marca = new ArrayList<Marca>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("SELECT * FROM vista_modelo_marca WHERE modelo=?");
            ps.setInt(1, modelo);
            rs = ps.executeQuery();
            while(rs.next()){
                Marca m = new Marca();
                m.setIdmarca(rs.getInt(1));
                m.setMarca(rs.getString(2));
                marca.add(m);
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
        return marca;
    } 
}
