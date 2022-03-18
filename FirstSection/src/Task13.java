
/**  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 m и n вводятся с клавиатуры.           */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = m + 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i % j == 0 && i != j && j != 1) {
                    System.out.printf("Digit %d divide by %d\n", i, j);
                }
            }
        }
    }
}
