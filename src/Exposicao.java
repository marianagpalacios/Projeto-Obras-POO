// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
    private String nome;
    private String data;
    private List<ObraDeArte> obras;

    //Sobrecarga
    public Exposicao() { 
        this.nome = "";
        this.data = "";
        this.obras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void adicionarObra(ObraDeArte obra) {
        obras.add(obra);
    }

    public List<ObraDeArte> getObras() {
        return obras;
    }

    //Sobrescrita
    @Override
    public String toString() {
        return "Exposicao [nome=" + nome + ", data=" + data + ", qtdObras=" + obras.size() + "]";
    }
}