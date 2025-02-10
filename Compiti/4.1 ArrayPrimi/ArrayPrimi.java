/**
ES 4.1 ArrayPrimi
Leggere un array di interi con n numeri e dire quali e quanti di essi sono primi.


@author huynh anh nguyen
@version 10.02.2025

**/





public class ArrayPrimi{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		int[] numeri = {2,4,4,5,6,7,8,9};
		int contatore = 0;
		for (int num : numeri){
			for (int i = 2; i <= num /2; i++){
					if(num%i == 0){
						System.out.println(num + " is a prime number.");
						contatore++;
					}
					
			}
		}
		System.out.println(contatore);
	}
}