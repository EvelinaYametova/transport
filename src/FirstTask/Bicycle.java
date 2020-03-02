package FirstTask;

public class Bicycle extends MuscleStrengthTransport implements Movement {
    String TransportType;
    BicycleType BicycleType;
    Bicycle(double vel, int cap, double force, BicycleType type) {
        super(vel, cap, force);
        String fullClass = this.getClass().getName();
        TransportType = fullClass.substring(fullClass.indexOf(".") + 1);
        BicycleType = type;
    }
    public void move() {
        System.out.println("");
    }
    public String getTransportType() {
        return TransportType;
    }
    public boolean isTransportForStrong() {
        if (this.Force > 100)
            return true;
        return false;
    }
}