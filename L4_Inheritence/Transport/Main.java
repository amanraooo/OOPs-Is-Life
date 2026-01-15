package L4_Inheritence.Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 4, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle m = new MotorCycle("Splendor", "XLV", 2 , "U", "soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }

}
