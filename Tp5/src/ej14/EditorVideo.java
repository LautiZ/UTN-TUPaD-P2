/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author zullo
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        
        if (proyecto != null) {
            render.setProyecto(proyecto);
        }
        
        System.out.println(render.getFormato() + " | " + render.getProyecto());
    }
}
