public class Task3 {

    public static void main(String[] args) {

        int[][] array = new int[5][8];
        int[][] minAndMaxArray = new int[5][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101) - 50;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {

            int min = array[i][0], max = array[i][0];

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            minAndMaxArray[i][0] = max;
            minAndMaxArray[i][1] = min;
        }

        System.out.println();

        for (int i = 0; i < minAndMaxArray.length; i++) {
            for (int j = 0; j < minAndMaxArray[i].length; j++) {
                System.out.printf("%5d", minAndMaxArray[i][j]);
            }
            System.out.println();
        }

    }
}
