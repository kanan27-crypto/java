class Student {
    int a;
    String name;

    Student(int a, String name) {
        this.a = a;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + a);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(110, "Kanan");
        s1.display();
    }
}