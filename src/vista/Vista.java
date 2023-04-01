package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame {
 
    public JButton imagen;
    public JPanel panelA;
    public Controlador control;

    public Vista() {
        getContentPane().setLayout(new BorderLayout());
        
        panelA = new JPanel();
        panelA.setLayout(new FlowLayout());
        
        imagen = new JButton("Traer imagen");
        this.imagen.setBounds(300, 400, 250, 50);
        this.add(panelA);
        
        panelA.add(imagen);
        

    }

    public void setControl(Controlador control) {
        this.control = control;
        this.imagen.addActionListener(this.control);
    }

    public JButton getImagen() {
        return imagen;
    }

    public void setImagen(JButton imagen) {
        this.imagen = imagen;
    }

    public JPanel getPanelA() {
        return panelA;
    }

    public void setPanelA(JPanel panelA) {
        this.panelA = panelA;
    }

    public Controlador getControl() {
        return control;
    }

}
