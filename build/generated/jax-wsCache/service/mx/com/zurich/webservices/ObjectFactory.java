
package mx.com.zurich.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.zurich.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _COTIZACIONAUTOSREQUEST_QNAME = new QName("http://webservices.zurich.com.mx/", "COTIZACION_AUTOS_REQUEST");
    private final static QName _COTIZACIONAUTOSRESPONSE_QNAME = new QName("http://webservices.zurich.com.mx/", "COTIZACION_AUTOS_RESPONSE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.zurich.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SOLICITUDCOTAUTOSREQType }
     * 
     */
    public SOLICITUDCOTAUTOSREQType createSOLICITUDCOTAUTOSREQType() {
        return new SOLICITUDCOTAUTOSREQType();
    }

    /**
     * Create an instance of {@link SOLICITUDCOTAUTOSRESType }
     * 
     */
    public SOLICITUDCOTAUTOSRESType createSOLICITUDCOTAUTOSRESType() {
        return new SOLICITUDCOTAUTOSRESType();
    }

    /**
     * Create an instance of {@link FORMAPAGOType }
     * 
     */
    public FORMAPAGOType createFORMAPAGOType() {
        return new FORMAPAGOType();
    }

    /**
     * Create an instance of {@link RECOTIZACIONAUTOSREQType }
     * 
     */
    public RECOTIZACIONAUTOSREQType createRECOTIZACIONAUTOSREQType() {
        return new RECOTIZACIONAUTOSREQType();
    }

    /**
     * Create an instance of {@link PAQUETEType }
     * 
     */
    public PAQUETEType createPAQUETEType() {
        return new PAQUETEType();
    }

    /**
     * Create an instance of {@link COBERTURAType }
     * 
     */
    public COBERTURAType createCOBERTURAType() {
        return new COBERTURAType();
    }

    /**
     * Create an instance of {@link COBERTURAREQType }
     * 
     */
    public COBERTURAREQType createCOBERTURAREQType() {
        return new COBERTURAREQType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOLICITUDCOTAUTOSREQType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.zurich.com.mx/", name = "COTIZACION_AUTOS_REQUEST")
    public JAXBElement<SOLICITUDCOTAUTOSREQType> createCOTIZACIONAUTOSREQUEST(SOLICITUDCOTAUTOSREQType value) {
        return new JAXBElement<SOLICITUDCOTAUTOSREQType>(_COTIZACIONAUTOSREQUEST_QNAME, SOLICITUDCOTAUTOSREQType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOLICITUDCOTAUTOSRESType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.zurich.com.mx/", name = "COTIZACION_AUTOS_RESPONSE")
    public JAXBElement<SOLICITUDCOTAUTOSRESType> createCOTIZACIONAUTOSRESPONSE(SOLICITUDCOTAUTOSRESType value) {
        return new JAXBElement<SOLICITUDCOTAUTOSRESType>(_COTIZACIONAUTOSRESPONSE_QNAME, SOLICITUDCOTAUTOSRESType.class, null, value);
    }

}
