/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author zullo
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Total: " + (impuesto.getMonto() * 1.21));
    }
}
