
/**  4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.      */

package second_section;

public class Task4EpamSecondSection {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : array) {
            System.out.printf("%d, ", x);
        }
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[0];
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            min = array[0];
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
        System.out.println();
        for (int x : array) {
            System.out.printf("%d, ", x);
        }
    }
}
