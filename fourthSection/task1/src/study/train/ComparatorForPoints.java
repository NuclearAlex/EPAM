package study.train;

import java.util.Comparator;

public class ComparatorForPoints implements Comparator<Train> {

    @Override
    public int compare(Train t1, Train t2) {
        if (t1.getNamePoint().equalsIgnoreCase(t2.getNamePoint())) {
            return t1.getTimeOfDeparture().compareTo(t2.getTimeOfDeparture());
        }
        int x = 0;
        for (int i = 0; i < t1.getNamePoint().length() - 1; i++) {
            x = Character.compare(t1.getNamePoint().charAt(i), t2.getNamePoint().charAt(i));
            if (x == 0) {
                x += Character.compare(t1.getNamePoint().charAt(i+1), t2.getNamePoint().charAt(i+1));
            } else {
                break;
            }
        }
        return x;
    }
}
