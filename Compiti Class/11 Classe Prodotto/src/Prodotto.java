import java.util.Scanner;

/**
Content: making a class of product for tracking all the objects
 @author Nguyen Huynh Anh
 @version 18/03/2025
*/




public class Prodotto {
    private String _nome;
    private int _codice;
    private int _quantitaInMagazzino;
    private double _prezzo;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String nome) {
        this._nome = nome;
    }

    public int get_codice() {
        return _codice;
    }

    public void set_codice(int codice) {
        this._codice = codice;
    }

    public int get_quantitaInMagazzino() {
        return _quantitaInMagazzino;
    }

    public void set_quantitaInMagazzino(int quantitaInMagazzino) {
        this._quantitaInMagazzino += quantitaInMagazzino;
    }

    public double get_prezzo() {
        return _prezzo;
    }

    public void set_prezzo(double prezzo) {
        this._prezzo = prezzo;
    }

    public Prodotto(String nome, int codice, int quantitaInMagazzino, double prezzo) {
        this._nome = nome;
        this._codice = codice;
        this._quantitaInMagazzino = quantitaInMagazzino;
        this._prezzo = prezzo;
    }


    /**
     * @param qt the amount of products being subtracted or added
     * @return it will change the amount directly in the storage
     */
    public void aggiornaQuantita(int qt){
        int quantitaInMagazzino = get_quantitaInMagazzino();
        int difference = quantitaInMagazzino + qt;
        if (difference < 0) {
            System.out.println("Vuoi vendere tutti i prodotti disponibili: " + quantitaInMagazzino + "?");
            Scanner sc = new Scanner(System.in);
            boolean choice = sc.nextBoolean();
            if (choice) {
                set_quantitaInMagazzino(-quantitaInMagazzino);
            }
            else {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Inserisci nuova quantita di prodotti");
                set_quantitaInMagazzino(+sc2.nextInt());
                sc2.close();
            }
            sc.close();
        }
        else {
            set_quantitaInMagazzino(+qt);
        }

    }

    /**
     *
     * @return it will calculate the total value of all items of that product in the storage
     *
     */
    public void calcolaValoreTotale(){
        double totale =  get_quantitaInMagazzino() * get_prezzo();
        System.out.println("Prezzo totale dei prodotti nel magazzino: " + totale);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "_nome='" + _nome + '\'' +
                ", _codice=" + _codice +
                ", _quantitaInMagazzino=" + _quantitaInMagazzino +
                ", _prezzo=" + _prezzo +
                '}';
    }
}
