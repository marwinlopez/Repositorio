/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis
 */
public class Cotizacion {

    public void setId_cotizacion(String id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public void setId_aseguradora(String id_aseguradora) {
        this.id_aseguradora = id_aseguradora;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    public void setId_submarca(String id_submarca) {
        this.id_submarca = id_submarca;
    }

    public void setId_anio(Integer id_anio) {
        this.id_anio = id_anio;
    }

    public void setId_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

    public void setId_clave_aseguradora(String id_clave_aseguradora) {
        this.id_clave_aseguradora = id_clave_aseguradora;
    }

    public void setFecha_cotizacion(String fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public void setNombre_contratante(String nombre_contratante) {
        this.nombre_contratante = nombre_contratante;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(String metododepago) {
        this.metododepago = metododepago;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setNo_ext(String no_ext) {
        this.no_ext = no_ext;
    }

    public void setNo_int(String no_int) {
        this.no_int = no_int;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public void setCobertura_auto_siempre(Boolean cobertura_auto_siempre) {
        this.cobertura_auto_siempre = cobertura_auto_siempre;
    }

    public void setCobertura_auto_amante(Boolean cobertura_auto_amante) {
        this.cobertura_auto_amante = cobertura_auto_amante;
    }
String    id_cotizacion;
String    id_aseguradora;
String    id_marca;
String    id_submarca;
Integer   id_anio;
String    id_modelo;
String    id_clave_aseguradora;
String    fecha_cotizacion;
String    tipo_pago;
String    monto;
String    nombre_contratante;
String    apellido_paterno;
String    apellido_materno;
String    mail;
String    telefono;
String    rfc;
String    serie;
String    cp;
String    call;
String    no_ext;
String    no_int;
String    estado;
String    delegacion;
String    colonia;
String    forma_pago;
Boolean   cobertura_auto_siempre;
Boolean   cobertura_auto_amante;
String    metododepago;
String    primernombre;
String    segundonombre;
String    numerotarjeta;
String    fechavencimiento;
String    cvc;
String    banco;
String    celular;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getId_cotizacion() {
        return id_cotizacion;
    }

    public String getId_aseguradora() {
        return id_aseguradora;
    }

    public String getId_marca() {
        return id_marca;
    }

    public String getId_submarca() {
        return id_submarca;
    }

    public Integer getId_anio() {
        return id_anio;
    }

    public String getId_modelo() {
        return id_modelo;
    }

    public String getId_clave_aseguradora() {
        return id_clave_aseguradora;
    }

    public String getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public String getMonto() {
        return monto;
    }

    public String getNombre_contratante() {
        return nombre_contratante;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public String getSerie() {
        return serie;
    }

    public String getCp() {
        return cp;
    }

    public String getCall() {
        return call;
    }

    public String getNo_ext() {
        return no_ext;
    }

    public String getNo_int() {
        return no_int;
    }

    public String getEstado() {
        return estado;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public String getColonia() {
        return colonia;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public Boolean getCobertura_auto_siempre() {
        return cobertura_auto_siempre;
    }

    public Boolean getCobertura_auto_amante() {
        return cobertura_auto_amante;
    }
    
    
}
