package study.train;

import java.util.Comparator;

public class ComparatorForNumbers implements Comparator<Train> {
    @Override
    public int compare(Train t1, Train t2) {
        return Integer.compare(t1.getNumberOfTrain(), t2.getNumberOfTrain());
    }
}
