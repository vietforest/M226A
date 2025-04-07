import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String titolo;
    private List<Brano> brani;
    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>();
    }

/**
 * Return the Brano from the arraylist
 *
 * @param index indicate the index of array
 * @return can return null or the song
 * */

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

    /**
     * add songs
     *
     * @param bran0 add more songs
     * @return nothing it's void
     * */

    public void addBrani(Brano bran0){
        brani.add(bran0);
    }

    /**
     * @return the size of the arraylist
     * */

    public int getNumeroBrani() {
        return brani.size();
    }
}
