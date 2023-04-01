/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author User
 */
public class Controlador implements ActionListener, ItemListener {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControl(this);
    }

    public void iniciarVista() {
        vista.setTitle("Imagenes");
        vista.setSize(1200, 750);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (vista.imagen == e.getSource()) {
            while(1!=0){
            modelo.Imprimir();
            }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

}
