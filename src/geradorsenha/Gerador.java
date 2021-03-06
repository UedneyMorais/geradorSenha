package geradorsenha;

import criptografia.HashMD5;
import criptografia.HashSHA1;
import criptografia.HashSHA256;
import criptografia.HashSHA512;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 *
 * @author uedney
 */
public class Gerador extends javax.swing.JFrame {

    /**
     * Creates new form Gerador
     */
    public Gerador() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDatavenc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodDesb = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnGerarHash = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkBase64 = new javax.swing.JRadioButton();
        checkMD5 = new javax.swing.JRadioButton();
        checkSHA1 = new javax.swing.JRadioButton();
        checkSHA256 = new javax.swing.JRadioButton();
        checkSHA512 = new javax.swing.JRadioButton();
        checkDecript = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de chave");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Gerador de chave");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Informe a data de bloqueio:");

        jLabel3.setText("Codigo de desbloqueio:");

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(txtDatavenc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodDesb, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDatavenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodDesb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(jButton2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gerar serial", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Digite o valor a ser gerado:");

        jLabel5.setText("Resultado:");

        btnGerarHash.setText("Gerar");
        btnGerarHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarHashActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkBase64);
        checkBase64.setText("Base64");

        buttonGroup1.add(checkMD5);
        checkMD5.setText("MD5");

        buttonGroup1.add(checkSHA1);
        checkSHA1.setText("SHA1");

        buttonGroup1.add(checkSHA256);
        checkSHA256.setText("SHA256");

        buttonGroup1.add(checkSHA512);
        checkSHA512.setText("SHA512");

        checkDecript.setText("Decript");
        checkDecript.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkDecriptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGerarHash)
                                .addGap(46, 46, 46)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(checkBase64)
                                .addGap(18, 18, 18)
                                .addComponent(checkMD5)
                                .addGap(18, 18, 18)
                                .addComponent(checkSHA1)
                                .addGap(18, 18, 18)
                                .addComponent(checkSHA256)
                                .addGap(18, 18, 18)
                                .addComponent(checkSHA512)))
                        .addGap(107, 107, 107)
                        .addComponent(checkDecript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado)
                            .addComponent(txtValor))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBase64)
                    .addComponent(checkMD5)
                    .addComponent(checkSHA1)
                    .addComponent(checkSHA256)
                    .addComponent(checkSHA512)
                    .addComponent(checkDecript))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarHash)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gerador de HAsh", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        // TODO add your handling code here:
        String data = txtDatavenc.getText();
        int operacao = (Integer.parseInt(data) + 132) / 4;
        String operacao1 = String.valueOf(operacao);
        String codificado = HashMD5.hashMD5(operacao1);
        System.out.println(codificado);
        txtCodDesb.setText(String.valueOf(codificado));
    }//GEN-LAST:event_btnGerarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGerarHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarHashActionPerformed
        //Gerador de hash
        if (txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo com o dado a ser criptografado");
            txtValor.requestFocus();
        } else if (!checkBase64.isSelected() && !checkMD5.isSelected() && !checkSHA1.isSelected() && !checkSHA256.isSelected() && !checkSHA512.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, " Selecione um tipo de criptografia!");
        } else {
            if (checkBase64.isSelected() && !checkDecript.isSelected()) {
                checkMD5.setSelected(false);
                String string = txtValor.getText();
                String frase = Base64.getEncoder().encodeToString(string.getBytes());
                txtResultado.setText(frase);
            } else if (checkMD5.isSelected()) {
                String string = txtValor.getText();
                String frase = HashMD5.hashMD5(string);
                txtResultado.setText(frase);
            } else if (checkSHA1.isSelected()) {
                String string = txtValor.getText();
                String frase = HashSHA1.hashSHA1(string);
                txtResultado.setText(frase);
            } else if (checkSHA256.isSelected()) {
                String string = txtValor.getText();
                String frase = HashSHA256.hashSHA256(string);
                txtResultado.setText(frase);
            } else if (checkSHA512.isSelected()) {
                String string = txtValor.getText();
                String frase = HashSHA512.hashSHA512(string);
                txtResultado.setText(frase);
            } else if (checkDecript.isSelected() && checkBase64.isSelected()) {
                if (txtValor.getText().length() < 2) {
                    JOptionPane.showMessageDialog(rootPane, "Quantidade de caract??res inv??lida para decodificar");
                } else {
                    String string = txtValor.getText();
                    byte[] decodificaHash = Base64.getDecoder().decode(string);
                    String stringDecodificada = new String(decodificaHash);
                    txtResultado.setText(stringDecodificada);
                }
            }
        }
    }//GEN-LAST:event_btnGerarHashActionPerformed

    private void checkDecriptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDecriptMouseClicked
        if (checkDecript.isSelected()) {
            checkBase64.setSelected(true);
            checkMD5.setEnabled(false);
            checkSHA1.setEnabled(false);
            checkSHA256.setEnabled(false);
            checkSHA512.setEnabled(false);
        } else {
            checkBase64.setSelected(false);
            checkMD5.setEnabled(true);
            checkSHA1.setEnabled(true);
            checkSHA256.setEnabled(true);
            checkSHA512.setEnabled(true);
        }
    }//GEN-LAST:event_checkDecriptMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtValor.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Gerador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnGerarHash;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkBase64;
    private javax.swing.JCheckBox checkDecript;
    private javax.swing.JRadioButton checkMD5;
    private javax.swing.JRadioButton checkSHA1;
    private javax.swing.JRadioButton checkSHA256;
    private javax.swing.JRadioButton checkSHA512;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtCodDesb;
    private javax.swing.JTextField txtDatavenc;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
