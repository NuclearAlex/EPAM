
/**  You need to check is a given word palindrome or not   */

package third_section;

public class Task7EpamThirdSection {
    public static void main(String[] args) {
        String init1 = "tenet";
        String init2 = "sator";

        String result1 = "", result2 = "";

        String[] z = init1.split("");
        for (int i = 0; i < z.length / 2; i++) {
            String temp = z[i];
            z[i] = z[z.length - 1 - i];
            z[z.length - 1 - i] = temp;
        }
        for (int i = 0; i < z.length; i++) {
            result1 += z[i];
        }
        printResult(init1, result1);


        String[] a = init2.split("");
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            result2 += a[i];
        }
        printResult(init2, result2);

    }

    public static void printResult(String str, String fin) {
        if (str.equalsIgnoreCase(fin)) {
            System.out.println("Yep, word " + "\"" + str + "\"" + " is a palindrome");
        } else {
            System.out.println("Nope, word " + "\"" + str + "\"" + " isn't a palindrome");
        }
    }
}
