abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Scooty extends Vehicle {

    @Override
    void start() {
        System.out.println("Scooty starts with a self-start button");
    }
}

public class Main7 {

    public static void main(String[] args) {

        Vehicle c = new Car();
        Vehicle s = new Scooty();

        c.start();
        c.fuel();

        System.out.println();

        s.start();
        s.fuel();
    }
}