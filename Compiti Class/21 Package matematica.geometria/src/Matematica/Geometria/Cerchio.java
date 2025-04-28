package Matematica.Geometria;

public class Cerchio {
    private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + raggio +
                '}';
    }
}
