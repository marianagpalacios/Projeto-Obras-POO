// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRelatorioObras extends javax.swing.JFrame {
    
    private static FormRelatorioObras formUnico;

    //MÉTODO SINGLETON
    public static FormRelatorioObras getFormRelatorioObras() {
        if (formUnico == null) {
            formUnico = new FormRelatorioObras();
        }
        return formUnico;
    }
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormRelatorioObras.class.getName());

    private FormRelatorioObras() {
        initComponents();
    }
    
    public void listarDados() {
        DefaultTableModel modelo = (DefaultTableModel) tblObras.getModel();
        modelo.setRowCount(0);

        for (ObraDeArte obra : BDObras.getBDObras().getObras()) {
            modelo.addRow(new Object[]{
                obra.getClass().getSimpleName(),
                obra.getTitulo(),
                obra.getAno(),
                obra.getArtista().getNome(),
                getDetalhesObra(obra)
            });
        }
    }

    private String getDetalhesObra(ObraDeArte obra) {
        if (obra instanceof Pintura) {
            return "Estilo: " + ((Pintura) obra).getEstilo();
        }
        if (obra instanceof Escultura) {
            return "Material: " + ((Escultura) obra).getMaterial();
        }
        if (obra instanceof Fotografia) {
            return "Câmera: " + ((Fotografia) obra).getCameraModel();
        }
        return "";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        scrollPaneObras = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Título", "Ano", "Artista", "Detalhes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObrasMouseClicked(evt);
            }
        });
        scrollPaneObras.setViewportView(tblObras);

        scrollPane1.add(scrollPaneObras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked

        int linha = tblObras.getSelectedRow();
        if (linha >= 0) {
            String titulo = tblObras.getModel().getValueAt(linha, 1).toString();
            ObraDeArte obra = BDObras.getBDObras().consultarObraPorTitulo(titulo);
            if(obra != null) {
                JOptionPane.showMessageDialog(null, obra.toString(), "Detalhes da Obra", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_tblObrasMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarDados();
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPaneObras;
    private javax.swing.JTable tblObras;
    // End of variables declaration//GEN-END:variables
}
