import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileReader;
import java.util.List;
import java.io.FileWriter;


public class Task3 {
    public static void main(String[] args) {
        String idLinePath = "C:/TZ/values.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(idLinePath))) {
            String idLine;
            while ((idLine = reader.readLine()) != null) {
                if (idLine.contains("id")) {
                    System.out.println(idLine);
                }
            }
        }catch (IOException error) {
            error.printStackTrace();
        }
        String pathLine = "C:/TZ/tests.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathLine))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("id") && line.contains("id") != line.contains("title"))
                {
                    System.out.println();

                }
            }
        }
        catch (IOException error) {
            error.printStackTrace();
        }

    }
}


