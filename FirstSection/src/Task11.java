
/** 3. Найти сумму квадратов первых ста чисел.   */


public class Task11 {
    public static void main(String[] args) {
        int intro = 1;
        for (int i = intro + 1; i <= 100; i++) {
            intro += i * i;
        }
        System.out.printf("The sum squares of first 100 digits is: %d", intro);
    }
}
