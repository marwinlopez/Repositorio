/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotizador;

import Modelo.UbicacionAba;
import java.io.StringReader;
import java.text.DecimalFormat;
import javax.xml.bind.JAXBElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.tempuri.ObjectFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import zurich_header.HeaderHandlerResolver;

/**
 *
 * @author KNDY
 */
public class MyUtil {
    
    
    
    public String formatNumber(String number){
 
double amount = Double.parseDouble(number);
DecimalFormat formatter = new DecimalFormat("#,###.00");

System.out.println(formatter.format(amount));
    return String.valueOf(formatter.format(amount));
    }
 
 public  String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return " ";
        }
        return out;
    }
                             
                             
                             
public UbicacionAba getUbicacionAba(String cp){
    UbicacionAba ubi=new UbicacionAba();
    
    
  try {
 org.tempuri.ACCatalogos service = new org.tempuri.ACCatalogos();
        HeaderHandlerResolver header = new HeaderHandlerResolver();
        service.setHandlerResolver(header);
        
 org.tempuri.IACCatalogos port = service.getDefault();
  // TODO initialize WS operation arguments here
 org.tempuri.Entrada parameters = new org.tempuri.Entrada();
        
         ObjectFactory factory = new ObjectFactory();
        //JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("&lt;COT&gt; &lt;DG&gt;    &lt;NEG&gt;6542&lt;/NEG&gt;    &lt;AGE&gt;93349&lt;/AGE&gt;    &lt;CON&gt;0&lt;/CON&gt;    &lt;TAR&gt;141&lt;/TAR&gt;   &lt;INIVIG&gt;2016-05-02&lt;/INIVIG&gt;    &lt;FINVIG&gt;2017-05-02&lt;/FINVIG&gt;    &lt;TS&gt;1&lt;/TS&gt;    &lt;TC&gt;1&lt;/TC&gt;    &lt;FP&gt;12&lt;/FP&gt;  &lt;/DG&gt;  &lt;INCISOS&gt;    &lt;INCISO&gt;      &lt;ID&gt;3435&lt;/ID&gt;      &lt;MOD&gt;2013&lt;/MOD&gt;      &lt;PAQ&gt;1&lt;/PAQ&gt;      &lt;EDO&gt;19&lt;/EDO&gt;      &lt;MUN&gt;1037&lt;/MUN&gt;      &lt;SERV&gt;1&lt;/SERV&gt;      &lt;USO&gt;1&lt;/USO&gt;      &lt;TDED&gt;1&lt;/TDED&gt;      &lt;TSA&gt;1&lt;/TSA&gt;      &lt;PD&gt;0&lt;/PD&gt;      &lt;PB&gt;0&lt;/PB&gt;      &lt;COBS&gt;        &lt;COB&gt;          &lt;COBID&gt;1&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.05&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;2&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.10&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;3&lt;/COBID&gt;          &lt;SUMAASEG&gt;1000000&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;4&lt;/COBID&gt;          &lt;SUMAASEG&gt;400000&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;42&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;    &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;50&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;        &lt;COB&gt;          &lt;COBID&gt;116&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0&lt;/DPCT&gt;        &lt;/COB&gt;         &lt;COB&gt;          &lt;COBID&gt;472&lt;/COBID&gt;          &lt;SUMAASEG&gt;0&lt;/SUMAASEG&gt;          &lt;DADIC /&gt;          &lt;DPCT&gt;0.05&lt;/DPCT&gt;        &lt;/COB&gt;      &lt;/COBS&gt;    &lt;/INCISO&gt;  &lt;/INCISOS&gt;&lt;/COT&gt;");
        JAXBElement<String> createMessageDescription = factory.createEntradaStrEntrada("<CAT><NEG>6542</NEG> <CP>"+cp+"</CP></CAT>");
        parameters.setStrEntrada(createMessageDescription);
        
 // TODO process result here
 org.tempuri.Salida result = port.obtenerMunicipioPorCP(parameters);
 System.out.println("Result = "+result);
        System.out.println("Result = "+result);
        System.out.println("Result = "+result.getStrSalida().getValue());
        String responsexml=result.getStrSalida().getValue();
        

DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(responsexml));

Document doc=builder.parse(src);
ubi.setEdo(doc.getElementsByTagName("EDO").item(0).getTextContent());
ubi.setMpo(doc.getElementsByTagName("MPO").item(0).getTextContent());
     
        
    } catch (Exception ex) {
 // TODO handle custom exceptions here
        System.out.println("Result = "+ex);
    }
  
    
return ubi;
}
}


/* 
conexion con;      
      con = new conexion();
  Connection AccesoDB = con.getConexion();
        
        try {
            
            PreparedStatement ps = AccesoDB.prepareStatement("select * from abacp where cp=?");
            ps.setString(1, cp);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              ubi.setCol(rs.getString("colonia"));
              ubi.setEdo(rs.getString("estado"));
              ubi.setMpo(rs.getString("municipio"));
            
              
            }
        } catch (Exception e) {
            System.out.println("Excepcionn: "+e);
             ubi.setCol("1");
              ubi.setEdo("1");
              ubi.setMpo("1");
        }
*/