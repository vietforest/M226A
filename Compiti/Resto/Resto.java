import java.util.ArrayList;

public class Temp{
	//Entry point del programma (Il main parte del main)
	public static void main(String[] args){
		ArrayList<int> temp = new ArrayList<int>();
		temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 temp.add (8);
		 
		int sum = 0;
        for (int num : temp) {
            sum += num;
        }
		for (int i = ; i < 6; i++) {
			System.out.println(temp[i]);
		}
		double average = (double)sum / temp.size();
        System.out.println("Average: " + average);
	}
}