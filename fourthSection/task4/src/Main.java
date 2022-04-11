import auto.Auto;
import engine.Engine;
import wheel.Wheel;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto("KIA", new Wheel(4), new Engine(true));

        System.out.println(auto.moveCar());

        System.out.println(auto.visitGasStation());

        System.out.println(auto.replaceWheel());

        System.out.println(auto);
    }
}
