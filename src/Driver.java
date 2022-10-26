public class Driver<C> {
    public String fIo;
    public boolean thePresenceOfDriverLicense;//наличие водительских прав
    public int experience;//стаж

    public Driver(String fIo, boolean thePresenceOfDriverLicense, int experience, String CategoryCDriver) {
        this.fIo = fIo;
        this.thePresenceOfDriverLicense = thePresenceOfDriverLicense;
        this.experience = experience;
    Driver<C> = new Driver<CategoryADriver>();
    Driver<C> = new Driver<CategoryBDriver>();
    Driver<C> = new Driver<>(CategoryCDriver);
    }

    public Driver() {

    }

    public void setExperience(int experience) {
        if (experience > 0)
        this.experience = experience;
    }

    public String getFIo() {
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

    @Override
    public String toString() {
        return "Driver{" +
                "fIo='" + fIo + '\'' +
                ", thePresenceOfDriverLicense=" + thePresenceOfDriverLicense +
                ", experience=" + experience +
                '}';
    }
}
