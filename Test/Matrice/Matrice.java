import java.util.Random;

/*
nome: matrice
desc: creare matrice con x e y inseriti dai 2 agumenti

@author: huynh anh nguyen
@data:17.02.2025
*/

public class Matrice{
	public static void main(String[] args){
			int righe = Integer.parseInt(args[0]);
			int colonne = Integer.parseInt(args[1]);
			int [][] m = new int[righe][colonne];
			String[] letter = {"x","y"};
			char lettera;
			Random rnd = new Random();//min incluso e max escluso
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				int numero= rnd.nextInt(0,2);
				lettera = letter[numero].charAt(0);
				System.out.print(m[i][j] + "" + lettera);
			}
			System.out.println("");
		}
	}
}