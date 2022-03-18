
/**  4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа. */

public class Task4 {
    public static void main(String[] args) {

        // Version 1
        double x = 123.456;
        char[] charResult = (x + "").toCharArray();
        String temp = "";
        for (int i = 0; i < charResult.length; i++) {
            while (charResult[i] != '.'){
                temp += "" + charResult[i];
                i++;
            }
            if (charResult[i] == '.') {
                break;
            }
        }
        String stringIntro = "" + x;
        String stringRemainder = stringIntro.substring(temp.length() + 1);
        String stringResult = stringRemainder + "." + temp;
        double result1 = Double.parseDouble(stringResult);
        System.out.println(result1);


        // Version 2
        double y = 3.4565555;
        String[] array = String.valueOf(y).split("\\.");
        double result2 = Double.parseDouble(array[1] + "." + array[0]);
        System.out.println(result2);
    }
}
