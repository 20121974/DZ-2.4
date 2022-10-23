public class Trucks extends Transport implements Competing{
    public Trucks(String lada, String grande, double v) {

    }

    @Override
    public String toString() {
        return "Trucks{}";
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
