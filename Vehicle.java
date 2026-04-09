class Vehicle {
    public void run() {
        System.out.println("Vehicle can run");
    }
}

class Car extends Vehicle {
    public void fuel() {
        System.out.println("Car uses fuel");
    }
}

class ElectricCar extends Car {
    public void battery() {
        System.out.println("Electric car uses a battery");
    }

    public static void main(String[] args) {

        ElectricCar e = new ElectricCar();

        e.run(); // from Vehicle
        e.fuel(); // from Car
        e.battery(); // from ElectricCar
    }
}
