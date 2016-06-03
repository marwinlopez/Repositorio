
package org.datacontract.schemas._2004._07.abaseguros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.abaseguros package. 
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

    private final static QName _Token_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "Token");
    private final static QName _ReqObtenerMunicipioPorCP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "ReqObtenerMunicipioPorCP");
    private final static QName _ResObtenerMunicipioPorCP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "ResObtenerMunicipioPorCP");
    private final static QName _Error_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "Error");
    private final static QName _TokenReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "referencia");
    private final static QName _TokenUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "usuario");
    private final static QName _TokenPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "password");
    private final static QName _ResObtenerMunicipioPorCPError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "error");
    private final static QName _ResObtenerMunicipioPorCPStrSalida_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "strSalida");
    private final static QName _ErrorOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "Origen");
    private final static QName _ErrorStackTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "StackTrace");
    private final static QName _ErrorMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "Mensaje");
    private final static QName _ReqObtenerMunicipioPorCPStrEntrada_QNAME = new QName("http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", "strEntrada");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.abaseguros
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReqObtenerMunicipioPorCP }
     * 
     */
    public ReqObtenerMunicipioPorCP createReqObtenerMunicipioPorCP() {
        return new ReqObtenerMunicipioPorCP();
    }

    /**
     * Create an instance of {@link ResObtenerMunicipioPorCP }
     * 
     */
    public ResObtenerMunicipioPorCP createResObtenerMunicipioPorCP() {
        return new ResObtenerMunicipioPorCP();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "Token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqObtenerMunicipioPorCP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "ReqObtenerMunicipioPorCP")
    public JAXBElement<ReqObtenerMunicipioPorCP> createReqObtenerMunicipioPorCP(ReqObtenerMunicipioPorCP value) {
        return new JAXBElement<ReqObtenerMunicipioPorCP>(_ReqObtenerMunicipioPorCP_QNAME, ReqObtenerMunicipioPorCP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResObtenerMunicipioPorCP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "ResObtenerMunicipioPorCP")
    public JAXBElement<ResObtenerMunicipioPorCP> createResObtenerMunicipioPorCP(ResObtenerMunicipioPorCP value) {
        return new JAXBElement<ResObtenerMunicipioPorCP>(_ResObtenerMunicipioPorCP_QNAME, ResObtenerMunicipioPorCP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "referencia", scope = Token.class)
    public JAXBElement<String> createTokenReferencia(String value) {
        return new JAXBElement<String>(_TokenReferencia_QNAME, String.class, Token.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "usuario", scope = Token.class)
    public JAXBElement<String> createTokenUsuario(String value) {
        return new JAXBElement<String>(_TokenUsuario_QNAME, String.class, Token.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "password", scope = Token.class)
    public JAXBElement<String> createTokenPassword(String value) {
        return new JAXBElement<String>(_TokenPassword_QNAME, String.class, Token.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "error", scope = ResObtenerMunicipioPorCP.class)
    public JAXBElement<String> createResObtenerMunicipioPorCPError(String value) {
        return new JAXBElement<String>(_ResObtenerMunicipioPorCPError_QNAME, String.class, ResObtenerMunicipioPorCP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "strSalida", scope = ResObtenerMunicipioPorCP.class)
    public JAXBElement<String> createResObtenerMunicipioPorCPStrSalida(String value) {
        return new JAXBElement<String>(_ResObtenerMunicipioPorCPStrSalida_QNAME, String.class, ResObtenerMunicipioPorCP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "Origen", scope = Error.class)
    public JAXBElement<String> createErrorOrigen(String value) {
        return new JAXBElement<String>(_ErrorOrigen_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "StackTrace", scope = Error.class)
    public JAXBElement<String> createErrorStackTrace(String value) {
        return new JAXBElement<String>(_ErrorStackTrace_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "Mensaje", scope = Error.class)
    public JAXBElement<String> createErrorMensaje(String value) {
        return new JAXBElement<String>(_ErrorMensaje_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "Token", scope = ReqObtenerMunicipioPorCP.class)
    public JAXBElement<Token> createReqObtenerMunicipioPorCPToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, ReqObtenerMunicipioPorCP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", name = "strEntrada", scope = ReqObtenerMunicipioPorCP.class)
    public JAXBElement<String> createReqObtenerMunicipioPorCPStrEntrada(String value) {
        return new JAXBElement<String>(_ReqObtenerMunicipioPorCPStrEntrada_QNAME, String.class, ReqObtenerMunicipioPorCP.class, value);
    }

}
