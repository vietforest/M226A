public class Autista {
    private String Nome;
    private String Cognome;
    private Veicolo veicolo;
    private Sede sede;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Autista(String nome, String cognome, Veicolo veicolo, Sede sede) {
        Nome = nome;
        Cognome = cognome;
        this.veicolo = veicolo;
        this.sede = sede;
    }
}
