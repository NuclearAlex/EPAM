
/**  11. Матрицу 6x6 заполнить случайными числами. Вывести на экран саму матрицу и номера строк, в
 которых число 5 встречается три и более раз.        */

package second_section;

public class Task12EpamSecondSection {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5,  5 , 3,  4,  5,  5 },
                {8,  9,  10, 11, 12, 13},
                {5 , 16, 5 , 18, 19,  5},
                {22, 23, 24, 25, 26, 27},
                {29, 30, 31, 32, 33, 34},
                {36, 5 , 5 , 39, 5 , 41}
        };

        for (int[] x : matrix) {
            for (int z : x) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }

        System.out.print("\nRows who contains the digit \"5\" 3 or more times:\n\n");

        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.printf("%d \t", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
