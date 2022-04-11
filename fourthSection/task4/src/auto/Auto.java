package auto;

import engine.Engine;
import wheel.Wheel;

public class Auto {
    private final String model;
    private final Wheel wheel;
    private final Engine engine;

    public Auto(String model, Wheel wheel, Engine engine) {
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
    }
    public String visitGasStation() {
        if (!engine.isEngine()) {
            return "May be car need visit a gas station";
        } else {
            return "A car has full tank of fuel";
        }
    }
    public String moveCar() {
        if (engine.isEngine() && wheel.getWheel() >= 4 && wheel.getWheel() <= 13) {
            return "A car can moving normally";
        } else {
            return "A car must be stopped if it ran before";
        }
    }
    public String replaceWheel() {
        if (wheel.getWheel() >= 4 && wheel.getWheel() <= 13) {
            return "A car doesn't need to replace any wheel";
        } else {
            return "Probably you need to replace some wheel";
        }
    }

    @Override
    public String toString() {
        return String.format("The car has %s model", model);
    }
}
