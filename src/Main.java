public class Main {
    public static void main(String[] args, Object egor) {
        Driver<PassengerCars> egor1 = new Driver<>("Лада");
        PassengerCars lada = new PassengerCars("Lada", "Grande", 1.7);
        System.out.println("водитель" + egor1 + "управляет автомобилем" + lada + "и будет участвовать в заезде");
        Driver<Driver.CategoryBDriver> ivan = new Driver<>("lada1");

//        Driver <PassengerCars> egor = new Driver<>("Lada", "Grande", 1.7, "Egor",
//                true, 5);
//        egor.toString();
//        Transport audi = new PassengerCars("Audi", "A8 50 L TDI quattro",  3.0);
//        Driver <PassengerCars> ivan = new Driver<>("Audi", "A8 50 L TDI quattro",  3.0, "Ivan",
//                true, 4);
//        Transport bmv = new PassengerCars("BMW", "Z8", 3.0);
//        Driver <PassengerCars> maxim = new Driver<>("Audi", "A8 50 L TDI quattro",  3.0, "Ivan",
//                true, 4);
//        Transport kia = new PassengerCars("Kia", "Sportage 4 поколение", 2.4);
//
//        Transport lada1 = new Trucks("Lada", "Grande", 7.7);
//        Transport audi1 = new Trucks("Audi", "A8 50 L TDI quattro",  7.0);
//        Transport bmv1 = new Trucks("BMW", "Z8", 7.0);
//        Transport kia1 = new Trucks("Kia", "Sportage 4 поколение", 7.4);
//
//        Buses lada2 = new Buses ("Lada", "Grande", 5.4);
//        lada.refill();
//        Buses audi2 = new Buses("Audi", "A8 50 L TDI quattro", 6.1);
//        lada.refill();
//        Buses bmv2 = new Buses("BMW", "Z8", 220);
//        Buses kia2 = new Buses("Kia", "Sportage 4 поколение", 6.4);


    }
}