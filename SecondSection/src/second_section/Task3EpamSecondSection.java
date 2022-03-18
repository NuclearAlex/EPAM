
/**  3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 положительных и нулевых элементов.       */

package second_section;

public class Task3EpamSecondSection {
    public static void main(String[] args) {
        int[] array = new int[]{-5, 20, 0, 1, 2, 6, -8, 0, -7, 41, -23, 5};
        int negative = 0;
        int positive = 0;
        int empty = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative += 1;
            } else if (array[i] == 0) {
                empty += 1;
            } else if (array[i] > 0) {
                positive += 1;
            }
        }
        System.out.printf("Number of positive digits is %d\nNumber of negative digits is %d\n" +
                "Number of null digits is %d", positive, negative, empty);
    }
}
