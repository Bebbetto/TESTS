import java.lang.Math;
import java.util.Scanner;

public class task_2 {
    public static void main(String[]args){

        System.out.println("print cfg");
        Scanner scan = new Scanner(System.in);

        System.out.println("print x: ");
        float x_point = scan.nextFloat();
        System.out.println("print y: ");
        float y_point = scan.nextFloat();
        System.out.println("print r: ");
        float r_circle = scan.nextFloat();

        int hypot = (int) Math.sqrt(x_point * 2 + y_point * 2);

        if (hypot < r_circle) {
            System.out.print("1");
        }
        else if (hypot > r_circle) {
            System.out.print("2");
        }
        else
            System.out.print("0");
    }
}
