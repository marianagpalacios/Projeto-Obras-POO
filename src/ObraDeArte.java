// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

public abstract class ObraDeArte {
    private String titulo;
    private int ano;
    private Artista artista;
    
    public ObraDeArte() {
        this.titulo = "";
        this.ano = 0;
        this.artista = new Artista();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) throws AnoInvalidoException {
        if (ano < 0) {
            throw new AnoInvalidoException("Ano não pode ser negativo.");
        }
        this.ano = ano;
    }

    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    //Sobrescrita
    public String getResumo() {
        return "Título: " + getTitulo() + ", Ano: " + getAno() + ", Artista: " + getArtista().getNome();
     }

}