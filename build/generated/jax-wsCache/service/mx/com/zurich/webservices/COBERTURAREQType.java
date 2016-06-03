
package mx.com.zurich.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COBERTURA_REQ_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COBERTURA_REQ_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_cobertura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="monto_asegurado">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="porcentaje_deducible">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_seleccion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COBERTURA_REQ_Type", propOrder = {
    "idCobertura",
    "montoAsegurado",
    "porcentajeDeducible",
    "idSeleccion"
})
public class COBERTURAREQType {

    @XmlElement(name = "id_cobertura")
    protected int idCobertura;
    @XmlElement(name = "monto_asegurado", required = true)
    protected BigDecimal montoAsegurado;
    @XmlElement(name = "porcentaje_deducible")
    protected int porcentajeDeducible;
    @XmlElement(name = "id_seleccion")
    protected int idSeleccion;

    /**
     * Obtiene el valor de la propiedad idCobertura.
     * 
     */
    public int getIdCobertura() {
        return idCobertura;
    }

    /**
     * Define el valor de la propiedad idCobertura.
     * 
     */
    public void setIdCobertura(int value) {
        this.idCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoAsegurado() {
        return montoAsegurado;
    }

    /**
     * Define el valor de la propiedad montoAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoAsegurado(BigDecimal value) {
        this.montoAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDeducible.
     * 
     */
    public int getPorcentajeDeducible() {
        return porcentajeDeducible;
    }

    /**
     * Define el valor de la propiedad porcentajeDeducible.
     * 
     */
    public void setPorcentajeDeducible(int value) {
        this.porcentajeDeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad idSeleccion.
     * 
     */
    public int getIdSeleccion() {
        return idSeleccion;
    }

    /**
     * Define el valor de la propiedad idSeleccion.
     * 
     */
    public void setIdSeleccion(int value) {
        this.idSeleccion = value;
    }

}
