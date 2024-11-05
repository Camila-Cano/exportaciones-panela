/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import Vista.IniciarSesionVista;

/**
 *
 * @author Camila
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new runnable(){
          public void run(){
          new IniciarSesionVista().setVisible(true);    
          }
         });
    }
    
}
