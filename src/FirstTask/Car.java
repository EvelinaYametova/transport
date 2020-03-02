package FirstTask;

public class Car extends  CombustionEngineTransport implements Movement {
    ControlType Control;
    String TransportType;
    String Brand;
    Car(double vel, int cap, double eV, double eP) {
        super(vel, cap, eV, eP);
        String fullClass = this.getClass().getName();
        TransportType = fullClass.substring(fullClass.indexOf(".") + 1);
        Brand = "Audi";
        Control = ControlType.FORWARD;
    }
    public void move() {
        System.out.println("");
    }
    public String getTransportType() {
        return TransportType;
    }
    public boolean isEliteCar() {
        if (this.Brand.equalsIgnoreCase("Lada"))
            return false;
        return true;
    }
}