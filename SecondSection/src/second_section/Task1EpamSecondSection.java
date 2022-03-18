
/** 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.   */

package second_section;

public class Task1EpamSecondSection {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int k = 2;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
