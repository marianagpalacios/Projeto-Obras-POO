// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

public class FormRelatorioPintura extends javax.swing.JFrame {
    
    private static FormRelatorioPintura instancia;

    //MÉTODO SINGLETON
    public static FormRelatorioPintura getInstancia() {
        if (instancia == null) {
            instancia = new FormRelatorioPintura();
        }
        return instancia;
    }
    
    public FormRelatorioPintura() {
        initComponents();
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent evt) {
                atualizarTabela();
            }
        });
    }
    
    public void atualizarTabela() {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 

        for (ObraDeArte obra : BDObras.getBDObras().getObras()) {
            if (obra instanceof Pintura) {
                Pintura p = (Pintura) obra;
                modelo.addRow(new Object[]{
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
