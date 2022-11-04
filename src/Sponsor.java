import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name) && Objects.equals(amount, sponsor.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
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







