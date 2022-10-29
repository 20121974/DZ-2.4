import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bus extends Transport implements Competing {
    private Set<String> listBus = new HashSet<>();
    private static Object bus;

    public Bus(Set<String> listBus) {
        this.listBus = listBus;
    }
    public void addListBus(){
        listBus.add((String) Bus.bus);
        System.out.println((String) Bus.bus);
    }

    public Set<String> getListBus() {
        return listBus;
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
}
