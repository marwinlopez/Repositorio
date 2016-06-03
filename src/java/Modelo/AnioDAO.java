package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AnioDAO {
    conexion conexion;
    ResultSet rs;
    PreparedStatement ps;
    Connection bd;

    public AnioDAO() {
        conexion = new conexion();
    }
    
    public ArrayList ArrayListaAnio(){
        ArrayList Anio = new ArrayList();
   
        try {
            //Conexion a la base de datos
            bd = conexion.getConexion();
            ps = bd.prepareStatement("SELECT * FROM vista_modelo");
            rs = ps.executeQuery();
            while(rs.next()){
                Anio.add(rs.getString(1));
                Anio.add(rs.getString(2));
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
        //Retorna el ArrayList
        return Anio;
    }
    
    public List<Anio> ListaAnio(){
        List<Anio> anio = new ArrayList<Anio>();
        bd = conexion.getConexion();
         try{
            ps = bd.prepareStatement("SELECT * FROM vista_modelo");
            
            rs = ps.executeQuery();
            while(rs.next()){
                Anio a = new Anio();
                a.setSequence(rs.getInt(1));
                a.setAño(rs.getInt(2));
                anio.add(a);
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
        return anio;
    }
    
    public Anio ObtenerAnio(int idn){
        Anio anio=null;
        bd = conexion.getConexion();
        try{
            ps = bd.prepareStatement("SELECT * FROM vista_modelo WHERE sequence = ?");
            ps.setInt(1, idn);
            rs = ps.executeQuery();
           if(rs.next()){
                anio = new Anio();
                anio.setSequence(rs.getInt(1));
                anio.setAño(rs.getInt(2));
                return anio;
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
        return anio;
    }
}
