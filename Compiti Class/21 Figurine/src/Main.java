import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Figurina> Figurinas = new HashSet<>();
        Figurinas.add(new Figurina("00001","Rana", "Winter"));
        Figurinas.add(new Figurina("00002","Rana", "Winter"));
        Figurinas.add(new Figurina("00001","Rana", "Winter"));
        Figurinas.add(new Figurina("00001","Reana", "Winter"));

        System.out.println(Figurinas.toString());
    }
}