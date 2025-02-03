import java.util.ArrayList;
import java.io.*;
public class Temp{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (435);
		 temp.add (435);
		int sum = 0;
        for (int num : temp) {
            sum += num;
        }
		for (int num1 : temp) {
            System.out.println("Temp: " + num1);
        }
		double average = (double)sum / temp.size();
        System.out.println("Average: " + average);
	}
}