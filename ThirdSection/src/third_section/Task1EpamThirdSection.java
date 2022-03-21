
/**  You have an array of names which includes from variables in camelCase. You need to convert these
 *    names to snake_case. */

package third_section;

public class Task1EpamThirdSection {
    public static void main(String[] args) {
        String[] camelCase = new String[]{"JavaItIsCool", "BecauseIChooseIt", "AndEverythingWillWorkOut"};
        String[] snake_case = new String[camelCase.length];

        for (int i = 0; i < camelCase.length; i++) {
            String temp = camelCase[i];
            String finalValue = "";
            for (String s : temp.split("")){
                if (s.toUpperCase().equals(s)) {
                    finalValue += "_" + s.toLowerCase();
                } else {
                    finalValue += s;
                }
            }
            snake_case[i] = finalValue;
        }
        System.out.println("Array in a camelCase: ");
        for (String s : camelCase) {
            System.out.printf("%s\t\t", s);
        }

        System.out.println("\n\nArray in a snake_case: ");
        for (String s : snake_case) {
            System.out.printf("%s\t\t", s);
        }
    }
}
        // solved by Boris