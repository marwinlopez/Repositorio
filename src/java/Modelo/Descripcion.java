package Modelo;

public class Descripcion {
    private int idmarca;
    private String marca;
    private int idsubmarca;
    private String submarca;
    private int modelo;
    private int anio;
    private int idcotizacion;

    public Descripcion() {
        idmarca = 0;
        marca = "";
        idsubmarca = 0;
        submarca = "";
        modelo = 0;
        anio = 0;
    }

    public int getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(int idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdsubmarca() {
        return idsubmarca;
    }

    public void setIdsubmarca(int idsubmarca) {
        this.idsubmarca = idsubmarca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

   
}
