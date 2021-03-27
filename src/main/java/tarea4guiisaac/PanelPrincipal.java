/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4guiisaac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author isaac
 */
public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    //El area de texto donde se realizara los calculos
    private JTextArea areaTextoCalculos;
    //Este area muestra los resultados del ares de texto anterior
    private JTextArea areaTextoVisible;
    private int tipoOperacion;
    private int antesSigno;
    private int despuesSigno;
    private int antesSignoAlias;
    private boolean signoPulsado;
    private boolean realizarSuma = false;
    private boolean realizarResta = false;
    private boolean realizarDivision = false;
    private boolean realizarMultiplicacion = false;

// Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }
    // Se inicializan los componentes gráficos y se colocan en el panel

    private void initComponents() {

        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos las áreas de textos
        //No tiene valores ni lo añadimos puesto que no es necesario que sea visible
        areaTextoCalculos = new JTextArea();
        areaTextoVisible = new JTextArea(10, 50);
        //Para que no se pueda agrandar la ventana que se crea
        areaTextoVisible.setEditable(false);
        //Fondo de pantalla del area de texto
        areaTextoVisible.setBackground(Color.white);
        //Aumenta el tamaño de la letra del area de texto
        areaTextoVisible.setFont(areaTextoVisible.getFont().deriveFont(20f));

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTextoVisible, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener((ActionListener) this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
