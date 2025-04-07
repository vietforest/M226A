import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {
    private String titolo;
    private List<Brano> brani;
    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Brano getBrani(int index) {
        if (index >= 0 && index < brani.size()) {
            return brani.get(index);
        } else {
            return null;
        }
    }
    public void addBrani(Brano bran0){
        brani.add(bran0);
    }
    public int getNumeroBrani() {
        return brani.size();
    }

    public List<Brano> getBrani() {
        return new ArrayList<>(brani); // copia per sicurezza
    }

    public Brano getBrano(int tracciaCorrente) {
        return null;
    }
}
