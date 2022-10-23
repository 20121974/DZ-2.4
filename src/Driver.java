public class Driver<P extends Transport> extends Transport  {
    public String fIo;
    public boolean thePresenceOfDriverLicense;//наличие водительских прав
    public int experience;//стаж

    public Driver(String brand, String model, double engineVolume, String fIo, boolean thePresenceOfDriverLicense, int experience) {
        super(brand, model, engineVolume);
        this.fIo = fIo;
        this.thePresenceOfDriverLicense = thePresenceOfDriverLicense;
        this.experience = experience;
    }

    @Override
    public void startMoving() {
        System.out.println("Заводи и начинай движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Остановись и выключи двигатель");
    }

    @Override
    public void refill() {
        System.out.println("Заправь автомобиль бензином");
    }

    public void setExperience(int experience) {
        if (experience > 0)
        this.experience = experience;
    }

    public String getfIo() {
        if (fIo != null && !fIo.isBlank() && !fIo.isEmpty())
        return fIo;
        return null;
    }

    public boolean isThePresenceOfDriverLicense() {
        return thePresenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }
}
