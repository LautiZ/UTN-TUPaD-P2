/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author zullo
 */
public class CuentaBancaria {
    private String cbu;
    private double salgo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double salgo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.salgo = salgo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSalgo() {
        return salgo;
    }

    public void setSalgo(double salgo) {
        this.salgo = salgo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        if (titular != null) {
            return titular;
        } else {
            return null;
        }
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        
        if (titular != null) {
            titular.setCuentaBancaria(this);
        }
    }
    
    
}
