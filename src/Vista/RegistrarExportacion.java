/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import controlador.EmpleadoService;
import controlador.ExportacionService;
import controlador.SessionService;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.entidades.Empleado;
import modelo.entidades.Exportacion;
import utils.Utilidades;

/**
 *
 * @author Camila
 */
public class RegistrarExportacion extends javax.swing.JFrame {

    private final EmpleadoService empleadoService = new EmpleadoService();
    private final ExportacionService exportacionService = new ExportacionService();
    private int idEmpleado;
    private int idFuncionario;

    /**
     * Creates new form RegistrarExportaccion
     */
    public RegistrarExportacion() {
        initComponents();
        Empleado empleado = SessionService.getSesionEmpleado();
        if (empleado.getRol().equals("Empleado")) {
            poblarDatosEmpleado(empleado);
            this.idEmpleado = empleado.getIdEmpleado();
        } else {
            poblarDatosFuncionario(empleado);
            this.idFuncionario = empleado.getIdEmpleado();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInfoEmpleado = new javax.swing.JLabel();
        lblIdEmpleado = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        lblNombreEmpleado = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidosEmpleado = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblCargoEmpleado = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lbltelefonoEmpleado = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbldatosExportacion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPresentacion = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JTextField();
        lblTipoEnvio = new javax.swing.JLabel();
        txtTipoEnvio = new javax.swing.JTextField();
        lblCiudadOrigen = new javax.swing.JLabel();
        txtCiudadOrigen = new javax.swing.JTextField();
        lblTpPago = new javax.swing.JLabel();
        txtTpPago = new javax.swing.JComboBox<>();
        lblFechaEnvio = new javax.swing.JLabel();
        txtFechaEnvio = new javax.swing.JTextField();
        lblFechaEnntrega = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblIdFuncionario = new javax.swing.JLabel();
        txtIdFuncionario = new javax.swing.JTextField();
        lblNombresFuncionario = new javax.swing.JLabel();
        txtNombresFuncionario = new javax.swing.JTextField();
        lblApellidosFuncionario = new javax.swing.JLabel();
        txtApellidosFuncionario = new javax.swing.JTextField();
        lblCargoFuncionario = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txtTelefonoFuncionario = new javax.swing.JTextField();
        lblCorreoEmpleado = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        lblCorreoFuncionario = new javax.swing.JLabel();
        txtCorreoFuncionario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        BtnBuscarempleado = new javax.swing.JButton();
        BtnBuscarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInfoEmpleado.setText("Información del empleado");

        lblIdEmpleado.setText("Identificación");

        lblNombreEmpleado.setText("Nombres");

        lblApellidosEmpleado.setText("Apellidos");

        lblCargoEmpleado.setText("Cargo");

        lbltelefonoEmpleado.setText("Telefono");

        lbldatosExportacion.setText("Datos Exportación");

        lblCantidad.setText("Cantidad");

        lblPresentacion.setText("Presentación");

        lblTipoEnvio.setText("Tipo de envío");

        lblCiudadOrigen.setText("Ciudad Origen");

        lblTpPago.setText("Tipo de pago");

        txtTpPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Dolares", "Euros" }));

        lblFechaEnvio.setText("Fecha de envío (yyyy-MM-dd)");

        lblFechaEnntrega.setText("Fecha estimada entrega (yyyy-MM-dd)");

        jLabel1.setText("Información del funcionario receptor");

        lblIdFuncionario.setText("Identificación");

        lblNombresFuncionario.setText("Nombres ");

        lblApellidosFuncionario.setText("Apellidos");

        lblCargoFuncionario.setText("Cargo");

        lblEmpresa.setText("Empresa");

        lbltelefono.setText("Telefono");

        lblCorreoEmpleado.setText("Correo");

        lblCorreoFuncionario.setText("Correo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        BtnBuscarempleado.setText("Buscar");
        BtnBuscarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarempleadoActionPerformed(evt);
            }
        });

        BtnBuscarFuncionario.setText("Buscar");
        BtnBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdEmpleado)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)
                            .addComponent(txtCargo)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarempleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoEnvio)
                                    .addComponent(lblCiudadOrigen)
                                    .addComponent(lblTpPago)
                                    .addComponent(lblFechaEnvio)
                                    .addComponent(lblFechaEnntrega)
                                    .addComponent(lblPresentacion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPresentacion)
                                    .addComponent(txtTipoEnvio)
                                    .addComponent(txtCiudadOrigen)
                                    .addComponent(txtTpPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaEnvio)
                                    .addComponent(txtFechaEntrega)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdEmpleado)
                                    .addComponent(lblNombreEmpleado)
                                    .addComponent(lblApellidosEmpleado)
                                    .addComponent(lblCargoEmpleado)
                                    .addComponent(lbltelefonoEmpleado)
                                    .addComponent(lblIdFuncionario)
                                    .addComponent(lblNombresFuncionario)
                                    .addComponent(lblApellidosFuncionario)
                                    .addComponent(lblCorreoEmpleado)
                                    .addComponent(lblCorreoFuncionario))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCorreoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(txtIdFuncionario)
                                            .addComponent(txtNombresFuncionario)
                                            .addComponent(txtApellidosFuncionario))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(lblCargoFuncionario)
                                                .addGap(31, 31, 31)
                                                .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(101, 101, 101)
                                                        .addComponent(lbltelefono))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(BtnBuscarFuncionario)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblEmpresa)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTelefonoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(btnGuardar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnInicio))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtInfoEmpleado)
                                .addGap(167, 167, 167)
                                .addComponent(lbldatosExportacion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInfoEmpleado)
                    .addComponent(lbldatosExportacion))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEmpleado)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPresentacion)
                        .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscarempleado))
                    .addComponent(lblNombreEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidosEmpleado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoEnvio)
                        .addComponent(txtTipoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoEmpleado)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCiudadOrigen)
                        .addComponent(txtCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltelefonoEmpleado)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTpPago)
                        .addComponent(txtTpPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEnvio)
                    .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoEmpleado)
                    .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEnntrega)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdFuncionario)
                    .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargoFuncionario)
                    .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombresFuncionario)
                    .addComponent(txtNombresFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresa)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosFuncionario)
                    .addComponent(txtApellidosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono)
                    .addComponent(txtTelefonoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoFuncionario)
                    .addComponent(txtCorreoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnInicio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            String txtCantidad = this.txtCantidad.getText();
            Utilidades.validarCampoTexto(txtCantidad, "Cantidad");
            Utilidades.validarCampoNumerico(txtCantidad, "Cantidad");
            String txtPresentacion = this.txtPresentacion.getText();
            Utilidades.validarCampoTexto(txtPresentacion, "Presentacion");
            String txtTipoEnvio = this.txtTipoEnvio.getText();
            Utilidades.validarCampoTexto(txtTipoEnvio, "Tipo de envio");
            String txtCiudadOrigen = this.txtCiudadOrigen.getText();
            Utilidades.validarCampoTexto(txtCiudadOrigen, "Ciudad Origen");
            String txtTipoPago = this.txtTpPago.getSelectedItem().toString();
            Utilidades.validarCampoSeleccion(txtTipoPago, "Tipo de pago");
            String txtFechaEnvio = this.txtFechaEnvio.getText();
            Utilidades.validarCampoTexto(txtFechaEnvio, "Fecha de envio");
            Utilidades.validarCampoFecha(txtFechaEnvio, "Fecha de envio");
            String txtFechaEstimadaEntrega = this.txtFechaEntrega.getText();
            Utilidades.validarCampoTexto(txtFechaEstimadaEntrega, "Fecha estimdada entrega");
            Utilidades.validarCampoFecha(txtFechaEstimadaEntrega, "Fecha estimada entrega");

            LocalDate fechaEnvio = LocalDate.parse(txtFechaEnvio, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate fechaEstimadaEntrega = LocalDate.parse(txtFechaEstimadaEntrega, DateTimeFormatter.ISO_LOCAL_DATE);

            Exportacion exportacion = new Exportacion();
            exportacion.setCantidad(Integer.parseInt(txtCantidad));
            exportacion.setCiudadOrigen(txtCiudadOrigen);
            exportacion.setIdEmpleado(this.idEmpleado);
            exportacion.setIdFuncionario(this.idFuncionario);
            exportacion.setPresentacion(txtPresentacion);
            exportacion.setTipoEnvio(txtTipoEnvio);
            exportacion.setTipoPago(txtTipoPago);
            exportacion.setFechaEnvio(fechaEnvio);
            exportacion.setFechaEstimadaEntrega(fechaEstimadaEntrega);
            exportacionService.crearExportacion(exportacion);
            Utilidades.mostrarMensajeDeDialogo("Registro exitoso");
            this.btnInicioActionPerformed(null);
        } catch (Exception ex) {
            Utilidades.mostrarMensajeDeDialogo(ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        HomeVista Home = new HomeVista();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void BtnBuscarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarempleadoActionPerformed
        try {
            String nombres = txtNombres.getText();
            Empleado empleado = empleadoService.consultarEmpleadoPorNombre(nombres, "Empleado");
            this.poblarDatosEmpleado(empleado);
            this.idEmpleado = empleado.getIdEmpleado();
        } catch (Exception ex) {
            Utilidades.mostrarMensajeDeDialogo(ex.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarempleadoActionPerformed

    private void BtnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarFuncionarioActionPerformed
        try {
            String nombres = txtNombresFuncionario.getText();
            Empleado empleado = empleadoService.consultarEmpleadoPorNombre(nombres, "Funcionario");
            this.poblarDatosFuncionario(empleado);
            this.idFuncionario = empleado.getIdEmpleado();
        } catch (Exception ex) {
            Utilidades.mostrarMensajeDeDialogo(ex.getMessage());
        }
    }//GEN-LAST:event_BtnBuscarFuncionarioActionPerformed

    private void poblarDatosEmpleado(Empleado empleado) {
        this.txtApellidos.setText(empleado.getApellidos());
        this.txtNombres.setText(empleado.getNombres());
        this.txtCorreoEmpleado.setText(empleado.getCorreoElectronico());
        this.txtIdEmpleado.setText(empleado.getIdentificacion());
        this.txtTelefono.setText(empleado.getTelefono());
        this.txtCargo.setText(empleado.getRol());
    }

    private void poblarDatosFuncionario(Empleado empleado) {
        this.txtApellidosFuncionario.setText(empleado.getApellidos());
        this.txtNombresFuncionario.setText(empleado.getNombres());
        this.txtCorreoFuncionario.setText(empleado.getCorreoElectronico());
        this.txtIdFuncionario.setText(empleado.getIdentificacion());
        this.txtTelefonoFuncionario.setText(empleado.getTelefono());
        this.txtCargoFuncionario.setText(empleado.getRol());
        this.txtEmpresa.setText(empleado.getEmpresa());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarExportacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarExportacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarExportacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarExportacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarExportacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarFuncionario;
    private javax.swing.JButton BtnBuscarempleado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidosEmpleado;
    private javax.swing.JLabel lblApellidosFuncionario;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCargoEmpleado;
    private javax.swing.JLabel lblCargoFuncionario;
    private javax.swing.JLabel lblCiudadOrigen;
    private javax.swing.JLabel lblCorreoEmpleado;
    private javax.swing.JLabel lblCorreoFuncionario;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaEnntrega;
    private javax.swing.JLabel lblFechaEnvio;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombresFuncionario;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblTipoEnvio;
    private javax.swing.JLabel lblTpPago;
    private javax.swing.JLabel lbldatosExportacion;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltelefonoEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosFuncionario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtCiudadOrigen;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtCorreoFuncionario;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaEnvio;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JLabel txtInfoEmpleado;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresFuncionario;
    private javax.swing.JTextField txtPresentacion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoFuncionario;
    private javax.swing.JTextField txtTipoEnvio;
    private javax.swing.JComboBox<String> txtTpPago;
    // End of variables declaration//GEN-END:variables
}
