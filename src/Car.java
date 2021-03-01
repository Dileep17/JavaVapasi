public class Car {

    private String color;
    private Engine engine = new Engine();

    public Car(){}

    public Car(String color){
        this.color = color;
    }

    public Car(Car car){
        this.color = car.color;
    }

    public String getColor() {
        return color;
    }

    public void paint(String color){
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }
}
