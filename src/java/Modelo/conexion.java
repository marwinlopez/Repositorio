/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

public class conexion {
    public conexion(){
    }
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            
            con=DriverManager.getConnection("jdbc:postgresql://dbgeneral.c6ncr8z5n4i7.us-west-1.rds.amazonaws.com:5432/Seguros","postgres","PradosPirineos.1");
            
        }catch(Exception e){
        }
        System.out.println("Conectado");
        return con;
    }
}