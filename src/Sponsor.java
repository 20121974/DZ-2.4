import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Sponsor {
    private final String name;
    private Integer amount;//сумма поддержки

    public Sponsor(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public static Object getSponsor() {
        return getSponsor();
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд на %d%n", name, amount);
    }
    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }
}







