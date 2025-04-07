public class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    int indexList = 0;

    public Player(Playlist playlist, String marca, String modello) {
        this.playlist = playlist;
        this.marca = marca;
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public void Successivo(){
        if (indexList + 1 < playlist.getNumeroBrani()){
            indexList++;
            play();
        }else {
            System.out.println("📢 Sei già all'ultimo brano.");
        }

    }

    public void precedente() {
        if (indexList  > 0) {
            indexList --;
            play();
        } else {
            System.out.println("📢 Sei già al primo brano.");
        }
    }

    public void play() {
        Brano brano = playlist.getBrani(indexList);
        if (brano != null) {
            System.out.println("🎵 Riproducendo: " + brano.getTitle() + "By " + brano.getAutore() + " (Posizione: " + (indexList + 1) + ")");
        } else {
            System.out.println("❌ Nessun brano da riprodurre.");
        }
    }

    public void selezionaBrano(int n) {
        if (n >= 0 && n < playlist.getNumeroBrani()) {
            indexList = n;
            play();
        } else {
            System.out.println("❌ Posizione non valida.");
        }
    }
}
