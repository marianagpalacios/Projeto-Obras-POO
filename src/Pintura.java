// Mariana Gasparotto Palácios - 2648890

public class Pintura extends ObraDeArte {
    private String estilo;
    private double largura;
    private double altura;
    private Tecnica tecnica;

    //Sobrecarga
    public Pintura() {
        super();
        this.estilo = "";
        this.largura = 0.0;
        this.altura = 0.0;
        this.tecnica = new Tecnica();
    }

    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) throws TamanhoInvalidoException {
        if (largura <= 0) throw new TamanhoInvalidoException("Largura deve ser > 0.");
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) throws TamanhoInvalidoException {
        if (altura <= 0) throw new TamanhoInvalidoException("Altura deve ser > 0.");
        this.altura = altura;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }
    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    //Sobrescrita
    @Override
    public String getResumo() {
        return super.getResumo() + ", Estilo: " + getEstilo() + ", Técnica: " + getTecnica().getDescricao();
    }
}