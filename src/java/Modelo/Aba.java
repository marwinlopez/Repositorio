package Modelo;

public class Aba {
    private Integer clave;
    private String descripcion;

    public Aba() {
        clave=0;
        descripcion="";
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
