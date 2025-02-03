/**
ES 2.11 Codice
Scrivere un programma che data una parola, inserita come argomento, 
restituisce una parola in codice con la seguente regola:
1. Prima lettera +Terza lettera + Ultima lettera + Penultima Lettera

Esempio: vascello -->vsol

@author huynh anh nguyen
@version 03.02.2025

**/





public class Codice{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		String word = args[0];
		int indice = word.length();
		String primaLettera =	word.substring(0,1);
		String terzaLettera =	word.substring(2,3);
		String penUnltimaLettera = word.substring(indice-2, indice-1);
		String unltimaLettera = word.substring(indice-1, indice);
		String compose = primaLettera + terzaLettera + unltimaLettera + penUnltimaLettera;
        System.out.println(compose);//Stampa a video una stringa 
	}
}