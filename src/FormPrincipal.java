// Apache NetBeans 26
// Mariana Gasparotto Palácios - 2648890

import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    private static FormPrincipal formPrincipalUnico;

    //MÉTODO SINGLETON
    public static FormPrincipal getFormPrincipal() {
        if (formPrincipalUnico == null) {
            formPrincipalUnico = new FormPrincipal();
        }
        return formPrincipalUnico;
    }

    private FormPrincipal() {
        initComponents();
        
        itMnCadPint.addActionListener(e -> itMnCadPintActionPerformed(e));
        itMnCadEsc.addActionListener(e -> itMnCadEscActionPerformed(e));
        itMnCadFoto.addActionListener(e -> itMnCadFotoActionPerformed(e));
        itMnCadExp.addActionListener(e -> itMnCadExpActionPerformed(e));
        itMnExObras.addActionListener(e -> itMnExObrasActionPerformed(e));
        itMnExExp.addActionListener(e -> itMnExExpActionPerformed(e));
        itMnSair.addActionListener(e -> itMnSairActionPerformed(e));
    }

    private void itMnCadPintActionPerformed(java.awt.event.ActionEvent evt) {        
        FormPintura.getFormPintura().setVisible(true);
    }

    private void itMnCadEscActionPerformed(java.awt.event.ActionEvent evt) {
        FormEscultura.getFormEscultura().setVisible(true);
    }

    private void itMnCadFotoActionPerformed(java.awt.event.ActionEvent evt) {
        FormFotografia.getFormFotografia().setVisible(true);
    }

    private void itMnCadExpActionPerformed(java.awt.event.ActionEvent evt) {
        FormExposicao.getFormExposicao().setVisible(true);
    }

    private void itMnExObrasActionPerformed(java.awt.event.ActionEvent evt) {
        FormRelatorioObras.getFormRelatorioObras().setVisible(true);
    }

    private void itMnExExpActionPerformed(java.awt.event.ActionEvent evt) {
        FormRelatorioExposicoes.getFormRelatorioExposicoes().setVisible(true);
    }

    private void itMnSairActionPerformed(java.awt.event.ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtFormPrincipal = new javax.swing.JLabel();
        barMenuPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        itMnCadPint = new javax.swing.JMenuItem();
        itMnCadEsc = new javax.swing.JMenuItem();
        itMnCadFoto = new javax.swing.JMenuItem();
        Mnseparador = new javax.swing.JPopupMenu.Separator();
        itMnCadExp = new javax.swing.JMenuItem();
        mnRel = new javax.swing.JMenu();
        itMnExObras = new javax.swing.JMenuItem();
        itMnExExp = new javax.swing.JMenuItem();
        itMnPin = new javax.swing.JMenuItem();
        itMnEsc = new javax.swing.JMenuItem();
        itMnFoto = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        itMnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtFormPrincipal.setText("Formulário principal");

        mnCad.setText("Cadastros");

        itMnCadPint.setText("Pintura");
        mnCad.add(itMnCadPint);

        itMnCadEsc.setText("Escultura");
        mnCad.add(itMnCadEsc);

        itMnCadFoto.setText("Fotografia");
        mnCad.add(itMnCadFoto);
        mnCad.add(Mnseparador);

        itMnCadExp.setText("Exposição");
        mnCad.add(itMnCadExp);

        barMenuPrincipal.add(mnCad);

        mnRel.setText("Relatórios");

        itMnExObras.setText("Obras Cadastradas");
        mnRel.add(itMnExObras);

        itMnExExp.setText("Exposições Cadastradas");
        mnRel.add(itMnExExp);

        itMnPin.setText("Pinturas Cadastradas");
        itMnPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnPinActionPerformed(evt);
            }
        });
        mnRel.add(itMnPin);

        itMnEsc.setText("Esculturas Cadastradas");
        itMnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnEscActionPerformed(evt);
            }
        });
        mnRel.add(itMnEsc);

        itMnFoto.setText("Fotografias Cadastradas");
        itMnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnFotoActionPerformed(evt);
            }
        });
        mnRel.add(itMnFoto);

        barMenuPrincipal.add(mnRel);

        mnSair.setText("Sair");

        itMnSair.setText("Sair do Sistema");
        mnSair.add(itMnSair);

        barMenuPrincipal.add(mnSair);

        setJMenuBar(barMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(rtFormPrincipal)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(rtFormPrincipal)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnPinActionPerformed
        FormRelatorioPintura.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnPinActionPerformed

    private void itMnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnEscActionPerformed
        FormRelatorioEscultura.getInstancia().setVisible(true);
    }//GEN-LAST:event_itMnEscActionPerformed

    private void itMnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnFotoActionPerformed
        FormRelatorioFotografia.getFormRelatorioObras().setVisible(true);
    }//GEN-LAST:event_itMnFotoActionPerformed

     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal.getFormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Mnseparador;
    private javax.swing.JMenuBar barMenuPrincipal;
    private javax.swing.JMenuItem itMnCadEsc;
    private javax.swing.JMenuItem itMnCadExp;
    private javax.swing.JMenuItem itMnCadFoto;
    private javax.swing.JMenuItem itMnCadPint;
    private javax.swing.JMenuItem itMnEsc;
    private javax.swing.JMenuItem itMnExExp;
    private javax.swing.JMenuItem itMnExObras;
    private javax.swing.JMenuItem itMnFoto;
    private javax.swing.JMenuItem itMnPin;
    private javax.swing.JMenuItem itMnSair;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnRel;
    private javax.swing.JMenu mnSair;
    private javax.swing.JLabel rtFormPrincipal;
    // End of variables declaration//GEN-END:variables
}
