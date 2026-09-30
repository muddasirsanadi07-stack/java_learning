/**
 * Lesson: interfaces declare capabilities that implementing classes promise
 * to provide. One class can implement multiple interfaces.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        DemonstrationDevice device = new DemonstrationDevice();
        device.start();
        device.stop();
    }
}

interface Startable {
    void start();
}

interface Stoppable {
    void stop();
}

class DemonstrationDevice implements Startable, Stoppable {
    @Override
    public void start() {
        System.out.println("Device started.");
    }

    @Override
    public void stop() {
        System.out.println("Device stopped.");
    }
}
