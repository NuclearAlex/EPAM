
/** 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦 / 𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦) ∗𝑡𝑔 𝑥𝑦     */

public class Task3 {
    public static void main(String[] args) {
        int x = 60;
        double xRad = Math.toRadians(x);
        int y = 60;
        double yRad = Math.toRadians(y);
        double z = ((Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad))) * Math.tan(xRad * yRad);
        System.out.println(z);
    }
}
