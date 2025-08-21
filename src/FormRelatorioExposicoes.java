// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRelatorioExposicoes extends javax.swing.JFrame {

    private static FormRelatorioExposicoes formUnico;
    
    //MÉTODO SINGLETON
    public static FormRelatorioExposicoes getFormRelatorioExposicoes(){
        if(formUnico == null){
            formUnico = new FormRelatorioExposicoes();
        }
        return formUnico;
    }
    
    private FormRelatorioExposicoes() {
        initComponents();
    }
    
    public void listarDados() {
        DefaultTableModel modelo = (DefaultTableModel) tblExposicoes.getModel();
        modelo.setRowCount(0);
        
        for (Exposicao expo : BDExposicoes.getBDExposicoes().getExposicoes()) {
            modelo.addRow(new Object[]{
                expo.getNome(),
                expo.getData(),
                expo.getObras().size()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        scrollPaneExposicoes = new javax.swing.JScrollPane();
        tblExposicoes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblExposicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome da Exposição", "Data", "Qtd. de Obras"
            }
        ));
        tblExposicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExposicoesMouseClicked(evt);
            }
        });
        scrollPaneExposicoes.setViewportView(tblExposicoes);

        scrollPane1.add(scrollPaneExposicoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarDados();
    }//GEN-LAST:event_formWindowActivated

    private void tblExposicoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExposicoesMouseClicked
        int linha = tblExposicoes.getSelectedRow();
        if (linha >= 0) {
            String nomeExposicao = tblExposicoes.getModel().getValueAt(linha, 0).toString();
            Exposicao expo = BDExposicoes.getBDExposicoes().consultarExposicaoPorNome(nomeExposicao);
            
            if (expo != null) {
                StringBuilder detalhes = new StringBuilder();
                detalhes.append("Exposição: ").append(expo.getNome()).append("\n");
                detalhes.append("Data: ").append(expo.getData()).append("\n\n");
                detalhes.append("Obras na exposição:\n");
                
                if(expo.getObras().isEmpty()){
                    detalhes.append("- Nenhuma obra cadastrada nesta exposição.");
                } else {
                    for (ObraDeArte obra : expo.getObras()) {
                        detalhes.append("- ").append(obra.getTitulo());
                        detalhes.append(" (").append(obra.getArtista().getNome()).append(")\n");
                    }
                }
                
                JOptionPane.showMessageDialog(null, detalhes.toString(), "Detalhes da Exposição", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_tblExposicoesMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPaneExposicoes;
    private javax.swing.JTable tblExposicoes;
    // End of variables declaration//GEN-END:variables
}
