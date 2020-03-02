package FirstTask;

public abstract class Transport {
    double Velocity;
    int Capacity;
    abstract String getTransportType();

    Transport(double velocity, int capacity) {
        this.Velocity = velocity;
        this.Capacity = capacity;
    }
}