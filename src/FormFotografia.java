// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import javax.swing.JOptionPane;

public class FormFotografia extends javax.swing.JFrame {

    private static FormFotografia formFotografiaUnico;
    private Fotografia fotografiaEmEdicao = null;

    //MÉTODO SINGLETON
    public static FormFotografia getFormFotografia() {
        if (formFotografiaUnico == null) {
            formFotografiaUnico = new FormFotografia();
        }
        return formFotografiaUnico;
    }

    private FormFotografia() {
        initComponents();
        habilitarModoCadastro();
    }
    
    private void habilitarModoCadastro() {
        this.setTitle("Gerenciar Fotografia (Modo: Cadastro)");
        cxTitulo.setEditable(true);
        cxTitulo.requestFocus();
        btnCadastrar.setText("Cadastrar");
        btnConsultar.setEnabled(true);
        btnExcluir.setEnabled(false);
        
    }

    private void habilitarModoEdicao() {
        this.setTitle("Gerenciar Fotografia (Modo: Edição)");
        cxTitulo.setEditable(false);
        btnCadastrar.setText("Salvar Alterações");
        btnConsultar.setEnabled(false);
        btnExcluir.setEnabled(true);
       
}

    private void limparCampos() {
        cxTitulo.setText("");
        cxAno.setText("");
        cxArtista.setText("");
        cxCamera.setText("");
        cxIso.setText("");
        cxTitulo.requestFocus();
    }
    
    private void resetarFormulario() {
        limparCampos();
        habilitarModoCadastro();
        fotografiaEmEdicao = null;
    }

    private void atualizarTabela() {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 

        for (ObraDeArte obra : BDObras.getBDObras().getObras()) {
            if (obra instanceof Fotografia) {
                Fotografia f = (Fotografia) obra;
                modelo.addRow(new Object[]{
                    f.getTitulo(),
                    f.getAno(),
                    f.getArtista().getNome(),
                    f.getCameraModel(),
                    f.getIso()
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
        rtCamera = new javax.swing.JLabel();
        rtIso = new javax.swing.JLabel();
        cxTitulo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxArtista = new javax.swing.JTextField();
        cxCamera = new javax.swing.JTextField();
        cxIso = new javax.swing.JTextField();
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

        rtCamera.setText("Modelo da Câmera:");

        rtIso.setText("ISO:");

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
                "Título", "Ano", "Artista", "Modelo da Câmera", "ISO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rtCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtIso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxIso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAno)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtArtista)
                    .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCamera)
                    .addComponent(cxCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxIso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtIso)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (cxTitulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo 'Título' é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (fotografiaEmEdicao == null) { 
                Fotografia f = new Fotografia();
                if(BDObras.getBDObras().consultarObraPorTitulo(cxTitulo.getText()) != null){
                    JOptionPane.showMessageDialog(null, "Já existe uma obra com este título.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                f.setTitulo(cxTitulo.getText());
                f.setAno(Integer.parseInt(cxAno.getText()));
                f.getArtista().setNome(cxArtista.getText());
                f.setCameraModel(cxCamera.getText());
                f.setIso(Integer.parseInt(cxIso.getText()));
                BDObras.getBDObras().adicionarObra(f);

            } else { 
                Fotografia atualizada = new Fotografia();
                atualizada.setTitulo(fotografiaEmEdicao.getTitulo());
                atualizada.setAno(Integer.parseInt(cxAno.getText()));
                atualizada.getArtista().setNome(cxArtista.getText());
                atualizada.setCameraModel(cxCamera.getText());
                atualizada.setIso(Integer.parseInt(cxIso.getText()));

                BDObras.getBDObras().alterarFotografia(atualizada);
                
                JOptionPane.showMessageDialog(null, "Fotografia alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            resetarFormulario();
            atualizarTabela(); 

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Os campos 'Ano' e 'ISO' devem ser numéricos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (AnoInvalidoException aie) {
            JOptionPane.showMessageDialog(null, aie.getMessage(), "Erro de Ano", JOptionPane.ERROR_MESSAGE);
        } catch (TamanhoInvalidoException tie) {
            JOptionPane.showMessageDialog(null, tie.getMessage(), "Erro de Tamanho", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String titulo = cxTitulo.getText();
        if(titulo.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um Título para consultar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ObraDeArte obra = BDObras.getBDObras().consultarObraPorTitulo(titulo);

        if (obra != null && obra instanceof Fotografia) {
            fotografiaEmEdicao = (Fotografia) obra;
            cxAno.setText(String.valueOf(fotografiaEmEdicao.getAno()));
            cxArtista.setText(fotografiaEmEdicao.getArtista().getNome());
            cxCamera.setText(fotografiaEmEdicao.getCameraModel());
            cxIso.setText(String.valueOf(fotografiaEmEdicao.getIso()));
            habilitarModoEdicao();
        } else {
            JOptionPane.showMessageDialog(null, "Fotografia não encontrada ou o título pertence a outro tipo de obra.", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (fotografiaEmEdicao == null) {
            JOptionPane.showMessageDialog(null, "Consulte uma fotografia antes de excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a fotografia '" + fotografiaEmEdicao.getTitulo() + "'?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            boolean removido = BDObras.getBDObras().removerFotografia(fotografiaEmEdicao.getTitulo());  
            if (removido) {
                JOptionPane.showMessageDialog(null, "Fotografia excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: obra não encontrada no ArrayList.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            resetarFormulario();
            atualizarTabela();
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
    private javax.swing.JTextField cxCamera;
    private javax.swing.JTextField cxIso;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtArtista;
    private javax.swing.JLabel rtCamera;
    private javax.swing.JLabel rtIso;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
