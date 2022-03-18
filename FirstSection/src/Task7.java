
/** 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 *  и если да, то будет ли он прямоугольным. */

public class Task7 {
    public static void main(String[] args) {
        // Version 1
        int a = 60;
        int b = 120;
        int sum = 180;
        if (sum - a - b > 0) {
            if (sum - a - b == 90) {
                System.out.println("this triangle is square");
            } else {
                System.out.println("this triangle isn't square");
            }
        } else {
            System.out.println("this figure isn't triangle");
        }

        // Version 2
        int x = 30;
        int y = 160;
        int corners = 180;
        String str1 = "this figure isn't triangle";
        String str2 = "this triangle is square";
        String str3 = "this triangle isn't square";
        String result = corners - x - y <= 0 ? str1 : corners - x - y == 90 ? str2 : str3;
        System.out.println(result);
    }
}
