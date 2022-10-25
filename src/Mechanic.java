import java.util.LinkedList;

public class Mechanic<F> {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        LinkedList<PassengerCar> listOfMechanic = new LinkedList<PassengerCar>();
        LinkedList<Truck> listOfMechanic1 = new LinkedList<Truck>();
        LinkedList<Bus> listOfMechanic2 = new LinkedList<Bus>();
    }

    public static void performMaintenance() {//провести техобслуживание
        System.out.println("Проведи техобслуживание перед заездом");
    }

    public static void fixTheCar() {//починить машину
        System.out.println("Почини машину перед заездом");
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}
