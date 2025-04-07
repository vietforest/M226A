import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String titolo;
    private List<Brano> brani;
    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>();
    }

    public Brano getBrani(int index) {
        if (index >= 0 && index < brani.size()) {
            return brani.get(index);
        } else {
            return null;
        }
    }

    public String getTitle() {
        return titolo;
    }

    public void setTitle(String title) {
        this.titolo = title;
    }

    public void addBrani(Brano bran0){
        brani.add(bran0);
    }

    public int getNumeroBrani() {
        return brani.size();
    }
}
