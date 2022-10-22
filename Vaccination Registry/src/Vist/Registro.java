package Vist;

import javax.swing.JOptionPane;

/**
 * @author Propietario
 */

public class Registro extends javax.swing.JFrame {

    String[] nameArray = new String[200];
    String[] lastNameArray = new String[200];
    String[] calleArray = new String[200];
    String[] coloniaArray = new String[200];
    String[] numCalleArray = new String[200];
    int[] ageArray = new int[200];
    String[] genderArray = new String[200];
    String[] bloodTypeArray = new String[200];
    
    int i = 0, j = 0, k = 0, l = 0, m = 0;

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRegistry = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDirección = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        jcbEdad = new javax.swing.JComboBox<>();
        lblGénero = new javax.swing.JLabel();
        jcbGénero = new javax.swing.JComboBox<>();
        btnRecord = new javax.swing.JButton();
        lblTipoSangre = new javax.swing.JLabel();
        jcbTipoSangre = new javax.swing.JComboBox<>();
        lblApellido = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblDirección1 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblDirección2 = new javax.swing.JLabel();
        lblDirección3 = new javax.swing.JLabel();
        txtNumCalle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(79, 135, 36));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estado_Chihuahua_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 955, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnRegistry.setBackground(java.awt.Color.darkGray);
        btnRegistry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistry.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistry.setText("Registro");
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });

        btnConsult.setBackground(java.awt.Color.darkGray);
        btnConsult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("Consulta");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registro.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 154, -1, 330));

        jPanel4.setBackground(new java.awt.Color(79, 135, 36));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 518, 955, -1));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Registro de paciente.");

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre.setText("Nombre/s:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblDirección.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección.setText("Dirección");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblEdad.setBackground(new java.awt.Color(0, 0, 0));
        lblEdad.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 102, 102));
        lblEdad.setText("Edad:");

        jcbEdad.setBackground(new java.awt.Color(255, 255, 255));
        jcbEdad.setForeground(new java.awt.Color(0, 0, 0));
        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jcbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdadActionPerformed(evt);
            }
        });

        lblGénero.setBackground(new java.awt.Color(0, 0, 0));
        lblGénero.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblGénero.setForeground(new java.awt.Color(0, 102, 102));
        lblGénero.setText("Género:");

        jcbGénero.setBackground(new java.awt.Color(255, 255, 255));
        jcbGénero.setForeground(new java.awt.Color(0, 0, 0));
        jcbGénero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        jcbGénero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGéneroActionPerformed(evt);
            }
        });

        btnRecord.setBackground(java.awt.Color.darkGray);
        btnRecord.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnRecord.setText("Registrar");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        lblTipoSangre.setBackground(new java.awt.Color(0, 0, 0));
        lblTipoSangre.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblTipoSangre.setForeground(new java.awt.Color(0, 102, 102));
        lblTipoSangre.setText("Tipo de sangre:");

        jcbTipoSangre.setBackground(new java.awt.Color(255, 255, 255));
        jcbTipoSangre.setForeground(new java.awt.Color(0, 0, 0));
        jcbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        jcbTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoSangreActionPerformed(evt);
            }
        });

        lblApellido.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido.setText("Apellidos:");

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        lblDirección1.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección1.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección1.setText("Calle");

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });

        lblDirección2.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección2.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección2.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección2.setText("Colonia");

        lblDirección3.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección3.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección3.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección3.setText("No.");

        txtNumCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtNumCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirección2)
                            .addComponent(lblDirección1))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtColonia))
                        .addGap(26, 26, 26)
                        .addComponent(lblDirección3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblNombre))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblDirección)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblTipoSangre)
                            .addComponent(lblGénero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblDirección)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirección2)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addGap(18, 18, 18)
                                .addComponent(lblGénero)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipoSangre)
                                    .addComponent(jcbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirección1)
                            .addComponent(lblDirección3)
                            .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 154, 660, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed
       // Nos encontramos en esa ventana.
    }//GEN-LAST:event_btnRegistryActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        Consulta consulta = new Consulta();        
        consulta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        if (!"".equals(txtNombre.getText()) || !"".equals(txtApellido.getText()) || !"".equals(txtCalle.getText()) || !"".equals(txtColonia.getText()) || !"".equals(txtNumCalle.getText())) {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String calle = txtCalle.getText();
            String colonia = txtColonia.getText();
            String numCalle = txtNumCalle.getText();
            
            nameArray[i] = nombre;
            lastNameArray[j] = apellido;
            calleArray[k] = calle;
            coloniaArray[l] = colonia;
            numCalleArray[m] = numCalle;
            i++;
            j++;
            k++;
            l++;
            m++;
            JOptionPane.showMessageDialog(null, "Paciente Registrado");
            
            txtNombre.setText("");
            txtApellido.setText("");
            txtCalle.setText("");
            txtColonia.setText("");
            txtNumCalle.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos están vacíos.");
        }
        
        JOptionPane.showMessageDialog(null, nameArray[1]);
    }//GEN-LAST:event_btnRecordActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
    }//GEN-LAST:event_txtCalleActionPerformed

    private void jcbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdadActionPerformed
        /*int n = jcbEdad.getSelectedIndex();
        ageArray[l] = n;
        k++;*/
    }//GEN-LAST:event_jcbEdadActionPerformed

    private void jcbGéneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGéneroActionPerformed
        /*Object n = jcbGender.getSelectedItem();
        String o = n.toString();
        if ("1".equals(o)) {
            genderArray[m] = o;
        } else if ("2".equals(o)) {
            genderArray[m] = o;
        }
        l++;*/
    }//GEN-LAST:event_jcbGéneroActionPerformed

    private void jcbTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoSangreActionPerformed
        /*Object n = jcbBloodType.getSelectedItem();
        String o = n.toString();
        
        bloodTypeArray[m] = o;
        m++;*/
    }//GEN-LAST:event_jcbTipoSangreActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void txtNumCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCalleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRegistry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jcbEdad;
    private javax.swing.JComboBox<String> jcbGénero;
    private javax.swing.JComboBox<String> jcbTipoSangre;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDirección;
    private javax.swing.JLabel lblDirección1;
    private javax.swing.JLabel lblDirección2;
    private javax.swing.JLabel lblDirección3;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblGénero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCalle;
    // End of variables declaration//GEN-END:variables
}
