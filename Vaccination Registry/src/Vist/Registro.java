package Vist;

import javax.swing.JOptionPane;

import Paciente.Paciente;

/**
 * @authors
 * José Sebastian López Ibarra
 * Sebastián Emilio Murillo Andrade
 * Andrés Sáenz Olivas
 */

public class Registro extends javax.swing.JFrame {
    
    public String[] pacienteArray = new String[5000];
    
    int a = 0;     
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDirección = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        jcbEdad = new javax.swing.JComboBox<>();
        lblGénero = new javax.swing.JLabel();
        jcbGénero = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblDirección1 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblDirección2 = new javax.swing.JLabel();
        lblDirección3 = new javax.swing.JLabel();
        txtNumCalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblDirección4 = new javax.swing.JLabel();
        txtCódigoPostal = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lblApellido2 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfoPaciente = new javax.swing.JTextArea();
        lblNombre1 = new javax.swing.JLabel();
        txtNombreConsulta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNombre2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNombre3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lblDirección5 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        lblEdad1 = new javax.swing.JLabel();
        jcbEdad1 = new javax.swing.JComboBox<>();
        lblGénero1 = new javax.swing.JLabel();
        jcbGénero1 = new javax.swing.JComboBox<>();
        btnRegistrar1 = new javax.swing.JButton();
        lblApellido3 = new javax.swing.JLabel();
        txtColonia1 = new javax.swing.JTextField();
        lblDirección6 = new javax.swing.JLabel();
        txtMunicipio1 = new javax.swing.JTextField();
        lblDirección7 = new javax.swing.JLabel();
        lblDirección8 = new javax.swing.JLabel();
        txtNumCalle1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblDirección9 = new javax.swing.JLabel();
        txtCódigoPostal1 = new javax.swing.JTextField();
        lblApellido4 = new javax.swing.JLabel();
        txtCurp1 = new javax.swing.JTextField();
        lblApellido5 = new javax.swing.JLabel();
        txtCalle1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInfoPaciente1 = new javax.swing.JTextArea();
        lblNombre4 = new javax.swing.JLabel();
        txtNombreConsulta1 = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        lblNombre5 = new javax.swing.JLabel();
        btnBorrar1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnRegresarMenu = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnRegistrarInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(79, 135, 36));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estado_Chihuahua_1.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("Vacuna-T");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacuna.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre.setText("Nombre/s:");

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

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblEdad.setBackground(new java.awt.Color(0, 0, 0));
        lblEdad.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 102, 102));
        lblEdad.setText("Edad :");

        jcbEdad.setBackground(new java.awt.Color(255, 255, 255));
        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jcbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdadActionPerformed(evt);
            }
        });

        lblGénero.setBackground(new java.awt.Color(0, 0, 0));
        lblGénero.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblGénero.setForeground(new java.awt.Color(0, 102, 102));
        lblGénero.setText("Género :");

        jcbGénero.setBackground(new java.awt.Color(255, 255, 255));
        jcbGénero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        jcbGénero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGéneroActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(java.awt.Color.darkGray);
        btnRegistrar.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblApellido.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido.setText("Apellidos :");

        txtColonia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });

        lblDirección1.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección1.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección1.setText("Calle");

        txtMunicipio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipioActionPerformed(evt);
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

        txtNumCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCalleActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Registro de paciente.");

        lblDirección4.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección4.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección4.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección4.setText("C.P. :");

        txtCódigoPostal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCódigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCódigoPostalActionPerformed(evt);
            }
        });

        lblApellido1.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido1.setText("CURP :");

        txtCurp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        lblApellido2.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido2.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido2.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido2.setText("Municipio :");

        txtCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblApellido1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblGénero)
                                .addGap(18, 18, 18)
                                .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirección2)
                            .addComponent(lblDirección1)
                            .addComponent(lblApellido2))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblDirección3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblDirección4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCódigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblDirección)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad)
                            .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGénero)
                            .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblApellido1)))
                .addGap(12, 12, 12)
                .addComponent(lblDirección)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirección1)
                            .addComponent(lblDirección3)
                            .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirección2)
                            .addComponent(lblDirección4)
                            .addComponent(txtCódigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido2))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 560, 440));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Consulta de paciente.");

        txaInfoPaciente.setColumns(20);
        txaInfoPaciente.setRows(5);
        jScrollPane1.setViewportView(txaInfoPaciente);

        lblNombre1.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre1.setText("Nombre:");

        btnBuscar.setBackground(java.awt.Color.darkGray);
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        btnBuscar.setText("  Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(java.awt.Color.darkGray);
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblNombre2.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre2.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre2.setText("Información del paciente:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblNombre1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreConsulta)
                            .addComponent(lblNombre2))))
                .addGap(111, 111, 111)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre1)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 570, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(79, 135, 36));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estado_Chihuahua_1.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Vacuna-T");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacuna.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405)
                .addComponent(jLabel8)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombre3.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre3.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre3.setText("Nombre/s:");

        txtNombre1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        lblDirección5.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección5.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección5.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección5.setText("Dirección");

        txtApellido1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        lblEdad1.setBackground(new java.awt.Color(0, 0, 0));
        lblEdad1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblEdad1.setForeground(new java.awt.Color(0, 102, 102));
        lblEdad1.setText("Edad :");

        jcbEdad1.setBackground(new java.awt.Color(255, 255, 255));
        jcbEdad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jcbEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdad1ActionPerformed(evt);
            }
        });

        lblGénero1.setBackground(new java.awt.Color(0, 0, 0));
        lblGénero1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblGénero1.setForeground(new java.awt.Color(0, 102, 102));
        lblGénero1.setText("Género :");

        jcbGénero1.setBackground(new java.awt.Color(255, 255, 255));
        jcbGénero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        jcbGénero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGénero1ActionPerformed(evt);
            }
        });

        btnRegistrar1.setBackground(java.awt.Color.darkGray);
        btnRegistrar1.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        lblApellido3.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido3.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido3.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido3.setText("Apellidos :");

        txtColonia1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtColonia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColonia1ActionPerformed(evt);
            }
        });

        lblDirección6.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección6.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección6.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección6.setText("Calle");

        txtMunicipio1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMunicipio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipio1ActionPerformed(evt);
            }
        });

        lblDirección7.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección7.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección7.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección7.setText("Colonia");

        lblDirección8.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección8.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección8.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección8.setText("No.");

        txtNumCalle1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumCalle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCalle1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Registro de paciente.");

        lblDirección9.setBackground(new java.awt.Color(0, 0, 0));
        lblDirección9.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblDirección9.setForeground(new java.awt.Color(0, 102, 102));
        lblDirección9.setText("C.P. :");

        txtCódigoPostal1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCódigoPostal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCódigoPostal1ActionPerformed(evt);
            }
        });

        lblApellido4.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido4.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido4.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido4.setText("CURP :");

        txtCurp1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCurp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurp1ActionPerformed(evt);
            }
        });

        lblApellido5.setBackground(new java.awt.Color(0, 0, 0));
        lblApellido5.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblApellido5.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido5.setText("Municipio :");

        txtCalle1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCalle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(lblNombre3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido3)
                                    .addComponent(lblApellido4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCurp1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdad1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(lblGénero1)
                                .addGap(18, 18, 18)
                                .addComponent(jcbGénero1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel11)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirección7)
                            .addComponent(lblDirección6)
                            .addComponent(lblApellido5))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lblDirección8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumCalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lblDirección9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCódigoPostal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMunicipio1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblDirección5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre3)
                            .addComponent(lblEdad1)
                            .addComponent(jcbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido3)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGénero1)
                            .addComponent(jcbGénero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtCurp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblApellido4)))
                .addGap(12, 12, 12)
                .addComponent(lblDirección5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirección6)
                            .addComponent(lblDirección8)
                            .addComponent(txtNumCalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirección7)
                            .addComponent(lblDirección9)
                            .addComponent(txtCódigoPostal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMunicipio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido5))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 560, 440));

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Consulta de paciente.");

        txaInfoPaciente1.setColumns(20);
        txaInfoPaciente1.setRows(5);
        jScrollPane2.setViewportView(txaInfoPaciente1);

        lblNombre4.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre4.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre4.setText("Nombre:");

        btnBuscar1.setBackground(java.awt.Color.darkGray);
        btnBuscar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        btnBuscar1.setText("  Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnLimpiar1.setBackground(java.awt.Color.darkGray);
        btnLimpiar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        lblNombre5.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre5.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre5.setText("Información del paciente:");

        btnBorrar1.setBackground(java.awt.Color.darkGray);
        btnBorrar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        btnBorrar1.setText("Borrar");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblNombre4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreConsulta1)
                            .addComponent(lblNombre5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblNombre4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 570, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnRegresarMenu.setBackground(java.awt.Color.darkGray);
        btnRegresarMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu.setText("Regresar al Menú");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N

        btnRegistrarInformacion.setBackground(java.awt.Color.darkGray);
        btnRegistrarInformacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarInformacion.setText("Registrar Vacuna");
        btnRegistrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnRegistrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btnRegresarMenu)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btnRegistrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15))))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 570, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarPacientes();                 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void jcbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdadActionPerformed
             
    }//GEN-LAST:event_jcbEdadActionPerformed

    private void jcbGéneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGéneroActionPerformed
        
    }//GEN-LAST:event_jcbGéneroActionPerformed

    private void txtMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipioActionPerformed

    }//GEN-LAST:event_txtMunicipioActionPerformed

    private void txtNumCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCalleActionPerformed

    }//GEN-LAST:event_txtNumCalleActionPerformed

    private void txtCódigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCódigoPostalActionPerformed

    }//GEN-LAST:event_txtCódigoPostalActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed

    }//GEN-LAST:event_txtCurpActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed

    }//GEN-LAST:event_txtCalleActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        for(int i=0; i<pacienteArray.length; i++) {
            if (pacienteArray[i].contains(txtNombreConsulta.getText())){
                String paciente = pacienteArray[i];
                String separador = "\n";
                pacienteArray = paciente.split(separador);
                txaInfoPaciente.setText(paciente+separador);
            }           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Validamos si el cuadro de texto no está vacío.
        if (!"".equals(txtNombreConsulta.getText())) {
            txtNombreConsulta.setText(""); // Dejamos en blanco el cuadro de texto para una nueva consulta.
            txaInfoPaciente.setText(""); // Dejamos el área de texto en blanco.
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, introduce un nombre.");
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void jcbEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdad1ActionPerformed

    private void jcbGénero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGénero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGénero1ActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void txtColonia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColonia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColonia1ActionPerformed

    private void txtMunicipio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipio1ActionPerformed

    private void txtNumCalle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCalle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCalle1ActionPerformed

    private void txtCódigoPostal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCódigoPostal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCódigoPostal1ActionPerformed

    private void txtCurp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurp1ActionPerformed

    private void txtCalle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalle1ActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        Main_Menu menu = new Main_Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnRegistrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInformacionActionPerformed
        Registro_Información registrarInfo = new Registro_Información();
        registrarInfo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarInformacionActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrar1ActionPerformed
    
    private void registrarPacientes() {  
        // Validamos si se introdujeron todos los datos, en caso de no ser así, mandamos un mensaje.
        if (!"".equals(txtNombre.getText()) && !"".equals(txtApellido.getText()) && !"".equals(jcbEdad.getSelectedItem()) && !"".equals(jcbGénero.getSelectedItem()) &&
                !"".equals(txtCurp.getText()) && !"".equals(txtCalle.getText()) && !"".equals(txtColonia.getText()) && !"".equals(txtNumCalle.getText()) &&
                !"".equals(txtCódigoPostal.getText()) && !"".equals(txtMunicipio.getText())) {
            
            Paciente paciente = new Paciente();
                        
            String nombre = txtNombre.getText();            
            nombre += " " + txtApellido.getText();            
            paciente.setNombre(nombre);                    
            
            String edad = jcbEdad.getSelectedItem().toString();
            paciente.setEdad(edad);
            
            String genero = jcbGénero.getSelectedItem().toString();
            paciente.setGenero(genero);
            
            String curp = txtCurp.getText();
            paciente.setCurp(curp);
            
            String calle = txtCalle.getText();
            paciente.setCalle(calle);
            
            String colonia = txtColonia.getText();
            paciente.setColonia(colonia);
            
            String numCalle = txtNumCalle.getText();
            paciente.setNumCalle(numCalle);
            
            String codPostal = txtCódigoPostal.getText();
            paciente.setCodPost(codPostal);
            
            String municipio = txtMunicipio.getText();
            paciente.setMunicipio(municipio);
            
            pacienteArray[a] = paciente.getNombre() + "\n" + paciente.getEdad() + "\n" + paciente.getGenero() + "\n" + paciente.getCurp() + "\n" + paciente.getCalle() +
                    " " + paciente.getNumCalle() + "\n" + paciente.getColonia() + "\n" + paciente.getCodPost() + "\n" + paciente.getMunicipio();

            JOptionPane.showMessageDialog(null, "Paciente Registrado");          
            
            a++;                    
            
            // Dejamos en blanco los cuadros de texto para realizar un nuevo registro.
            txtNombre.setText("");
            txtApellido.setText("");
            jcbEdad.setSelectedItem("");
            jcbGénero.setSelectedItem("");
            txtCurp.setText("");
            txtCalle.setText("");
            txtColonia.setText("");
            txtNumCalle.setText("");
            txtCódigoPostal.setText("");
            txtMunicipio.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Existe algún campo vacío. Verifica de nuevo.");
        }                              
    }     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrarInformacion;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbEdad;
    private javax.swing.JComboBox<String> jcbEdad1;
    private javax.swing.JComboBox<String> jcbGénero;
    private javax.swing.JComboBox<String> jcbGénero1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblApellido3;
    private javax.swing.JLabel lblApellido4;
    private javax.swing.JLabel lblApellido5;
    private javax.swing.JLabel lblDirección;
    private javax.swing.JLabel lblDirección1;
    private javax.swing.JLabel lblDirección2;
    private javax.swing.JLabel lblDirección3;
    private javax.swing.JLabel lblDirección4;
    private javax.swing.JLabel lblDirección5;
    private javax.swing.JLabel lblDirección6;
    private javax.swing.JLabel lblDirección7;
    private javax.swing.JLabel lblDirección8;
    private javax.swing.JLabel lblDirección9;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblGénero;
    private javax.swing.JLabel lblGénero1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JTextArea txaInfoPaciente;
    private javax.swing.JTextArea txaInfoPaciente1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCalle1;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtColonia1;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCurp1;
    private javax.swing.JTextField txtCódigoPostal;
    private javax.swing.JTextField txtCódigoPostal1;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtMunicipio1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreConsulta;
    private javax.swing.JTextField txtNombreConsulta1;
    private javax.swing.JTextField txtNumCalle;
    private javax.swing.JTextField txtNumCalle1;
    // End of variables declaration//GEN-END:variables
}
