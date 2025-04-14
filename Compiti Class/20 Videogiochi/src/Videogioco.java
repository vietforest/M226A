import java.util.ArrayList;

public class Videogioco {
    private String titolo;
    private float prezzo;
    private boolean stato;
    private ArrayList<Sviluppatore> Sviluppatori = new ArrayList<>();

    public Videogioco(String titolo, float prezzo, boolean stato, Sviluppatore sviluppatori) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.stato = stato;
        this.Sviluppatori.add(sviluppatori);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public ArrayList<Sviluppatore> getSviluppatori() {
        return new ArrayList<Sviluppatore>(Sviluppatori);
    }

    public void setSviluppatori(ArrayList<Sviluppatore> sviluppatori) {
        Sviluppatori = sviluppatori;
    }

    public void addSviluppatore(Sviluppatore sviluppatore){
        Sviluppatori.add(sviluppatore);
    }


    public void removeSviluppatore(int index){
        Sviluppatori.remove(index);
    }
}
