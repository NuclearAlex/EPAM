package wheel;

public class Wheel {
    private int wheel;

    public Wheel(int wheel) {
        if (wheel < 4 && wheel > 0) {
            System.out.println("Probably this is motorbike or moped, and less probably that is unicycle");
            this.wheel = wheel;
        }
        if (wheel == 4) {
            System.out.println("More probably this is usual passenger car");
            this.wheel = wheel;
        }
        if (wheel > 4 && wheel < 13) {
            System.out.println("More probably this is truck");
            this.wheel = wheel;
        }
    }
    public int getWheel() {
        return wheel;
    }
}
