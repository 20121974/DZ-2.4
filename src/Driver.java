public class Driver<A extends Transport & Competing>{
    public String fIo;
    public boolean thePresenceOfDriverLicense;//наличие водительских прав
    public int experience;//стаж

    public class CategoryADriver <A extends Transport & Competing>{
    }
    public class CategoryBDriver <A extends Transport & Competing> extends Transport implements Competing {
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
    public class CategoryCDriver <A extends Transport & Competing>{
    }
    public Driver(Object egor) {
        super();
        this.fIo = fIo;
        this.thePresenceOfDriverLicense = thePresenceOfDriverLicense;
        this.experience = experience;
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
