import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PassengerCar extends Transport implements Competing {
    private Set<String> listPassengerCar = new HashSet<>();
    private static Object passengerCar;

    public PassengerCar(Set<String> listPassengerCar) {
        this.listPassengerCar = listPassengerCar;
    }

//    public PassengerCar(String lada, String grande, double v) {
//        super();
//    }

    public void addListPassengerCar(){
        listPassengerCar.add((String) PassengerCar.passengerCar);
        System.out.println((String) PassengerCar.passengerCar);
    }

    public Set<String> getListPassengerCar() {
        return listPassengerCar;
    }
//    public PassengerCar(String lada, String grande, double v) {
//        super();
//        List <String> listOfPassengerCars = new ArrayList<>(50);
//
//    }
//    @Override
//    public void refill() {
//        System.out.println("Заправь машину бензином на заправке");
//    }
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
