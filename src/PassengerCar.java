import java.util.HashSet;
import java.util.Set;

public class PassengerCar extends Transport implements Competing {
    private Set<String> listPassengerCar = new HashSet<>();

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Set<String> getListPassengerCar() {
        return listPassengerCar;
    }

    @Override
    public void refill() {
        System.out.println("Заправь машину бензином на заправке");
    }
    @Override
    public String toString() {
        return "PassengerCars{}";
    }


    public void addDriver(String egor, boolean b, int i, String b1, PassengerCar kia) {
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
