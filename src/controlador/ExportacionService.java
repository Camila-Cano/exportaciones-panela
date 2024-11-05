/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.SQLException;
import modelo.entidades.Exportacion;
import modelo.repositorio.RepositorioExportacion;

/**
 *
 * @author Camila
 */
public class ExportacionService {
    
    private final RepositorioExportacion repositorioExportacion = new RepositorioExportacion();
    
    public int crearExportacion(Exportacion exportacion) throws SQLException {
        return repositorioExportacion.crearExportacion(exportacion);
    }
}
