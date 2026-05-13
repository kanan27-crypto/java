class Person {
    void showPerson() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a manager");
    }
}

public class Main89 {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}
