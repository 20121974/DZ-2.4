import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Mechanic <T extends  Transport> {
    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public static void performMaintenance() {//провести техобслуживание
        System.out.println("Проведи техобслуживание перед заездом");
    }
    public static void fixTheCar() {//починить машину
        System.out.println("Почини машину перед заездом");
    }

    public static Object getMechanic() {
        return getMechanic();
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
