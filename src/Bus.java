import java.util.HashSet;
import java.util.Set;

public class Bus extends Transport implements Competing {
    private Set<String> listBus = new HashSet<>();

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Set<String> getListBus() {
        return listBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "listBus=" + listBus +
                '}';
    }
    @Override
    public void refill() {
        System.out.println("Заправь машину дизелем на заправке");
    }

    public void addDriver(String oleg, boolean b, int i, String b1, Bus audi) {

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
