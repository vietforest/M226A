public class Brano {
    private String title;
    private String autore;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Brano(String autore, String title) {
        this.autore = autore;
        this.title = title;
    }
}
