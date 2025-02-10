/**
ES 4.6 Matrice
Leggere un array di interi con n numeri e dire quali e quanti di essi sono primi.


@author huynh anh nguyen
@version 10.02.2025

**/





public class Matrice{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		int maxNumeroCasuale = Integer.parseInt(args[0]);
		int dimensione = Integer.parseInt(args[1]);
		int[][] matrice = new int[dimensione][dimensione]; 
		for (int i = 0; i < dimensione ; i++){
			for (int j = 0; j < dimensione ; j++){
				int randMath = (int)(Math.random() * (maxNumeroCasuale+1));
				matrice[i][j] = randMath;
				System.out.print(matrice[i][j]);
			}
			System.out.println("");
		}			
		
	}
}

