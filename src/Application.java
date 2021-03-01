
public class Application {

    public static void main(String[] args) {
        Car blueCar = new Car("Blue");
        blueCar.printModelAndNumberOfCarsMade();

//        look at the implementation of this method for error
//        blueCar.printStatusOfEngine();

        System.out.println("-------------------------------");

        Car redCar = new Car("Red");
        redCar.printModelAndNumberOfCarsMade();

        System.out.println("-------------------------------");

        Car greenCar = new Car("Green");
        greenCar.printModelAndNumberOfCarsMade();
    }

}
