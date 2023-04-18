package org.example.repository;

import org.example.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    List<CustomerDTO> fetchCustomerData();
    void addCustomer(CustomerDTO customer);
    CustomerDTO getCustomer (int customerId);


}
