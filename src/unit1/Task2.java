package unit1;

public class Task2 {

    private static double f(double x) {
        return Math.tan(2 * x) - 3;
    }

    private static double A = Math.PI / 8;
    private static double B = Math.PI / 6;
    private static double H = 0.01;

    public static void main(String[] args) {

        while (A < B) {
            System.out.printf("%5.4f %5.4f\n", A, f(A));
            A += H;
        }
    }
}
