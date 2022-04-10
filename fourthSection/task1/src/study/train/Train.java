package study.train;

import java.util.Date;

public class Train {
    private final String namePoint;
    private final int numberOfTrain;
    private final Date timeOfDeparture;

    public Train(String namePoint, int numberOfTrain, Date timeOfDeparture) {
        this.namePoint = namePoint;
        this.numberOfTrain = numberOfTrain;
        this.timeOfDeparture = timeOfDeparture;
    }
    public String getNamePoint() {
        return namePoint;
    }
    public int getNumberOfTrain() {
        return numberOfTrain;
    }
    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }
    @Override
    public String toString() {
        return String.format("%s; %d; %s", namePoint, numberOfTrain, timeOfDeparture);
    }
}
