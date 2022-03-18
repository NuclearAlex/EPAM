
/**  10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.       */

package second_section;

public class Task6EpamSecondSection {
    public static void main(String[] args) {
        int[] row = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        for (int i = 0; i < row.length; i++) {
            if (i == 0) {
                continue;
            } else {
                row[i] = 0;
                i++;
            }
        }

        for (int x : row) {
            System.out.printf("%d ", x);
        }
    }
}
