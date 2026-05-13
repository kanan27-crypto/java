// Java Program using Abstract Class, Method Overriding,
// Array of Objects and Polymorphism

abstract class Employee {

    protected String name;
    protected int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Concrete Method
    void displayDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {

    private double basicSalary;
    private double hra;
    private double da;

    FullTimeEmployee(String name, int id,
            double basicSalary,
            double hra,
            double da) {

        super(name, id);

        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra + da;
    }

    void showSalarySlip() {
        displayDetails();

        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);

        System.out.println("Total Salary : " + calculateSalary());
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double ratePerHour;

    PartTimeEmployee(String name, int id,
            int hoursWorked,
            double ratePerHour) {

        super(name, id);

        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    void showPartTimeDetails() {

        displayDetails();

        System.out.println("Hours Worked : " + hoursWorked);
        System.out.println("Rate Per Hour : " + ratePerHour);

        System.out.println("Total Salary : " + calculateSalary());
    }
}

// Contract Employee
class ContractEmployee extends Employee {

    private int projectsCompleted;
    private double paymentPerProject;

    ContractEmployee(String name, int id,
            int projectsCompleted,
            double paymentPerProject) {

        super(name, id);

        this.projectsCompleted = projectsCompleted;
        this.paymentPerProject = paymentPerProject;
    }

    @Override
    double calculateSalary() {
        return projectsCompleted * paymentPerProject;
    }

    void showContractDetails() {

        displayDetails();

        System.out.println("Projects Completed : "
                + projectsCompleted);

        System.out.println("Payment Per Project : "
                + paymentPerProject);

        System.out.println("Total Salary : "
                + calculateSalary());
    }
}

// Main Class
public class Company {

    public static void main(String[] args) {

        // Polymorphism using Abstract Class Reference
        Employee emp1 = new FullTimeEmployee(
                "Rahul",
                101,
                40000,
                5000,
                3000);

        Employee emp2 = new PartTimeEmployee(
                "Aman",
                102,
                5,
                600);

        Employee emp3 = new ContractEmployee(
                "Karan",
                103,
                4,
                15000);

        // Array of Employees
        Employee employees[] = { emp1, emp2, emp3 };

        System.out.println("======= EMPLOYEE DETAILS =======");

        for (Employee emp : employees) {

            emp.displayDetails();

            System.out.println("Calculated Salary : "
                    + emp.calculateSalary());

            System.out.println("--------------------------------");
        }

        // Downcasting Example
        System.out.println("\n======= FULL TIME SALARY SLIP =======");

        FullTimeEmployee ft = (FullTimeEmployee) emp1;

        ft.showSalarySlip();

        System.out.println("\n======= PART TIME DETAILS =======");

        PartTimeEmployee pt = (PartTimeEmployee) emp2;

        pt.showPartTimeDetails();

        System.out.println("\n======= CONTRACT EMPLOYEE DETAILS =======");

        ContractEmployee ct = (ContractEmployee) emp3;

        ct.showContractDetails();
    }
}
