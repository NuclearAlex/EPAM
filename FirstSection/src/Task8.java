
/** 2. Найти max{min(a, b), min(c, d)}. */

public class Task8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int tempMax = Math.max(a, b);
        int tempMin = Math.min(c, d);
        int result = Math.max(tempMax, tempMin);
        System.out.println(result);
    }
}
