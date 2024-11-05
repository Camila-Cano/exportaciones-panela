/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.entidades.Empleado;

/**
 *
 * @author Camila
 */
public class SessionService {
    
    private static Empleado sesionEmpleado;
    
    public static void setSesionEmpleado(Empleado empleado) {
        sesionEmpleado = empleado;
    }
    
    public static Empleado getSesionEmpleado() {
        return sesionEmpleado;
    }
    
}
