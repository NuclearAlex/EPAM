
/**  1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 дополнительный массив.       */

package second_section;

import java.util.Arrays;

public class Task15EpamSecondSection {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{11, 12, 13, 14, 15, 16};
        int k = 3;

        System.out.println("First array: ");
        for (int x : arr1) {
            System.out.printf("%d\t", x);
        }

        System.out.println("\nSecond array: ");
        for (int x : arr2) {
            System.out.printf("%d\t", x);
        }

        arr1 = Arrays.copyOf(arr1, (arr1.length + arr2.length));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = arr1.length - 1; j > k; j--) {
                int temp = arr1[j];
                arr1[j] = arr1[j - 1];
                arr1[j - 1] = temp;
            }
        }

        for (int i = k; i < arr2.length + k; i++) {
            arr1[i] = arr2[i - k];
        }

        System.out.println("\n\nFinal array: ");
        for (int x : arr1) {
            System.out.printf("%d\t", x);
        }
    }
}
