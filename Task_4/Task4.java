package Task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();

        try (Scanner scanner = new Scanner(new File("C:\\Users\\progr\\IdeaProjects\\HelloPath\\src\\Task_4\\Task4.txt"))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found: " + e.getMessage());
            return;
        }
        Collections.sort(numbers);
        int median = numbers.get(numbers.size() / 2);

        int steps = 0;
        for (int num : numbers) {
            steps =steps + Math.abs(num - median);
        }
        System.out.println("min steps: " + steps);
    }
}
