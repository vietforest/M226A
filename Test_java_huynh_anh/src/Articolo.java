import java.util.Objects;

public class Articolo {
    private String nome;
    private Produttore produttore;
    private int annoProduzione;
    private String descrizione;
    private int quantita;
    private String identificatore;
    public Articolo(String nome, Produttore produttore, int annoProduzione, String descrizione, int quantita) {
        if (produttore == null || descrizione == null || nome == null || nome == "") {
            throw new IllegalArgumentException("Produttore and descrizione are null!");
        }
        else {
            this.nome = nome;
            this.produttore = produttore;
            this.annoProduzione = annoProduzione;
            this.descrizione = descrizione;
            this.quantita = quantita;
            this.identificatore = getNome().charAt(0) + "" + getProduttore().getNome().charAt(0) + getAnnoProduzione();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produttore getProduttore() {
        return produttore;
    }

    public void setProduttore(Produttore produttore) {
        this.produttore = produttore;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita += quantita;
    }

    public String getIdentificatore() {
        return identificatore;
    }

    public void setIdentificatore(String identificatore) {
        this.identificatore = identificatore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return annoProduzione == articolo.annoProduzione && quantita == articolo.quantita && Objects.equals(nome, articolo.nome) && Objects.equals(produttore, articolo.produttore) && Objects.equals(descrizione, articolo.descrizione) && Objects.equals(identificatore, articolo.identificatore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, produttore, annoProduzione, descrizione, quantita, identificatore);
    }

    /**
     * @return ritorna il nome dell'articolo, il nome del produttore e una codice identificatore
     * */
    @Override
    public String toString() {
        return getNome() + " - " + getProduttore().getNome() + " - " + getIdentificatore();
    }
}
