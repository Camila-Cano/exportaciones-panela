/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.repositorio;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.entidades.Exportacion;

/**
 *
 * @author Camila
 */
public class RepositorioExportacion {
    
    private final Conexion conexion = new Conexion();
    
    public int crearExportacion(Exportacion exportacion) throws SQLException {
        
        String sql = "INSERT INTO exportaciones(ID_empleado_emisor,ID_funcionario_receptor,cantidad,Presentacion,Tipo_envio,Ciudad_origen,Tipo_pago,Fecha_envio,Fecha_estimada_entrega)VALUES (?,?,?,?,?,?,?,?,?)";
        Connection conn = conexion.crearConexionBd();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, exportacion.getIdEmpleado());
        pstm.setInt(2, exportacion.getIdFuncionario());
        pstm.setInt(3, exportacion.getCantidad());
        pstm.setString(4, exportacion.getPresentacion());
        pstm.setString(5, exportacion.getTipoEnvio());
        pstm.setString(6, exportacion.getCiudadOrigen());
        pstm.setObject(7, exportacion.getTipoPago());
        pstm.setObject(8, exportacion.getFechaEnvio());
        pstm.setObject(9, exportacion.getFechaEstimadaEntrega());
        return pstm.executeUpdate();
    }
    
}
