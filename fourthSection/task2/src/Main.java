import time.Time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(10950);
        System.out.println(time);
        time.changeTimeToDown(55, Time.ChangeTime.SECONDS);
        System.out.println(time);
        time.changeTimeToUp(4, Time.ChangeTime.SECONDS);
        System.out.println(time);
        time.changeTimeToDown(20, Time.ChangeTime.MINUTES);
        System.out.println(time);
        time.changeTimeToUp(6, Time.ChangeTime.MINUTES);
        System.out.println(time);
        time.changeTimeToDown(3, Time.ChangeTime.HOURS);
        System.out.println(time);
        time.changeTimeToUp(23, Time.ChangeTime.HOURS);
        System.out.println(time);
    }
}
