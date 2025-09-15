/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author zullo
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        
        if (usuario != null) {
            codigoQR.setUsuario(usuario);
        }
        
        System.out.println(codigoQR.getValor() + " | " + codigoQR.getUsuario());
    }
}
