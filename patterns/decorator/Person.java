public class Person {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();

        System.out.println("\n== BASIC CAR ==");
        basicCar.design();

        System.out.println("\n\n== BASIC CAR + PASSENGER CAR ==");
        Car passengerCar = new PassengerCar(basicCar);
        passengerCar.design();

        System.out.println("\n\n== BASIC CAR + LUXURY CAR ==");
        Car luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.design();

        System.out.println("\n\n== BASIC CAR + PASSENGER CAR + LUXURY CAR ==");
        Car plCar = new LuxuryCar(passengerCar);
        plCar.design();

        System.out.println();

    }
}