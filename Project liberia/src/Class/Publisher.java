package Class;

import java.util.Objects;

public class Publisher {
    private String name;
    private String edizione;


    /**
     *
     * @param name
     * @param edizione
     */

    public Publisher(String name, String edizione) {
        this.name = name;
        this.edizione = edizione;
    }

    public String getEdizione() {
        return edizione;
    }

    public void setEdizione(String edizione) {
        this.edizione = edizione;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(name, publisher.name) && Objects.equals(edizione, publisher.edizione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edizione);
    }


}
