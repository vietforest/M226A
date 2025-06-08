import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private ArrayList<Employee> employees =  new ArrayList<>();
    private Path path;

    public EmployeeManager(String txtPath) {
        this.path = Paths.get(txtPath);
        if (Files.exists(path)){
            System.out.printf("Il file %s esiste!\n", path.toString());
        }
        else {
            System.out.print("Il file %s non esiste!\n");
        }
        if (Files.isWritable(path)) {
            System.out.printf("Il file %s è accessibile!\n", path.toString());
        }
        else {
            System.out.printf("Il file %s non è accessibile!\n", path.toString());
        }
    }
    public void loadEmployees() {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                double Salary = Double.parseDouble(line.split(";")[0]);
                String name =  line.split(";")[1];
                Employee employee = new Employee(name, Salary);
                employees.add(employee);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }
}
