/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author zullo
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void getCelular() {
        if (celular != null) {
            System.out.println("Titular: " + celular.getImei());
        } else {
            System.out.println("No tiene titular");
        }
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        
        if (celular != null) {
            celular.setUsuario(this); // Llama a setCoche en Matricula
        }
    }
    
    
}
