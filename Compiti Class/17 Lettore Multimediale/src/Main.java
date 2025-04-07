public class Main {
    public static void main(String[] args) {
        Brano b1 = new Brano("Bohemian Rhapsody", "Queen");
        Brano b2 = new Brano("Imagine", "John Lennon");
        Brano b3 = new Brano("Hotel California", "Eagles");

        Playlist playlist = new Playlist("Classici Rock");
        playlist.addBrani(b1);
        playlist.addBrani(b2);
        playlist.addBrani(b3);

        Player player = new Player("X100", "Sony", playlist);


        player.play();
        player.successivo();
        player.successivo();
        player.successivo(); // fuori limite
        player.precedente();
        player.selezionaBrano(0);
        player.selezionaBrano(10); // non valido
    }
}