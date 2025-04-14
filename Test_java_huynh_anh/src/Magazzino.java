import java.util.ArrayList;
import java.util.Objects;

public class Magazzino {
    private ArrayList<Articolo> articoloList;
    public Magazzino() {
        articoloList = new ArrayList<>();
    }

    /**
     * @param art aggiungere un nuovo articolo
     * */
    public void addArticolo(Articolo art) {
        articoloList.add(art);
    }

    /**
     * @param art rimuovere un nuovo articolo dalla lista
     * */
    public void removeArticolo(Articolo art) {
        articoloList.remove(art);
    }

    /**
     * @param articolo specifica quale articolo desiderato di essere modificato
     * @param quantita specifica la quantita
     * */
    public void modificareQuantitta (Articolo articolo ,int quantita){
        try {
            Articolo articoli = articoloList.get(articoloList.indexOf(articolo));
            articoli.setQuantita(quantita);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("l'articolo non esiste più");
        }
        
    }
    /**
     * @param identificatore specifica l'identificatore dell'articolo
     * @return è un void però se no c'è l'articolo non stampa
     * */
    public void ricercaIdentificatore (String identificatore){
        for (Articolo articoli : articoloList) {
            if (articoli.getIdentificatore().equals(identificatore)) {
                System.out.println(articoli.toString());
            }
        }
    }

    public ArrayList<Articolo> getArticoloList() {
        return articoloList;
    }

    public void setArticoloList(ArrayList<Articolo> articoloList) {
        this.articoloList = articoloList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazzino magazzino = (Magazzino) o;
        return Objects.equals(articoloList, magazzino.articoloList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(articoloList);
    }

}
