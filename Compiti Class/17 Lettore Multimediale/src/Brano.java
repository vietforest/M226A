public class Brano {
    private String titolo;
    private String autore;

    public Brano(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
}
