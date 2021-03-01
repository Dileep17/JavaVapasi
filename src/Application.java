
public class Application {

    public static void main(String[] args) {
        Car blueCar = new Car("Blue");
        System.out.println(blueCar.getColor());

        System.out.println("-----------------------");

        Car oneMoreBlueCar = new Car(blueCar);
        System.out.println(oneMoreBlueCar.getColor());
        oneMoreBlueCar.paint("Red");
        System.out.println(oneMoreBlueCar.getColor());

        System.out.println("-----------------------");

        Car yetToBePaintedCar = new Car();
        System.out.println(yetToBePaintedCar.getColor());
    }

}
