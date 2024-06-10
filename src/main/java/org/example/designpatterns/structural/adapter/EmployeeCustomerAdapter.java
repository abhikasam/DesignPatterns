package org.example.designpatterns.structural.adapter;

public class EmployeeCustomerAdapter implements Customer {
    private Employee employee;

    public EmployeeCustomerAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getLocation();
    }
}
