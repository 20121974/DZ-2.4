public class Buses extends Transport implements Competing {
    public Buses(String lada, String grande, double i) {
        super();
    }

    @Override
    public String toString() {
        return "Buses{}";
    }

    @Override
    public void refill() {
        System.out.println("Заправь автобус дизелем на заправке");
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

    public enum TypeOfCapacity {
        especiallySmall("до 10 мест"), small("до 25 мест"), average("40-50 мест"),
        big("60-80 мест"), especiallyBig("100-120 мест");
        private int numberOfSeats;
        private String capacity;

        TypeOfCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }
    }
}
