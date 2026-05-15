class College {
    static String collegeName = "ABC College";

    int id;
    String name;

    College(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + collegeName);
    }
}

public class Main77 {
    public static void main(String[] args) {

        College c1 = new College(1, "Kanan");
        College c2 = new College(2, "Rahul");

        c1.display();
        c2.display();
    }
}