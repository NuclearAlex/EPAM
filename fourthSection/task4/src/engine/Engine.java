package engine;

public class Engine {
    private final boolean engine;

    public Engine(boolean engine) {
        if (!engine) {
            System.out.println("Probably this transport off or broken because its engine off");
        } else {
            System.out.println("Probably this transport work and going because its engine on");
        }
        this.engine = engine;
    }
    public boolean isEngine() {
        return engine;
    }
}
