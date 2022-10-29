import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Truck extends Transport implements Competing {
    private Set<String> listTruck = new HashSet<>();
    private static Object truck;

    public Truck(Set<String> listTruck) {
        this.listTruck = listTruck;
    }
    public void addListTruck(){
        listTruck.add((String) Truck.truck);
        System.out.println((String) Truck.truck);
    }

    public Set<String> getListTruck() {
        return listTruck;
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

//    public Truck(String lada, String grande, double v) {
//        super();
//        List<String> listOfTrucks = new ArrayList<>(50);
//    }

//    @Override
//    public String toString() {
//        return "Trucks{}";
//    }

//    @Override
//    public void refill() {
//        System.out.println("Заправь машину дизелем на заправке");
//    }

//    @Override
//    public String[] pitStop() {
//        return new String[0];
//    }
//
//    @Override
//    public double bestLapTime() {
//        return 0;
//    }

//    @Override
//    public int maximumSpeed() {
//        return 0;
//    }
//
//    public enum TypeOfLoadCapacity {
//        N1("с полной массой до 3,5 тонн"), N2("с полной массой свыше 3,5 до 12 тонн"),
//        N3("с полной массой свыше 12 тонн");
//        private double grossWeight;
//        private String load;
//
//        TypeOfLoadCapacity(String load) {
//            this.load = load;
//        }
//
//        public String getLoad() {
//            return load;
//        }
//
//        public void setLoad(String load) {
//            this.load = load;
//        }
//    }
}
