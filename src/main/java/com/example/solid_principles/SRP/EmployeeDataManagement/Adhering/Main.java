package com.example.solid_principles.SRP.EmployeeDataManagement.Adhering;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Damini", 50000);
        PayrollCalculator payrollCalculator = new PayrollCalculator();

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeReporter employeeReporter = new EmployeeReporter();

        double totalPay = payrollCalculator.calculatePay(employee);
        System.out.println("Total Pay: " + totalPay);
        employeeRepository.save(employee);
        employeeReporter.generateReport(employee);

    }
}
