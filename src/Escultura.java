// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

public class Escultura extends ObraDeArte {
    private String material;
    private double peso;

    //Sobrecarga
    public Escultura() {
        super();
        this.material = "";
        this.peso = 0.0;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) throws TamanhoInvalidoException {
        if (peso <= 0) {
            throw new TamanhoInvalidoException("Peso deve ser > 0.");
        }
        this.peso = peso;
    }
    
    //Sobrescrita
    @Override 
    public String getResumo() {
        return super.getResumo() + ", Material: " + getMaterial() +
           ", Peso: " + getPeso();
    }  
}