public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    int tracciaCorrente;

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = playlist;
        this.tracciaCorrente = 0;
    }

    public void precedente() {
        if (tracciaCorrente > 0) {
            tracciaCorrente--;
            play();
        } else {
            System.out.println("📢 Sei già al primo brano.");
        }
    }

    public void successivo() {
        if (tracciaCorrente + 1 < playlist.getNumeroBrani()) {
            tracciaCorrente++;
            play();
        } else {
            System.out.println("📢 Sei già all'ultimo brano.");
        }
    }

    public void play() {
        Brano brano = playlist.getBrano(tracciaCorrente);
        if (brano != null) {
            System.out.println("🎵 Riproducendo: " + brano.getAutore() + " (Posizione: " + (tracciaCorrente + 1) + ")");
        } else {
            System.out.println("❌ Nessun brano da riprodurre.");
        }
    }
    public void selezionaBrano(int n) {
        if (n >= 0 && n < playlist.getNumeroBrani()) {
            tracciaCorrente = n;
            play();
        } else {
            System.out.println("❌ Posizione non valida.");
        }
    }


}
