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

/**
 *
 * @author orell
 */
public class Reservapaquete extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reservapaquete
     */
    public Reservapaquete() {
        initComponents();
        llenarComboBox();
    }

     private void llenarComboBox() {
       Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
    //combo box id de hotel
        //combo box nit de reserva de paquetes
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT nit_a FROM CLIENTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_nit.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String nit = rs.getString("nit_a");
            cmb_nit.addItem(nit); // Agregar cada nit al combo box
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
    //combo box de trayecto
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Transporte FROM TRANSPORTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_trayecto.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String trayecto = rs.getString("ID_Transporte");
            cmb_trayecto.addItem(trayecto); // Agregar cada nit al combo box
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
    //combo box de reservacion de restaurante
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Res_Res FROM RESERVAS_RESTAURANTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_res_res_res_paq.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String res = rs.getString("ID_Res_Res");
            cmb_res_res_res_paq.addItem(res); 
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
    //combo box de resrevacion de hotel
    try {
        // Obtener la conexión a SQL Server
        Conexion conect = new Conexion();
        con = conect.getConexion();

        // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
        String sql = "SELECT ID_Res_Hot FROM RESERVAS_HOTELES";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Limpiar el JComboBox antes de agregar nuevos elementos
        cmb_reserva_hotel.removeAllItems();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String res = rs.getString("ID_Res_hot");
            cmb_reserva_hotel.addItem(res); 
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
        jPanel3 = new javax.swing.JPanel();
        txt_id_reserva = new javax.swing.JTextField();
        cmb_nit = new javax.swing.JComboBox<>();
        cmb_trayecto = new javax.swing.JComboBox<>();
        cmb_reserva_hotel = new javax.swing.JComboBox<>();
        cmb_res_res_res_paq = new javax.swing.JComboBox<>();
        txt_total = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(3, 54, 61));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 54, 61));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reservas.png"))); // NOI18N
        jLabel3.setText("Reservas Paquete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(268, 268, 268))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        cmb_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nitActionPerformed(evt);
            }
        });

        cmb_trayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_trayectoActionPerformed(evt);
            }
        });

        cmb_reserva_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_reserva_hotelActionPerformed(evt);
            }
        });

        cmb_res_res_res_paq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_res_res_res_paqActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paquetes (1).png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel16.setText("ID Reservación:");

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel17.setText("NIT:");

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel18.setText("Trayecto:");

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel19.setText("Reservación Hotel:");

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel20.setText("Reservación Restaurante:");

        jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel21.setText("Total:");
        jLabel21.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Utilice esta ventana para agregar paquetes.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(43, 43, 43)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_trayecto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmb_reserva_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_id_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmb_nit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_res_res_res_paq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_trayecto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_reserva_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_res_res_res_paq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Airtemala™ 2024. Todos los derechos registrados.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 255, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(310, 310, 310))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nitActionPerformed
       String selectedID3 = (String) cmb_nit.getSelectedItem();
 
    }//GEN-LAST:event_cmb_nitActionPerformed

    private void cmb_trayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_trayectoActionPerformed
        String selectedID4 = (String) cmb_trayecto.getSelectedItem();
      
    }//GEN-LAST:event_cmb_trayectoActionPerformed

    private void cmb_reserva_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_reserva_hotelActionPerformed
       String selectedID5 = (String) cmb_reserva_hotel.getSelectedItem();
    }//GEN-LAST:event_cmb_reserva_hotelActionPerformed

    private void cmb_res_res_res_paqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_res_res_res_paqActionPerformed
     String selectedID6 = (String) cmb_res_res_res_paq.getSelectedItem();
    }//GEN-LAST:event_cmb_res_res_res_paqActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   try {
    // Obtener la conexión a SQL Server
    Conexion conect = new Conexion();
    Connection con = conect.getConexion();

    // Validar que los campos no estén vacíos
    if (txt_id_reserva.getText().isEmpty() || cmb_nit.getSelectedItem() == null ||
        cmb_trayecto.getSelectedItem() == null || cmb_reserva_hotel.getSelectedItem() == null ||
        cmb_res_res_res_paq.getSelectedItem() == null || txt_total.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_RP es un número
    if (!txt_id_reserva.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_RP debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que nit_a es un número
    if (!cmb_nit.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo nit_a debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Trayecto es un número
    if (!cmb_trayecto.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Trayecto debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Res_Hot es un número
    if (!cmb_reserva_hotel.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Res_Hot debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Res_Res es un número
    if (!cmb_res_res_res_paq.getSelectedItem().toString().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Res_Res debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que Total_Paquete es un número decimal
    if (!txt_total.getText().matches("\\d+(\\.\\d{1,2})?")) {
        JOptionPane.showMessageDialog(this, "El campo Total_Paquete debe ser un número decimal con máximo dos decimales.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Consulta SQL preparada con parámetros
    String sql = "INSERT INTO RESERVAS_PAQUETE (ID_RP, nit_a, ID_Trayecto, ID_Res_Hot, ID_Res_Res, Total_Paquete) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);

    // Asignar los valores de los campos
    pst.setInt(1, Integer.parseInt(txt_id_reserva.getText().trim()));  
    pst.setInt(2, Integer.parseInt(cmb_nit.getSelectedItem().toString().trim()));
    pst.setInt(3, Integer.parseInt(cmb_trayecto.getSelectedItem().toString().trim()));
    pst.setInt(4, Integer.parseInt(cmb_reserva_hotel.getSelectedItem().toString().trim()));
    pst.setInt(5, Integer.parseInt(cmb_res_res_res_paq.getSelectedItem().toString().trim()));  
    pst.setFloat(6, Float.parseFloat(txt_total.getText().trim()));

    // Ejecutar la consulta
    int n = pst.executeUpdate();

    if (n > 0) {
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
    }

    // Limpiar los campos
    txt_id_reserva.setText("");
    txt_total.setText("");
    cmb_nit.setSelectedIndex(0);
    cmb_trayecto.setSelectedIndex(0);
    cmb_reserva_hotel.setSelectedIndex(0);
    cmb_res_res_res_paq.setSelectedIndex(0);

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "LOS DATOS NO SE GUARDARON CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
    System.out.println("Error: " + e.getMessage());
    e.printStackTrace();
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Error de formato numérico en los campos. Asegúrese de que los campos numéricos contengan solo números.", "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}



    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_nit;
    private javax.swing.JComboBox<String> cmb_res_res_res_paq;
    private javax.swing.JComboBox<String> cmb_reserva_hotel;
    private javax.swing.JComboBox<String> cmb_trayecto;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_id_reserva;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
