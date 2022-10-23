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
    public enum TypeOfCapacity {especiallySmall("до 10 мест"), small("до 25 мест"), average("40-50 мест"),
        big("60-80 мест"), especiallyBig("100-120 мест");

        TypeOfCapacity(String B) {
        }
    }
}
