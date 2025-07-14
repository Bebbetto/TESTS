import java.util.Arrays;
import java.util.Scanner;


public class Task1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("массив: ");
        int n = scan.nextInt();
        System.out.print("длина: ");
        int m = scan.nextInt();

        int[] arr = new int[n];
        Arrays.setAll(arr, i -> ++i);

        int current = 1;
        System.out.print("путь: ");
        do {
            System.out.print(current);
            current = (current - 1 + m - 1) % n + 1;
        } while (current != 1);
    }
    }