import java.util.Objects;

public class Figurina {
    private String idFigurina;
    private String nomeGioctore;
    private String stagione;

    public Figurina(String idFigurina, String nomeGioctore, String stagione) {
        this.idFigurina = idFigurina;
        this.nomeGioctore = nomeGioctore;
        this.stagione = stagione;
    }

    public String getIdFigurina() {
        return idFigurina;
    }

    public void setIdFigurina(String idFigurina) {
        this.idFigurina = idFigurina;
    }

    public String getNomeGioctore() {
        return nomeGioctore;
    }

    public void setNomeGioctore(String nomeGioctore) {
        this.nomeGioctore = nomeGioctore;
    }

    public String getStagione() {
        return stagione;
    }

    public void setStagione(String stagione) {
        this.stagione = stagione;
    }

    @Override
    public String toString() {
        return "Figurina{" +
                "idFigurina='" + idFigurina + '\'' +
                ", nomeGioctore='" + nomeGioctore + '\'' +
                ", stagione='" + stagione + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figurina figurina = (Figurina) o;
        return Objects.equals(idFigurina, figurina.idFigurina);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFigurina);
    }
}
