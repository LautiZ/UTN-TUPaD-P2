/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author zullo
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco bancoTarjeta;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco bancoTarjeta) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.bancoTarjeta = bancoTarjeta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        if (cliente != null) {
            return cliente;
        } else {
            return null;
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }

    public Banco getBancoTarjeta() {
        return bancoTarjeta;
    }

    public void setBancoTarjeta(Banco bancoTarjeta) {
        this.bancoTarjeta = bancoTarjeta;
    }
    
    
}
