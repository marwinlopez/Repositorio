
package mx.com.zurich.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SOLICITUD_COT_AUTOS_REQ_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOLICITUD_COT_AUTOS_REQ_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_req">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="usuario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idOficina">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="programaComercial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoVehiculo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cve_zurich">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modelo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_estado">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_ciudad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_tipoValor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_tipoUso">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cve_agente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipo_producto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipo_carga">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipo_persona">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="edad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="genero">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoCivil">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ocupacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="giro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nacionalidad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id_moneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fecha_inicio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fecha_fin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vigencia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="2"/>
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
 *         &lt;element name="codigoPostal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONDICIONES" type="{http://webservices.zurich.com.mx/}RECOTIZACION_AUTOS_REQ_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLICITUD_COT_AUTOS_REQ_Type", propOrder = {
    "numReq",
    "usuario",
    "password",
    "idOficina",
    "programaComercial",
    "tipoVehiculo",
    "cveZurich",
    "modelo",
    "idEstado",
    "idCiudad",
    "idTipoValor",
    "idTipoUso",
    "cveAgente",
    "tipoProducto",
    "tipoCarga",
    "tipoPersona",
    "edad",
    "genero",
    "estadoCivil",
    "ocupacion",
    "giro",
    "nacionalidad",
    "idMoneda",
    "fechaInicio",
    "fechaFin",
    "vigencia",
    "montoAsegurado",
    "codigoPostal",
    "condiciones"
})
public class SOLICITUDCOTAUTOSREQType {

    @XmlElement(name = "num_req")
    protected int numReq;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String password;
    protected int idOficina;
    protected int programaComercial;
    protected int tipoVehiculo;
    @XmlElement(name = "cve_zurich", required = true)
    protected String cveZurich;
    protected int modelo;
    @XmlElement(name = "id_estado")
    protected int idEstado;
    @XmlElement(name = "id_ciudad")
    protected int idCiudad;
    @XmlElement(name = "id_tipoValor")
    protected int idTipoValor;
    @XmlElement(name = "id_tipoUso")
    protected int idTipoUso;
    @XmlElement(name = "cve_agente")
    protected int cveAgente;
    @XmlElement(name = "tipo_producto")
    protected int tipoProducto;
    @XmlElement(name = "tipo_carga")
    protected int tipoCarga;
    @XmlElement(name = "tipo_persona", required = true)
    protected String tipoPersona;
    protected int edad;
    @XmlElement(required = true)
    protected String genero;
    protected int estadoCivil;
    protected int ocupacion;
    protected int giro;
    protected int nacionalidad;
    @XmlElement(name = "id_moneda")
    protected int idMoneda;
    @XmlElement(name = "fecha_inicio")
    protected int fechaInicio;
    @XmlElement(name = "fecha_fin")
    protected Integer fechaFin;
    protected int vigencia;
    @XmlElement(name = "monto_asegurado", required = true)
    protected BigDecimal montoAsegurado;
    protected int codigoPostal;
    @XmlElement(name = "CONDICIONES")
    protected RECOTIZACIONAUTOSREQType condiciones;

    /**
     * Obtiene el valor de la propiedad numReq.
     * 
     */
    public int getNumReq() {
        return numReq;
    }

    /**
     * Define el valor de la propiedad numReq.
     * 
     */
    public void setNumReq(int value) {
        this.numReq = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficina.
     * 
     */
    public int getIdOficina() {
        return idOficina;
    }

    /**
     * Define el valor de la propiedad idOficina.
     * 
     */
    public void setIdOficina(int value) {
        this.idOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad programaComercial.
     * 
     */
    public int getProgramaComercial() {
        return programaComercial;
    }

    /**
     * Define el valor de la propiedad programaComercial.
     * 
     */
    public void setProgramaComercial(int value) {
        this.programaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVehiculo.
     * 
     */
    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Define el valor de la propiedad tipoVehiculo.
     * 
     */
    public void setTipoVehiculo(int value) {
        this.tipoVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad cveZurich.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveZurich() {
        return cveZurich;
    }

    /**
     * Define el valor de la propiedad cveZurich.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveZurich(String value) {
        this.cveZurich = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     */
    public void setModelo(int value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstado.
     * 
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * Define el valor de la propiedad idEstado.
     * 
     */
    public void setIdEstado(int value) {
        this.idEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idCiudad.
     * 
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Define el valor de la propiedad idCiudad.
     * 
     */
    public void setIdCiudad(int value) {
        this.idCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoValor.
     * 
     */
    public int getIdTipoValor() {
        return idTipoValor;
    }

    /**
     * Define el valor de la propiedad idTipoValor.
     * 
     */
    public void setIdTipoValor(int value) {
        this.idTipoValor = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoUso.
     * 
     */
    public int getIdTipoUso() {
        return idTipoUso;
    }

    /**
     * Define el valor de la propiedad idTipoUso.
     * 
     */
    public void setIdTipoUso(int value) {
        this.idTipoUso = value;
    }

    /**
     * Obtiene el valor de la propiedad cveAgente.
     * 
     */
    public int getCveAgente() {
        return cveAgente;
    }

    /**
     * Define el valor de la propiedad cveAgente.
     * 
     */
    public void setCveAgente(int value) {
        this.cveAgente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     */
    public int getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     */
    public void setTipoProducto(int value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarga.
     * 
     */
    public int getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define el valor de la propiedad tipoCarga.
     * 
     */
    public void setTipoCarga(int value) {
        this.tipoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     */
    public int getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     */
    public void setEstadoCivil(int value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacion.
     * 
     */
    public int getOcupacion() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     * 
     */
    public void setOcupacion(int value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad giro.
     * 
     */
    public int getGiro() {
        return giro;
    }

    /**
     * Define el valor de la propiedad giro.
     * 
     */
    public void setGiro(int value) {
        this.giro = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     */
    public int getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     */
    public void setNacionalidad(int value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idMoneda.
     * 
     */
    public int getIdMoneda() {
        return idMoneda;
    }

    /**
     * Define el valor de la propiedad idMoneda.
     * 
     */
    public void setIdMoneda(int value) {
        this.idMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     */
    public int getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     */
    public void setFechaInicio(int value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFechaFin(Integer value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     */
    public int getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     */
    public void setVigencia(int value) {
        this.vigencia = value;
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
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     */
    public void setCodigoPostal(int value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad condiciones.
     * 
     * @return
     *     possible object is
     *     {@link RECOTIZACIONAUTOSREQType }
     *     
     */
    public RECOTIZACIONAUTOSREQType getCONDICIONES() {
        return condiciones;
    }

    /**
     * Define el valor de la propiedad condiciones.
     * 
     * @param value
     *     allowed object is
     *     {@link RECOTIZACIONAUTOSREQType }
     *     
     */
    public void setCONDICIONES(RECOTIZACIONAUTOSREQType value) {
        this.condiciones = value;
    }

}
