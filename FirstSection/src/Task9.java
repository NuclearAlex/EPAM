
/** 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.  */

public class Task9 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 4;
        int x3 = 7;
        int y1 = 2;
        int y2 = 6;
        int y3 = 10;
        int side1 = (int)Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
        int side2 = (int)Math.pow((((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))), 0.5);
        int side3 = (int)Math.pow((((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))), 0.5);
        if (side1 + side2 == side3) {
            System.out.println("Yes, these points located on one line");
        } else {
            System.out.println("No, these points don't located on one line");
        }
    }
}

/**
 * public static void main(String[] args) {
 *         int x1 = 1;
 *         int x2 = 4;
 *         int x3 = 7;
 *         int y1 = 2;
 *         int y2 = 6;
 *         int y3 = 12;
 *         int side1 = (int)Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
 *         int side2 = (int)Math.pow((((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2))), 0.5);
 *         int side3 = (int)Math.pow((((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1))), 0.5);
 *         int moreSide = Math.max(side1, Math.max(side2, side3));
 *         System.out.println(moreSide);
 *         int sumLessSides = 0;
 *         if (side1 == moreSide) {
 *             moreSide = side1;
 *             sumLessSides += side2 + side3;
 *             System.out.println("Side1 is max");
 *         } else if (side2 == moreSide) {
 *             sumLessSides += side1 + side3;
 *             moreSide = side2;
 *             System.out.println("Side2 is max");
 *         }else if (side3 == moreSide) {
 *             sumLessSides += side1 + side2;
 *             moreSide = side3;
 *             System.out.println("Side3 is max");
 *         }
 *         System.out.println(sumLessSides);
 *         if (sumLessSides == moreSide) {
 *             System.out.println("Yes, these points located on one line");
 *         } else {
 *             System.out.println("No, these points don't located on one line");
 *         }
 *     }
 */
