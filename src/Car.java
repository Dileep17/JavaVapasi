import java.util.Map;

public class Car {

    private static final String MODEL = "Ford Fusion Energi";
    private static int numberOfCarsMade;
    private String color;
    private Engine engine = new Engine();

    public Car(){
        numberOfCarsMade = numberOfCarsMade + 1;
    }

    public Car(String color){
        this.color = color;
        numberOfCarsMade = numberOfCarsMade + 1;
    }

    public Car(Car car){
        this.color = car.color;
        numberOfCarsMade = numberOfCarsMade + 1;
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

    public void printModelAndNumberOfCarsMade(){
        System.out.println("model = " + MODEL);  // from  a non static method can access static property
        System.out.println("number Of Cars Made = " + getNumberOfCarsMade());  // from a non static method can access static method
    }

//    ERROR: Non-static field 'engine' cannot be referenced from a static context
//    public static void printStatusOfEngine(){
//        engine.printStatusOfEngine();
//    }

    public static String getCarModel(){
        return MODEL;
    }

// Cannot assign a value to final variable 'MODEL'
//    public void changeModel(String newModel){
//        MODEL = newModel;
//    }

    public static int getNumberOfCarsMade(){
        return numberOfCarsMade;
    }
}
