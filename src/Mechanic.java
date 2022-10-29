import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Mechanic {
//    private String name;
//    private String surname;
//    private String company;
    private Set<String> listMechanic = new HashSet<>();
    private static Object mechanic;

    public Mechanic(Set<String> listMechanic) {
        this.listMechanic = listMechanic;
    }
    public void addListMechanic(){
        listMechanic.add((String) Mechanic.mechanic);
        System.out.println((String) Mechanic.mechanic);
    }

    public Set<String> getListMechanic() {
        return listMechanic;
    }
//    public Mechanic(String name, String surname, String company) {
//        this.name = name;
//        this.surname = surname;
//        this.company = company;
//        LinkedList<PassengerCar> listOfMechanic = new LinkedList<PassengerCar>();
//        LinkedList<Truck> listOfMechanic1 = new LinkedList<Truck>();
//        LinkedList<Bus> listOfMechanic2 = new LinkedList<Bus>();
//    }
//
//    public static void performMaintenance() {//провести техобслуживание
//        System.out.println("Проведи техобслуживание перед заездом");
//    }
//
//    public static void fixTheCar() {//починить машину
//        System.out.println("Почини машину перед заездом");
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getCompany() {
//        return company;
//    }
}
