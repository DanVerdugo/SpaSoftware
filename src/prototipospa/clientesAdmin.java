/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipospa;

/**
 *
 * @author lis_h
 */
public class clientesAdmin extends javax.swing.JFrame {
    principalAdmin pAdmin;

    /**
     * Creates new form usuariosAdmin
     */
    public clientesAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        text_nombreAsistente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        button_registrar = new javax.swing.JButton();
        button_eliminar = new javax.swing.JButton();
        button_actualizar = new javax.swing.JButton();
        button_buscar = new javax.swing.JButton();
        button_verTodo = new javax.swing.JButton();
        button_historial = new javax.swing.JButton();
        button_regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_nombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_contrasena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_contrasena1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        text_nombreAsistente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        table_usuarios.setBackground(new java.awt.Color(255, 102, 0));
        table_usuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_usuarios.setForeground(new java.awt.Color(255, 153, 0));
        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "No. Teléfono", "Correo", "Fecha Nacimiento"
            }
        ));
        table_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_usuariosMouseClicked(evt);
            }
        });
        table_usuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_usuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table_usuarios);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones para usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        button_registrar.setBackground(new java.awt.Color(255, 136, 18));
        button_registrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_registrar.setText("Registrar");
        button_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_registrarMouseClicked(evt);
            }
        });
        button_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registrarActionPerformed(evt);
            }
        });
        button_registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                button_registrarKeyReleased(evt);
            }
        });
        jPanel1.add(button_registrar);

        button_eliminar.setBackground(new java.awt.Color(255, 136, 18));
        button_eliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_eliminar.setText("Eliminar");
        button_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(button_eliminar);

        button_actualizar.setBackground(new java.awt.Color(255, 136, 18));
        button_actualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_actualizar.setText("Actualizar");
        button_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_actualizarMouseClicked(evt);
            }
        });
        jPanel1.add(button_actualizar);

        button_buscar.setBackground(new java.awt.Color(255, 136, 18));
        button_buscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_buscar.setText("Buscar");
        button_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_buscarMouseClicked(evt);
            }
        });
        jPanel1.add(button_buscar);

        button_verTodo.setBackground(new java.awt.Color(255, 136, 18));
        button_verTodo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_verTodo.setText("Ver Todo");
        button_verTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_verTodoMouseClicked(evt);
            }
        });
        jPanel1.add(button_verTodo);

        button_historial.setBackground(new java.awt.Color(255, 136, 18));
        button_historial.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_historial.setText("Ver historial");
        button_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_historialMouseClicked(evt);
            }
        });
        jPanel1.add(button_historial);

        button_regresar.setBackground(new java.awt.Color(255, 136, 18));
        button_regresar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_regresar.setText("Regresar");
        button_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_regresarMouseClicked(evt);
            }
        });
        button_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(button_regresar);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setText("Cliente");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Nombre del cliente");

        text_nombreUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoBueno.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Numero telefonico");

        text_contrasena.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Correo");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Fecha nacimiento");

        text_contrasena1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nombreAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nombreAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuariosMouseClicked

    }//GEN-LAST:event_table_usuariosMouseClicked

    private void table_usuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_usuariosKeyReleased

    }//GEN-LAST:event_table_usuariosKeyReleased

    private void button_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registrarMouseClicked
    

    }//GEN-LAST:event_button_registrarMouseClicked

    private void button_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarActionPerformed

    private void button_registrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_registrarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_registrarKeyReleased

    private void button_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_eliminarMouseClicked

    }//GEN-LAST:event_button_eliminarMouseClicked

    private void button_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseClicked

    }//GEN-LAST:event_button_buscarMouseClicked

    private void button_verTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_verTodoMouseClicked

    }//GEN-LAST:event_button_verTodoMouseClicked

    private void button_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_actualizarMouseClicked

    }//GEN-LAST:event_button_actualizarMouseClicked

    private void button_historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_historialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_historialMouseClicked

    private void button_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_regresarMouseClicked
        pAdmin = new principalAdmin();
        pAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_button_regresarMouseClicked

    private void button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(clientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_actualizar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_eliminar;
    private javax.swing.JButton button_historial;
    private javax.swing.JButton button_registrar;
    private javax.swing.JButton button_regresar;
    private javax.swing.JButton button_verTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_usuarios;
    private javax.swing.JTextField text_contrasena;
    private javax.swing.JTextField text_contrasena1;
    private javax.swing.JTextField text_nombreAsistente;
    private javax.swing.JTextField text_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
