// Mariana Gasparotto Palácios - 2648890

public class Tecnica {
    private String descricao;
    private String tipo;

    //Sobrecarga
    public Tecnica() { 
        this.descricao = "";
        this.tipo = "";
    }

    //Sobrecarga
    public Tecnica(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Sobrescrita
    @Override
    public String toString() {
        return descricao + " (" + tipo + ")";
    }
}