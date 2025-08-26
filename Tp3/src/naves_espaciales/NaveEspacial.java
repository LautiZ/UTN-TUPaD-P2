/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naves_espaciales;

/**
 *
 * @author zullo
 */
public class NaveEspacial {
    private String _nombre;
    private int _combustible;

    public NaveEspacial(String nombre, int combustible) {
        this._nombre = nombre;
        this._combustible = combustible;
    }
    
    public void despegar() {
        System.out.println("La nave despego");
    }
    
    private boolean combustibleDisponible(int cantidad) {
        return this._combustible >= cantidad;
    }
    
    public String avanzar(int distancia) {
        if (this.combustibleDisponible(distancia)){
            this._combustible -= distancia;
            return "Avanzo: " + distancia + " casillas, quedan " + this._combustible + " unidades de combustible";
        }
        return "No alcanza el combustible.";
    }
    
    public String recargarCombustible(int cantidad) {
        if ((this._combustible + cantidad) > 100) {
            cantidad = this._combustible + cantidad - 100;
            this._combustible = 100;            
            return "Combustible al maximo, sobro " + cantidad;
        }
        
        this._combustible += cantidad;
        return "Nueva cantidad de combustible: " + this._combustible;
    }
    
    public String mostrarEstado() {
        return this._nombre + " " + this._combustible;
    }
}
