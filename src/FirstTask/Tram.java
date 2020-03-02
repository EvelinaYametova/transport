package FirstTask;

public class Tram extends ElectricEngineTransport implements Movement {
    String TransportType;
    int WagonCount;
    Wagon[] Wagons;
    Tram(double vel, int cap, double elc, int wc) {
        super(vel, cap, elc);
        String fullClass = this.getClass().getName();
        TransportType = fullClass.substring(fullClass.indexOf(".") + 1);
        WagonCount = wc;
        Wagons = new Wagon[WagonCount];
        for (int i = 0; i < WagonCount; i++) {
            Wagons[i] = new Wagon("Trailer", "Red");
        }
    }
    public void move() {
        System.out.println("");
    }
    public String getTransportType() {
        return TransportType;
    }

    private class Wagon {
        private String construction, color;
        private Wagon(String construction, String color) {
            this.construction = construction;
            this.color = color;
        }
    }
}