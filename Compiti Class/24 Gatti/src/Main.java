import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/Gatti.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String name = line.split(",")[0];
                int age = Integer.parseInt(line.split(",")[1]);
                String gender = line.split(",")[2];

                Gatto gatto  = new Gatto(name, age, gender);
                System.out.println(gatto.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}