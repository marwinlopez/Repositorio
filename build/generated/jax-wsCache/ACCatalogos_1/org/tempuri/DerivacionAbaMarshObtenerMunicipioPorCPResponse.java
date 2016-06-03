
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.abaseguros.ResObtenerMunicipioPorCP;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DerivacionAbaMarshObtenerMunicipioPorCPResult" type="{http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect}ResObtenerMunicipioPorCP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "derivacionAbaMarshObtenerMunicipioPorCPResult"
})
@XmlRootElement(name = "DerivacionAbaMarshObtenerMunicipioPorCPResponse")
public class DerivacionAbaMarshObtenerMunicipioPorCPResponse {

    @XmlElementRef(name = "DerivacionAbaMarshObtenerMunicipioPorCPResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResObtenerMunicipioPorCP> derivacionAbaMarshObtenerMunicipioPorCPResult;

    /**
     * Obtiene el valor de la propiedad derivacionAbaMarshObtenerMunicipioPorCPResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResObtenerMunicipioPorCP }{@code >}
     *     
     */
    public JAXBElement<ResObtenerMunicipioPorCP> getDerivacionAbaMarshObtenerMunicipioPorCPResult() {
        return derivacionAbaMarshObtenerMunicipioPorCPResult;
    }

    /**
     * Define el valor de la propiedad derivacionAbaMarshObtenerMunicipioPorCPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResObtenerMunicipioPorCP }{@code >}
     *     
     */
    public void setDerivacionAbaMarshObtenerMunicipioPorCPResult(JAXBElement<ResObtenerMunicipioPorCP> value) {
        this.derivacionAbaMarshObtenerMunicipioPorCPResult = value;
    }

}
