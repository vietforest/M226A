/**
ES 2.9 Swap Valori
Realizzare un programma che acquisisca da tastiera (argomenti) due valori interi e li memorizzi nelle variabili varA e varB. 
In seguito, scambiare il valore di tali variabili e stamparne a schermo il nuovo contenuto. 


@author huynh anh nguyen
@version 03.02.2025

**/





public class SwapValori{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		int varA = Integer.parseInt(args[0]);
        int varB = Integer.parseInt(args[1]);
        int swap = varA; //variabile usata come buffer
        varA = varB;
        varB = swap;
        System.out.println("Variabile A: " + varA);
        System.out.println("Variabile B: " + varB);//Stampa a video una stringa 
	}
}