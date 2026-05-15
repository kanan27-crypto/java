class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main45 {
    public static void main(String[] args) {

        Employee e[] = new Employee[3];

        e[0] = new Employee(1, "Aman");
        e[1] = new Employee(2, "Kanan");
        e[2] = new Employee(3, "Riya");

        for (int i = 0; i < e.length; i++) {
            e[i].display();
        }
    }
}