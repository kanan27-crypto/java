abstract class vehicle{
    int noOfWheels;
    abstract void start();

}
class car extends vehicle{
    int noOfWheels = 4;
    void start(){
        System.out.println("car starts with key");
    }
}
class scooty extends vehicle{
    int noOfWheels = 2;
    void start(){
        System.out.println("scooty starts with kick");
    }
}

public class Main5{
    public static void main(String[] args) {
        vehicle obj = new car();
        obj.start();
        vehicle obj1 = new scooty();    
        obj1.start();

    }
}