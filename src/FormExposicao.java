// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FormExposicao extends javax.swing.JFrame {

    private static FormExposicao formUnico;
    
    //MÉTODO SINGLETON
    public static FormExposicao getFormExposicao(){
        if(formUnico == null){
            formUnico = new FormExposicao();
        }
        return formUnico;
    }
    
    private FormExposicao() {
        initComponents();
    }
    
    private void popularListaObras() {
        DefaultListModel<String> model = new DefaultListModel<>();
        List<ObraDeArte> obras = BDObras.getBDObras().getObras();
        
        if (obras.isEmpty()) {
            model.addElement("Nenhuma obra de arte cadastrada.");
            listObras.setEnabled(false);
        } else {
            for (ObraDeArte obra : obras) {
                model.addElement(obra.getTitulo() + " (" + obra.getArtista().getNome() + ")");
            }
            listObras.setEnabled(true);
        }
        listObras.setModel(model);
    }
    
    private void limparCampos() {
        cxNome.setText("");
        cxData.setText("");
        listObras.clearSelection();
        cxNome.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtNome = new javax.swing.JLabel();
        rtData = new javax.swing.JLabel();
        rtObras = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listObras = new javax.swing.JList<>();
        cxNome = new javax.swing.JTextField();
        cxData = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rtNome.setText("Nome da Exposição:");

        rtData.setText("Data (DD/MM/AAAA):");

        rtObras.setText("Obras Disponíveis (selecione uma ou mais):");

        listObras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listObras);

        scrollPane1.add(jScrollPane1);

        btnCriar.setText("Criar Exposição");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCriar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rtObras, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtData)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(rtObras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCriar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        if (cxNome.getText().trim().isEmpty() || cxData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome e a data da exposição.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (listObras.getSelectedIndices().length == 0) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos uma obra para a exposição.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Exposicao novaExpo = new Exposicao();
        novaExpo.setNome(cxNome.getText());
        novaExpo.setData(cxData.getText());

        int[] indicesSelecionados = listObras.getSelectedIndices();
        List<ObraDeArte> todasAsObras = BDObras.getBDObras().getObras();

        for (int indice : indicesSelecionados) {
            if (indice >= 0 && indice < todasAsObras.size()) {
                novaExpo.adicionarObra(todasAsObras.get(indice));
            }
        }

        BDExposicoes.getBDExposicoes().adicionarExposicao(novaExpo);
        
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         popularListaObras();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listObras;
    private javax.swing.JLabel rtData;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtObras;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
