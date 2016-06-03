
package mx.com.zurich.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SOLICITUD_COT_AUTOS_RES_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOLICITUD_COT_AUTOS_RES_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="num_response">
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
 *         &lt;element name="seq_paquetes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAQUETE" type="{http://webservices.zurich.com.mx/}PAQUETE_Type" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLICITUD_COT_AUTOS_RES_Type", propOrder = {
    "status",
    "mensaje",
    "numResponse",
    "folioCotizacion",
    "seqPaquetes",
    "paquete"
})
public class SOLICITUDCOTAUTOSRESType {

    protected int status;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(name = "num_response")
    protected int numResponse;
    @XmlElement(name = "folio_cotizacion")
    protected int folioCotizacion;
    @XmlElement(name = "seq_paquetes")
    protected int seqPaquetes;
    @XmlElement(name = "PAQUETE")
    protected List<PAQUETEType> paquete;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numResponse.
     * 
     */
    public int getNumResponse() {
        return numResponse;
    }

    /**
     * Define el valor de la propiedad numResponse.
     * 
     */
    public void setNumResponse(int value) {
        this.numResponse = value;
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
     * Obtiene el valor de la propiedad seqPaquetes.
     * 
     */
    public int getSeqPaquetes() {
        return seqPaquetes;
    }

    /**
     * Define el valor de la propiedad seqPaquetes.
     * 
     */
    public void setSeqPaquetes(int value) {
        this.seqPaquetes = value;
    }

    /**
     * Gets the value of the paquete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paquete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAQUETE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAQUETEType }
     * 
     * 
     */
    public List<PAQUETEType> getPAQUETE() {
        if (paquete == null) {
            paquete = new ArrayList<PAQUETEType>();
        }
        return this.paquete;
    }

}
