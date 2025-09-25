/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package menu;
import SQL.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ReservaTransporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservaTransporte
     */
    public ReservaTransporte() {
        initComponents();
        llenarComboBox();
    }

    private void llenarComboBox() {
       Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        
        try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Empresa FROM EMPRESA_TRANSPORTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_id_empresa.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String idempresa = rs.getString("ID_Empresa");
            cmb_id_empresa.addItem(idempresa); // Agregar cada nit al combo box
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar la empresa", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        //combo box nit  de hoteles
       try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Ubicacion FROM UBICACIONES";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_id_ubicacion.removeAllItems();

        // Recorrer los resultados y agregar los ID_Ubicacion al JComboBox
        while (rs.next()) {
            String idUbicacion = rs.getString("ID_Ubicacion");
            cmb_id_ubicacion.addItem(idUbicacion); // Agregar cada ID_Ubicacion al combo box
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar las ubicaciones", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_id_transporte = new javax.swing.JTextField();
        cmb_id_empresa = new javax.swing.JComboBox<>();
        cmb_id_ubicacion = new javax.swing.JComboBox<>();
        txt_costo_trayecto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_salida = new javax.swing.JTextField();
        txt_llegada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("Airtemala™ 2024. Todos los derechos registrados.");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(3, 54, 61));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 54, 61));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transportee.png"))); // NOI18N
        jLabel1.setText("Reservas Transporte");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        txt_id_transporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_transporteActionPerformed(evt);
            }
        });

        cmb_id_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_empresaActionPerformed(evt);
            }
        });

        cmb_id_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_ubicacionActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transporte (1).png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel16.setText("ID Transporte");

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel17.setText("ID_Empresa");

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel18.setText("ID_Ubicacion");

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel19.setText("Salida");

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel20.setText("Llegada");

        jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel21.setText("Costo Trayecto");
        jLabel21.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Utilice esta ventana para agregar reservaciones.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_id_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_id_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_costo_trayecto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id_transporte, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_transporte, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_id_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_id_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_costo_trayecto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setText("Airtemala™ 2024. Todos los derechos registrados.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(264, 264, 264))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_id_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_empresaActionPerformed
     String selectedidempre = (String) cmb_id_empresa.getSelectedItem();
    }//GEN-LAST:event_cmb_id_empresaActionPerformed

    private void cmb_id_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_ubicacionActionPerformed
    String cmbidubicacion = (String) cmb_id_ubicacion.getSelectedItem();
    }//GEN-LAST:event_cmb_id_ubicacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try {
    // Obtener la conexión
    Conexion connect = new Conexion();
    Connection con = connect.getConexion();

    // Validar que los campos no estén vacíos
    if (txt_id_transporte.getText().isEmpty() || cmb_id_empresa.getSelectedItem() == null ||
        cmb_id_ubicacion.getSelectedItem() == null || txt_salida.getText().isEmpty() ||
        txt_llegada.getText().isEmpty() || txt_costo_trayecto.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Transporte es un número
    if (!txt_id_transporte.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Transporte debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Empresa es un número
    if (!cmb_id_empresa.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Empresa debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Ubicacion es un número
    if (!cmb_id_ubicacion.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Ubicacion debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que las fechas de salida y llegada están en formato correcto (ej. YYYY-MM-DD HH:MM:SS)
    if (!txt_salida.getText().matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
        JOptionPane.showMessageDialog(this, "El campo Salida debe estar en el formato YYYY-MM-DD HH:MM:SS.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!txt_llegada.getText().matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
        JOptionPane.showMessageDialog(this, "El campo Llegada debe estar en el formato YYYY-MM-DD HH:MM:SS.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que Costo_Trayecto es un número decimal
    if (!txt_costo_trayecto.getText().matches("\\d+(\\.\\d{1,2})?")) {
        JOptionPane.showMessageDialog(this, "El campo Costo_Trayecto debe ser un número decimal con máximo dos decimales.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Consulta SQL preparada
    String sql = "INSERT INTO TRANSPORTE (ID_Transporte, ID_Empresa, ID_Ubicacion, Salida, Llegada, Costo_Trayecto) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);

    // Asignar valores a los campos en la consulta
    pst.setInt(1, Integer.parseInt(txt_id_transporte.getText().trim())); // ID_Transporte como entero
    pst.setInt(2, Integer.parseInt(cmb_id_empresa.getSelectedItem().toString().trim())); // ID_Empresa
    pst.setInt(3, Integer.parseInt(cmb_id_ubicacion.getSelectedItem().toString().trim())); // ID_Ubicacion
    pst.setTimestamp(4, java.sql.Timestamp.valueOf(txt_salida.getText().trim())); // Salida
    pst.setTimestamp(5, java.sql.Timestamp.valueOf(txt_llegada.getText().trim())); // Llegada
    pst.setFloat(6, Float.parseFloat(txt_costo_trayecto.getText().trim())); // Costo_Trayecto

    // Ejecutar la consulta
    int n = pst.executeUpdate();

    if (n > 0) {
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
    }

    // Limpiar los campos
    txt_id_transporte.setText("");
    txt_costo_trayecto.setText("");
    txt_salida.setText("");
    txt_llegada.setText("");
    cmb_id_empresa.setSelectedIndex(0);
    cmb_id_ubicacion.setSelectedIndex(0);

} catch (SQLException | HeadlessException e) {
    JOptionPane.showMessageDialog(this, "LOS DATOS NO SE GUARDARON CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
    System.out.println("Error: " + e.getMessage());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Error de formato numérico en los campos ID_Transporte, ID_Empresa, ID_Ubicacion o Costo_Trayecto", "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}



    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_id_transporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_transporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_transporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_id_empresa;
    private javax.swing.JComboBox<String> cmb_id_ubicacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_costo_trayecto;
    private javax.swing.JTextField txt_id_transporte;
    private javax.swing.JTextField txt_llegada;
    private javax.swing.JTextField txt_salida;
    // End of variables declaration//GEN-END:variables
}
