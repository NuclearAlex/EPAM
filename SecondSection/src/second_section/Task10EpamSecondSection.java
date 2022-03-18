
/**         */

package second_section;

public class Task10EpamSecondSection {
    public static void main(String[] args) {
        int m = 10, n = 10;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == matrix.length - i) {
                    break;
                } else {
                    matrix[i][j] = i + 1;
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
