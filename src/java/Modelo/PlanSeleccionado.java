
package Modelo;

public class PlanSeleccionado {
    private String aseguradora;
    private String descripcion;
    private String plan;
    private String valor;

    public PlanSeleccionado(String aseguradora, String descripcion, String plan, String valor) {
        this.aseguradora = aseguradora;
        this.descripcion = descripcion;
        this.plan = plan;
        this.valor = valor;
    }
    
    

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
  
    
    
}
