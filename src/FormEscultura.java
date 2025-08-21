// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import javax.swing.JOptionPane;

public class FormEscultura extends javax.swing.JFrame {
    
    private static FormEscultura formEsculturaUnico;
    private Escultura esculturaEmEdicao = null;
  
    public static FormEscultura getFormEscultura() {
        if (formEsculturaUnico == null) {
            formEsculturaUnico = new FormEscultura();
        }
        return formEsculturaUnico;
    }

    private FormEscultura() {
        initComponents();
        habilitarModoCadastro(); 
    }
    
    private void habilitarModoCadastro() {
        this.setTitle("Gerenciar Escultura (Modo: Cadastro)");
        cxTitulo.setEditable(true);
        cxTitulo.requestFocus();
        btnCadastrar.setText("Cadastrar");
        btnConsultar.setEnabled(true);
        btnExcluir.setEnabled(false);
    }

    private void habilitarModoEdicao() {
        this.setTitle("Gerenciar Escultura (Modo: Edição)");
        cxTitulo.setEditable(false);
        btnCadastrar.setText("Salvar Alterações");
        btnConsultar.setEnabled(false);
        btnExcluir.setEnabled(true);
    }

    private void limparCampos() {
        cxTitulo.setText("");
        cxAno.setText("");
        cxArtista.setText("");
        cxMaterial.setText("");
        cxPeso.setText("");
        cxTitulo.requestFocus();
    }

    private void resetarFormulario() {
        limparCampos();
        habilitarModoCadastro();
        esculturaEmEdicao = null;
    }
    
    private void atualizarTabela() {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 

        for (ObraDeArte obra : BDObras.getBDObras().getObras()) {
            if (obra instanceof Escultura) {
                Escultura e = (Escultura) obra;
                modelo.addRow(new Object[]{
                    e.getTitulo(),
                    e.getAno(),
                    e.getArtista().getNome(),
                    e.getMaterial(),
                    e.getPeso()
                });
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtArtista = new javax.swing.JLabel();
        rtMaterial = new javax.swing.JLabel();
        rtPeso = new javax.swing.JLabel();
        cxTitulo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxArtista = new javax.swing.JTextField();
        cxMaterial = new javax.swing.JTextField();
        cxPeso = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        rtTitulo.setText("Título:");

        rtAno.setText("Ano:");

        rtArtista.setText("Artista:");

        rtMaterial.setText("Material:");

        rtPeso.setText("Peso:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Ano", "Artista", "Material", "Peso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cxAno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar)
                            .addComponent(btnCadastrar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(493, 493, 493)
                                .addComponent(btnExcluir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAno)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtArtista)
                    .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtMaterial)
                    .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPeso)
                    .addComponent(cxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (cxTitulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo 'Título' é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (esculturaEmEdicao == null) { 
                Escultura nova = new Escultura();
                if(BDObras.getBDObras().consultarObraPorTitulo(cxTitulo.getText()) != null){
                    JOptionPane.showMessageDialog(null, "Já existe uma obra com este título.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                nova.setTitulo(cxTitulo.getText());
                nova.setAno(Integer.parseInt(cxAno.getText()));
                nova.getArtista().setNome(cxArtista.getText());
                nova.setMaterial(cxMaterial.getText());
                nova.setPeso(Double.parseDouble(cxPeso.getText()));
                BDObras.getBDObras().adicionarObra(nova);
            } else {
                // Alterar escultura existente
                Escultura atualizada = new Escultura();
                atualizada.setTitulo(esculturaEmEdicao.getTitulo()); 
                atualizada.setAno(Integer.parseInt(cxAno.getText()));
                atualizada.getArtista().setNome(cxArtista.getText());
                atualizada.setMaterial(cxMaterial.getText());
                atualizada.setPeso(Double.parseDouble(cxPeso.getText()));

                BDObras.getBDObras().alterarEscultura(atualizada);

                JOptionPane.showMessageDialog(null, "Escultura alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }           
            atualizarTabela();
            resetarFormulario();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Os campos 'Ano' e 'Peso' devem ser numéricos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (AnoInvalidoException aie) {
            JOptionPane.showMessageDialog(null, aie.getMessage(), "Erro de Ano", JOptionPane.ERROR_MESSAGE);
        } catch (TamanhoInvalidoException tie) {
            JOptionPane.showMessageDialog(null, tie.getMessage(), "Erro de Tamanho", JOptionPane.ERROR_MESSAGE);
        }
        atualizarTabela();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String titulo = cxTitulo.getText();
        if(titulo.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um Título para consultar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ObraDeArte obra = BDObras.getBDObras().consultarObraPorTitulo(titulo);
        if (obra != null && obra instanceof Escultura) {
            Escultura e = (Escultura) obra;
            esculturaEmEdicao = e;
            cxAno.setText(String.valueOf(e.getAno()));
            cxArtista.setText(e.getArtista().getNome());
            cxMaterial.setText(e.getMaterial());
            cxPeso.setText(String.valueOf(e.getPeso()));
            habilitarModoEdicao();
        } else {
            JOptionPane.showMessageDialog(null, "Escultura não encontrada ou o título pertence a outro tipo de obra.", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String tituloParaExcluir;

        if (esculturaEmEdicao != null) {
            tituloParaExcluir = esculturaEmEdicao.getTitulo(); 
        } else {
            tituloParaExcluir = cxTitulo.getText().trim();
            if (tituloParaExcluir.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite ou consulte uma escultura para excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }       }

        int resposta = JOptionPane.showConfirmDialog(null, 
            "Deseja realmente excluir a escultura '" + tituloParaExcluir + "'?", 
            "Confirmar Exclusão", 
            JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            boolean removido = BDObras.getBDObras().removerEscultura(tituloParaExcluir);
            if (removido) {
                JOptionPane.showMessageDialog(null, "Escultura excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                resetarFormulario();
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Escultura não encontrada para exclusão!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        resetarFormulario();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxArtista;
    private javax.swing.JTextField cxMaterial;
    private javax.swing.JTextField cxPeso;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtArtista;
    private javax.swing.JLabel rtMaterial;
    private javax.swing.JLabel rtPeso;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
