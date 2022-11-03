import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Transport> transports = new HashSet<>();
        PassengerCar kia = new PassengerCar("Kia", "Sport cars 4 поколение", 7.4);
        kia.addDriver("Egor", true, 5, "B", kia);
        kia.addSponsor("Газпром");
        kia.addMechanic("Ivan");

        Truck bmv = new Truck("BMW", "Z8", 7.0);
        bmv.addDriver("Oleg", true, 5, "B", bmv);
        bmv.addSponsor("URAL");
        bmv.addMechanic("Bob");

        Bus audi = new Bus("Audi", "A8 50 L TDI quatrain", 6.1);
        audi.addDriver("Oleg", true, 5, "B", audi);
        audi.addSponsor("VTB");
        audi.addMechanic("Tip");

    }

}