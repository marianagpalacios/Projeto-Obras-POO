// Mariana Gasparotto Palácios - 2648890
// Apache NetBeans 26

public class Fotografia extends ObraDeArte {
    private String cameraModel;
    private int iso;

    // Sobrecarga
    public Fotografia() {
        super();
        this.cameraModel = "";
        this.iso = 0;

        if (getArtista() == null) {
            setArtista(new Artista());
        }
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) throws TamanhoInvalidoException {
        if (iso <= 0) {
            throw new TamanhoInvalidoException("ISO deve ser > 0.");
        }
        this.iso = iso;
    }

    @Override //Sobrescrita
        public String getResumo() {
            return super.getResumo() +
                   ", Câmera: " + getCameraModel() +
                   ", ISO: " + getIso();
        }


}
