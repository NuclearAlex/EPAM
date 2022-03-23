
/**  You need delete all unnecessary spaces (which go one after another). Leave one space between words.   */

package third_section;

public class Task4EpamThirdSection {
    public static void main(String[] args) {
        String init = " This     text          have  some   excess spaces. Now we         fix  it   ";

        System.out.println("Initial string: ");
        System.out.println("\"" + init + "\"");

        String[] temp = init.split(" ");
        String dummy = "";
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            String[] y = temp[i].split(" ");
            for (int j = 0; j < y.length; j++) {
                if (y[j].length() == 0) {
                } else {
                    dummy += y[j] + " ";
                }
            }
        }
        result = dummy.substring(0, dummy.length() - 1);

        System.out.println("\nFinal string after our fix: ");
        System.out.println("\"" + result + "\"");
    }
}
