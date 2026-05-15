class Box {

    int length, breadth, height;

    // Default Constructor
    Box() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    // Parameterized Constructor
    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void volume() {
        int vol = length * breadth * height;
        System.out.println("Volume = " + vol);
    }
}

public class Main56 {

    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(2, 3, 4);

        b1.volume();
        b2.volume();
    }
}