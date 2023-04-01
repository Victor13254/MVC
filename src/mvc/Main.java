/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Imagen;
import vista.Vista;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[]args){
        Vista vista = new Vista();
        Modelo model= new Modelo(vista);
        Controlador ctrl = new Controlador(vista,model);
        ctrl.iniciarVista();
    }
}
