/*Create a class named 'Member' having the following
members: Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 – Salary
It also has a method named 'printSalary' which prints the salary of the members. 
Two classes 'Employee' and'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager
by making an object of both of these classes and print the same. */

public class p18 {

    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setPhoneNumber("123-456-7890");
        employee.setAddress("123 Main St");
        employee.setSalary(50000);
        employee.setSpecialization("Software Engineering");
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Address: " + employee.getAddress());
        employee.printSalary();
        System.out.println("Specialization: " + employee.getSpecialization());

        // Create an object of the Manager class
        Manager manager = new Manager();
        manager.setName("Jane Doe");
        manager.setAge(35);
        manager.setPhoneNumber("987-654-3210");
        manager.setAddress("456 Elm St");
        manager.setSalary(70000);
        manager.setDepartment("IT");
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Phone Number: " + manager.getPhoneNumber());
        System.out.println("Address: " + manager.getAddress());
        manager.printSalary();
        System.out.println("Department: " + manager.getDepartment());
    }
}

class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + getSalary());
    }
}

class Employee extends Member {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Manager extends Member {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
