
package org.datacontract.schemas._2004._07.abaseguros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReqObtenerMunicipioPorCP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReqObtenerMunicipioPorCP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect}Token" minOccurs="0"/>
 *         &lt;element name="strEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqObtenerMunicipioPorCP", propOrder = {
    "token",
    "strEntrada"
})
public class ReqObtenerMunicipioPorCP {

    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", type = JAXBElement.class, required = false)
    protected JAXBElement<Token> token;
    @XmlElementRef(name = "strEntrada", namespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEntrada;

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Token }{@code >}
     *     
     */
    public JAXBElement<Token> getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Token }{@code >}
     *     
     */
    public void setToken(JAXBElement<Token> value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad strEntrada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrEntrada() {
        return strEntrada;
    }

    /**
     * Define el valor de la propiedad strEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrEntrada(JAXBElement<String> value) {
        this.strEntrada = value;
    }

}
