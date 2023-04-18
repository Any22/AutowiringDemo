package org.example;

import org.example.dto.CustomerDTO;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.example.utility.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       CustomerService customerService= (CustomerService) context.getBean("customerServiceBean");
        //CustomerService customerService= (CustomerService) context.getBean(CustomerServiceImpl.class);
        System.out.println("Finding Customer data using Id:");
        customerService.getCustomer(3);

        System.out.println("\nGetting all Customer data :");
        customerService.getAllCustomers();

        System.out.println("\nAdding new Customer:");
        CustomerDTO customer = new CustomerDTO();
        customer.setCustomerId(04);
        customer.setCustomerName("Jonas");
        customer.setCustomerAge(34);
        customer.setAccountType("Savings");
        customerService.insertCustomer(customer);

      //  using Setter injection
//        customerService.getAllCustomers();
//        customerService.getCustomer(1);

    }
}