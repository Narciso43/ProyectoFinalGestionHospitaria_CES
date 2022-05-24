package administrador;

import Main.Hospital;
import recepcionistas.agregarRecepcionista;
import recepcionistas.eliminarRecepcionista;
import recepcionistas.buscarRecepcionista;
import recepcionistas.actualizarRecepcionista;
import recepcionistas.verRecepcionista;
import javax.swing.ImageIcon;


public class GestionRecepcionista extends javax.swing.JFrame {

    public GestionRecepcionista() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblGestionRecepcionistaTitulo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panGestionRecepcionistasAgregar = new javax.swing.JPanel();
        addReceptionbtn = new javax.swing.JLabel();
        addReceptionbtn2 = new javax.swing.JLabel();
        panGestionRecepcionistasActualizar = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        updateReceptionbtn2 = new javax.swing.JLabel();
        panGestionRecepcionistasEliminar = new javax.swing.JPanel();
        deleteReceptionbtn = new javax.swing.JLabel();
        deleteReceptionbtn2 = new javax.swing.JLabel();
        panGestionRecepcionistasVista = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        viewReceptionbtn2 = new javax.swing.JLabel();
        panGestionRecepcionistasBuscar = new javax.swing.JPanel();
        searchReceptionbtn = new javax.swing.JLabel();
        searchReceptionbtn2 = new javax.swing.JLabel();
        panGestionRecepcionistaSubtitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Recepcionista ");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        lblGestionRecepcionistaTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblGestionRecepcionistaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionRecepcionistaTitulo.setText("Gestión de Recepcionistas");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(lblGestionRecepcionistaTitulo)
                .addGap(365, 365, 365)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblGestionRecepcionistaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panGestionRecepcionistasAgregar.setBackground(java.awt.Color.lightGray);
        panGestionRecepcionistasAgregar.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        addReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        addReceptionbtn.setText("Agregar");
        addReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtnMouseClicked(evt);
            }
        });

        addReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panGestionRecepcionistasAgregarLayout = new javax.swing.GroupLayout(panGestionRecepcionistasAgregar);
        panGestionRecepcionistasAgregar.setLayout(panGestionRecepcionistasAgregarLayout);
        panGestionRecepcionistasAgregarLayout.setHorizontalGroup(
            panGestionRecepcionistasAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistasAgregarLayout.createSequentialGroup()
                .addGroup(panGestionRecepcionistasAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGestionRecepcionistasAgregarLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(addReceptionbtn2))
                    .addGroup(panGestionRecepcionistasAgregarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panGestionRecepcionistasAgregarLayout.setVerticalGroup(
            panGestionRecepcionistasAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionRecepcionistasActualizar.setBackground(java.awt.Color.lightGray);

        updateReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        updateReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        updateReceptionbtn.setText("Actualizar ");
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

        javax.swing.GroupLayout panGestionRecepcionistasActualizarLayout = new javax.swing.GroupLayout(panGestionRecepcionistasActualizar);
        panGestionRecepcionistasActualizar.setLayout(panGestionRecepcionistasActualizarLayout);
        panGestionRecepcionistasActualizarLayout.setHorizontalGroup(
            panGestionRecepcionistasActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistasActualizarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(updateReceptionbtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasActualizarLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panGestionRecepcionistasActualizarLayout.setVerticalGroup(
            panGestionRecepcionistasActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionRecepcionistasEliminar.setBackground(java.awt.Color.lightGray);
        panGestionRecepcionistasEliminar.setPreferredSize(new java.awt.Dimension(150, 100));

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

        javax.swing.GroupLayout panGestionRecepcionistasEliminarLayout = new javax.swing.GroupLayout(panGestionRecepcionistasEliminar);
        panGestionRecepcionistasEliminar.setLayout(panGestionRecepcionistasEliminarLayout);
        panGestionRecepcionistasEliminarLayout.setHorizontalGroup(
            panGestionRecepcionistasEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistasEliminarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(deleteReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionRecepcionistasEliminarLayout.setVerticalGroup(
            panGestionRecepcionistasEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionRecepcionistasVista.setBackground(java.awt.Color.lightGray);
        panGestionRecepcionistasVista.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        viewReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReceptionbtn.setText("Vista");
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

        javax.swing.GroupLayout panGestionRecepcionistasVistaLayout = new javax.swing.GroupLayout(panGestionRecepcionistasVista);
        panGestionRecepcionistasVista.setLayout(panGestionRecepcionistasVistaLayout);
        panGestionRecepcionistasVistaLayout.setHorizontalGroup(
            panGestionRecepcionistasVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistasVistaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(viewReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasVistaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionRecepcionistasVistaLayout.setVerticalGroup(
            panGestionRecepcionistasVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionRecepcionistasBuscar.setBackground(java.awt.Color.lightGray);
        panGestionRecepcionistasBuscar.setPreferredSize(new java.awt.Dimension(150, 100));

        searchReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        searchReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchReceptionbtn.setText("Buscar");
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

        javax.swing.GroupLayout panGestionRecepcionistasBuscarLayout = new javax.swing.GroupLayout(panGestionRecepcionistasBuscar);
        panGestionRecepcionistasBuscar.setLayout(panGestionRecepcionistasBuscarLayout);
        panGestionRecepcionistasBuscarLayout.setHorizontalGroup(
            panGestionRecepcionistasBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistasBuscarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(searchReceptionbtn2)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panGestionRecepcionistasBuscarLayout.setVerticalGroup(
            panGestionRecepcionistasBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionRecepcionistasBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchReceptionbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panGestionRecepcionistaSubtitulo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("al");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión de recepcionistas");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout panGestionRecepcionistaSubtituloLayout = new javax.swing.GroupLayout(panGestionRecepcionistaSubtitulo);
        panGestionRecepcionistaSubtitulo.setLayout(panGestionRecepcionistaSubtituloLayout);
        panGestionRecepcionistaSubtituloLayout.setHorizontalGroup(
            panGestionRecepcionistaSubtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistaSubtituloLayout.createSequentialGroup()
                .addGroup(panGestionRecepcionistaSubtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGestionRecepcionistaSubtituloLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(panGestionRecepcionistaSubtituloLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panGestionRecepcionistaSubtituloLayout.setVerticalGroup(
            panGestionRecepcionistaSubtituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionRecepcionistaSubtituloLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panGestionRecepcionistaSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(315, 315, 315)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panGestionRecepcionistasBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panGestionRecepcionistasAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(71, 71, 71)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panGestionRecepcionistasActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(panGestionRecepcionistasEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panGestionRecepcionistasVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(312, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(panGestionRecepcionistaSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panGestionRecepcionistasAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panGestionRecepcionistasActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panGestionRecepcionistasEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGap(100, 100, 100)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panGestionRecepcionistasBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panGestionRecepcionistasVista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(145, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        ActividadAdministrador aActivity = new ActividadAdministrador();
        aActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void addReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtnMouseClicked
        agregarRecepcionista adr = new agregarRecepcionista();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtnMouseClicked

    private void addReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn2MouseClicked
        agregarRecepcionista adr = new agregarRecepcionista();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn2MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtnMouseClicked
        actualizarRecepcionista uReceptionist = new actualizarRecepcionista();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtnMouseClicked

    private void updateReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtn2MouseClicked
        actualizarRecepcionista uReceptionist = new actualizarRecepcionista();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtn2MouseClicked

    private void deleteReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtnMouseClicked
        eliminarRecepcionista dReceptionist = new eliminarRecepcionista();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtnMouseClicked

    private void deleteReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtn2MouseClicked
        eliminarRecepcionista dReceptionist = new eliminarRecepcionista();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtn2MouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtnMouseClicked
        verRecepcionista vReceptionist = new verRecepcionista();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtnMouseClicked

    private void viewReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn2MouseClicked
        verRecepcionista vReceptionist = new verRecepcionista();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtn2MouseClicked

    private void searchReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtnMouseClicked
        buscarRecepcionista sReceptionist = new buscarRecepcionista();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtnMouseClicked

    private void searchReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtn2MouseClicked
        buscarRecepcionista sReceptionist = new buscarRecepcionista();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtn2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GestionRecepcionista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn;
    private javax.swing.JLabel addReceptionbtn2;
    private javax.swing.JLabel deleteReceptionbtn;
    private javax.swing.JLabel deleteReceptionbtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblGestionRecepcionistaTitulo;
    private javax.swing.JPanel panGestionRecepcionistaSubtitulo;
    private javax.swing.JPanel panGestionRecepcionistasActualizar;
    private javax.swing.JPanel panGestionRecepcionistasAgregar;
    private javax.swing.JPanel panGestionRecepcionistasBuscar;
    private javax.swing.JPanel panGestionRecepcionistasEliminar;
    private javax.swing.JPanel panGestionRecepcionistasVista;
    private javax.swing.JLabel searchReceptionbtn;
    private javax.swing.JLabel searchReceptionbtn2;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn2;
    private javax.swing.JLabel viewReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn2;
    // End of variables declaration//GEN-END:variables

}
