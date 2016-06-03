package Modelo;

public class CodigoPostal {
    private int idedo;
    private String nombedo;
    private int idmcpo;
    private String nombmcpo;
    private String  codpos;
    private String localidad;

    public CodigoPostal() {
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getIdedo() {
        return idedo;
    }

    public void setIdedo(int idedo) {
        this.idedo = idedo;
    }

    public String getNombedo() {
        return nombedo;
    }

    public void setNombedo(String nombedo) {
        this.nombedo = nombedo;
    }

    public int getIdmcpo() {
        return idmcpo;
    }

    public void setIdmcpo(int idmcpo) {
        this.idmcpo = idmcpo;
    }

    public String getNombmcpo() {
        return nombmcpo;
    }

    public void setNombmcpo(String nombmcpo) {
        this.nombmcpo = nombmcpo;
    }   

    public String getCodpos() {
        return codpos;
    }

    public void setCodpos(String codpos) {
        this.codpos = codpos;
    }

    

}
