package unit1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, D;

        System.out.print("a = ");
        a = in.nextInt();

        System.out.print("b = ");
        b = in.nextInt();

        System.out.print("c = ");
        c = in.nextInt();

        D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Корней нет");
            return;
        } else if (D == 0) {
            System.out.println("Уравнение имеет один корень x = " + -b / (2 * a));
            return;
        }

        System.out.println("x1 = " + (-b + Math.sqrt(D)) / (2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(D)) / (2 * a));

    }
}
