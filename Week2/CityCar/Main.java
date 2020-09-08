/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Car coupe = new Car(80, 4);
        Car sportCar = new F1Car(180, 1);
        Car cityCar = new CityCar(60, 6);
        int coupeSpeed = coupe.getTopSpeed();
        int sportCarSpeed = sportCar.getTopSpeed();
        int cityCarSpeed = cityCar.getTopSpeed();
        coupe.printDescription();
        sportCar.printDescription();
        cityCar.printDescription();
        System.out.println("coupe gets up to " + coupeSpeed + " miles per hour" + " with seating capacity " + coupe.getSeatingCapacity());
        System.out.println("sportCar gets up to " + sportCarSpeed + " miles per hour"  + " with seating capacity " + sportCar.getSeatingCapacity());
        System.out.println("cityCar gets up to " + cityCarSpeed + " miles per hour" + " with seating capacity " + cityCar.getSeatingCapacity());
    }
}