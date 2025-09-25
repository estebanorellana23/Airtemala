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
public class ReservaHotel extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reservatranspo
     */
    public ReservaHotel() {
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

        // Consulta SQL para obtener los nit_a de la tabla CLIENTE
        String sql = "SELECT nit_a FROM CLIENTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_nit_a.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String nit = rs.getString("nit_a");
            cmb_nit_a.addItem(nit); // Agregar cada nit al combo box
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los NITs", "Error", JOptionPane.ERROR_MESSAGE);
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
    //combo box id de hotel
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Hotel FROM HOTELES";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_id_hotel.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String hotel = rs.getString("ID_Hotel");
            cmb_id_hotel.addItem(hotel); // Agregar cada nit al combo box
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
    //combo box habitaciones
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Habitacion FROM HABITACIONES";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_id_habitacion.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String hab = rs.getString("ID_Habitacion");
            cmb_id_habitacion.addItem(hab); // Agregar cada nit al combo box
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
        //combo box nit de reservacion de hoteles
       
   
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_id_res_hot = new javax.swing.JTextField();
        cmb_nit_a = new javax.swing.JComboBox<>();
        cmb_id_hotel = new javax.swing.JComboBox<>();
        cmb_id_habitacion = new javax.swing.JComboBox<>();
        txt_check_in = new javax.swing.JTextField();
        txt_check_out = new javax.swing.JTextField();
        txt_total_reser = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(3, 54, 61));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 54, 61));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hotel_1.png"))); // NOI18N
        jLabel3.setText("Reservas Hoteles");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        cmb_nit_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nit_aActionPerformed(evt);
            }
        });

        cmb_id_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_hotelActionPerformed(evt);
            }
        });

        cmb_id_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_habitacionActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hotel2 (1).png"))); // NOI18N
        jButton2.setText("Guardar Reservación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel9.setText("ID_Reservacion");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel10.setText("NIT");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel11.setText("Hotel:");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel12.setText("Habitación:");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel13.setText("Check-In:");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Check-Out:");

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel15.setText("Total:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Utilice esta ventana para agregar reservaciones.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_check_out)
                            .addComponent(txt_check_in)
                            .addComponent(cmb_id_habitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_id_hotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_nit_a, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_id_res_hot)
                            .addComponent(txt_total_reser, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_res_hot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_nit_a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_id_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_id_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_check_out, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Airtemala™ 2024. Todos los derechos registrados.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_nit_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nit_aActionPerformed
      String selectedNit = (String) cmb_nit_a.getSelectedItem();
    }//GEN-LAST:event_cmb_nit_aActionPerformed

    private void cmb_id_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_hotelActionPerformed
    String selectedNit = (String) cmb_id_hotel.getSelectedItem();
    }//GEN-LAST:event_cmb_id_hotelActionPerformed

    private void cmb_id_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_habitacionActionPerformed
    String selectedNit = (String) cmb_id_habitacion.getSelectedItem();
    }//GEN-LAST:event_cmb_id_habitacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try {
    // Validar que ID_Res_Hot, nit_a, ID_Hotel, ID_Habitacion y Total_Reser son números válidos
    if (!txt_id_res_hot.getText().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID de la Reserva debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!cmb_nit_a.getSelectedItem().toString().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo NIT debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!cmb_id_hotel.getSelectedItem().toString().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID del Hotel debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!cmb_id_habitacion.getSelectedItem().toString().trim().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID de la Habitación debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!txt_total_reser.getText().trim().matches("\\d+(\\.\\d+)?")) {
        JOptionPane.showMessageDialog(this, "El campo Total de la Reserva debe contener solo números o decimales.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que Check_In y Check_Out tengan el formato correcto
    String dateTimePattern = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
    if (!txt_check_in.getText().trim().matches(dateTimePattern)) {
        JOptionPane.showMessageDialog(this, "El campo Check-In debe tener el formato yyyy-MM-dd HH:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!txt_check_out.getText().trim().matches(dateTimePattern)) {
        JOptionPane.showMessageDialog(this, "El campo Check-Out debe tener el formato yyyy-MM-dd HH:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener la conexión
    Conexion connect = new Conexion();
    Connection con = connect.getConexion();

    // Consulta SQL preparada
    String sql = "INSERT INTO RESERVAS_HOTELES (ID_Res_Hot, nit_a, ID_Hotel, ID_Habitacion, Check_In, Check_Out, Total_Reser) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);

    // Asignar valores a los campos en la consulta
    pst.setInt(1, Integer.parseInt(txt_id_res_hot.getText().trim())); // ID_Res_Hot
    pst.setInt(2, Integer.parseInt(cmb_nit_a.getSelectedItem().toString().trim())); // nit_a
    pst.setInt(3, Integer.parseInt(cmb_id_hotel.getSelectedItem().toString().trim())); // ID_Hotel
    pst.setInt(4, Integer.parseInt(cmb_id_habitacion.getSelectedItem().toString().trim())); // ID_Habitacion

    // Asignar fecha y hora como Timestamp
    pst.setTimestamp(5, java.sql.Timestamp.valueOf(txt_check_in.getText().trim())); // Check_In
    pst.setTimestamp(6, java.sql.Timestamp.valueOf(txt_check_out.getText().trim())); // Check_Out

    // Asignar el total de la reserva
    pst.setFloat(7, Float.parseFloat(txt_total_reser.getText().trim())); // Total_Reser

    // Ejecutar la consulta
    int n = pst.executeUpdate();

    if (n > 0) {
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
    }

} catch (SQLException | HeadlessException e) {
    JOptionPane.showMessageDialog(this, "LOS DATOS NO SE GUARDARON CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
    System.out.println("Error: " + e.getMessage());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Error de formato numérico en los campos ID_Res_Hot, nit_a, ID_Hotel, ID_Habitacion o Total_Reser", "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_id_habitacion;
    private javax.swing.JComboBox<String> cmb_id_hotel;
    private javax.swing.JComboBox<String> cmb_nit_a;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_check_in;
    private javax.swing.JTextField txt_check_out;
    private javax.swing.JTextField txt_id_res_hot;
    private javax.swing.JTextField txt_total_reser;
    // End of variables declaration//GEN-END:variables
}
