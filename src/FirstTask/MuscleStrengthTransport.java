package FirstTask;

public abstract class MuscleStrengthTransport extends Transport {
    double Force;
    abstract boolean isTransportForStrong();
    MuscleStrengthTransport(double velocity, int capacity, double force) {
        super(velocity, capacity);
        Force = force;
    }
}
