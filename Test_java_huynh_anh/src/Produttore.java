import java.util.Objects;

public class Produttore {
    private String nome;
    private String indirizzo;

    public Produttore(String nome, String indirizzo) {
        if (nome == null || indirizzo == null) {
            throw new NullPointerException("Nome e indirizzo nullo");
        }
        else {
            this.nome = nome;
            this.indirizzo = indirizzo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produttore that = (Produttore) o;
        return Objects.equals(nome, that.nome) && Objects.equals(indirizzo, that.indirizzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, indirizzo);
    }
}
