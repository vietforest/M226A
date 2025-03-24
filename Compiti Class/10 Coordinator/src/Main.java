import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int riga;
        int col;
        do {
            System.out.print("Enter the coordinate x: ");
            riga = sc.nextInt();
        } while(!isNumber(riga));

        do {
            System.out.print("Enter the coordinate y: ");
            col = sc.nextInt();
        } while(!isNumber(col));
        sc.close();
        Coordinator coord = new Coordinator(riga, col);

    }


    public static boolean isNumber(int number){
        int min = 0;
        int max = 4;
        if(number < min || number >= max){
            System.out.println("Try again");
            return false;
        }
        else {
            return true;
        }
    }
}