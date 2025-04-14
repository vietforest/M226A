import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String nome;
    private List<Videogioco> videogiocoList= new ArrayList<Videogioco>();

    public Negozio(String nome, Videogioco videogiocoList) {
        this.nome = nome;
        this.videogiocoList.add(videogiocoList);
    }

    public List<Videogioco> getVideogiocoList() {
        return videogiocoList;
    }

    public void setVideogiocoList(List<Videogioco> videogiocoList) {
        this.videogiocoList = videogiocoList;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVideogioco(Videogioco videogioco){
        videogiocoList.add(videogioco);
    }

    @Override
    public String toString() {
        String videogioci = "" ;
        for (int index = 0; index <= videogiocoList.size()-1; index++){
            Videogioco videogioco = videogiocoList.get(index);
            videogioci += videogioco.getTitolo() + videogioco.getSviluppatori().toString() + "; " + "\n";
        }
        return "Negozio{" +
                "videogiocoList: " + "\n" + videogioci +
                '}';
    }

    public void removeVideogioco(int index){
        videogiocoList.remove(index);
    }
}
