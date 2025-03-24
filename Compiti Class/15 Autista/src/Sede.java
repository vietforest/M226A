public class Sede {
    private int NPA;
    private String Inidrizzo;
    private String Telefono;

    public int getNPA() {
        return NPA;
    }

    public void setNPA(int NPA) {
        this.NPA = NPA;
    }

    public String getInidrizzo() {
        return Inidrizzo;
    }

    public void setInidrizzo(String inidrizzo) {
        Inidrizzo = inidrizzo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Sede(int NPA, String inidrizzo, String telefono) {
        this.NPA = NPA;
        Inidrizzo = inidrizzo;
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return
                "NPA=" + NPA +
                ", Inidrizzo='" + Inidrizzo + '\'' +
                ", Telefono='" + Telefono + '\'';
    }
}
