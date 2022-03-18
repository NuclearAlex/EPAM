
/**  9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 чисел несколько, то определить наименьшее из них.       */

package second_section;

public class Task5EpamSecondSection {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 6, 2, 21, 2, 3, 4, 0, 4};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (array[1] < array[i]) {
                        result = array[1];
                        break;
                    } else {
                        result = array[i];
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}


//public class Program {
//    public static void main(String[] args) {
//        int[] ars = new int[]{3, 3, 4, 4, 4, 4, 7, 8, 9, 10, 11};
//        int res = 0;
//        for (int i = 0; i < ars.length; i++) {
//            for (int j = i + 1; j < ars.length; j++) {
//                if (ars[i] == ars[j]) {
//                    System.out.println(ars[j]);
//                    res += ars[j];
//                }
//            }
//        }
//        System.out.println(res);
//    }
//}
