package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BancosDAO {
    conexion con;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public BancosDAO() {
     con = new conexion();
    }
    
    public List<Bancos> ObtenerListaBancos(){
        List<Bancos> lista = new ArrayList<Bancos>();
        bd = con.getConexion();
        try {
            ps = bd.prepareStatement("select idbanco, banco from bancos");
            rs = ps.executeQuery();
            while(rs.next()){
                Bancos b = new Bancos();
                b.setIdbanco(rs.getString(1));
                b.setBanco(rs.getString(2));
                lista.add(b);
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
