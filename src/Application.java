import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car blueCar = new Car("Blue");
        cars.add(blueCar);

        Car redCar = new Car("Red");
        cars.add(redCar);

        Car GreenCar = new Car("Green");
        cars.add(GreenCar);

        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()){
            System.out.println(carIterator.next().getColor());
        }

        // or

        for (Car car : cars){
            System.out.println(car.getColor());
        }

    }

}
