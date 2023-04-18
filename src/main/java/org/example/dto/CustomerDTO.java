/*******************************************************************************************************************
 * 1. created a customer DTO class to map all the data
 ********************************************************************************************************************/

package org.example.dto;

import org.springframework.stereotype.Component;

@Component
public class CustomerDTO {
    private int customerId;
    private String customerName;
    private int customerAge;
    private String accountType ;

    public CustomerDTO(int customerId, String customerName, int customerAge, String accountType) {
        this.customerId = customerId ;
        this.customerName = customerName ;
        this.customerAge = customerAge ;
        this.accountType = accountType;

    }

    public CustomerDTO() {

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString(){
        return "CustomerId:"+ this.customerId+" "+ "Customer Name :"+" "+ this.customerName+
        "Customer Age : " + " " + this.customerAge + " " + "Customer Account Type:" + " " + this.accountType ;
    }
}
