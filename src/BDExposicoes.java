// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class BDExposicoes {

    private static BDExposicoes bdExposicoesUnico;
    private final List<Exposicao> exposicoes;

    private BDExposicoes() {
        exposicoes = new ArrayList<>();
    }

    //MÉTODO SINGLETON
    public static BDExposicoes getBDExposicoes() {
        if (bdExposicoesUnico == null) {
            bdExposicoesUnico = new BDExposicoes();
        }
        return bdExposicoesUnico;
    }

    public List<Exposicao> getExposicoes() {
        return exposicoes;
    }
    
    public void adicionarExposicao(Exposicao expo) {
        if (expo != null) {
            exposicoes.add(expo);
            JOptionPane.showMessageDialog(null, "Exposição cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Exposicao consultarExposicaoPorNome(String nome) {
        for (Exposicao expo : exposicoes) {
            if (expo.getNome().equalsIgnoreCase(nome)) {
                return expo;
            }
        }
        return null;
    }
   
    public void alterarExposicao(Exposicao expoAntiga, Exposicao expoNova) {
        int index = exposicoes.indexOf(expoAntiga);
        if (index != -1) {
            exposicoes.set(index, expoNova);
            JOptionPane.showMessageDialog(null, "Exposição alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null, "Exposição a ser alterada não foi encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removerExposicao(String nome) {
        Exposicao expo = consultarExposicaoPorNome(nome);
        if (expo != null) {
            exposicoes.remove(expo);
   
        } else {
            JOptionPane.showMessageDialog(null, "Exposição não encontrada para exclusão!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}