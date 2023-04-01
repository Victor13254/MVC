/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Imagen extends javax.swing.JPanel {

    public Imagen() {
        this.setSize(40, 30); //se selecciona el tamaño del panel
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagen/wtf.jpg"));
        
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}
