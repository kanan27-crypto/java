class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    void fuel() {
        System.out.println("Transport is fueling");
    }
}

// Subclass Bus
class Bus extends Transport {
    @Override
    void move() {
        System.out.println("Bus is moving");
    }

    @Override
    void fuel() {
        System.out.println("Bus is fueling");
    }
}

// Subclass Train
class Train extends Transport {
    @Override
    void move() {
        System.out.println("Train is moving");
    }

    @Override
    void fuel() {
        System.out.println("Train is fueling");
    }
}

// Subclass Airplane
class Airplane extends Transport {
    @Override
    void move() {
        System.out.println("Airplane flies in air");
    }

    @Override
    void fuel() {
        System.out.println("Airplane is fueling");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t;

        t = new Bus();
        t.move();
        t.fuel();

        t = new Train();
        t.move();
        t.fuel();

        t = new Airplane();
        t.move();
        t.fuel();
    }
}