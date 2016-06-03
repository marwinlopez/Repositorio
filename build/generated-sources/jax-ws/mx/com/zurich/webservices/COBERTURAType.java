
package mx.com.zurich.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COBERTURA_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COBERTURA_Type">
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
 *         &lt;element name="descripcion_cobertura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipo_cobertura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
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
 *         &lt;element name="ppdm_deducible">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prima">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_modifMonto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_modifDeducible">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
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
 *         &lt;element name="id_descBien">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_mensajeCob">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
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
@XmlType(name = "COBERTURA_Type", propOrder = {
    "idCobertura",
    "descripcionCobertura",
    "tipoCobertura",
    "montoAsegurado",
    "porcentajeDeducible",
    "ppdmDeducible",
    "prima",
    "idModifMonto",
    "idModifDeducible",
    "idSeleccion",
    "idDescBien",
    "idMensajeCob"
})
public class COBERTURAType {

    @XmlElement(name = "id_cobertura")
    protected int idCobertura;
    @XmlElement(name = "descripcion_cobertura", required = true)
    protected String descripcionCobertura;
    @XmlElement(name = "tipo_cobertura")
    protected int tipoCobertura;
    @XmlElement(name = "monto_asegurado", required = true)
    protected BigDecimal montoAsegurado;
    @XmlElement(name = "porcentaje_deducible")
    protected int porcentajeDeducible;
    @XmlElement(name = "ppdm_deducible", required = true)
    protected BigDecimal ppdmDeducible;
    @XmlElement(required = true)
    protected BigDecimal prima;
    @XmlElement(name = "id_modifMonto")
    protected int idModifMonto;
    @XmlElement(name = "id_modifDeducible")
    protected int idModifDeducible;
    @XmlElement(name = "id_seleccion")
    protected int idSeleccion;
    @XmlElement(name = "id_descBien")
    protected int idDescBien;
    @XmlElement(name = "id_mensajeCob")
    protected int idMensajeCob;

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
     * Obtiene el valor de la propiedad descripcionCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCobertura() {
        return descripcionCobertura;
    }

    /**
     * Define el valor de la propiedad descripcionCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCobertura(String value) {
        this.descripcionCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCobertura.
     * 
     */
    public int getTipoCobertura() {
        return tipoCobertura;
    }

    /**
     * Define el valor de la propiedad tipoCobertura.
     * 
     */
    public void setTipoCobertura(int value) {
        this.tipoCobertura = value;
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
     * Obtiene el valor de la propiedad ppdmDeducible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPpdmDeducible() {
        return ppdmDeducible;
    }

    /**
     * Define el valor de la propiedad ppdmDeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPpdmDeducible(BigDecimal value) {
        this.ppdmDeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad prima.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrima() {
        return prima;
    }

    /**
     * Define el valor de la propiedad prima.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrima(BigDecimal value) {
        this.prima = value;
    }

    /**
     * Obtiene el valor de la propiedad idModifMonto.
     * 
     */
    public int getIdModifMonto() {
        return idModifMonto;
    }

    /**
     * Define el valor de la propiedad idModifMonto.
     * 
     */
    public void setIdModifMonto(int value) {
        this.idModifMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad idModifDeducible.
     * 
     */
    public int getIdModifDeducible() {
        return idModifDeducible;
    }

    /**
     * Define el valor de la propiedad idModifDeducible.
     * 
     */
    public void setIdModifDeducible(int value) {
        this.idModifDeducible = value;
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

    /**
     * Obtiene el valor de la propiedad idDescBien.
     * 
     */
    public int getIdDescBien() {
        return idDescBien;
    }

    /**
     * Define el valor de la propiedad idDescBien.
     * 
     */
    public void setIdDescBien(int value) {
        this.idDescBien = value;
    }

    /**
     * Obtiene el valor de la propiedad idMensajeCob.
     * 
     */
    public int getIdMensajeCob() {
        return idMensajeCob;
    }

    /**
     * Define el valor de la propiedad idMensajeCob.
     * 
     */
    public void setIdMensajeCob(int value) {
        this.idMensajeCob = value;
    }

}
