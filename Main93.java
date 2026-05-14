abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    void area() {
        double r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {

    void area() {
        int l = 10, b = 5;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class Main93 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}