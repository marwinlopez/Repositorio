/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotizador;

/**
 *
 * @author Luis
 */
public class HdiCotizador {
    private String zona1;
    private String anual;
    private String semestral;
    
    private String primaTotal;

    public String getPrimaTotal() {
        return primaTotal;
    }

    public void setPrimaTotal(String primaTotal) {
        this.primaTotal = primaTotal;
    }

    public String getAnual() {
        return anual;
    }

    public void setAnual(String anual) {
        this.anual = anual;
    }

    public String getSemestral() {
        return semestral;
    }

    public void setSemestral(String semestral) {
        this.semestral = semestral;
    }
    

    public String getZona1() {
        return zona1;
    }

    public void setZona1(String zona1) {
        this.zona1 = zona1;
    }
    
}
