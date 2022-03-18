
/**  2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 числом. Подсчитать количество замен.       */

package second_section;

public class Task2EpamSecondSection {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int x = 11;
        int replace = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                array[i] = x;
                replace += 1;
            }
        }
        System.out.println(replace);
    }
}
