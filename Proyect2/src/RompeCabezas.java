
/**
 * @authors: 
    Alexander Almengor, Armando Almengor, Cristopher Moreno
 */

import javax.swing.*;
import java.awt.event.*;

public class RompeCabezas implements ActionListener {

    //Field (Instanciaciación de Objetos)
    JFrame ventana;
    JButton boton;
    int dim = 50;
    JButton[] arreglo = new JButton[16];

    //Constructor (El único con la capacidad de traer argumentos de otras clases.
    RompeCabezas() {

        //Creación de la Ventana
        ventana = new JFrame("Rompecabezas");
        ventana.setBounds(550, 150, 700, 700); //Recibe Argumentos
        ventana.setLayout(null);
        ventana.setResizable(false);
        crearBotones();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Creación de Botones
    //Clase Main
    public static void main(String[] args) {
        new RompeCabezas();
    }

    //Métodos
    public void crearBotones() {
        //Inicialización de los Objetos "Botones"
        
        int i = 0;
        
        for (i = 0; (i < 15); i++) {
            boton = new JButton();
            boton.setBounds(200 + dim + dim * (i % 4), 210 + dim * (i / 4), dim, dim);
            boton.setText(String.valueOf(i + 1));
            boton.addActionListener(this);
            arreglo[i] = boton;
            ventana.add(boton);
            boton.setVisible(true);
            System.out.println(arreglo[i].getLocation().x + " " + arreglo[i].getLocation().y );
        }
        
        boton = new JButton(String.valueOf(16));
        boton.setBounds(400,360,dim,dim);
        boton.setVisible(false);
        arreglo[i] = boton;
        ventana.repaint();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(arreglo[15].getLocation().x + " " + arreglo[15].getLocation().y );
    }
}
