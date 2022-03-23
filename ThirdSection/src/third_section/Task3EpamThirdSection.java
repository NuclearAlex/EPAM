
/**  You need to find all numbers from string  */

package third_section;

public class Task3EpamThirdSection {
    public static void main(String[] args) throws NumberFormatException {
        String init = "Everyday we write 100 and more word incorrectly. It's show our illiteracy. Literate people " +
                "must write this 100 or more word without mistakes.";
        int counter;
        String[] dummy = init.split(" ");

        counter = getDigit(dummy);
        System.out.print("The quantity of numbers from this string: ");
        System.out.println(counter);
    }

    public static int getDigit(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            try {
                Integer.parseInt(s[i]);
                counter++;
            } catch (NumberFormatException e) {
            }
        }
        return counter;
    }
}
