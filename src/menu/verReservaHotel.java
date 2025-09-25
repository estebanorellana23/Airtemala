
package menu;
import SQL.Conexion;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.table.DefaultTableModel;
import SQL.Conexion;
import java.awt.HeadlessException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class verReservaHotel extends javax.swing.JInternalFrame {

    /**
     * Creates new form verReservaTransporte
     */
    public verReservaHotel() {
        initComponents();
        cargarDatosReservaHotel();
    }

    private void cargarDatosReservaHotel() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID_Res_Hot");
    model.addColumn("nit_a");
    model.addColumn("ID_Hotel");
    model.addColumn("ID_Habitacion");
    model.addColumn("Check_In");
    model.addColumn("Check_Out");
    model.addColumn("Total_Reser");

    try {
        // Conexión a SQL Server y consulta
        Conexion connect = new Conexion();
        java.sql.Connection con = connect.getConexion();
        String sql = "SELECT ID_Res_Hot, nit_a, ID_Hotel, ID_Habitacion, Check_In, Check_Out, Total_Reser FROM RESERVAS_HOTELES";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Llenar el modelo de la tabla con los datos obtenidos
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("ID_Res_Hot"),
                rs.getInt("nit_a"),
                rs.getInt("ID_Hotel"),
                rs.getInt("ID_Habitacion"),
                rs.getTimestamp("Check_In"),  // Timestamp para Check_In
                rs.getTimestamp("Check_Out"), // Timestamp para Check_Out
                rs.getFloat("Total_Reser")    // Total de la reserva
            });
        }

        // Asignar el modelo a la tabla
        TreservaHotel.setModel(model);

        // Cerrar recursos
        rs.close();
        pst.close();
        con.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener los datos de RESERVAS_HOTELES", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TreservaHotel = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(3, 54, 61));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reservaciones.png"))); // NOI18N
        jLabel1.setText("Ver Reservas de Hotel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        TreservaHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RES HOTEL", "NIT", "ID HOTEL", "ID HABITACION", "CHECK IN ", "CHECK OUT", "TOTAL RESERVA"
            }
        ));
        jScrollPane1.setViewportView(TreservaHotel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TreservaHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
