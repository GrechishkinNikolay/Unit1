package unit6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArraycopy {

    public static void main(String[] args) {

        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));

        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println(Arrays.toString(arrayDestination));

        ArrayList<Integer> ar = (ArrayList<Integer>) Arrays.stream(arrayDestination).boxed().collect(Collectors.toList());
        ar.remove(3);
        ar.forEach(System.out::print);

    }
}
