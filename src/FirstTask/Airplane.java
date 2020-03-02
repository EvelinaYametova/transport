package FirstTask;

public class Airplane extends Transport implements Movement {
    String TransportType;
    Wing LeftWing = new Wing("White", "Left");
    Wing RightWing = new Wing ("White", "Right");
    Airplane(double vel, int cap) {
        super(vel, cap);
        String fullClass = this.getClass().getName();
        TransportType = fullClass.substring(fullClass.indexOf(".") + 1);
    }
    public void move() {
        System.out.println("");
    }
    public String getTransportType() {
        return TransportType;
    }
    private class Wing {
        private String color, model;
        private Wing(String col, String mod) {
            color = col;
            model = mod;
        }
    }
}