
/**  5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.  */

public class Task5 {
    public static void main(String[] args) {
        int introTime = 12345;
        int hours = (int)Math.floor(introTime / (60 * 60));
        int minutes = (int)Math.floor((introTime / 60) % 60);
        int seconds = introTime - (hours * 60 * 60) - (minutes * 60);
        System.out.printf("%dч %dмин %dс", hours, minutes, seconds);
    }
}
