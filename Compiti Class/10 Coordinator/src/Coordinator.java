
import java.util.Scanner;
public class Coordinator {
    public Coordinator(int x, int y) {
        String matrice[][] = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == y+1 && j == x+1) {
                    matrice[i][j] = "x";
                    System.out.print(matrice[i][j]);
                } else if (i == 0) {
                    matrice[i][j] = Integer.toString(j);
                    System.out.print(matrice[i][j]);

                } else if (j == 0) {
                    matrice[i][j] = Integer.toString(i);
                    System.out.print(matrice[i][j]);
                } else {
                    matrice[i][j] = " ";
                    System.out.print(matrice[i][j]);
                }

            }
            System.out.println("");
        }

    }
}
