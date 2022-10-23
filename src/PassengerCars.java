public class PassengerCars extends Transport implements Competing{
    public PassengerCars(String lada, String grande, double v) {

    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "PassengerCars{}";
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
