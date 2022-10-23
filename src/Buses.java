public class Buses extends Transport implements Competing {
    public Buses(String lada, String grande, double i) {

    }

    @Override
    public String toString() {
        return "Buses{}";
    }

    @Override
    public void refill() {

    }

    @Override
    public String[] pitStop() {
        return new String[0];
    }

    @Override
    public double bestLapTime() {
        return 0;
    }

    @Override
    public int maximumSpeed() {
        return 0;
    }
}
