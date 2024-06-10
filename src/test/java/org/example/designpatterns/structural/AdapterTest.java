package org.example.designpatterns.structural;

import org.example.designpatterns.structural.adapter.Customer;
import org.example.designpatterns.structural.adapter.Employee;
import org.example.designpatterns.structural.adapter.EmployeeCustomerAdapter;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    public void Test(){
        Employee employee=new Employee();
        employee.setFullName("Abhinav Kasam");
        employee.setJobTitle("Senior Software Engineer");
        employee.setLocation("Begumpet");
        Customer customer=new EmployeeCustomerAdapter(employee);
        System.out.println(customer.getName());
        System.out.println(customer.getDesignation());
        System.out.println(customer.getAddress());
    }
}
