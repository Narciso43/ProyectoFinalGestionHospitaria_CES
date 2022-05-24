package Main;

import javax.swing.ImageIcon;

public class Hospital extends javax.swing.JFrame {

    public Hospital() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainF = new javax.swing.JPanel();
        panHospitalAdministrador = new javax.swing.JPanel();
        adminIcon = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        lblHospitalTitulo = new java.awt.Label();
        panHospitalRecepcionista = new javax.swing.JPanel();
        receptionIcon = new javax.swing.JLabel();
        receptionLabel = new javax.swing.JLabel();
        panHospitalMedico = new javax.swing.JPanel();
        doctorIcon = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblHospitalAcceso = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido al sistema de gestión hospitalaria");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));

        MainF.setName("Welcome To Hospital Management System"); // NOI18N

        panHospitalAdministrador.setBackground(java.awt.Color.lightGray);

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("Administrador");
        adminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panHospitalAdministradorLayout = new javax.swing.GroupLayout(panHospitalAdministrador);
        panHospitalAdministrador.setLayout(panHospitalAdministradorLayout);
        panHospitalAdministradorLayout.setHorizontalGroup(
            panHospitalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalAdministradorLayout.createSequentialGroup()
                .addGroup(panHospitalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panHospitalAdministradorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adminIcon))
                    .addGroup(panHospitalAdministradorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(adminLabel)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panHospitalAdministradorLayout.setVerticalGroup(
            panHospitalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalAdministradorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(adminIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHospitalTitulo.setAlignment(java.awt.Label.CENTER);
        lblHospitalTitulo.setBackground(new java.awt.Color(0, 153, 153));
        lblHospitalTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblHospitalTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalTitulo.setText("Sistema de gestión hospitalaria");

        panHospitalRecepcionista.setBackground(java.awt.Color.lightGray);

        receptionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reception.png"))); // NOI18N
        receptionIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionIconMouseClicked(evt);
            }
        });

        receptionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        receptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        receptionLabel.setText("Recepcionista");
        receptionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panHospitalRecepcionistaLayout = new javax.swing.GroupLayout(panHospitalRecepcionista);
        panHospitalRecepcionista.setLayout(panHospitalRecepcionistaLayout);
        panHospitalRecepcionistaLayout.setHorizontalGroup(
            panHospitalRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalRecepcionistaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(receptionLabel)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHospitalRecepcionistaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receptionIcon)
                .addGap(52, 52, 52))
        );
        panHospitalRecepcionistaLayout.setVerticalGroup(
            panHospitalRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalRecepcionistaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(receptionIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receptionLabel)
                .addContainerGap())
        );

        panHospitalMedico.setBackground(java.awt.Color.lightGray);

        doctorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/doctor.png"))); // NOI18N
        doctorIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIconMouseClicked(evt);
            }
        });

        doctorLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        doctorLabel.setForeground(new java.awt.Color(255, 255, 255));
        doctorLabel.setText("Médico");
        doctorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panHospitalMedicoLayout = new javax.swing.GroupLayout(panHospitalMedico);
        panHospitalMedico.setLayout(panHospitalMedicoLayout);
        panHospitalMedicoLayout.setHorizontalGroup(
            panHospitalMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalMedicoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panHospitalMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorLabel)
                    .addComponent(doctorIcon))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panHospitalMedicoLayout.setVerticalGroup(
            panHospitalMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHospitalMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        lblHospitalAcceso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblHospitalAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalAcceso.setText("Acceso a");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(lblHospitalAcceso)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblHospitalAcceso)
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("al");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sistema Hospitario");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainFLayout = new javax.swing.GroupLayout(MainF);
        MainF.setLayout(MainFLayout);
        MainFLayout.setHorizontalGroup(
            MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHospitalTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainFLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(panHospitalAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(panHospitalMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(panHospitalRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(MainFLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainFLayout.setVerticalGroup(
            MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHospitalTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainFLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panHospitalMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panHospitalAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panHospitalRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblHospitalTitulo.getAccessibleContext().setAccessibleName("Sistema de gestión hospitalaria IMSS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminLabelMouseClicked

    private void doctorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabelMouseClicked
        Medico doctor = new Medico();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorLabelMouseClicked

    private void receptionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionLabelMouseClicked
        Recepcionista receptionist = new Recepcionista();
        receptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_receptionLabelMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminIconMouseClicked

    private void doctorIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIconMouseClicked
        Medico doctor = new Medico();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorIconMouseClicked

    private void receptionIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionIconMouseClicked
        Recepcionista receptionist = new Recepcionista();
        receptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_receptionIconMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Hospital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainF;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel doctorIcon;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblHospitalAcceso;
    private java.awt.Label lblHospitalTitulo;
    private javax.swing.JPanel panHospitalAdministrador;
    private javax.swing.JPanel panHospitalMedico;
    private javax.swing.JPanel panHospitalRecepcionista;
    private javax.swing.JLabel receptionIcon;
    private javax.swing.JLabel receptionLabel;
    // End of variables declaration//GEN-END:variables
}
