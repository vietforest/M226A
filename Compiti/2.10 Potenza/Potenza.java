/**
ES 2.10 Potenza
Scrivere un programma che preso un numero restituisce il suo quadrato (cercare la maggior precisione possibile).


@author huynh anh nguyen
@version 03.02.2025

**/





public class Potenza{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		double varA = Double.parseDouble(args[0]);
		double expo = 2;
        System.out.println("Potenza di varA: " + Math.pow(varA, expo));//Stampa a video una stringa 
	}
}