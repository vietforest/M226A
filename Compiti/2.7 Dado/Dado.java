/**
ES 2.7 Dado
Scrivere un programma che usi la classe Random per simulare il lancio di un dado,
visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene eseguito.

@author huynh anh nguyen
@version 03.02.2025

**/





public class Dado{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		int randomNum = (int)(Math.random() * 7); // 0 to 100
		System.out.println("Numero: " + randomNum);//Stampa a video una stringa 
	}
}