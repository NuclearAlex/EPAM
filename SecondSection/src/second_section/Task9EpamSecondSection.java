
/**  4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):       */

package second_section;

public class Task9EpamSecondSection {
    public static void main(String[] args) {
        int m = 10, n = 10;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 != 0) {
                    matrix[i][j] = (matrix.length - j);
                } else {
                    matrix[i][j] = j + 1;
                }
            }
        }

        for (int[] x : matrix) {
            for (int y : x) {
                System.out.printf("%d \t", y);
            }
            System.out.println();
        }
    }
}
