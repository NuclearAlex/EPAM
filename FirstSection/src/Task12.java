
/**  4. Составить программу нахождения произведения квадратов первых двухсот чисел.  */

public class Task12 {
    public static void main(String[] args) {
        double intro = 1;
        for (double i = intro + 1; i <= 200; i++) {
            intro *= i * i;
        }
        System.out.printf("The multi squares of first 200 digits is: %f", intro);
    }
}
