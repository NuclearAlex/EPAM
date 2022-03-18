
/**         */

package second_section;

import java.util.Scanner;

public class Task11EpamSecondSection {
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input numbers columns who you want replace: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.printf("You wanna replace %d column on %d column\n\n", x, y);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == x) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][y];
                    matrix[i][y] = temp;
                }
            }
        }

        System.out.println("Result of our replacement: ");

        for (int[] q : matrix) {
            for (int z : q) {
                System.out.printf("%d \t", z);
            }
            System.out.println();
        }
    }
}
