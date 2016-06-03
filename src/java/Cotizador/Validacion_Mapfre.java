/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotizador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import Cotizador.MyUtil;

/**
 *
 * @author KNDY
 */
public class Validacion_Mapfre {

    /**
     * @param args the command line arguments
     * 
     */
    public String anio="";
    public String codmarca="";
    public String codmodelo="";
    public String fechavencimiento="";
    public String fechainicio="";
public String estado="";
    public String poblacion="";
    
    public Validacion_Mapfre(String codmarca, String codmodelo, String anio,String fechainicio, String fechavencimiento, String estado, String poblacion){
        this.anio=anio;
        this.codmarca=codmarca;
        this.codmodelo=codmodelo;
        this.fechainicio=fechainicio;
        this.fechavencimiento=fechavencimiento;       
        this.estado=estado;
        this.poblacion=poblacion;
        
    }
    public String cotizaMapfreAnual() throws UnsupportedEncodingException, MalformedURLException, IOException, ParserConfigurationException, SAXException  {
        MyUtil m=new MyUtil();
        String resultresponse="";
       String url = "http://negocios.mapfre.com.mx/wsemisiontw/emisiontw.asmx/WS_TW_ACotiza?";
String charset = "UTF-8";



String param1 = URLEncoder.encode("<xml><seguridad><user pwd='mXmIfnlKyZAqH5PrPHrLLA=='   id='GMAC0106'/></seguridad><data><cotizacion><DATOS_POLIZA PCT_AGT='100' COD_PROV='"+poblacion+"'   COD_ESTADO='"+estado+"' COD_DOCUM='PRUEBA' TIP_DOCUM='RFC' COD_NIVEL3_CAPTURA='0'   COD_USR='GMAC0106' COD_GESTOR='63692' TIP_GESTOR='AG' COD_AGT='63692'   COD_CUADRO_COM='1' COD_FRACC_PAGO='1' FEC_VCTO_POLIZA='"+fechavencimiento+"'   FEC_EFEC_POLIZA='"+fechainicio+"' COD_RAMO='401' COD_SECTOR='4' NUM_CONTRATO='45435'   NUM_POLIZA_GRUPO='4GPOLOCALES01' ID_NEGOCIO='LOCALES'/><DATOS_VARIABLES   TIP_NIVEL='2' NUM_RIESGO='1'><CAMPO VAL_CAMPO='40999'   COD_CAMPO='COD_MODALIDAD'/><CAMPO VAL_CAMPO='"+anio+"'   COD_CAMPO='ANIO_FABRICA'/><CAMPO VAL_CAMPO='"+codmarca+"' COD_CAMPO='COD_MARCA'/><CAMPO   VAL_CAMPO='"+codmodelo+"' COD_CAMPO='COD_MODELO'/><CAMPO VAL_CAMPO='1'   COD_CAMPO='COD_TIP_VEHI'/><CAMPO VAL_CAMPO='401'   COD_CAMPO='COD_USO_VEHI'/><CAMPO VAL_CAMPO='N'   COD_CAMPO='MCA_FACTURA'/><CAMPO VAL_CAMPO='N' COD_CAMPO='MCA_ACTUAL'/><CAMPO   VAL_CAMPO='S' COD_CAMPO='MCA_COMERCIAL'/></DATOS_VARIABLES><DATOS_VARIABLES   TIP_NIVEL='1' NUM_RIESGO='0'><CAMPO VAL_CAMPO='999'   COD_CAMPO='COD_BONI_RECA'/><CAMPO VAL_CAMPO='-68.5'   COD_CAMPO='PCT_COD_REC_ESP'/></DATOS_VARIABLES><COBERTURAS><COBERTURA   COD_FRANQUICIA='5' SUMA_ASEG='C' COD_COB='4000'/><COBERTURA COD_FRANQUICIA='10'   SUMA_ASEG='C' COD_COB='4001'/><COBERTURA SUMA_ASEG='1' COD_COB='4003'/><COBERTURA   SUMA_ASEG='1' COD_COB='4004'/><COBERTURA SUMA_ASEG='500000'   COD_COB='4006'/><COBERTURA SUMA_ASEG='500000' COD_COB='4010'/><COBERTURA   SUMA_ASEG='500000' COD_COB='4011'/><COBERTURA SUMA_ASEG='0'   COD_COB='4012'/><COBERTURA SUMA_ASEG='100000' COD_COB='4013'/><COBERTURA   SUMA_ASEG='0' COD_COB='4028'/><COBERTURA SUMA_ASEG='0' COD_COB='4023'/><COBERTURA   SUMA_ASEG='0' COD_COB='4022'/><COBERTURA SUMA_ASEG='0' COD_COB='4024'/><COBERTURA   SUMA_ASEG='0' COD_COB='4027'/><COBERTURA SUMA_ASEG='3000000'   COD_COB='4068'/></COBERTURAS></cotizacion></data></xml>", charset);
String query = String.format("xml=%s", param1);

URLConnection urlConnection = new URL(url).openConnection();
urlConnection.setUseCaches(false);
urlConnection.setDoOutput(true); // Triggers POST.
urlConnection.setRequestProperty("accept-charset", charset);
urlConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");

OutputStreamWriter writer = null;
try {
    writer = new OutputStreamWriter(urlConnection.getOutputStream(), charset);
    writer.write(query); // Write POST query string (if any needed).
    System.out.println(query);
} finally {
    if (writer != null) try { writer.close(); } catch (IOException logOrIgnore) {}
}

InputStream result = urlConnection.getInputStream();
// Now do your thing with the result.
// Write it into a String and put as request attribute
// or maybe to OutputStream of response as being a Servlet behind `jsp:include`.

BufferedReader reader = new BufferedReader(new InputStreamReader(result));
StringBuilder result1 = new StringBuilder();
String line;
while((line = reader.readLine()) != null) {
    result1.append(line);
}
System.out.println(result1.toString());

DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(result1.toString()));
try{
Document doc=builder.parse(src);
String primaTotal=doc.getElementsByTagName("prima_total").item(0).getTextContent();
System.out.println("resultado"+primaTotal);
if(primaTotal.equals("")){
    primaTotal="No disponible";
}

primaTotal="$ "+m.formatNumber(primaTotal);
//resultresponse=primasemestral+"|"+primaTotal+"|"+primasemestral;
resultresponse=primaTotal;
}catch(Exception ex){
    System.out.println("Exception validacionmapfre"+ex);
    resultresponse="No disponible";
}
System.out.println("resultresponse"+resultresponse);
return resultresponse;
    }
    
    public String cotizaMapfre() throws UnsupportedEncodingException, MalformedURLException, IOException, ParserConfigurationException, SAXException  {
        MyUtil m=new MyUtil();
        String resultresponse="";
       String url = "http://negocios.mapfre.com.mx/wsemisiontw/emisiontw.asmx/WS_TW_ACotiza?";
String charset = "UTF-8";


String param1 = URLEncoder.encode("<xml><seguridad><user pwd='mXmIfnlKyZAqH5PrPHrLLA=='   id='GMAC0106'/></seguridad><data><cotizacion><DATOS_POLIZA PCT_AGT='100' COD_PROV='"+poblacion+"'   COD_ESTADO='"+estado+"' COD_DOCUM='PRUEBA' TIP_DOCUM='RFC' COD_NIVEL3_CAPTURA='0'   COD_USR='GMAC0106' COD_GESTOR='63692' TIP_GESTOR='AG' COD_AGT='63692'   COD_CUADRO_COM='1' COD_FRACC_PAGO='2' FEC_VCTO_POLIZA='"+fechavencimiento+"'   FEC_EFEC_POLIZA='"+fechainicio+"' COD_RAMO='401' COD_SECTOR='4' NUM_CONTRATO='45435'   NUM_POLIZA_GRUPO='4GPOLOCALES01' ID_NEGOCIO='LOCALES'/><DATOS_VARIABLES   TIP_NIVEL='2' NUM_RIESGO='1'><CAMPO VAL_CAMPO='40999'   COD_CAMPO='COD_MODALIDAD'/><CAMPO VAL_CAMPO='"+anio+"'   COD_CAMPO='ANIO_FABRICA'/><CAMPO VAL_CAMPO='"+codmarca+"' COD_CAMPO='COD_MARCA'/><CAMPO   VAL_CAMPO='"+codmodelo+"' COD_CAMPO='COD_MODELO'/><CAMPO VAL_CAMPO='1'   COD_CAMPO='COD_TIP_VEHI'/><CAMPO VAL_CAMPO='401'   COD_CAMPO='COD_USO_VEHI'/><CAMPO VAL_CAMPO='N'   COD_CAMPO='MCA_FACTURA'/><CAMPO VAL_CAMPO='N' COD_CAMPO='MCA_ACTUAL'/><CAMPO   VAL_CAMPO='S' COD_CAMPO='MCA_COMERCIAL'/></DATOS_VARIABLES><DATOS_VARIABLES   TIP_NIVEL='1' NUM_RIESGO='0'><CAMPO VAL_CAMPO='999'   COD_CAMPO='COD_BONI_RECA'/><CAMPO VAL_CAMPO='-68.5'   COD_CAMPO='PCT_COD_REC_ESP'/></DATOS_VARIABLES><COBERTURAS><COBERTURA   COD_FRANQUICIA='5' SUMA_ASEG='C' COD_COB='4000'/><COBERTURA COD_FRANQUICIA='10'   SUMA_ASEG='C' COD_COB='4001'/><COBERTURA SUMA_ASEG='1' COD_COB='4003'/><COBERTURA   SUMA_ASEG='1' COD_COB='4004'/><COBERTURA SUMA_ASEG='500000'   COD_COB='4006'/><COBERTURA SUMA_ASEG='500000' COD_COB='4010'/><COBERTURA   SUMA_ASEG='500000' COD_COB='4011'/><COBERTURA SUMA_ASEG='0'   COD_COB='4012'/><COBERTURA SUMA_ASEG='100000' COD_COB='4013'/><COBERTURA   SUMA_ASEG='0' COD_COB='4028'/><COBERTURA SUMA_ASEG='0' COD_COB='4023'/><COBERTURA   SUMA_ASEG='0' COD_COB='4022'/><COBERTURA SUMA_ASEG='0' COD_COB='4024'/><COBERTURA   SUMA_ASEG='0' COD_COB='4027'/><COBERTURA SUMA_ASEG='3000000'   COD_COB='4068'/></COBERTURAS></cotizacion></data></xml>", charset);

String query = String.format("xml=%s", param1);


URLConnection urlConnection = new URL(url).openConnection();
urlConnection.setUseCaches(false);
urlConnection.setDoOutput(true); // Triggers POST.
urlConnection.setRequestProperty("accept-charset", charset);
urlConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");

OutputStreamWriter writer = null;
try {
    writer = new OutputStreamWriter(urlConnection.getOutputStream(), charset);
    writer.write(query); // Write POST query string (if any needed).
    System.out.println(query);
} finally {
    if (writer != null) try { writer.close(); } catch (IOException logOrIgnore) {}
}

InputStream result = urlConnection.getInputStream();
// Now do your thing with the result.
// Write it into a String and put as request attribute
// or maybe to OutputStream of response as being a Servlet behind `jsp:include`.

BufferedReader reader = new BufferedReader(new InputStreamReader(result));
StringBuilder result1 = new StringBuilder();
String line;
while((line = reader.readLine()) != null) {
    result1.append(line);
}
System.out.println(result1.toString());

DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(result1.toString()));
try{
Document doc=builder.parse(src);
String primaTotal=doc.getElementsByTagName("prima_total").item(0).getTextContent();
System.out.println("resultado"+primaTotal);
if(primaTotal.equals("")){
    primaTotal="No disponible";
}
primaTotal="$ "+m.formatNumber(primaTotal);
resultresponse=primaTotal;
}catch(Exception ex){
    System.out.println("Exception validacionmapfre"+ex);
    resultresponse="No disponible";
}
System.out.println("resultresponse"+resultresponse);
return resultresponse;
    }
    
}