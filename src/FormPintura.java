// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPintura extends javax.swing.JFrame {

    private static FormPintura formPinturaUnico;
    private Pintura pinturaEmEdicao = null;

    //MÉTODO SINGLETON
    public static FormPintura getFormPintura() {
        if (formPinturaUnico == null) {
            formPinturaUnico = new FormPintura();
        }
        return formPinturaUnico;
    }

    private FormPintura() {
        initComponents();
        habilitarModoCadastro();
    }

 
    
    private void habilitarModoCadastro() {
        this.setTitle("Gerenciar Pintura (Modo: Cadastro)");
        cxTitulo.setEditable(true);
        cxTitulo.requestFocus();
        
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnExcluir.setEnabled(false);
    }

    private void habilitarModoEdicao() {
        this.setTitle("Gerenciar Pintura (Modo: Edição)");
        cxTitulo.setEditable(false);
        
        btnCadastrar.setText("Salvar Alterações");
        btnCadastrar.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnExcluir.setEnabled(true);
    }
    
    private void limparCampos() {
        cxTitulo.setText("");
        cxAno.setText("");
        cxArtista.setText("");
        cxEstilo.setText("");
        cxLargura.setText("");
        cxAltura.setText("");
        cxDescTecnica.setText("");
        cxTipoTecnica.setText("");
        cxTitulo.requestFocus();
    }
    
    private void resetarFormulario() {
        limparCampos();
        habilitarModoCadastro();
        pinturaEmEdicao = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        rtTitulo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtArtista = new javax.swing.JLabel();
        rtEstilo = new javax.swing.JLabel();
        rtLargura = new javax.swing.JLabel();
        rtAltura = new javax.swing.JLabel();
        rtDesc = new javax.swing.JLabel();
        rtTipo = new javax.swing.JLabel();
        cxTitulo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxArtista = new javax.swing.JTextField();
        cxEstilo = new javax.swing.JTextField();
        cxLargura = new javax.swing.JTextField();
        cxAltura = new javax.swing.JTextField();
        cxDescTecnica = new javax.swing.JTextField();
        cxTipoTecnica = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        rtTitulo.setText("Título:");

        rtAno.setText("Ano:");

        rtArtista.setText("Artista:");

        rtEstilo.setText("Estilo:");

        rtLargura.setText("Largura:");

        rtAltura.setText("Altura:");

        rtDesc.setText("Descrição:");

        rtTipo.setText("Tipo de técnica:");

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Ano", "Artista", "Estilo", "Largura", "Altura", "Descrição", "Tipo de Técnica"
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
                                .addComponent(rtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(cxEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(rtLargura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(rtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rtTipo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rtDesc)
                                            .addGap(36, 36, 36)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxDescTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(cxTipoTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(443, 443, 443))))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtAno)
                            .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtArtista)
                            .addComponent(cxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rtEstilo)
                                .addComponent(cxEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtLargura)
                                .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rtAltura)
                                .addComponent(cxAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtDesc)
                            .addComponent(cxDescTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipo)
                    .addComponent(cxTipoTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (cxTitulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo 'Título' é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (pinturaEmEdicao == null) { 
                Pintura p = new Pintura();
                
                if(BDObras.getBDObras().consultarObraPorTitulo(cxTitulo.getText()) != null){
                    JOptionPane.showMessageDialog(null, "Já existe uma obra com este título.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                p.setTitulo(cxTitulo.getText());
                p.setAno(Integer.parseInt(cxAno.getText()));
                p.getArtista().setNome(cxArtista.getText());
                p.setEstilo(cxEstilo.getText());
                p.setLargura(Double.parseDouble(cxLargura.getText()));
                p.setAltura(Double.parseDouble(cxAltura.getText()));
                p.getTecnica().setDescricao(cxDescTecnica.getText());
                p.getTecnica().setTipo(cxTipoTecnica.getText());
                
                BDObras.getBDObras().adicionarObra(p);

            } else { 
                pinturaEmEdicao.setAno(Integer.parseInt(cxAno.getText()));
                pinturaEmEdicao.getArtista().setNome(cxArtista.getText());
                pinturaEmEdicao.setEstilo(cxEstilo.getText());
                pinturaEmEdicao.setLargura(Double.parseDouble(cxLargura.getText()));
                pinturaEmEdicao.setAltura(Double.parseDouble(cxAltura.getText()));
                pinturaEmEdicao.getTecnica().setDescricao(cxDescTecnica.getText());
                pinturaEmEdicao.getTecnica().setTipo(cxTipoTecnica.getText());                
                BDObras.getBDObras().alterarPintura(pinturaEmEdicao);
                JOptionPane.showMessageDialog(null, "Obra alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                listTab(); 
            }
            
            resetarFormulario();

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Ano, Largura e Altura devem ser números.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (AnoInvalidoException aie) {
            JOptionPane.showMessageDialog(null, aie.getMessage(), "Erro de Ano", JOptionPane.ERROR_MESSAGE);
        } catch (TamanhoInvalidoException tie) {
            JOptionPane.showMessageDialog(null, tie.getMessage(), "Erro de Tamanho", JOptionPane.ERROR_MESSAGE);
        }
        FormRelatorioPintura relatorio = new FormRelatorioPintura();
        relatorio.atualizarTabela(); 

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String titulo = cxTitulo.getText().trim();

        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um Título para consultar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ObraDeArte obra = BDObras.getBDObras().consultarObraPorTitulo(titulo);

        if (obra == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma obra encontrada com esse título.", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
            return;
        }

        if (obra instanceof Pintura) {
            pinturaEmEdicao = (Pintura) obra;
            cxAno.setText(String.valueOf(pinturaEmEdicao.getAno()));
            cxArtista.setText(pinturaEmEdicao.getArtista().getNome());
            cxEstilo.setText(pinturaEmEdicao.getEstilo());
            cxLargura.setText(String.valueOf(pinturaEmEdicao.getLargura()));
            cxAltura.setText(String.valueOf(pinturaEmEdicao.getAltura()));
            cxDescTecnica.setText(pinturaEmEdicao.getTecnica().getDescricao());
            cxTipoTecnica.setText(pinturaEmEdicao.getTecnica().getTipo());

            cxTitulo.setEditable(false);
            btnExcluir.setEnabled(true); 
            btnCadastrar.setText("Salvar Alterações");

            this.setTitle("Gerenciar Pintura (Modo: Edição)");

        } else {
            JOptionPane.showMessageDialog(null, "O título encontrado pertence a outro tipo de obra (não é uma pintura).", "Atenção", JOptionPane.WARNING_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (pinturaEmEdicao == null) {
            JOptionPane.showMessageDialog(null, "Consulte uma pintura antes de excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja realmente excluir a pintura '" + pinturaEmEdicao.getTitulo() + "'?",
            "Confirmar Exclusão",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            BDObras.getBDObras().removerPintura(pinturaEmEdicao.getTitulo());
            JOptionPane.showMessageDialog(null, "Pintura excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            resetarFormulario();
            listTab(); 
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        resetarFormulario();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listTab();
    }//GEN-LAST:event_formWindowActivated

    public void listTab(){
    DefaultTableModel modTab = (DefaultTableModel) jTable1.getModel();
    modTab.setRowCount(0);

    for (ObraDeArte obra : BDObras.getBDObras().getObras()) {
        if (obra instanceof Pintura) {
            Pintura p = (Pintura) obra;

            modTab.addRow(new Object[]{
                p.getTitulo(),
                p.getAno(),
                p.getArtista().getNome(),
                p.getEstilo(),
                p.getLargura(),
                p.getAltura(),
                p.getTecnica().getDescricao(),
                p.getTecnica().getTipo()
            });
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField cxAltura;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxArtista;
    private javax.swing.JTextField cxDescTecnica;
    private javax.swing.JTextField cxEstilo;
    private javax.swing.JTextField cxLargura;
    private javax.swing.JTextField cxTipoTecnica;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel rtAltura;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtArtista;
    private javax.swing.JLabel rtDesc;
    private javax.swing.JLabel rtEstilo;
    private javax.swing.JLabel rtLargura;
    private javax.swing.JLabel rtTipo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
