
public class Application {

    public static void main(String[] args) {
        Car blueCar = new Car("Blue");
        System.out.println(blueCar.getColor());
        blueCar.getEngine().start();
        blueCar.getEngine().printStatusOfEngine();

        System.out.println("-------------------------------");

        Car redCar = new Car("Red");
        System.out.println(redCar.getColor());
        redCar.getEngine().stop();
        redCar.getEngine().start();
        redCar.getEngine().printStatusOfEngine();
        redCar.getEngine().start();
        redCar.getEngine().stop();
        redCar.getEngine().stop();
        redCar.getEngine().printStatusOfEngine();
    }

}
