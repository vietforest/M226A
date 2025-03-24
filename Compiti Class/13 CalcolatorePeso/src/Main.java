import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questo programma calcola il tuo peso su");
        System.out.println("PREMI ENTER PER CONTINUARE...");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("")) {
            System.out.print("Inserisci il tuo peso in kg: ");
            Scanner kg = new Scanner(System.in);
            double kgInput = kg.nextDouble();
            while (kgInput <= 0) {
                System.out.println("Il peso deve essere maggiore di 0, riprova.");
                System.out.print("Inserisci il tuo peso in kg: ");
                kgInput = kg.nextDouble();
            }

        }
    }
}