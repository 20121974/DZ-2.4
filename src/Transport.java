import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private final String brand;//марка автомобиля
    private final String model;//модель
    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model == null || brand.isBlank()){
            this.model = "default";
        }else{
            this.model = model;
        }
        this.engineVolume = engineVolume;
        setEngineVolume(engineVolume);
    }
    private void setEngineVolume(double engineVolume) {
        if (engineVolume < 0){
            this.engineVolume = 1.6;
        }else {
            this.engineVolume = engineVolume;
        }
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.add((Driver<?>) Driver.getDriver());
    }
    public void addMechanic(String mechanics) {
        this.mechanics.add((Mechanic<?>) Mechanic.getMechanic());
    }
    public void addSponsor(String sponsors) {
        this.sponsors.add((Sponsor) Sponsor.getSponsor());
    }
    private static void printInfo(Transport transport){
        System.out.println("Иформация по машинам заезда:" + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver: transport.drivers) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor: transport.sponsors) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики:");
        for (Mechanic<?> mechanic: transport.mechanics) {
            System.out.println(mechanic.getName());
        }

    }

    public void startMoving() {
        System.out.println("Заводи и начинай движение");
    }

    public void finishTheMovement() {
        System.out.println("Остановись и выключи двигатель");
    }

    public void refill() {
        System.out.println("Заправь автомобиль бензином");
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }public double getEngineVolume() {
        return engineVolume;
    }
}
