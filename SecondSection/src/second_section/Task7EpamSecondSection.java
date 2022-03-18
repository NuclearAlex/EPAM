
/**  1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.       */

package second_section;

public class Task7EpamSecondSection {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,  52, 3,  4,  5,  56, 7 },
                {8,  9,  10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42}
        };

        for (int[] x : matrix) {
            for (int z : x) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j % 2 != 0) {
                    if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                        System.out.printf("%d \t", matrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
