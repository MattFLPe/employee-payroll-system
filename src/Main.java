public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        String[] data = employee.storeEmployeeData();
        float taxRate = 0.20f;
        float grossPay = employee.calculateGrossPay();
        float taxes = employee.calculateTaxes(taxRate);
        float netPay = employee.calculateNetPay(taxRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Taxes: " + taxes);
        System.out.println("Net Pay: " + netPay);
    }


};
