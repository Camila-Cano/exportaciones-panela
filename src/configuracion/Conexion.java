/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Camila
 */
public class Conexion {
    
    public Connection crearConexionBd() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/dbpanela";
        String user = "root";
        String password = "Root";
        return DriverManager.getConnection(url, user, password);
    }
    
}
