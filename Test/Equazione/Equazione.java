
/*
nome: equazione
desc: fare una equazione di parabola

@author: huynh anh nguyen
@data:17.02.2025
*/

public class Equazione{
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double x1;
		double x2;
		double discriminante = (b*b)-4*a*c;
		if (discriminante > 0){
			x1 = (-b - Math.sqrt(discriminante))/2*a;
			x2 = (-b + Math.sqrt(discriminante))/2*a;
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
		else if (discriminante == 0){
			x1 = (-b + Math.sqrt(discriminante))/2*a;
			System.out.println("x = "+ x1);
		}
		else {
			System.out.println("impossible");
		}
	
	}
}