import java.util.*;
public class Employee extends Payroll {
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

        System.out.println("Employee's name: " + name + " " +
                            "Employee's ID: " + ID + " " +
                            "Employee's hourly salary: " + salary + " " +
                            "Regular hours worked: " + regularHours + " " +
                            "Overtime hours worked: " + overtimeHours + " " +
                            "Bonus: " + bonus + " " +
                            "Deductions: " + deductions);
                            }
    public float calculateGrossPay() {
        float overtimeRate = 1.5f;
        float regularPay = regularHours * salary;
        float overtimePay = overtimeHours * salary * overtimeRate;
        return regularPay + overtimePay + bonus;
    }

    public String[] storeEmployeeData() {
        String[] employeeData = new String[7];
        employeeData[0] = this.name;
        employeeData[1] = Integer.toString(this.ID);
        employeeData[2] = Float.toString(this.salary);
        employeeData[3] = Float.toString(this.regularHours);
        employeeData[4] = Float.toString(this.overtimeHours);
        employeeData[5] = Float.toString(this.bonus);
        employeeData[6] = Float.toString(this.deductions);
        return employeeData;
    }


}
