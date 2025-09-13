/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author zullo
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, String modeloBateria, double capacidad) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = new Bateria(modeloBateria, capacidad);
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void getUsuario() {
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre());
        } else {
            System.out.println("No tiene usuario");
        }
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
