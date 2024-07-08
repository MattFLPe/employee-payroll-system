import java.util.*;
public class Employee {
    String name;
    int ID;
    float salary;

    public Employee() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        this.name = s.nextLine();
        System.out.println("Enter employee's ID: ");
        this.ID = s.nextInt();
        System.out.println("Enter employee's salary: ");
        this.salary = s.nextFloat();


        System.out.println("Employee's name: " + name + " " +
                            "Employee's ID: " + ID + " " +
                            "Employee's salary: " + salary);
    }

    public String[] storeEmployeeData() {
        String[] employeeData = new String[3];
        employeeData[0] = this.name;
        employeeData[1] = Integer.toString(this.ID);
        employeeData[2] = Float.toString(this.salary);
        return employeeData;
    }


}
