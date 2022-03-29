
/**  You need to paste symbol 'b' after every symbol 'a'   */

package third_section;

public class Task6EpamThirdSection {
    public static void main(String[] args) {
        String init = "Now next on first letter in word \"after\" will be letter b";

        String[] x = init.split(" ");
        String res = "";
        for (int i = 0; i < x.length; i++) {
            res += x[i] + " ";
        }
        System.out.println(res);

        char[] y = res.toCharArray();
        String result = "";
        for (int i = 0; i < y.length; i++) {
            if (y[i] == 'a') {
                y[i + 1] = 'b';
            }
            result += y[i];
        }

        System.out.println(result);
    }
}
