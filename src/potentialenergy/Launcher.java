/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potentialenergy;

import javax.swing.JFrame;

/**
 *
 * @author Alberto pc
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Display d = new Display();
        d.setVisible(true);
        d.setResizable(false);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setLocationRelativeTo(null);
        d.setTitle("Calculadora de Energía Potencial");
    }
    
}
