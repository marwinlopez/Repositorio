
package mx.com.zurich.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RECOTIZACION_AUTOS_REQ_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RECOTIZACION_AUTOS_REQ_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_resquest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="folio_cotizacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="porcentaje_descuento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="porcentaje_recargo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prima_objetivo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_paquete">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COBERTURA_OPCIONAL" type="{http://webservices.zurich.com.mx/}COBERTURA_REQ_Type" maxOccurs="25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECOTIZACION_AUTOS_REQ_Type", propOrder = {
    "numResquest",
    "folioCotizacion",
    "porcentajeDescuento",
    "porcentajeRecargo",
    "primaObjetivo",
    "idPaquete",
    "coberturaopcional"
})
public class RECOTIZACIONAUTOSREQType {

    @XmlElement(name = "num_resquest")
    protected int numResquest;
    @XmlElement(name = "folio_cotizacion")
    protected int folioCotizacion;
    @XmlElement(name = "porcentaje_descuento", required = true)
    protected BigDecimal porcentajeDescuento;
    @XmlElement(name = "porcentaje_recargo", required = true)
    protected BigDecimal porcentajeRecargo;
    @XmlElement(name = "prima_objetivo", required = true)
    protected BigDecimal primaObjetivo;
    @XmlElement(name = "id_paquete")
    protected int idPaquete;
    @XmlElement(name = "COBERTURA_OPCIONAL")
    protected List<COBERTURAREQType> coberturaopcional;

    /**
     * Obtiene el valor de la propiedad numResquest.
     * 
     */
    public int getNumResquest() {
        return numResquest;
    }

    /**
     * Define el valor de la propiedad numResquest.
     * 
     */
    public void setNumResquest(int value) {
        this.numResquest = value;
    }

    /**
     * Obtiene el valor de la propiedad folioCotizacion.
     * 
     */
    public int getFolioCotizacion() {
        return folioCotizacion;
    }

    /**
     * Define el valor de la propiedad folioCotizacion.
     * 
     */
    public void setFolioCotizacion(int value) {
        this.folioCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeDescuento(BigDecimal value) {
        this.porcentajeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeRecargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    /**
     * Define el valor de la propiedad porcentajeRecargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeRecargo(BigDecimal value) {
        this.porcentajeRecargo = value;
    }

    /**
     * Obtiene el valor de la propiedad primaObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaObjetivo() {
        return primaObjetivo;
    }

    /**
     * Define el valor de la propiedad primaObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaObjetivo(BigDecimal value) {
        this.primaObjetivo = value;
    }

    /**
     * Obtiene el valor de la propiedad idPaquete.
     * 
     */
    public int getIdPaquete() {
        return idPaquete;
    }

    /**
     * Define el valor de la propiedad idPaquete.
     * 
     */
    public void setIdPaquete(int value) {
        this.idPaquete = value;
    }

    /**
     * Gets the value of the coberturaopcional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coberturaopcional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOBERTURAOPCIONAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COBERTURAREQType }
     * 
     * 
     */
    public List<COBERTURAREQType> getCOBERTURAOPCIONAL() {
        if (coberturaopcional == null) {
            coberturaopcional = new ArrayList<COBERTURAREQType>();
        }
        return this.coberturaopcional;
    }

}
