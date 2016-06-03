/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotizador;
import java.io.StringReader;
import java.net.URLEncoder;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import Cotizador.MyUtil;

/**
 *
 * @author Luis
 */
public class Cotizador_rsa {
    //modelo
  public String anio="";
    public String clave="";
    public String modelo="";
        public String fechainicio="";
            public String fechadiamas="";
                public String fechavencimiento="";
                public String codigopostal="";
                String primaTotal="";
                String primasemestral="";
                
    
    public Cotizador_rsa(String clave, String modelo, String anio,String fechainicio, String fechadiamas, String fechavencimiento, String codigopostal){
        this.anio=anio;
        this.clave=clave;
        this.modelo=modelo;
        this.fechainicio=fechainicio;
        this.fechadiamas=fechadiamas;
        this.fechavencimiento=fechavencimiento;
        this.codigopostal=codigopostal;
        
    }
    /**
     * @param args the command line arguments
     */
    public String cotizaRSA() {
        // TODO code application logic here
        String responsetext="";
        MyUtil m=new MyUtil();
 
       try { // This code block invokes the WSInterfacePort:doProcess operation on web service
            RSA_2.WSInterface wSInterface = new RSA_2.WSInterface_Impl();
            RSA_2.WSInterfacePort wSInterfacePort = wSInterface.getWSInterfacePort();
     String respuesta = wSInterfacePort.doProcess(""
                    + "<rtm>\n" +
"	<rtm_header>\n" +
"		<conversationid>1</conversationid>\n" +
"		<transaction>BB0010</transaction>\n" +
"		<sourcecountry>MX</sourcecountry>\n" +
"		<sourcecompany>ARSEGUROS</sourcecompany>\n" +
"		<sourcesystem>ARSEGUROS</sourcesystem>\n" +
"	</rtm_header>\n" +
"	<rtm_body>\n" +
"		<information>\n" +
"			<poliza>\n" +
                     "                <cdunieco>1</cdunieco>"
                    + "                <cdramo>211</cdramo>"
                    + "                <edoPoliza>W</edoPoliza>"
                    + "                <nmpoliza></nmpoliza>"
                    + "                <status>V</status>"
                    + "                <nmsolici>0</nmsolici>"
                    + "                <cdmoneda>MXP</cdmoneda>"
                    + "                <ottempot>R</ottempot>"
                    + "                <feefecto>"+fechainicio+"</feefecto>"
                    + "                <hhefecto>12:00</hhefecto>"
                    + "                <fevencim>"+fechavencimiento+"</fevencim>"
                    + "                <feemisio/>"
                    + "                <cdperpag>12</cdperpag>"
                    + "                <cdpergago>TODAS</cdpergago>"
                    + "                <nmcuadro>MTS1</nmcuadro>"
                    + "                <porredau>0</porredau>"
                    + "                <otval01>P</otval01>"
                    + "                <otval03>S</otval03>"
                    + "                <otval05>00001</otval05>"
                    + "                <otval06>0000100001</otval06>"
                    + "                <otval10>2111400003</otval10>"
                    + "                <otval11>S</otval11>"
                    + "                <otval12>105314</otval12>"
                    + "                <otval13>10/04/2015 11:10</otval13>"
                    + "                <otval14>B</otval14>"
                    + "                <otval19>S</otval19>"
                    + "                <otval23></otval23>"
                    + "                <otval26></otval26>"
                    + "                <otval29>12345678</otval29>"
                    + "                <otval33>1</otval33>"
                    + "                <otval34>0001</otval34>"+
"			</poliza>\n" +
"			<situaciones>\n" +
"				<situacion>\n" +
"					<nmsituac>1</nmsituac>\n" +
"					<cdagrupa>1</cdagrupa>\n" +
"					<datosSituacion>\n" +
"						<otval01/>\n" +
"						<otval02>"+clave+"</otval02>\n" +
"						<otval03>"+modelo+"</otval03>\n" +
"						<otval05>"+anio+"</otval05>\n" +
"						<otval07>00</otval07>\n" +
"						<otval08>01</otval08>\n" +
"						<otval09>5</otval09>\n" +
"						<otval10>00UU43O5LL</otval10>\n" +
"						<otval11>000345345</otval11>\n" +
"						<otval13>200EREZ</otval13>\n" +
"						<otval15/>\n" +
"						<otval16/>\n" +
"						<otval17>N</otval17>\n" +
"						<otval21>45</otval21>\n" +
"						<otval22>H</otval22>\n" +
"						<otval26>"+codigopostal+"</otval26>\n" +
"					</datosSituacion>\n" +
"					<planCobertura>\n" +
"						<otval14>01</otval14>\n" +
"						<cobertura>\n" +
"							<cdgarant>0201</cdgarant>\n" +
"							<cdcapita>1</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>5</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0240</cdgarant>\n" +
"							<cdcapita>36</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0202</cdgarant>\n" +
"							<cdcapita>2</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>10</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0206</cdgarant>\n" +
"							<cdcapita>6</cdcapita>\n" +
"							<ptcapita>250000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0213</cdgarant>\n" +
"							<cdcapita>13</cdcapita>\n" +
"							<ptcapita>100000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0219</cdgarant>\n" +
"							<cdcapita>16</cdcapita>\n" +
"							<ptcapita>1000000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0235</cdgarant>\n" +
"							<cdcapita>31</cdcapita>\n" +
"							<ptcapita>550000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0236</cdgarant>\n" +
"							<cdcapita>32</cdcapita>\n" +
"							<ptcapita>550000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0245</cdgarant>\n" +
"							<cdcapita>45</cdcapita>\n" +
"							<ptcapita>10000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"					</planCobertura>\n" +
"				</situacion>\n" +
"			</situaciones>\n" +
"		</information>\n" +
"	</rtm_body>\n" +
"	<rtm_fault>\n" +
"		<systemfault/>\n" +
"		<applicationfault/>\n" +
"	</rtm_fault>\n" +
"</rtm>");
     
     
     
     System.out.println(respuesta);
            
            
            try{
      
DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(respuesta));
          
Document doc=builder.parse(src);
 primaTotal=doc.getElementsByTagName("primaTotal").item(0).getTextContent();
primaTotal="$ "+m.formatNumber(primaTotal);

}catch(Exception ex){
    System.out.println("Exception cotizadorrsa"+ex);
    responsetext="No disponible|No disponible|No disponible";
}

            
        } catch (javax.xml.rpc.ServiceException ex) {
            responsetext="No disponible|No disponible|No disponible";
            java.util.logging.Logger.getLogger(RSA_2.WSInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            responsetext="No disponible|No disponible|No disponible";
            java.util.logging.Logger.getLogger(RSA_2.WSInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   try { // This code block invokes the WSInterfacePort:doProcess operation on web service
            RSA_2.WSInterface wSInterface = new RSA_2.WSInterface_Impl();
            RSA_2.WSInterfacePort wSInterfacePort = wSInterface.getWSInterfacePort();
     String respuesta = wSInterfacePort.doProcess(""
                    + "<rtm>\n" +
"	<rtm_header>\n" +
"		<conversationid>1</conversationid>\n" +
"		<transaction>BB0010</transaction>\n" +
"		<sourcecountry>MX</sourcecountry>\n" +
"		<sourcecompany>ARSEGUROS</sourcecompany>\n" +
"		<sourcesystem>ARSEGUROS</sourcesystem>\n" +
"	</rtm_header>\n" +
"	<rtm_body>\n" +
"		<information>\n" +
"			<poliza>\n" +
                     "                <cdunieco>1</cdunieco>"
                    + "                <cdramo>211</cdramo>"
                    + "                <edoPoliza>W</edoPoliza>"
                    + "                <nmpoliza></nmpoliza>"
                    + "                <status>V</status>"
                    + "                <nmsolici>0</nmsolici>"
                    + "                <cdmoneda>MXP</cdmoneda>"
                    + "                <ottempot>R</ottempot>"
                    + "                <feefecto>"+fechainicio+"</feefecto>"
                    + "                <hhefecto>12:00</hhefecto>"
                    + "                <fevencim>"+fechavencimiento+"</fevencim>"
                    + "                <feemisio>"+fechainicio+"</feemisio>"
                    + "                <cdperpag>6</cdperpag>"
                    + "                <nmcuadro>MTS1</nmcuadro>"
                    + "                <porredau>0.0</porredau>"
                    + "                <otval01>P</otval01>"
                    + "                <otval03>S</otval03>"
                    + "                <otval05>00001</otval05>"
                    + "                <otval06>0000100001</otval06>"
                    + "                <otval10>2111400003</otval10>"
                    + "                <otval11>S</otval11>"
                    + "                <otval12>105314</otval12>"
                    + "                <otval13>"+fechainicio+" 12:00</otval13>"
                    + "                <otval14>B</otval14>"
                    + "                <otval19>S</otval19>"
                    + "                <otval23></otval23>"
                    + "                <otval26></otval26>"
                    + "                <otval29>12345678</otval29>"
                    + "                <otval33>1</otval33>"
                    + "                <otval34>0001</otval34>"+
"			</poliza>\n" +
"			<situaciones>\n" +
"				<situacion>\n" +
"					<nmsituac>1</nmsituac>\n" +
"					<cdagrupa>1</cdagrupa>\n" +
"					<datosSituacion>\n" +
"						<otval01/>\n" +
"						<otval02>"+clave+"</otval02>\n" +
"						<otval03>"+modelo+"</otval03>\n" +
"						<otval05>"+anio+"</otval05>\n" +
"						<otval07>00</otval07>\n" +
"						<otval08>01</otval08>\n" +
"						<otval09>5</otval09>\n" +
"						<otval10>12312312112312312</otval10>\n" +
"						<otval11>000345345</otval11>\n" +
"						<otval13>200EREZ</otval13>\n" +
"						<otval15/>\n" +
"						<otval16/>\n" +
"						<otval17>N</otval17>\n" +
"						<otval21>35</otval21>\n" +
"						<otval22>H</otval22>\n" +
"						<otval26>"+codigopostal+"</otval26>\n" +
"					</datosSituacion>\n" +
"					<planCobertura>\n" +
"						<otval14>01</otval14>\n" +
"						<cobertura>\n" +
"							<cdgarant>0201</cdgarant>\n" +
"							<cdcapita>1</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>5</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0240</cdgarant>\n" +
"							<cdcapita>36</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0202</cdgarant>\n" +
"							<cdcapita>2</cdcapita>\n" +
"							<ptcapita>0</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>10</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0206</cdgarant>\n" +
"							<cdcapita>6</cdcapita>\n" +
"							<ptcapita>250000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0213</cdgarant>\n" +
"							<cdcapita>13</cdcapita>\n" +
"							<ptcapita>100000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0219</cdgarant>\n" +
"							<cdcapita>16</cdcapita>\n" +
"							<ptcapita>1000000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0235</cdgarant>\n" +
"							<cdcapita>31</cdcapita>\n" +
"							<ptcapita>550000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0236</cdgarant>\n" +
"							<cdcapita>32</cdcapita>\n" +
"							<ptcapita>550000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"						<cobertura>\n" +
"							<cdgarant>0245</cdgarant>\n" +
"							<cdcapita>45</cdcapita>\n" +
"							<ptcapita>10000</ptcapita>\n" +
"							<otval01>0</otval01>\n" +
"							<otval03>0</otval03>\n" +
"						</cobertura>\n" +
"					</planCobertura>\n" +
"				</situacion>\n" +
"			</situaciones>\n" +
"		</information>\n" +
"	</rtm_body>\n" +
"	<rtm_fault>\n" +
"		<systemfault/>\n" +
"		<applicationfault/>\n" +
"	</rtm_fault>\n" +
"</rtm>");
     
     
     
     System.out.println(respuesta);
            
            
            try{
      
DocumentBuilder builder =DocumentBuilderFactory.newInstance().newDocumentBuilder();
InputSource src=new InputSource();
src.setCharacterStream(new StringReader(respuesta));
          
Document doc=builder.parse(src);
 primasemestral=doc.getElementsByTagName("primaTotal").item(0).getTextContent();
 
primasemestral="$ "+m.formatNumber(primasemestral);

}catch(Exception ex){
    System.out.println("Exception cotizadorrsa"+ex);
    responsetext="No disponible|No disponible|No disponible";
}        
        } catch (javax.xml.rpc.ServiceException ex) {
            responsetext="No disponible|No disponible|No disponible";
            java.util.logging.Logger.getLogger(RSA_2.WSInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            responsetext="No disponible|No disponible|No disponible";
            java.util.logging.Logger.getLogger(RSA_2.WSInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }




//String primasemestral=doc.getElementsByTagName("PrimaTotal").item(0).getTextContent();
//System.out.println("resultado"+primaTotal+" "+primasemestral);
if(primaTotal.equals("")){
    primaTotal="No disponible";
}
if(primasemestral.equals("")){
    primasemestral="No disponible";
    
}
responsetext=primaTotal+"|"+primasemestral+"|"+primaTotal;
return responsetext;
    }

}
