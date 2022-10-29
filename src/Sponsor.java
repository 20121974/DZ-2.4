import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Sponsor {
//    private String name;
//    private String companyName;
//    private Integer amountOfSupport;//сумма поддержки

    private Set<String> listOfSponsors = new HashSet<>();
    private static Object sponsor;

    public Sponsor(Set<String> listOfSponsors) {
        this.listOfSponsors = listOfSponsors;
    }
    public void addListOfSponsors(){
    listOfSponsors.add((String) Sponsor.sponsor);
    System.out.println((String) Sponsor.sponsor);
    }

    public Set<String> getListOfSponsors() {
        return listOfSponsors;
    }
}
