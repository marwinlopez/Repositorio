
package Modelo;

public class Tarjeta {
    private String primernombre;
    private String segundonombre;
    private String numerotarjeta;
    private String fechavencimiento;
    private String cvc;
    private String metodopago;
    private String banco;
  

    public Tarjeta(String primernombre, String segundonombre, String numerotarjeta, String fechavencimiento, String cvc, String metodopago, String banco) {
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.numerotarjeta = numerotarjeta;
        this.fechavencimiento = fechavencimiento;
        this.cvc = cvc;
        this.metodopago = metodopago;
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    
    
    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public String getprimernombre() {
        return primernombre;
    }

    public void setprimernombre(String primernombre) {
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

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    
    
    
    
}
