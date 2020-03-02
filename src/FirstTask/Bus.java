package FirstTask;

public class Bus extends CombustionEngineTransport implements Movement {
    String TransportType;
    Window[] Windows = new Window[2];
    Bus(double vel, int cap, double eV, double eP) {
        super(vel, cap, eV, eP);
        String fullClass = this.getClass().getName();
        TransportType = fullClass.substring(fullClass.indexOf(".") + 1);
        Windows[0] = new Window(10, 10);
        Windows[1] = new Window(10, 10);
    }
    public void move() {
        System.out.println("");
    }
    public String getTransportType() {
        return TransportType;
    }
    private class Window {
        private double width, height;
        private Window(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }
}
