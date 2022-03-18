
/**  6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 *      принадлежит закрашенной области, и false — в противном случае    */

public class Task6 {
    public static void main(String[] args) {
        int x = 0, y = 5;
        if (x <= 4 && x >= -4 && y >= -3 && y <= 0|| x >= -2 && x <= 2 && y >= -3 && y <= 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
