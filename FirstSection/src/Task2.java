
/** 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑏+√𝑏2+4𝑎𝑐2𝑎) −𝑎3𝑐+𝑏−2  */

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double d = (b + Math.sqrt(b * b + (4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(d);
    }
}
