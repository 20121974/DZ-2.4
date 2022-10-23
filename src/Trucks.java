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
    public enum BodyType {N1 ("с полной массой до 3,5 тонн"), N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("с полной массой свыше 12 тонн");

        BodyType(String B) {
        }
    }
}
