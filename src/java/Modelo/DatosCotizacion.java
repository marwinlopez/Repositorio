
package Modelo;

public class DatosCotizacion {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String email;
    private String telefono;
    private String rfc;
    private String serie;
    private String cp;
    private String calle;
    private String exterior;
    private String interior;
    private String estado;
    private String delegacion;
    private String colonia;
    private String celular;
    private boolean amanteauto;
    private boolean autosiempre;

    public DatosCotizacion(String nombre, String apaterno, String amaterno, String email, String telefono, String rfc, String serie, String cp, String calle, String exterior, String interior, String estado, String delegacion, String colonia, String celular, boolean amanteauto, boolean autosiempre) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.email = email;
        this.telefono = telefono;
        this.rfc = rfc;
        this.serie = serie;
        this.cp = cp;
        this.calle = calle;
        this.exterior = exterior;
        this.interior = interior;
        this.estado = estado;
        this.delegacion = delegacion;
        this.colonia = colonia;
        this.celular = celular;
        this.amanteauto = amanteauto;
        this.autosiempre = autosiempre;
    }

    public boolean isAmanteauto() {
        return amanteauto;
    }

    public void setAmanteauto(boolean amanteauto) {
        this.amanteauto = amanteauto;
    }

    public boolean isAutosiempre() {
        return autosiempre;
    }

    public void setAutosiempre(boolean autosiempre) {
        this.autosiempre = autosiempre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apaterno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apaterno = apellidoPaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }
    
    
}
