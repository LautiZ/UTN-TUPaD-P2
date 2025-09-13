/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author zullo
 */
public class Computadora {
    private String marca;
    private String nroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String nroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.nroSerie = nroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        if (propietario != null) {
            return propietario;
        } else {
            return null;
        }
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        
        if (propietario != null) {
            propietario.setComputadora(this); // Llama a setCoche en Matricula
        }
    }
    
    
}
