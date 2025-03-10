/*
nome: rettangolo
desc: creare un rettangolo secondo 2 parametri

@author: huynh anh nguyen
@data:17.02.2025
*/

public class Rettangolo{
	public static void main(String[] args){
			int righe = Integer.parseInt(args[0]);
			int colonne = Integer.parseInt(args[1]); 
		for (int i=0; i < righe;  i++){
			if (righe < 1){
					for (int j = 0; j < colonne; j++){
						System.out.print("*");
					}
				System.out.println("");
			}
			else if ((righe > 1 ) && (righe < righe-1)){
				for (int j = 0; j < colonne; j++){
						if (j < 1){
						System.out.print("*");
					}
					else if ((righe > 1 ) && (righe < righe-1)){
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			else {
				for (int k = 0; k < colonne; k++){
						System.out.print("*");
					}
				}
				System.out.println("");
			
		}			
	}
}