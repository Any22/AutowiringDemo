package org.example.service;
import org.example.dto.CustomerDTO;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
 //@Autowired
    private CustomerRepository customerRepository;

// public CustomerServiceImpl() {
//
// }
    //Autowired using Constructor
//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//            this.customerRepository = customerRepository;
//    }

    //Autowired using Setter we will generate getter and setter of repository

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }



    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void insertCustomer(CustomerDTO customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public void getAllCustomers() {

        List< CustomerDTO> allCustomer= customerRepository.fetchCustomerData();
        allCustomer.forEach(e->{
            System.out.println("Customer Id:"+ e.getCustomerId());
            System.out.println("Customer Name"+ e.getCustomerName());
            System.out.println("Customer age :" + e.getCustomerAge());
            System.out.println("Customer Account Type :" + e.getAccountType());
        });
    }


    @Override
    public CustomerDTO getCustomer(int id) {

     return customerRepository.getCustomer(id);
    }
}
