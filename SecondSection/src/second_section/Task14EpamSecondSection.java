
/**  13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.       */

package second_section;

public class Task14EpamSecondSection {
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

        System.out.print("\nSorted columns of array from min to max value elements:\n\n");

        boolean isSortedUp = false;
        while (!isSortedUp) {
            isSortedUp = true;
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                        isSortedUp = false;
                    }
                }
            }
        }

        for (int[] x : matrix) {
            for (int z : x) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }

        System.out.print("\nSorted columns of array from max to min value elements:\n\n");

        boolean isSortedDown = false;
        while (!isSortedDown) {
            isSortedDown = true;
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                        isSortedDown = false;
                    }
                }
            }
        }

        for (int[] x : matrix) {
            for (int z : x) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }
    }
}
