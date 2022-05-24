package administrador;

import medicos.buscarMedico;
import medicos.eliminarMedico;
import medicos.verMedico;
import medicos.añadirMedico;
import medicos.actulizarMedico;
import Main.Hospital;
import javax.swing.ImageIcon;


public class GestionMedico extends javax.swing.JFrame {

    public static String username;

    public GestionMedico() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    public void User(String Username) {
        username = Username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblGestionMedicoTitulo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        panAgregarMedico = new javax.swing.JPanel();
        addReceptionbtn1 = new javax.swing.JLabel();
        addReceptionbtn3 = new javax.swing.JLabel();
        panGestionMedicoActualizar = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        updateReceptionbtn2 = new javax.swing.JLabel();
        panGestionMedicoEliminar = new javax.swing.JPanel();
        deleteReceptionbtn = new javax.swing.JLabel();
        deleteReceptionbtn2 = new javax.swing.JLabel();
        panGestionMedicoVentana = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        viewReceptionbtn2 = new javax.swing.JLabel();
        panGestionMedicoBuscar = new javax.swing.JPanel();
        searchReceptionbtn = new javax.swing.JLabel();
        searchReceptionbtn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Medicos");

        jPanel1.setToolTipText("");
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        lblGestionMedicoTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblGestionMedicoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionMedicoTitulo.setText("Portal Médico");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGestionMedicoTitulo)
                .addGap(441, 441, 441)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblGestionMedicoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel17))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("al");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Portal Médico");
        jLabel3.setToolTipText("");

        adminName.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(adminName)))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(adminName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        panAgregarMedico.setBackground(java.awt.Color.lightGray);
        panAgregarMedico.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn1.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        addReceptionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        addReceptionbtn1.setText("Agregar");
        addReceptionbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn1MouseClicked(evt);
            }
        });

        addReceptionbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panAgregarMedicoLayout = new javax.swing.GroupLayout(panAgregarMedico);
        panAgregarMedico.setLayout(panAgregarMedicoLayout);
        panAgregarMedicoLayout.setHorizontalGroup(
            panAgregarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregarMedicoLayout.createSequentialGroup()
                .addGroup(panAgregarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAgregarMedicoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(addReceptionbtn3))
                    .addGroup(panAgregarMedicoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addReceptionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAgregarMedicoLayout.setVerticalGroup(
            panAgregarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgregarMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addReceptionbtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addReceptionbtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionMedicoActualizar.setBackground(java.awt.Color.lightGray);

        updateReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        updateReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        updateReceptionbtn.setText("Actualizar");
        updateReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtnMouseClicked(evt);
            }
        });

        updateReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatepatient.png"))); // NOI18N
        updateReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panGestionMedicoActualizarLayout = new javax.swing.GroupLayout(panGestionMedicoActualizar);
        panGestionMedicoActualizar.setLayout(panGestionMedicoActualizarLayout);
        panGestionMedicoActualizarLayout.setHorizontalGroup(
            panGestionMedicoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionMedicoActualizarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(updateReceptionbtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoActualizarLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panGestionMedicoActualizarLayout.setVerticalGroup(
            panGestionMedicoActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionMedicoEliminar.setBackground(java.awt.Color.lightGray);
        panGestionMedicoEliminar.setPreferredSize(new java.awt.Dimension(150, 100));

        deleteReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        deleteReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteReceptionbtn.setText("Eliminar");
        deleteReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReceptionbtnMouseClicked(evt);
            }
        });

        deleteReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/deletepatient.png"))); // NOI18N
        deleteReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panGestionMedicoEliminarLayout = new javax.swing.GroupLayout(panGestionMedicoEliminar);
        panGestionMedicoEliminar.setLayout(panGestionMedicoEliminarLayout);
        panGestionMedicoEliminarLayout.setHorizontalGroup(
            panGestionMedicoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionMedicoEliminarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(deleteReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionMedicoEliminarLayout.setVerticalGroup(
            panGestionMedicoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionMedicoVentana.setBackground(java.awt.Color.lightGray);
        panGestionMedicoVentana.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        viewReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReceptionbtn.setText("Ventana");
        viewReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtnMouseClicked(evt);
            }
        });

        viewReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/viewpatient.png"))); // NOI18N
        viewReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panGestionMedicoVentanaLayout = new javax.swing.GroupLayout(panGestionMedicoVentana);
        panGestionMedicoVentana.setLayout(panGestionMedicoVentanaLayout);
        panGestionMedicoVentanaLayout.setHorizontalGroup(
            panGestionMedicoVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionMedicoVentanaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(viewReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoVentanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionMedicoVentanaLayout.setVerticalGroup(
            panGestionMedicoVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoVentanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionMedicoBuscar.setBackground(java.awt.Color.lightGray);
        panGestionMedicoBuscar.setPreferredSize(new java.awt.Dimension(150, 100));

        searchReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        searchReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchReceptionbtn.setText("Buscar ");
        searchReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtnMouseClicked(evt);
            }
        });

        searchReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchpatient.png"))); // NOI18N
        searchReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panGestionMedicoBuscarLayout = new javax.swing.GroupLayout(panGestionMedicoBuscar);
        panGestionMedicoBuscar.setLayout(panGestionMedicoBuscarLayout);
        panGestionMedicoBuscarLayout.setHorizontalGroup(
            panGestionMedicoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionMedicoBuscarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(searchReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionMedicoBuscarLayout.setVerticalGroup(
            panGestionMedicoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionMedicoBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panGestionMedicoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panGestionMedicoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(panGestionMedicoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panGestionMedicoVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 314, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panGestionMedicoActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panGestionMedicoEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panGestionMedicoBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panGestionMedicoVentana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        adminName.setText(username);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void addReceptionbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn1MouseClicked
        añadirMedico aDoctor = new añadirMedico();
        aDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn1MouseClicked

    private void addReceptionbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn3MouseClicked
        añadirMedico aDoctor = new añadirMedico();
        aDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn3MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtnMouseClicked
        actulizarMedico uReceptionist = new actulizarMedico();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtnMouseClicked

    private void updateReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtn2MouseClicked
        actulizarMedico uReceptionist = new actulizarMedico();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtn2MouseClicked

    private void deleteReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtnMouseClicked
        eliminarMedico dDoctor = new eliminarMedico();
        dDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtnMouseClicked

    private void deleteReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtn2MouseClicked
        eliminarMedico dDoctor = new eliminarMedico();
        dDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtn2MouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtnMouseClicked
        verMedico vReceptionist = new verMedico();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtnMouseClicked

    private void viewReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn2MouseClicked
        verMedico vReceptionist = new verMedico();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtn2MouseClicked

    private void searchReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtnMouseClicked
        buscarMedico sReceptionist = new buscarMedico();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtnMouseClicked

    private void searchReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtn2MouseClicked
        buscarMedico sReceptionist = new buscarMedico();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtn2MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        ActividadAdministrador aActivity = new ActividadAdministrador();
        aActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GestionMedico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn1;
    private javax.swing.JLabel addReceptionbtn3;
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel deleteReceptionbtn;
    private javax.swing.JLabel deleteReceptionbtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblGestionMedicoTitulo;
    private javax.swing.JPanel panAgregarMedico;
    private javax.swing.JPanel panGestionMedicoActualizar;
    private javax.swing.JPanel panGestionMedicoBuscar;
    private javax.swing.JPanel panGestionMedicoEliminar;
    private javax.swing.JPanel panGestionMedicoVentana;
    private javax.swing.JLabel searchReceptionbtn;
    private javax.swing.JLabel searchReceptionbtn2;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn2;
    private javax.swing.JLabel viewReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn2;
    // End of variables declaration//GEN-END:variables
}
