
abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

// Full Time Employee Class
class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double bonus;

    FullTimeEmployee(String name, int id, double monthlySalary, double bonus) {
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + bonus;
    }

    void displayFullTimeDetails() {
        displayDetails();
        System.out.println("Monthly Salary : " + monthlySalary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {

    private int workingHours;
    private double hourlyRate;

    PartTimeEmployee(String name, int id, int workingHours, double hourlyRate) {
        super(name, id);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }

    void displayPartTimeDetails() {
        displayDetails();
        System.out.println("Working Hours : " + workingHours);
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class InternEmployee extends Employee {

    private double stipend;

    InternEmployee(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }

    void displayInternDetails() {
        displayDetails();
        System.out.println("Stipend : " + stipend);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee("Rohit", 101, 50000, 10000);

        PartTimeEmployee emp2 = new PartTimeEmployee("Nitika", 102, 6, 500);

        InternEmployee emp3 = new InternEmployee("Kanan", 103, 8000);

        System.out.println("========== FULL TIME EMPLOYEE ==========");
        emp1.displayFullTimeDetails();

        System.out.println("\n========== PART TIME EMPLOYEE ==========");
        emp2.displayPartTimeDetails();

        System.out.println("\n========== INTERN EMPLOYEE ==========");
        emp3.displayInternDetails();
        System.out.println("Total Salary : " + emp3.calculateSalary());
    }
}