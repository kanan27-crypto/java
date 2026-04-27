interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Scooty implements Vehicle {
    public void start() {
        System.out.println("Scooty starts with kick");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Car c = new Car();
        Scooty s = new Scooty();

        c.start();
        s.start();
    }
}