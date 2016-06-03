/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zurich_header;

/**
 *
 * @author luis
 */
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * Clase para cargar los tags del Header para inicializacion de seguridad
 * @author saturnov26
 *
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> 
{
	
	//==========Variables estaticas===================\\
     private static final Logger LOGGER= Logger.getLogger("HeaderHandler");

    
@Override
public boolean handleMessage(SOAPMessageContext context) {

	 try 
	 {
    
		//=====Obtencion del Mensaje SOAP============\\ 
        SOAPMessage message = context.getMessage();
        //=====Declaracion del encabezado del SOAP Request Paypal
        SOAPHeader header = message.getSOAPHeader();
        //=====Declaracion del Envelop Soap de nuestro mensaje.
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        
	        if (header == null) 
	        {
	            header = envelope.addHeader();
	        }
            
                
            //Creacion Tag Credentials
            QName qNameCredentials = new QName("http://tempuri.org/", "Token");
            SOAPHeaderElement credentials = header.addHeaderElement(qNameCredentials);
	            

	            QName qNameUsername = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "usuario");
	            SOAPHeaderElement username = header.addHeaderElement(qNameUsername );
	            username.addTextNode("WSBCSEGAN");
	            
	            QName qNamePassword = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "password");
	            SOAPHeaderElement password = header.addHeaderElement(qNamePassword);
	            password.addTextNode("VIRTUAL1$");
	            
	            credentials.addChildElement(password);
	            credentials.addChildElement(username);
	          
	            
	            message.saveChanges();
	            
	            //TODO: remove this writer when the testing is finished
	            StringWriter writer = new StringWriter();
	            message.writeTo(new StringOutputStream(writer));
            
	            LOGGER.log(Level.SEVERE, "HEADER DE SALIDA PAYPAL: [{0}]",writer.toString());

        }
	 	catch (SOAPException soapex) 
		{
	      LOGGER.log(Level.SEVERE, "ERROR AL AGREGAR EL HEADER DEL XML SOAP DE PAYPAL, MENSAJE: [{0}]",soapex.getLocalizedMessage());
	    }
	 	catch (IOException ioex) 
	 	{         
          LOGGER.log(Level.SEVERE, "ERROR AL ESCRIBIR EL MENSAJE AL STREAM DE SALIDA, MENSAJE: [{0}]",ioex.getLocalizedMessage());
	 	}
	 
    return true;

}//Fin del Metodo


//TODO: remove this class after testing is finished
private static class StringOutputStream extends OutputStream {

    private StringWriter writer;

    public StringOutputStream(StringWriter writer) {
        this.writer = writer;
    }

    @Override
    public void write(int b) throws IOException {
        writer.write(b);
    }
}


@Override
public boolean handleFault(SOAPMessageContext context) {
	LOGGER.log(Level.INFO, "SE INVOCA EL METODO [handleFault]");   
    return true;
}

@Override
public void close(MessageContext context) {
	LOGGER.log(Level.INFO, "SE INVOCA EL METODO [close]");  
}

@Override
public Set<QName> getHeaders() {
	LOGGER.log(Level.INFO, "SE INVOCA EL METODO [getHeaders]"); 
    return null;
}


  

}//Fin de la clase