import java.lang.Math;
public class Pitagora{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		float no1 = Float.parseFloat(args[0]);
		float no2 = Float.parseFloat(args[1]);
		float hyp = (float)Math.sqrt(Math.pow(no1,2)+Math.pow(no2,2));
		System.out.println("Hyp: " + String.format("%.2f", hyp));//Stampa a video una stringa 
	}
}