/**
ES 2.14 Nota Modulo
Scrivere un programma che riceve in ingresso 4 note.
Il programma dovrà calcolare la nota finale rispettando la seguente formula:

@author huynh anh nguyen
@version 03.02.2025

**/

public class NotaModulo{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		double nota1 = Double.parseDouble(args[0]);
		double nota2 = Double.parseDouble(args[1]);
		double nota3 = Double.parseDouble(args[2]);
		double nota4 = Double.parseDouble(args[3]);		
		double notaFinale = (nota1 * 0.1 + nota2 * 0.3 + nota3 * 0.3 + nota4 * 0.3);
		System.out.println("Nota finale: " + String.format("%2f",notaFinale));
	}
}