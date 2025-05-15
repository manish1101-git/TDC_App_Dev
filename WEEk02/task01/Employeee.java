abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

  
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int employeeId, int hoursWorked, double hourlyRate) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class 
public class Employeee {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, 5000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 80, 20);

        fullTime.displayInfo();
        System.out.printf("Full-Time Salary:\n", fullTime.calculateSalary());

        partTime.displayInfo();
        System.out.printf("Part-Time Salary:\n", partTime.calculateSalary());
    }
}