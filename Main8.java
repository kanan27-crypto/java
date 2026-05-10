abstract class Animal {

    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animals eat food");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main8 {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a1.eat();

        System.out.println();

        a2.sound();
        a2.eat();
    }
}
