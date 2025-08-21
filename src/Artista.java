// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

public class Artista {
    private String nome;
    private String nacionalidade;

    //Sobrecarga
    public Artista() {
        this.nome = "";
        this.nacionalidade = "";
    }
    
    // Getters e Setters
    public String getNome() { 
	return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Sobrecarga
    public void setNome(String primeiroNome, String sobrenome) {
        this.nome = primeiroNome + " " + sobrenome;
    }

    public String getNacionalidade() { 
	return nacionalidade; 
    }
    public void setNacionalidade(String nacionalidade) { 
	this.nacionalidade = nacionalidade; 
    }
}