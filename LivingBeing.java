class LivingBeing {
    public void breath() {
        System.out.println("all living beings can breath. ");
    }
}

class animal extends LivingBeing {
    public void eat() {
        System.out.println("animals eat food. ");
    }
}

class birds extends animal {
    public void fly() {
        System.out.println("birds can fly. ");
    }
}

class parrot extends birds {
    void speak() {
        System.out.println("parrot can speak. ");
    }
}

class parrotmain {
    public static void main(String[] args) {
        parrot p = new parrot();
        p.breath();
        p.eat();
        p.fly();
        p.speak();
    }
}
