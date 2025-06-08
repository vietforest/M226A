import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager("src/impiegati.txt");
        int input = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        try {
            while (flag) {
                if (input == 0)
                {
                    System.out.println("************************************");
                    System.out.println("1: Visualizza percorso txt");
                    System.out.println("2: Visualizza lista degli impiegati");
                    System.out.println("3: Visualizza stipendio medio");
                    System.out.println("4: Esci");
                    System.out.println("************************************");
                    input = sc.nextInt();
                }
                else if (input == 1){
                    String input2 = String.valueOf(sc.hasNext());
                    employeeManager = new EmployeeManager(input2);
                    input = 0;
                }
                else if (input == 2){
                    employeeManager.loadEmployees();
                    System.out.println(employeeManager.getEmployees());
                    input = 0;
                }
                else if (input == 3){
                    System.out.println("Stipendio medio " + employeeManager.getAverageSalary() + "FR");
                    input = 0;
                }
                else if (input == 4){
                    flag = false;
                }
                else {
                    System.out.println("Inserisci un valore valido");
                    input = 0;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}