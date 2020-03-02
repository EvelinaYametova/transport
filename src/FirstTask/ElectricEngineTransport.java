package FirstTask;

public abstract class ElectricEngineTransport extends Transport {
    double ElectricityCount;
    ElectricEngineTransport(double vel, int cap, double elc) {
        super(vel, cap);
        ElectricityCount = elc;
    }
}
