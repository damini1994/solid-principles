package com.example.solid_principles.SRP.EmployeeDataManagement.Adhering;

public class EmployeeRepository {
    public void save(Employee employee){
        System.out.println("Saving employee to DB: "+employee.getName()+" Salary: "+employee.getSalary());
    }
}
