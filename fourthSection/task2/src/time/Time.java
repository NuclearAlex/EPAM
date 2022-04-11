package time;

public class Time {
    int allSeconds;
    public Time(int seconds) {
        this.allSeconds = seconds;
    }
    public int getAllSeconds() {
        return allSeconds;
    }
    public enum ChangeTime {
        HOURS,
        MINUTES,
        SECONDS
    }
    public int changeTimeToDown(int time, ChangeTime variable) {
        int x = 0;
        if (variable == ChangeTime.HOURS) {
            if (time < 0 || time > 24) {
                x = allSeconds;
            } else {
                if (allSeconds / 3600 < time) {
                    x = allSeconds + (24 * 3600) - (time * 3600);
                } else {
                    x = allSeconds - (time * 3600);
                }
            }
        }
        if (variable == ChangeTime.MINUTES) {
            if (time < 0 || time > 60) {
                x = allSeconds;
            } else {
                x = allSeconds - (time * 60);
            }
        }
        if (variable == ChangeTime.SECONDS) {
            if (time < 0 || time > 60) {
                x = allSeconds;
            } else {
                x = allSeconds - time;
            }
        }
        return allSeconds = x;
    }
    public int changeTimeToUp(int time, ChangeTime variable) {
        int x = 0;
        if (variable == ChangeTime.HOURS) {
            if (time < 0 || time > 24) {
                x = allSeconds;
            } else {
                if ((time + (allSeconds / 3600)) > 24) {
                    x = allSeconds + (time * 3600) - (24 * 3600);
                } else {
                    x = allSeconds + (time * 3600);
                }
            }
        }
        if (variable == ChangeTime.MINUTES) {
            if (time < 0 || time > 60) {
                x = allSeconds;
            } else {
                x = allSeconds + (time * 60);
            }
        }
        if (variable == ChangeTime.SECONDS) {
            if (time < 0 || time > 60) {
                x = allSeconds;
            } else {
                x = allSeconds + time;
            }
        }
        return allSeconds = x;
    }
    public static int hours(int allSeconds) {
        return allSeconds / 3600;
    }
    public static int minutes(int allSeconds) {
        return (allSeconds - hours(allSeconds) * 3600) / 60;
    }
    public static int seconds(int allSeconds) {
        return allSeconds - (hours(allSeconds) * 3600) - (minutes(allSeconds) * 60);
    }
    @Override
    public String toString() {
        return String.format("%d;%d;%d", hours(allSeconds), minutes(allSeconds),seconds(allSeconds));
    }
}
