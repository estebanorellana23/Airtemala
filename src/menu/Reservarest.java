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
public class Reservarest extends javax.swing.JInternalFrame {

    String filtro = "";
    boolean activar_filtro = false;
    /**
     * Creates new form Reservarest
     */
    public Reservarest() {
        initComponents();
        llenarComboBox();
    }
private void llenarComboBox() {
         //Combo box nit
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
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
        JOptionPane.showMessageDialog(this, "Error al cargar el nit", "Error", JOptionPane.ERROR_MESSAGE);
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
        //Combo box id restaurante
        cmb_id_res.removeAllItems();
        try {
    if (!activar_filtro) {
        Conexion conect = new Conexion();
        con = conect.getConexion();
        String sql = "SELECT ID_rest FROM RESTAURANTE";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        // Recorrer los resultados y agregar los nits al JComboBox
        while (rs.next()) {
            String id_res = rs.getString("ID_rest");
            cmb_id_res.addItem(id_res); 
        }
    } else {
        // Verificar que filtro no sea nulo o vacío
        if (filtro != null && !filtro.trim().isEmpty()) {
            String sql = "SELECT ID_rest FROM RESTAURANTE WHERE ID_Ubicacion = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, filtro.trim());  // Asigna el valor de "filtro" al parámetro de la consulta
            rs = pst.executeQuery();

            // Recorrer los resultados y agregar los nits al JComboBox
            while (rs.next()) {
                String id_res = rs.getString("ID_rest");
                cmb_id_res.addItem(id_res); 
            }
        } else {
            System.out.println("El valor de 'filtro' está vacío o es nulo.");
        }
    }
} catch (SQLException e) {
    e.printStackTrace();  // Muestra el error en la consola para depuración
    JOptionPane.showMessageDialog(null, "Error al realizar la consulta: " + e.getMessage());
}
        finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //combo box del filtro de ubicaciones
        try {
            // Obtener la conexión a SQL Server
            Conexion conect = new Conexion();
            con = conect.getConexion();

            // Consulta SQL para obtener los ID_Ubicacion de la tabla UBICACIONES
            String sql = "SELECT ID_Ubicacion FROM RESTAURANTE";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            // Limpiar el JComboBox antes de agregar nuevos elementos
            cmb_filtro_ubi.removeAllItems();

            // Recorrer los resultados y agregar los nits al JComboBox
            while (rs.next()) {
                String id_ubi = rs.getString("ID_Ubicacion");
                cmb_filtro_ubi.addItem(id_ubi); 
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_id_res_res = new javax.swing.JTextField();
        cmb_nit = new javax.swing.JComboBox<>();
        cmb_id_res = new javax.swing.JComboBox<>();
        txt_tiempo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_filtro_ubi = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(3, 54, 61));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 54, 61));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/restaurantes.png"))); // NOI18N
        jLabel1.setText("Reserva Restaurante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        txt_id_res_res.setText(" ");
        txt_id_res_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_res_resActionPerformed(evt);
            }
        });

        cmb_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nitActionPerformed(evt);
            }
        });

        cmb_id_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_id_resActionPerformed(evt);
            }
        });

        txt_tiempo.setText(" ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/restaurante (1).png"))); // NOI18N
        jButton1.setText("Guardar Reservación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 16)); // NOI18N
        jLabel4.setText("ID_Reservación:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 16)); // NOI18N
        jLabel6.setText("NIT:");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel7.setText("ID_Restaurante:");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel8.setText("Tiempo:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel3.setText("Ubicacion");

        cmb_filtro_ubi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_filtro_ubiActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filtro-removebg-preview (1).png"))); // NOI18N
        jButton2.setText("Filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione una ubicación y presione el botón");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Utilice esta ventana para agregar paquetes.");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel9.setText("para filtrar reservaciones.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmb_nit, 0, 174, Short.MAX_VALUE)
                                    .addComponent(txt_id_res_res)
                                    .addComponent(cmb_id_res, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_tiempo))))
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_filtro_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_res_res, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_id_res, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_filtro_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Airtemala™ 2024. Todos los derechos registrados.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_res_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_res_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_res_resActionPerformed

    private void cmb_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nitActionPerformed
      String cmbnit = (String) cmb_nit.getSelectedItem();
    }//GEN-LAST:event_cmb_nitActionPerformed

    private void cmb_id_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_id_resActionPerformed
        // TODO add your handling code here:
        String selectedID = (String) cmb_id_res.getSelectedItem();
    }//GEN-LAST:event_cmb_id_resActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
    // Obtener la conexión a SQL Server
    Conexion connect = new Conexion();
    Connection con = connect.getConexion();

    // Validar que los campos no estén vacíos
    if (txt_id_res_res.getText().isEmpty() || cmb_nit.getSelectedItem() == null || 
        cmb_id_res.getSelectedItem() == null || txt_tiempo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Res_Res es un número
    if (!txt_id_res_res.getText().matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Res_Res debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que nit_a es un número
    if (!((String) cmb_nit.getSelectedItem()).matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo nit_a debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que ID_Rest es un número
    if (!((String) cmb_id_res.getSelectedItem()).matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "El campo ID_Rest debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar el formato de Tiempo (HH:MM o HH:MM:SS)
    String tiempo = txt_tiempo.getText().trim();
    if (!tiempo.matches("(\\d{1,2}:\\d{2})(:\\d{2})?")) {
        JOptionPane.showMessageDialog(this, "El campo Tiempo debe estar en formato HH:MM o HH:MM:SS.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Consulta SQL preparada con parámetros
    String sql = "INSERT INTO RESERVAS_RESTAURANTE (ID_Res_Res, nit_a, ID_Rest, Tiempo) VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);

    // Asignar los valores de los campos
    pst.setInt(1, Integer.parseInt(txt_id_res_res.getText().trim()));  // Eliminar espacios antes de convertir a entero
    pst.setInt(2, Integer.parseInt(((String) cmb_nit.getSelectedItem()).trim()));  // Eliminar espacios antes de convertir a entero
    pst.setInt(3, Integer.parseInt(((String) cmb_id_res.getSelectedItem()).trim()));  // Eliminar espacios antes de convertir a entero
    pst.setString(4, tiempo);  // Tiempo en formato HH:MM o HH:MM:SS

    // Ejecutar la consulta
    int n = pst.executeUpdate();

    // Verificar si se insertaron los datos
    if (n > 0) {
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
    }

    // Limpiar los campos
    txt_id_res_res.setText("");
    txt_tiempo.setText("");
    cmb_nit.setSelectedIndex(0);
    cmb_id_res.setSelectedIndex(0);

} catch (SQLException | HeadlessException e) {
    JOptionPane.showMessageDialog(this, "LOS DATOS NO SE GUARDARON CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
    System.out.println("Error: " + e.getMessage());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Error de formato numérico en los campos ID_Res_Res, nit_a o ID_Rest", "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        filtro = cmb_filtro_ubi.getSelectedItem().toString();
        llenarComboBox();
        activar_filtro = true;
        JOptionPane.showMessageDialog(null, "Filtro aplicado");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_filtro_ubiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_filtro_ubiActionPerformed
        // TODO add your handling code here:
        String selectedID = (String) cmb_filtro_ubi.getSelectedItem();
    }//GEN-LAST:event_cmb_filtro_ubiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_filtro_ubi;
    private javax.swing.JComboBox<String> cmb_id_res;
    private javax.swing.JComboBox<String> cmb_nit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_id_res_res;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
