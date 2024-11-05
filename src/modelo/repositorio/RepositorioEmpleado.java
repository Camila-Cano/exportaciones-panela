/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.repositorio;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.entidades.Empleado;

/**
 *
 * @author Camila
 */
public class RepositorioEmpleado {

    private final Conexion conexion = new Conexion();

    public Empleado consultarEmpleado(String login, String password) throws SQLException {

        String sql = "select * from empleados where login = ? and password = ?";
        Connection conn = conexion.crearConexionBd();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, login);
        pstm.setString(2, password);

        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            return obtenerEmpleado(rs);
        }
        return null;
    }
   
    public Empleado consultarEmpleadoPorNombre(String nombres, String rol) throws SQLException {

        String sql = "select * from empleados where Nombres = ? and rol = ?";
        Connection conn = conexion.crearConexionBd();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nombres);
        pstm.setString(2, rol);

        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            return obtenerEmpleado(rs);
        }
        return null;
    }
    
    public Empleado consultarEmpleado(String login) throws SQLException {

        String sql = "select * from empleados where login = ?";
        Connection conn = conexion.crearConexionBd();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, login);

        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            return obtenerEmpleado(rs);
        }
        return null;
    }
    
    public int crearEmpleado(Empleado empleado) throws SQLException {
        String sql = "INSERT INTO empleados(Nombres,Apellidos,Identificacion,Telefono,Departamento,Correo_electronico,Empresa,rol,login,password) VALUES(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = conexion.crearConexionBd();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, empleado.getNombres());
        pstm.setString(2, empleado.getApellidos());
        pstm.setString(3, empleado.getIdentificacion());
        pstm.setString(4, empleado.getTelefono());
        pstm.setString(5, empleado.getDepartamento());
        pstm.setString(6, empleado.getCorreoElectronico());
        pstm.setString(7, empleado.getEmpresa());
        pstm.setString(8, empleado.getRol());
        pstm.setString(9, empleado.getLogin());
        pstm.setString(10, empleado.getPassword());
        return pstm.executeUpdate();
    }

    private Empleado obtenerEmpleado(ResultSet rs) throws SQLException {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(rs.getInt("ID_Empleado"));
        empleado.setNombres(rs.getString("Nombres"));
        empleado.setApellidos(rs.getString("Apellidos"));
        empleado.setIdentificacion(rs.getString("Identificacion"));
        empleado.setTelefono(rs.getString("Telefono"));
        empleado.setDepartamento(rs.getString("Departamento"));
        empleado.setCorreoElectronico(rs.getString("Correo_Electronico"));
        empleado.setEmpresa(rs.getString("Empresa"));
        empleado.setRol(rs.getString("Rol"));
        empleado.setLogin(rs.getString("login"));
        return empleado;
    }

}
