
/** 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 *      являются цифры числа N.    */

package second_section;

public class Task18EpamSecondSection {
    public static void main(String[] args) {
        int N = 13452789;
        char[] c = ("" + N).toCharArray();
        int[] arr = new int[("" + N).length()];

        System.out.println("Our digit equal " + N);

        System.out.println("\nInitial array: ");
        print(arr);

        arr = addElements(arr, c);

        System.out.println("\n\nFinal array: ");
        print(arr);
    }

    private static void print(int[] array) {
        for (int x : array) {
            System.out.printf("%d\t", x);
        }
    }

    private static int[] addElements(int[] data, char[] c) {
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(("" + c[i]));
        }
        return data;
    }
}
