package com.example.solid_principles.SRP.EmployeeDataManagement.Adhering;

public class PayrollCalculator {
    public double calculatePay(Employee employee){
        double bonus = employee.getSalary() * 0.1;
        return employee.getSalary() + bonus;
    }
}
