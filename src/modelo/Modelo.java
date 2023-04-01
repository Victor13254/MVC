/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Random;
import vista.Imagen;
import vista.Vista;

/**
 *
 * @author User
 */
public class Modelo {

    private Vista vista;

    public Modelo(Vista vista) {
        this.vista = vista;
    }

    public void Imprimir() {
        
        Imagen item = crea();
        vista.panelA.add(item);
        
        item.setBounds(((int)(Math.random() * 1000)), ((int)(Math.random() * 700)), 40, 30);
        
        System.out.println(item);
        vista.repaint();
    }    
    
    
    public Imagen crea(){
        return new Imagen();
    }
    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }



}
