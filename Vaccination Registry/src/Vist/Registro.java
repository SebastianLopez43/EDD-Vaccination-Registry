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
    public String[] copia = pacienteArray.clone();
    
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
        btnMenu = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfoPaciente = new javax.swing.JTextArea();
        lblNombre1 = new javax.swing.JLabel();
        txtNombreConsulta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblNombre2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, -1));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        lblEdad.setText("Edad :");

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
        lblGénero.setText("Género :");

        jcbGénero.setBackground(new java.awt.Color(255, 255, 255));
        jcbGénero.setForeground(new java.awt.Color(0, 0, 0));
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

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
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

        txtMunicipio.setBackground(new java.awt.Color(255, 255, 255));
        txtMunicipio.setForeground(new java.awt.Color(0, 0, 0));
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

        txtNumCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCalle.setForeground(new java.awt.Color(0, 0, 0));
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

        txtCódigoPostal.setBackground(new java.awt.Color(255, 255, 255));
        txtCódigoPostal.setForeground(new java.awt.Color(0, 0, 0));
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

        txtCurp.setBackground(new java.awt.Color(255, 255, 255));
        txtCurp.setForeground(new java.awt.Color(0, 0, 0));
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

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
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
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addGap(40, 40, 40)
                                .addComponent(txtApellido))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(37, 37, 37)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblApellido1)
                                .addGap(66, 66, 66)
                                .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblEdad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblGénero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirección2)
                            .addComponent(lblDirección1)
                            .addComponent(lblApellido2))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCalle)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblDirección3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblDirección4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCódigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblDirección)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad))
                        .addGap(20, 20, 20)
                        .addComponent(lblApellido))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGénero)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGénero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido1))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblDirección)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDirección1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDirección2)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDirección3)
                                    .addComponent(txtNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDirección4)
                                    .addComponent(txtCódigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido2))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 620, 440));

        btnMenu.setBackground(java.awt.Color.darkGray);
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Regresar al Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 191, -1));

        btnConsult.setBackground(java.awt.Color.darkGray);
        btnConsult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("Consulta");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 90, 32));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Consulta de paciente.");

        txaInfoPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txaInfoPaciente.setColumns(20);
        txaInfoPaciente.setForeground(new java.awt.Color(0, 0, 0));
        txaInfoPaciente.setRows(5);
        jScrollPane1.setViewportView(txaInfoPaciente);

        lblNombre1.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre1.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre1.setText("Nombre:");

        txtNombreConsulta.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreConsulta.setForeground(new java.awt.Color(0, 0, 0));

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

        btnBorrar.setBackground(java.awt.Color.darkGray);
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre1)
                            .addComponent(lblNombre2)
                            .addComponent(txtNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGap(45, 45, 45))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre2)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        Consulta consulta = new Consulta();               
        consulta.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btnConsultActionPerformed

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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Main_Menu menu = new Main_Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String paciente = pacienteArray[0];
        String separador = "\n";
        pacienteArray = paciente.split(separador);
        if(txtNombreConsulta.getText().equals(pacienteArray[0])){
            System.out.println(copia[0]);
        } else {
            JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Validamos si el cuadro de texto no está vacío.
        if (!"".equals(txtNombreConsulta.getText()) && !"".equals(txaInfoPaciente.getText())) {
            txtNombreConsulta.setText(""); // Dejamos en blanco el cuadro de texto para una nueva consulta.
            txaInfoPaciente.setText(""); // Dejamos el área de texto en blanco.
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, introduce un nombre.");
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

    }//GEN-LAST:event_btnBorrarActionPerformed
    
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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbEdad;
    private javax.swing.JComboBox<String> jcbGénero;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblDirección;
    private javax.swing.JLabel lblDirección1;
    private javax.swing.JLabel lblDirección2;
    private javax.swing.JLabel lblDirección3;
    private javax.swing.JLabel lblDirección4;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblGénero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JTextArea txaInfoPaciente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCódigoPostal;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreConsulta;
    private javax.swing.JTextField txtNumCalle;
    // End of variables declaration//GEN-END:variables
}
