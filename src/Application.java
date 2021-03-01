import java.util.*;

public class Application {

    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();

        Car blueCar = new Car("Blue");
        cars.put("Blue", blueCar);

        Car redCar = new Car("Red");
        cars.put("Red", blueCar);

        Car GreenCar = new Car("Green");
        cars.put("Green", blueCar);


        System.out.println("Keys in HashMap: ");
        for (String key : cars.keySet()){
            System.out.println(key);
        }

        System.out.println("Enter one of the keys to view the details of car");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        if(cars.containsKey(key)){
            Car car = cars.get(key);
            System.out.println("color = " + car.getColor());
            car.getEngine().printStatusOfEngine();
        } else {
            System.out.println("Key doesn't exist! Remember key is case sensitive.");
        }


    }

}
