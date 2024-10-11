/*Create a class called Employee that includes three pieces of information as instance variables—a first name (type
String), a last name (type String) and a monthly salary (double). Your class should have a constructor that
initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employee’s
capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10%
raise and display each Employee’s yearly salary again. */

// Employee.java
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a raise
    public void giveRaise(double percentage) {
        monthlySalary *= (1 + percentage / 100);
    }
}

// EmployeeTest.java
public class p13 {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000.0);
        Employee emp2 = new Employee("Jane", "Smith", 6000.0);

        // Display each object's yearly salary
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Yearly salary: $" + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.println("Yearly salary: $" + emp2.getYearlySalary());

        // Give each Employee a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display each object's yearly salary after the raise
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Yearly salary after 10% raise: $" + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.println("Yearly salary after 10% raise: $" + emp2.getYearlySalary());
    }
}
