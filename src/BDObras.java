// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDObras {

    private static BDObras bdObrasUnico;
    private final List<ObraDeArte> obras;

    private BDObras() {
        obras = new ArrayList<>();
    }

    //MÉTODO SINGLETON
    public static BDObras getBDObras() {
        if (bdObrasUnico == null) {
            bdObrasUnico = new BDObras();
        }
        return bdObrasUnico;
    }

    public List<ObraDeArte> getObras() {
        return obras;
    }
    
    public void adicionarObra(ObraDeArte obra) {
        if (obra != null) {
            obras.add(obra);
            JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public ObraDeArte consultarObraPorTitulo(String titulo) {
        for (ObraDeArte obra : obras) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                return obra;
            }
        }
        return null;
    }

    public boolean removerObra(String titulo) {
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void alterarPintura(Pintura pinturaAtualizada) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Pintura && obra.getTitulo().equalsIgnoreCase(pinturaAtualizada.getTitulo())) {
                obras.set(i, pinturaAtualizada); 
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Escultura não encontrada para alteração!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void alterarEscultura(Escultura esculturaAtualizada) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Escultura && obra.getTitulo().equalsIgnoreCase(esculturaAtualizada.getTitulo())) {
                obras.set(i, esculturaAtualizada); 
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Escultura não encontrada para alteração!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void alterarFotografia(Fotografia fotografiaAtualizada) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Fotografia && obra.getTitulo().equalsIgnoreCase(fotografiaAtualizada.getTitulo())) {
                obras.set(i, fotografiaAtualizada); 
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Fotografia não encontrada para alteração!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean removerEscultura(String titulo) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Escultura && obra.getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(i);
                //JOptionPane.showMessageDialog(null, "Escultura removida com sucesso!", "Remoção", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Escultura não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean removerPintura(String titulo) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Pintura && obra.getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(i);
                //JOptionPane.showMessageDialog(null, "Pintura removida com sucesso!", "Remoção", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Pintura não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public boolean removerFotografia(String titulo) {
        for (int i = 0; i < obras.size(); i++) {
            ObraDeArte obra = obras.get(i);
            if (obra instanceof Fotografia && obra.getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(i);
                //JOptionPane.showMessageDialog(null, "Fotografia removida com sucesso!", "Remoção", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Fotografia não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}