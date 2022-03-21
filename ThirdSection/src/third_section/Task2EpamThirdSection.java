
/** You need to swap all consistency 'word' for 'letter'    */

package third_section;

public class Task2EpamThirdSection {
    public static void main(String[] args) {
        String init = "We often write some word incorrectly. It's show our illiteracy. Literate people must " +
                "write any word without mistakes.";
        String[] temp = init.split(" ");
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equalsIgnoreCase("word")) {
                temp[i] = "letter";
            }
            result += temp[i] + " ";
        }
        System.out.println("Init string: \n" + init);
        System.out.println("\nResult string after swaps: \n" + result);
    }
}
