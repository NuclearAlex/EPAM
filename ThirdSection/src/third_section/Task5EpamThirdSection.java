
/** You need to find more spaces which go in a row  */

package third_section;

public class Task5EpamThirdSection {
    public static void main(String[] args) {
        String init = " This     text          have  some   excess spaces. Now we         fix  it   ";

        System.out.println("Initial string: ");
        System.out.println("\"" + init + "\"");

        int maxSpace = 0;
        int counter = 0;
        for (char c : init.toCharArray()) {
            if (c == ' ') {
                counter++;
                if (counter > maxSpace) {
                    maxSpace = counter;
                }
            } else {
                counter = 0;
            }
        }

        System.out.println("\nMaximum number of spaces which go in a row equal " + maxSpace);
    }
}
