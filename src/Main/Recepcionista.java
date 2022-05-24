package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import recepcionistas.actividadRecepcionista;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Recepcionista extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Recepcionista() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRecepcionistaTitulo = new java.awt.Label();
        lblRecepcionistaUsuario = new javax.swing.JLabel();
        txtRecepcionistaUsuario = new javax.swing.JTextField();
        lblRecepcionistaContraseña = new javax.swing.JLabel();
        txtRecepcionistaContraseña = new javax.swing.JPasswordField();
        btnRecepcionistaInicio = new javax.swing.JButton();
        btnRecepcionistaConstraseña = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcionista.");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        lblRecepcionistaTitulo.setAlignment(java.awt.Label.CENTER);
        lblRecepcionistaTitulo.setBackground(new java.awt.Color(0, 153, 153));
        lblRecepcionistaTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblRecepcionistaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblRecepcionistaTitulo.setText("Sistema de gestión hospitalaria");
        getContentPane().add(lblRecepcionistaTitulo);
        lblRecepcionistaTitulo.setBounds(0, 34, 1000, 70);
        lblRecepcionistaTitulo.getAccessibleContext().setAccessibleName("Sistema de gestión hospitalaria IMSS");

        lblRecepcionistaUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRecepcionistaUsuario.setText("Usuario:");
        getContentPane().add(lblRecepcionistaUsuario);
        lblRecepcionistaUsuario.setBounds(262, 168, 88, 29);

        txtRecepcionistaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecepcionistaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtRecepcionistaUsuario);
        txtRecepcionistaUsuario.setBounds(388, 168, 279, 29);

        lblRecepcionistaContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRecepcionistaContraseña.setText("Contraseña:");
        getContentPane().add(lblRecepcionistaContraseña);
        lblRecepcionistaContraseña.setBounds(240, 300, 130, 29);

        txtRecepcionistaContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecepcionistaContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRecepcionistaContraseña);
        txtRecepcionistaContraseña.setBounds(388, 302, 279, 29);

        btnRecepcionistaInicio.setBackground(new java.awt.Color(0, 204, 204));
        btnRecepcionistaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRecepcionistaInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnRecepcionistaInicio.setText("Inicio");
        btnRecepcionistaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionistaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecepcionistaInicio);
        btnRecepcionistaInicio.setBounds(388, 404, 91, 35);

        btnRecepcionistaConstraseña.setBackground(new java.awt.Color(0, 153, 153));
        btnRecepcionistaConstraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRecepcionistaConstraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnRecepcionistaConstraseña.setText("Acceso");
        btnRecepcionistaConstraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionistaConstraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecepcionistaConstraseña);
        btnRecepcionistaConstraseña.setBounds(576, 404, 91, 35);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecepcionistaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecepcionistaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecepcionistaUsuarioActionPerformed

    private void txtRecepcionistaContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecepcionistaContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecepcionistaContraseñaActionPerformed

    private void btnRecepcionistaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionistaInicioActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRecepcionistaInicioActionPerformed

    private void btnRecepcionistaConstraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionistaConstraseñaActionPerformed
        connection = Connector.ConnectDb();
        String user = txtRecepcionistaUsuario.getText();
        String pass = String.valueOf(txtRecepcionistaContraseña.getPassword());
        try {
            String sql = "select usuario,contraseña from receptionist where usuario='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.first();
            if (pass.equals(result.getString("contraseña"))) {
                actividadRecepcionista rActivity = new actividadRecepcionista();
                rActivity.setVisible(true);
                username = user;
                actividadRecepcionista.username = username;
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_btnRecepcionistaConstraseñaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Recepcionista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecepcionistaConstraseña;
    private javax.swing.JButton btnRecepcionistaInicio;
    private javax.swing.JLabel lblRecepcionistaContraseña;
    private java.awt.Label lblRecepcionistaTitulo;
    private javax.swing.JLabel lblRecepcionistaUsuario;
    private javax.swing.JPasswordField txtRecepcionistaContraseña;
    private javax.swing.JTextField txtRecepcionistaUsuario;
    // End of variables declaration//GEN-END:variables
}
