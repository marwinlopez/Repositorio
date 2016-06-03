
package mx.com.zurich.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FORMA_PAGO_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FORMA_PAGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_forma_pago">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descripcion_forma_pago">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numero_pagos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pago_inicial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pago_subsecuente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prima_neta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="derechos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="recargos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iva">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prima_total">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "FORMA_PAGO_Type", propOrder = {
    "idFormaPago",
    "descripcionFormaPago",
    "numeroPagos",
    "pagoInicial",
    "pagoSubsecuente",
    "primaNeta",
    "derechos",
    "recargos",
    "iva",
    "primaTotal"
})
public class FORMAPAGOType {

    @XmlElement(name = "id_forma_pago", required = true)
    protected String idFormaPago;
    @XmlElement(name = "descripcion_forma_pago", required = true)
    protected String descripcionFormaPago;
    @XmlElement(name = "numero_pagos")
    protected int numeroPagos;
    @XmlElement(name = "pago_inicial", required = true)
    protected BigDecimal pagoInicial;
    @XmlElement(name = "pago_subsecuente", required = true)
    protected BigDecimal pagoSubsecuente;
    @XmlElement(name = "prima_neta", required = true)
    protected BigDecimal primaNeta;
    @XmlElement(required = true)
    protected BigDecimal derechos;
    @XmlElement(required = true)
    protected BigDecimal recargos;
    @XmlElement(required = true)
    protected BigDecimal iva;
    @XmlElement(name = "prima_total", required = true)
    protected BigDecimal primaTotal;

    /**
     * Obtiene el valor de la propiedad idFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFormaPago() {
        return idFormaPago;
    }

    /**
     * Define el valor de la propiedad idFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFormaPago(String value) {
        this.idFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFormaPago() {
        return descripcionFormaPago;
    }

    /**
     * Define el valor de la propiedad descripcionFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFormaPago(String value) {
        this.descripcionFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPagos.
     * 
     */
    public int getNumeroPagos() {
        return numeroPagos;
    }

    /**
     * Define el valor de la propiedad numeroPagos.
     * 
     */
    public void setNumeroPagos(int value) {
        this.numeroPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoInicial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagoInicial() {
        return pagoInicial;
    }

    /**
     * Define el valor de la propiedad pagoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagoInicial(BigDecimal value) {
        this.pagoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoSubsecuente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagoSubsecuente() {
        return pagoSubsecuente;
    }

    /**
     * Define el valor de la propiedad pagoSubsecuente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagoSubsecuente(BigDecimal value) {
        this.pagoSubsecuente = value;
    }

    /**
     * Obtiene el valor de la propiedad primaNeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaNeta() {
        return primaNeta;
    }

    /**
     * Define el valor de la propiedad primaNeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaNeta(BigDecimal value) {
        this.primaNeta = value;
    }

    /**
     * Obtiene el valor de la propiedad derechos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDerechos() {
        return derechos;
    }

    /**
     * Define el valor de la propiedad derechos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDerechos(BigDecimal value) {
        this.derechos = value;
    }

    /**
     * Obtiene el valor de la propiedad recargos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecargos() {
        return recargos;
    }

    /**
     * Define el valor de la propiedad recargos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecargos(BigDecimal value) {
        this.recargos = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIva(BigDecimal value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad primaTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaTotal() {
        return primaTotal;
    }

    /**
     * Define el valor de la propiedad primaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaTotal(BigDecimal value) {
        this.primaTotal = value;
    }

}
