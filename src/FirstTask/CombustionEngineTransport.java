package FirstTask;

public abstract class CombustionEngineTransport extends Transport {
    double EngineVolume;
    double EnginePower;
    CombustionEngineTransport(double vel, int cap, double eV, double eP) {
        super(vel, cap);
        EngineVolume = eV;
        EnginePower = eP;
    }
}