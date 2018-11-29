package menumakanan;

/**
 *
 * @author Atallabela Yosua
 */
public class VisualMenuMakanan extends javax.swing.JFrame {
    private static int TOTAL;

    public VisualMenuMakanan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tfBakso = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfRawon = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfSoto = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfGudeg = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfTotal = new javax.swing.JTextArea();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(405, 195));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);

        tfBakso.setColumns(20);
        tfBakso.setRows(5);
        tfBakso.setText("0");
        tfBakso.setEnabled(false);
        tfBakso.setName("tfBakso"); // NOI18N
        jScrollPane1.setViewportView(tfBakso);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);

        tfRawon.setColumns(20);
        tfRawon.setRows(5);
        tfRawon.setText("0");
        tfRawon.setEnabled(false);
        tfRawon.setName("tfRawon"); // NOI18N
        jScrollPane2.setViewportView(tfRawon);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);

        tfSoto.setColumns(20);
        tfSoto.setRows(5);
        tfSoto.setText("0");
        tfSoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfSoto.setEnabled(false);
        tfSoto.setName("tfSoto"); // NOI18N
        jScrollPane3.setViewportView(tfSoto);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setEnabled(false);

        tfGudeg.setColumns(20);
        tfGudeg.setRows(5);
        tfGudeg.setText("0");
        tfGudeg.setEnabled(false);
        tfGudeg.setName("tfGudeg"); // NOI18N
        jScrollPane4.setViewportView(tfGudeg);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setEnabled(false);

        tfTotal.setColumns(20);
        tfTotal.setRows(5);
        tfTotal.setEnabled(false);
        jScrollPane5.setViewportView(tfTotal);

        cbSoto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbSoto.setForeground(new java.awt.Color(51, 51, 255));
        cbSoto.setText("Soto (5000)");
        cbSoto.setName("cbSoto"); // NOI18N
        cbSoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSotoMouseClicked(evt);
            }
        });
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbRawon.setForeground(new java.awt.Color(51, 51, 255));
        cbRawon.setText("Rawon (6000)");
        cbRawon.setName("cbRawon"); // NOI18N
        cbRawon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRawonMouseClicked(evt);
            }
        });
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbBakso.setForeground(new java.awt.Color(51, 51, 255));
        cbBakso.setText("Bakso (4000)");
        cbBakso.setName("cbBakso"); // NOI18N
        cbBakso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBaksoMouseClicked(evt);
            }
        });
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbGudeg.setForeground(new java.awt.Color(51, 51, 255));
        cbGudeg.setText("Gudeg (8000)");
        cbGudeg.setName("cbGudeg"); // NOI18N
        cbGudeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbGudegMouseClicked(evt);
            }
        });
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Hitung");
        jLabel1.setName("lblHitung"); // NOI18N

        btnClear.setBackground(new java.awt.Color(102, 0, 102));
        btnClear.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setName("btnClear"); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(102, 0, 102));
        btnHitung.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(255, 255, 255));
        btnHitung.setText("Hitung");
        btnHitung.setName("btnHitung"); // NOI18N
        btnHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHitungMouseClicked(evt);
            }
        });
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("MENU MAKANAN");

        alert.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 0, 0));
        alert.setText("alert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSoto)
                            .addComponent(cbBakso)
                            .addComponent(cbRawon)
                            .addComponent(cbGudeg)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHitung))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBakso))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbGudeg))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(btnClear)))
                                    .addComponent(btnHitung)))
                            .addComponent(cbRawon)))
                    .addComponent(cbSoto))
                .addGap(31, 31, 31)
                .addComponent(alert)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        if(cbSoto.isSelected()) {
            tfSoto.setEditable(true);
        } else {
            tfSoto.setEditable(false);
            tfSoto.setText("");
        }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        if(cbBakso.isSelected()) {
            tfBakso.setEditable(true);
        } else {
            tfBakso.setEditable(false);
            tfBakso.setText("");
        }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        if(cbRawon.isSelected()) {
            tfRawon.setEditable(true);
        } else {
            tfRawon.setEditable(false);
            tfRawon.setText("");
        }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        if(cbGudeg.isSelected()) {
            tfGudeg.setEditable(true);
        } else {
            tfGudeg.setEditable(false);
            tfGudeg.setText("");
        }
    }//GEN-LAST:event_cbGudegActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        if(TOTAL < 1) {
            tfTotal.setEnabled(true);

            TOTAL = (5000 * Integer.valueOf(tfSoto.getText())) + (6000 * (Integer.valueOf(tfBakso.getText()))) 
                    + (4000 * Integer.valueOf(tfRawon.getText())) + (8000 * Integer.valueOf(tfRawon.getText()));

            tfTotal.setText(String.valueOf(TOTAL));
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void btnHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitungMouseClicked
        int jmlhSoto = 0,
            jmlhBakso = 0,
            jmlhRawon = 0,
            jmlhGudeg = 0;

        if(Integer.valueOf(tfSoto.getText()) > 0) {
            jmlhSoto = Integer.valueOf(tfSoto.getText());
        }

        if(Integer.valueOf(tfBakso.getText()) > 0) {
            jmlhBakso = Integer.valueOf(tfBakso.getText());
        }

        if(Integer.valueOf(tfRawon.getText()) > 0) {
            jmlhRawon = Integer.valueOf(tfRawon.getText());
        }

        if(Integer.valueOf(tfGudeg.getText()) > 0) {
            jmlhGudeg = Integer.valueOf(tfGudeg.getText());
        }
        
        TOTAL = (5000 * jmlhSoto) + (6000 * jmlhRawon) + (4000 * jmlhBakso) + (8000 * jmlhGudeg);

        if(TOTAL != 0) {
            tfTotal.setEnabled(true);
            tfTotal.setText(String.valueOf(TOTAL));
        }
    }//GEN-LAST:event_btnHitungMouseClicked

    private void cbSotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSotoMouseClicked
        if(tfSoto.isEnabled()) {
            tfSoto.setEnabled(false);
            tfSoto.setText("0");
        } else {
            tfSoto.setEnabled(true);
        }
    }//GEN-LAST:event_cbSotoMouseClicked

    private void cbRawonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRawonMouseClicked
        if(tfRawon.isEnabled()) {
            tfRawon.setEnabled(false);
            tfRawon.setText("0");
        } else {
            tfRawon.setEnabled(true);
        }
    }//GEN-LAST:event_cbRawonMouseClicked

    private void cbBaksoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBaksoMouseClicked
        if(tfBakso.isEnabled()) {
            tfBakso.setEnabled(false);
            tfBakso.setText("0");
        } else {
            tfBakso.setEnabled(true);
        }
    }//GEN-LAST:event_cbBaksoMouseClicked

    private void cbGudegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbGudegMouseClicked
        if(tfGudeg.isEnabled()) {
            tfGudeg.setEnabled(false);
            tfGudeg.setText("0");
        } else {
            tfGudeg.setEnabled(true);
        }
    }//GEN-LAST:event_cbGudegMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        tfSoto.setText("0");
        tfRawon.setText("0");
        tfBakso.setText("0");
        tfGudeg.setText("0");
        
        tfTotal.setText("0");

        tfSoto.setEnabled(false);
        tfRawon.setEnabled(false);
        tfBakso.setEnabled(false);
        tfGudeg.setEnabled(false);

        tfTotal.setEnabled(false);

        cbSoto.setSelected(false);
        cbRawon.setSelected(false);
        cbBakso.setSelected(false);
        cbGudeg.setSelected(false);
    }//GEN-LAST:event_btnClearMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualMenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHitung;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea tfBakso;
    private javax.swing.JTextArea tfGudeg;
    private javax.swing.JTextArea tfRawon;
    private javax.swing.JTextArea tfSoto;
    private javax.swing.JTextArea tfTotal;
    // End of variables declaration//GEN-END:variables
}
