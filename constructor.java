class Demo {

    int a;
    String name;

    Demo() {
        a = 0;
        name = null;
    }

    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Name: " + name);
    }
}

public class constructor {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();
    }
}