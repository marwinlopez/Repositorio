
package mx.com.zurich.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PAQUETE_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PAQUETE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_paquete">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcion_paquete">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COBERTURA" type="{http://webservices.zurich.com.mx/}COBERTURA_Type" maxOccurs="25" minOccurs="0"/>
 *         &lt;element name="FORMA_PAGO" type="{http://webservices.zurich.com.mx/}FORMA_PAGO_Type" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAQUETE_Type", propOrder = {
    "idPaquete",
    "descripcionPaquete",
    "cobertura",
    "formapago"
})
public class PAQUETEType {

    @XmlElement(name = "id_paquete")
    protected int idPaquete;
    @XmlElement(name = "descripcion_paquete", required = true)
    protected String descripcionPaquete;
    @XmlElement(name = "COBERTURA")
    protected List<COBERTURAType> cobertura;
    @XmlElement(name = "FORMA_PAGO")
    protected List<FORMAPAGOType> formapago;

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
     * Obtiene el valor de la propiedad descripcionPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPaquete() {
        return descripcionPaquete;
    }

    /**
     * Define el valor de la propiedad descripcionPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPaquete(String value) {
        this.descripcionPaquete = value;
    }

    /**
     * Gets the value of the cobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOBERTURA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COBERTURAType }
     * 
     * 
     */
    public List<COBERTURAType> getCOBERTURA() {
        if (cobertura == null) {
            cobertura = new ArrayList<COBERTURAType>();
        }
        return this.cobertura;
    }

    /**
     * Gets the value of the formapago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formapago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFORMAPAGO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FORMAPAGOType }
     * 
     * 
     */
    public List<FORMAPAGOType> getFORMAPAGO() {
        if (formapago == null) {
            formapago = new ArrayList<FORMAPAGOType>();
        }
        return this.formapago;
    }

}
