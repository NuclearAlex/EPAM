
/**  1. Напишите программу, где пользователь вводит любое целое положительное число.
 *      А программа суммирует все числа от 1 до введенного пользователем числа.   */


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int intro = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input digit, please: ");
        int dig = scanner.nextInt();
        for (int i = intro + 1; i <= dig; i++) {
            intro += i;
        }
        System.out.println(intro);
    }
}
