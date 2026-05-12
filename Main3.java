// Compile with: javac --source 26 Main3.java
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part Time Employee Salary: " + salary);
    }
}

public class Main3 {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee("Rahul", 101, 50000);

        PartTimeEmployee p1 = new PartTimeEmployee("Aman", 102, 5, 500);

        System.out.println("----- Full Time Employee -----");
        f1.displayDetails();
        f1.calculateSalary();

        System.out.println("\n----- Part Time Employee -----");
        p1.displayDetails();
        p1.calculateSalary();
    }
}