import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Prodotto prodotto = new Prodotto("Switch", 0001, 10, 250);
        System.out.println(prodotto);
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci un la quantita del prodotto");
            int numero = input.nextInt();
            prodotto.aggiornaQuantita(numero);
            System.out.println(prodotto);
        } catch (Exception e) {
            System.out.println("Invalide input");
        }

    }
}