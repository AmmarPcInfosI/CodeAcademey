import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employee> emps = new ArrayList<>();
        Employee admin = new Employee("Ammar", 55000);
        emps.add(admin);

        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.print("Enter R for registering a new Employee Salary or L for showing the list: ");
            String option = read.next();

            if (option.equalsIgnoreCase("r")) {
                System.out.print("Enter Employee name: ");
                String uName = read.next();
                System.out.print("Enter his given Salary: ");
                int uSalary = read.nextInt();
                emps.add(new Employee(uName, uSalary));
                System.out.println("Employee has been registered. Press N to add a new Employee or L to show the list.");
            } else if (option.equalsIgnoreCase("l")) {
                System.out.println("Employee Salaries List:");
                for (Employee emp : emps) {
                    System.out.println(emp.getName() + ": $" + emp.getSalary());
                }
                System.out.println("Press N to add a new Employee or any other key to exit.");
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            // Ask the user if they want to continue after each operation
            System.out.print("Do you want to continue? (Y/N): ");
            String continueOption = read.next();
            if (!continueOption.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Exiting the Salary Management System.");
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
