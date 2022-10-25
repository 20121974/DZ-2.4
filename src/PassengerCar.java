import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends Transport implements Competing {
    public PassengerCar(String lada, String grande, double v) {
        super();
        List <String> listOfPassengerCars = new ArrayList<>(50);

    }
    @Override
    public void refill() {
        System.out.println("Заправь машину бензином на заправке");
    }
    @Override
    public String toString() {
        return "PassengerCars{}";
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

    public enum BodyType {
        Sedan("Седан"), Hatchback("Хетчбек"), Coupe("Купе"), StationWagon("Универсал"), SUV("Внедорожник"), Crossover("Кроссовер"), PickupTruck("Пикап"), Van("Фургон"),
        Minivan("Минивэн");
        private String body;

        BodyType(String body) {
            this.body = body;
        }
        public String getBody() {
            return body;
        }
        public void setBody(String body) {
            this.body = body;
        }

        public BodyType determineTheTypeOfCar(String body) {
            for (BodyType bodyType:values()){
                if (bodyType.getBody().equals(body)) {
                    return bodyType;
                }
            }
            System.out.println("Данных недостаточно");
            return null;
        }
    }

}
