package com.example.solid_principles.SRP.EmployeeDataManagement.Adhering;

public class EmployeeReporter {
    public void generateReport(Employee employee){
        System.out.println("Employee Report: ");
        System.out.println("Name: "+employee.getName());
        System.out.println("Salary: "+employee.getSalary());
    }
}
