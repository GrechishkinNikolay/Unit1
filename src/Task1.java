import java.util.Arrays;

public class Task1 {

    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_SIZE];
        int[] secondArray = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = 2 * i;
        }

        System.out.println(Arrays.toString(array));

        int i = 1;

        while (i < ARRAY_SIZE) {
            secondArray[i] = array[i - 1] * array[i];
            i++;
        }

        i = 0;

        do {
            System.out.print("\t" + secondArray[i]);
            i++;
        } while (i < ARRAY_SIZE);
    }
}
