public class Veicolo {
    private String Modello;
    private String Marca;
    private String Targa;

    public String getTarga() {
        return Targa;
    }

    public void setTarga(String targa) {
        Targa = targa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public Veicolo(String modello, String marca, String targa) {
        Modello = modello;
        Marca = marca;
        Targa = targa;
    }

    @Override
    public String toString() {
        return
                "Modello='" + Modello + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Targa='" + Targa + '\''
               ;
    }
}
