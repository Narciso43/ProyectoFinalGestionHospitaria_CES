package Main;

import medicos.actividadMedico;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Medico extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String userName;

    public Medico() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMedicoTiulo = new java.awt.Label();
        lblDoctorUsuario = new javax.swing.JLabel();
        txtMedicoUsuario = new javax.swing.JTextField();
        lblDoctorContraseña = new javax.swing.JLabel();
        txtMedicoContraseña = new javax.swing.JPasswordField();
        btnMedicoInicio = new javax.swing.JButton();
        btnMedicoAcceso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hola Doctor.");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));

        jPanel1.setLayout(null);

        lblMedicoTiulo.setAlignment(java.awt.Label.CENTER);
        lblMedicoTiulo.setBackground(new java.awt.Color(0, 153, 153));
        lblMedicoTiulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMedicoTiulo.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicoTiulo.setText("Sistema de gestión hospitalaria");

        lblDoctorUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDoctorUsuario.setText("Usuario:");

        txtMedicoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoUsuarioActionPerformed(evt);
            }
        });

        lblDoctorContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDoctorContraseña.setText("Contraseña:");

        btnMedicoInicio.setBackground(new java.awt.Color(0, 204, 204));
        btnMedicoInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMedicoInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicoInicio.setText("Inicio");
        btnMedicoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoInicioActionPerformed(evt);
            }
        });

        btnMedicoAcceso.setBackground(new java.awt.Color(0, 153, 153));
        btnMedicoAcceso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMedicoAcceso.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicoAcceso.setText("Acceso");
        btnMedicoAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoAccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1004, 1004, 1004)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
            .addComponent(lblMedicoTiulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoctorContraseña)
                            .addComponent(lblDoctorUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedicoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(btnMedicoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnMedicoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblMedicoTiulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorUsuario)
                    .addComponent(txtMedicoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMedicoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDoctorContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedicoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedicoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoUsuarioActionPerformed

    private void btnMedicoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoInicioActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMedicoInicioActionPerformed

    private void btnMedicoAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoAccesoActionPerformed
        connection = Connector.ConnectDb();
        String user = txtMedicoUsuario.getText();
        String pass = String.valueOf(txtMedicoContraseña.getPassword());

        try {
            String sql = "select usuario, contraseña from medicos where usuario='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.first();
            userName = user;
            if (pass.equals(result.getString("contraseña"))) {
                actividadMedico dActivity = new actividadMedico(userName);
                dActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitosa", "BIENVENIDO " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Error de inicio de sesion", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta.");
        }
    }//GEN-LAST:event_btnMedicoAccesoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Medico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicoAcceso;
    private javax.swing.JButton btnMedicoInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDoctorContraseña;
    private javax.swing.JLabel lblDoctorUsuario;
    private java.awt.Label lblMedicoTiulo;
    private javax.swing.JPasswordField txtMedicoContraseña;
    private javax.swing.JTextField txtMedicoUsuario;
    // End of variables declaration//GEN-END:variables
}
