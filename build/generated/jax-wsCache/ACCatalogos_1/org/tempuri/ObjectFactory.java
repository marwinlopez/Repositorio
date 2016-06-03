
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.abaseguros.ReqObtenerMunicipioPorCP;
import org.datacontract.schemas._2004._07.abaseguros.ResObtenerMunicipioPorCP;
import org.datacontract.schemas._2004._07.abaseguros.Token;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _Token_QNAME = new QName("http://tempuri.org/", "Token");
    private final static QName _DerivacionAbaMarshObtenerMunicipioPorCPResponseDerivacionAbaMarshObtenerMunicipioPorCPResult_QNAME = new QName("http://tempuri.org/", "DerivacionAbaMarshObtenerMunicipioPorCPResult");
    private final static QName _DerivacionAbaMarshObtenerMunicipioPorCPEntrada_QNAME = new QName("http://tempuri.org/", "_entrada");
    private final static QName _SalidaStrSalida_QNAME = new QName("http://tempuri.org/", "strSalida");
    private final static QName _EntradaStrEntrada_QNAME = new QName("http://tempuri.org/", "strEntrada");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DerivacionAbaMarshObtenerMunicipioPorCP }
     * 
     */
    public DerivacionAbaMarshObtenerMunicipioPorCP createDerivacionAbaMarshObtenerMunicipioPorCP() {
        return new DerivacionAbaMarshObtenerMunicipioPorCP();
    }

    /**
     * Create an instance of {@link DerivacionAbaMarshObtenerMunicipioPorCPResponse }
     * 
     */
    public DerivacionAbaMarshObtenerMunicipioPorCPResponse createDerivacionAbaMarshObtenerMunicipioPorCPResponse() {
        return new DerivacionAbaMarshObtenerMunicipioPorCPResponse();
    }

    /**
     * Create an instance of {@link Entrada }
     * 
     */
    public Entrada createEntrada() {
        return new Entrada();
    }

    /**
     * Create an instance of {@link Salida }
     * 
     */
    public Salida createSalida() {
        return new Salida();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResObtenerMunicipioPorCP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DerivacionAbaMarshObtenerMunicipioPorCPResult", scope = DerivacionAbaMarshObtenerMunicipioPorCPResponse.class)
    public JAXBElement<ResObtenerMunicipioPorCP> createDerivacionAbaMarshObtenerMunicipioPorCPResponseDerivacionAbaMarshObtenerMunicipioPorCPResult(ResObtenerMunicipioPorCP value) {
        return new JAXBElement<ResObtenerMunicipioPorCP>(_DerivacionAbaMarshObtenerMunicipioPorCPResponseDerivacionAbaMarshObtenerMunicipioPorCPResult_QNAME, ResObtenerMunicipioPorCP.class, DerivacionAbaMarshObtenerMunicipioPorCPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqObtenerMunicipioPorCP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_entrada", scope = DerivacionAbaMarshObtenerMunicipioPorCP.class)
    public JAXBElement<ReqObtenerMunicipioPorCP> createDerivacionAbaMarshObtenerMunicipioPorCPEntrada(ReqObtenerMunicipioPorCP value) {
        return new JAXBElement<ReqObtenerMunicipioPorCP>(_DerivacionAbaMarshObtenerMunicipioPorCPEntrada_QNAME, ReqObtenerMunicipioPorCP.class, DerivacionAbaMarshObtenerMunicipioPorCP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strSalida", scope = Salida.class)
    public JAXBElement<String> createSalidaStrSalida(String value) {
        return new JAXBElement<String>(_SalidaStrSalida_QNAME, String.class, Salida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strEntrada", scope = Entrada.class)
    public JAXBElement<String> createEntradaStrEntrada(String value) {
        return new JAXBElement<String>(_EntradaStrEntrada_QNAME, String.class, Entrada.class, value);
    }

}
