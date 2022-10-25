import java.util.LinkedList;

public class Sponsor<S> {
    private String name;
    private String companyName;
    private Integer amountOfSupport;//сумма поддержки

    public static void sponsorTheRace() {//спонсировать заезд
        System.out.println("Окажи спонсорскую помощь перед заездом");
    }

    public Sponsor(String name, Integer amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
        LinkedList<PassengerCar> listOfSponsors = new LinkedList<PassengerCar>();
        LinkedList<Truck> listOfSponsors1 = new LinkedList<Truck>();
        LinkedList<Bus> listOfSponsors2 = new LinkedList<Bus>();
    }
    public Sponsor(String companyName) {
        this.companyName = companyName;
        LinkedList<PassengerCar> listOfSponsors = new LinkedList<PassengerCar>();
        LinkedList<Truck> listOfSponsors1 = new LinkedList<Truck>();
        LinkedList<Bus> listOfSponsors2 = new LinkedList<Bus>();
    }

    public void setAmountOfSupport(Integer amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getAmountOfSupport() {
        return amountOfSupport;
    }
}
