package com.example.solid_principles.SRP.EmployeeDataManagement.Violation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String name;
    private double salary;

    public double calculatePay(){
        double bonus = salary * 0.1;
        return salary + bonus;
    }

    public void save(){
        System.out.println("Saving employee to DB: "+name+" Salary: "+salary);
    }

    public void generateReport(){
        System.out.println("Employee Report: ");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Damini", 50000);
        double totalPay = employee1.calculatePay();
        System.out.println("Total Pay: "+totalPay);
        employee1.save();
        employee1.generateReport();
    }
}
