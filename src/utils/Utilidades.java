/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila
 */
public class Utilidades {
    
    public static void validarCampoTexto(String valor, String label) {
        if(valor == null || valor.trim().length() == 0) {
            String msg = String.format("El campo %s es obligatorio", label);
            throw new IllegalArgumentException(msg);
        }
    }
    
    public static void validarCampoSeleccion(String valor, String label) {
        validarCampoTexto(valor, label);
        if(valor.toLowerCase().equals("seleccionar")) {
            String msg = String.format("El campo %s es obligatorio", label);
            throw new IllegalArgumentException(msg);
        }
    }
    
    public static void validarCampoNumerico(String valor, String label) {
        try {
            Integer.parseInt(valor);
        } catch (Exception e) {
            String msg = String.format("El campo %s no es numerico", label);
            throw new IllegalArgumentException(msg);
        }
    }
    
    public static void validarCampoFecha(String valor, String label) {
        try {
            LocalDate.parse(valor, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (Exception e) {
            String msg = String.format("El campo %s debe de estar en formato yyyy-MM-dd", label);
            throw new IllegalArgumentException(msg);
        }
    }
    
    public static void mostrarMensajeDeDialogo(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
