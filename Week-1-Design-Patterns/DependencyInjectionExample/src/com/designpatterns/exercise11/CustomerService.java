package com.designpatterns.exercise11;

public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer Found -> ID: " + customer.getId() + ", Name: " + customer.getName());
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }
}
