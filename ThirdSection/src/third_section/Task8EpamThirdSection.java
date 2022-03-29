
/**  You need delete all spaces and repeats symbols  */

package third_section;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task8EpamThirdSection {
    public static void main(String[] args) {
        String init1 = "abc cde def";

        String s = Arrays.stream(init1.replaceAll(" ", "")
                .split("")).distinct().collect(Collectors.joining());
        System.out.println(s);
    }
}
