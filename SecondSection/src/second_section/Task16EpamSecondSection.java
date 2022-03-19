
/** 3. Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
 чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 повторяется. Написать алгоритм сортировки выбором. */

package second_section;

public class Task16EpamSecondSection {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 5, 8, 6, 3, 2, 16, 14, 10, 15, 4, 7, 11, 9, 13, 12};

        System.out.println("Initial array: ");
        print(digits);

        for (int i = 0; i < digits.length; i++) {
            int index = max(digits, i);
            int temp = digits[i];
            digits[i] = digits[index];
            digits[index] = temp;
        }

        System.out.println("\nSorted array by down: ");
        print(digits);
    }

    private static int max(int[] digits, int a){
        int maxIndex = a;
        int maxValue = digits[a];
        for (int i = a + 1; i < digits.length; i++) {
            if (digits[i] > maxValue) {
                maxValue = digits[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void print(int[] digits) {
        for (int x : digits) {
            System.out.printf("%d\t", x);
        }
    }
}
