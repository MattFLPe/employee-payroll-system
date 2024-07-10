import java.util.*;
public class Employee {
    public float regularHours;
    private float overtimeHours;
    private float bonus;
    private float deductions;
    String name;
    int ID;
    float salary;

    public Employee() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        this.name = s.nextLine();
        System.out.println("Enter employee's ID: ");
        this.ID = s.nextInt();
        System.out.println("Enter employee's hourly salary: ");
        this.salary = s.nextFloat();
        System.out.println("Enter employee's regular hours worked: ");
        this.regularHours = s.nextFloat();
        System.out.println("Enter employee's overtime hours worked: ");
        this.overtimeHours = s.nextFloat();
        System.out.println("Enter employee's bonus: ");
        this.bonus = s.nextFloat();
        System.out.println("Enter employee's deductions: ");
        this.deductions = s.nextFloat();

        System.out.println("Employee's name: " + name + "\n" +
                            "Employee's ID: " + ID + "\n" +
                            "Employee's hourly salary: " + salary + "\n" +
                            "Regular hours worked: " + regularHours + "\n" +
                            "Overtime hours worked: " + overtimeHours + "\n" +
                            "Bonus: " + bonus + "\n" +
                            "Deductions: " + deductions);
                            }
    public float calculateGrossPay() {
        float overtimeRate = 1.5f;
        float regularPay = regularHours * salary;
        float overtimePay = overtimeHours * salary * overtimeRate;
        return regularPay + overtimePay + bonus;
    }

    public float calculateTaxes(float taxRate) {
        return calculateGrossPay() * taxRate;
    }

    public float calculateNetPay(float taxRate) {
        float grossPay = calculateGrossPay();
        float taxes = calculateTaxes(taxRate);
        return grossPay - taxes - deductions;
    }

    public String[] storeEmployeeData() {
        String[] employeeData = new String[3];
        employeeData[0] = this.name;
        employeeData[1] = Integer.toString(this.ID);
        employeeData[2] = Float.toString(this.salary);
        return employeeData;
    }


}
