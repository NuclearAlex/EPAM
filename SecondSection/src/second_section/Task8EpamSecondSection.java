
/**  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.       */

package second_section;

public class Task8EpamSecondSection {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,  52, 3,  4,  5,  56},
                {8,  9,  10, 11, 12, 13},
                {15, 16, 17, 18, 19, 20},
                {22, 23, 24, 25, 26, 27},
                {29, 30, 31, 32, 33, 34},
                {36, 37, 38, 39, 40, 41}
        };

        for (int[] x : matrix) {
            for (int z : x) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                System.out.printf("%d %d\t", matrix[i][j], matrix[i][matrix.length - 1 - i]);
                break;
            }
            System.out.println();
        }
    }
}
