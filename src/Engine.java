
public class Engine {

    boolean status = false;

    public void start(){
        if(status){
            System.out.println("Cant start engine that's already started!");
            return;
        }
        this.status = true;
        System.out.println("Engine stared");
    }

    public void stop(){
        if(!status){
            System.out.println("Cant stop engine that's already stopped!");
            return;
        }
        this.status = false;
        System.out.println("Engine stopped");
    }

    public void printStatusOfEngine(){
        if(status)
            System.out.println("Engine is ON");
        else
            System.out.println("Engine is OFF");
    }

}
