package ADO2_Atividades.Interface;
import ADO2_Atividades.Interface.Operacao;

public class JF_Primeira extends javax.swing.JFrame {

    /**
     * Creates new form JF_Primeira
     */
    public JF_Primeira() {
        initComponents();
        Limpar();
    }
    
    public void Limpar() {
        jTF_NumA.setText("");
        jTF_NumB.setText("");
        jTF_NumC.setText("");
        jTF_Resultado.setText("");
        jLabel_Mensagem.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        jPanel_Atividade1 = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jPanel_criador = new javax.swing.JPanel();
        jLabel_criador = new javax.swing.JLabel();
        jButton_Voltar = new javax.swing.JButton();
        jLabel_Valor1 = new javax.swing.JLabel();
        jLabel_Valor2 = new javax.swing.JLabel();
        jLabel_Valor3 = new javax.swing.JLabel();
        jTF_NumA = new javax.swing.JTextField();
        jTF_NumB = new javax.swing.JTextField();
        jTF_NumC = new javax.swing.JTextField();
        jButton_Limpar = new javax.swing.JButton();
        jButton_Mult = new javax.swing.JButton();
        jTF_Resultado = new javax.swing.JTextField();
        jLabel_Texto1 = new javax.swing.JLabel();
        jLabel_Texto3 = new javax.swing.JLabel();
        jLabel_Texto2 = new javax.swing.JLabel();
        jLabel_Mensagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel_Atividade1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_Atividade1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel_Atividade1.setVerifyInputWhenFocusTarget(false);

        jLabel_titulo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel_titulo.setText("Atividade 1");

        jPanel_criador.setBackground(new java.awt.Color(153, 153, 255));
        jPanel_criador.setPreferredSize(new java.awt.Dimension(400, 25));

        jLabel_criador.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel_criador.setText("por Rafael Ferreira Goulart");

        javax.swing.GroupLayout jPanel_criadorLayout = new javax.swing.GroupLayout(jPanel_criador);
        jPanel_criador.setLayout(jPanel_criadorLayout);
        jPanel_criadorLayout.setHorizontalGroup(
            jPanel_criadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_criadorLayout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addComponent(jLabel_criador)
                .addContainerGap())
        );
        jPanel_criadorLayout.setVerticalGroup(
            jPanel_criadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_criador, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jButton_Voltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Voltar.setText("Voltar");
        jButton_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VoltarActionPerformed(evt);
            }
        });

        jLabel_Valor1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Valor1.setText("Valor 1");

        jLabel_Valor2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Valor2.setText("Valor 2");

        jLabel_Valor3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Valor3.setText("Valor 3");

        jButton_Limpar.setText("Limpar");
        jButton_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparActionPerformed(evt);
            }
        });

        jButton_Mult.setText("Multiplicar");
        jButton_Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MultActionPerformed(evt);
            }
        });

        jLabel_Texto1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_Texto1.setText("Dados 3 valores reais");

        jLabel_Texto3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_Texto3.setText("Imprimir o valor do produto destes valores");

        jLabel_Texto2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel_Texto2.setText("(Float ou Double)");

        jLabel_Mensagem.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Mensagem.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Mensagem.setText("mensagem");

        javax.swing.GroupLayout jPanel_Atividade1Layout = new javax.swing.GroupLayout(jPanel_Atividade1);
        jPanel_Atividade1.setLayout(jPanel_Atividade1Layout);
        jPanel_Atividade1Layout.setHorizontalGroup(
            jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_criador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_Atividade1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Voltar)
                .addContainerGap())
            .addGroup(jPanel_Atividade1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                        .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTF_NumB)
                                .addComponent(jLabel_Valor2)
                                .addComponent(jButton_Limpar)
                                .addComponent(jTF_NumA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_Valor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                                .addComponent(jLabel_Texto2)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                                .addComponent(jButton_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addComponent(jLabel_Texto3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                                .addComponent(jLabel_Texto1)
                                .addGap(54, 54, 54))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                        .addComponent(jTF_NumC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                        .addComponent(jLabel_Valor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel_Atividade1Layout.setVerticalGroup(
            jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Atividade1Layout.createSequentialGroup()
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton_Voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_criador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Atividade1Layout.createSequentialGroup()
                        .addComponent(jLabel_Texto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Texto3)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_Atividade1Layout.createSequentialGroup()
                        .addComponent(jLabel_Valor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_NumA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Valor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_NumB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Valor3)
                    .addComponent(jLabel_Mensagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_NumC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel_Atividade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Mult)
                    .addComponent(jButton_Limpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Atividade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Atividade1, 312, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VoltarActionPerformed
        JF_Menu abrir = new JF_Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_VoltarActionPerformed

    private void jButton_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButton_LimparActionPerformed

    private void jButton_MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MultActionPerformed
        Operacao op = new Operacao();
        
        try {
            String resp = op.PrimeiraOperacao(Integer.parseInt(jTF_NumA.getText())
                ,Integer.parseInt(jTF_NumB.getText())
                ,Integer.parseInt(jTF_NumC.getText()));
            jTF_Resultado.setText(resp);
            jLabel_Mensagem.setText("");
        } catch (NumberFormatException ex) {
            jLabel_Mensagem.setText("É necessário inserir apenas números");
        }
    }//GEN-LAST:event_jButton_MultActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Primeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Primeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Primeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Primeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Primeira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_Mult;
    private javax.swing.JButton jButton_Voltar;
    private javax.swing.JLabel jLabel_Mensagem;
    private javax.swing.JLabel jLabel_Texto1;
    private javax.swing.JLabel jLabel_Texto2;
    private javax.swing.JLabel jLabel_Texto3;
    private javax.swing.JLabel jLabel_Valor1;
    private javax.swing.JLabel jLabel_Valor2;
    private javax.swing.JLabel jLabel_Valor3;
    private javax.swing.JLabel jLabel_criador;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Atividade1;
    private javax.swing.JPanel jPanel_criador;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTF_NumA;
    public javax.swing.JTextField jTF_NumB;
    public javax.swing.JTextField jTF_NumC;
    private javax.swing.JTextField jTF_Resultado;
    // End of variables declaration//GEN-END:variables
}