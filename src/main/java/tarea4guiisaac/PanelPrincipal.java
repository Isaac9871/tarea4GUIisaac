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

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }

}
