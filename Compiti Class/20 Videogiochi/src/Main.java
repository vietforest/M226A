public class Main {
    public static void main(String[] args) {
        Sviluppatore sviluppatore1 = new Sviluppatore("asd", "sad");
        Sviluppatore sviluppatore2 = new Sviluppatore("asd2", "sad2");
        Videogioco videogioco1 = new Videogioco("asdsadds", (float)12.50, true, sviluppatore1);
        videogioco1.addSviluppatore(sviluppatore2);
        Videogioco videogioco2 = new Videogioco("apple", (float)12.50, true, sviluppatore1);
        Videogioco videogioco3 = new Videogioco("bana", (float)12.50, true, sviluppatore1);

        Negozio negozio1 = new Negozio("asd", videogioco1);
        negozio1.addVideogioco(videogioco2);
        negozio1.addVideogioco(videogioco3);
        System.out.printf(negozio1.toString());
    }
}