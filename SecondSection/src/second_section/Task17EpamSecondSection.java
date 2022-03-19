
/** 4. Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в
 порядке возрастания. Для этого сравниваются два соседних числа. Если нужно, то делается
 перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 Составить алгоритм сортировки, подсчитывая при этом количества перестановок.   */

package second_section;

public class Task17EpamSecondSection {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 5, 8, 6, 3, 2, 16, 14, 10, 15, 4, 7, 11, 9, 13, 12};

        System.out.println("Initial array: ");
        printData(digits);

        replaceElement(digits);

        System.out.println("\n\nSorted array by up: ");
        printData(digits);
    }

    private static int[] replaceElement(int[] data) {
//            Variant 1:

        int counter = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    isSorted = false;
                    counter++;
                }
            }
        }
//            Variant 2 :
//
//        int counter = 0;
//        for (int i = 0; i < data.length - 1; i++) {
//            for (int j = 0; j < data.length - 1; j++) {
//                if (data[j] > data[j + 1]) {
//                    int temp = data[j];
//                    data[j] = data[j + 1];
//                    data[j + 1] = temp;
//                    counter++;
//                }
//            }
//        }
        System.out.println("\nCount of steps which need for sort: " + counter);
        return data;
    }

    private static void printData(int[] data) {
        for (int x : data) {
            System.out.printf("%d\t", x);
        }
    }
}
