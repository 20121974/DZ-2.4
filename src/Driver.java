import java.util.HashSet;
import java.util.Set;

public class Driver <T extends Transport & Competing> {
    private String name;
    private boolean thePresenceOfDriverLicense;//наличие водительских прав
    private int experience;//стаж
    private T transport;
    private Set<String> listDriver = new HashSet<>();
    private static Object driver;

    public Driver(Set<String> listDriver) {
        this.listDriver = listDriver;
    }
    public void addListDriver(){
        listDriver.add((String) Driver.driver);
        System.out.println((String) Driver.driver);
    }

    public Set<String> getListDriver() {
        return listDriver;
    }

    public Driver(String name, boolean thePresenceOfDriverLicense, int experience, String CategoryCDriver, T transport) {
        this.name = name;
        this.thePresenceOfDriverLicense = thePresenceOfDriverLicense;
        this.experience = experience;
        this.transport = transport;
    }

    public void setExperience(int experience) {
        if (experience > 0)
            this.experience = experience;
    }

    public T getTransport() {
        return transport;
    }

    public boolean isThePresenceOfDriverLicense() {
        return thePresenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            return name;
        }
        return null;
    }
}




