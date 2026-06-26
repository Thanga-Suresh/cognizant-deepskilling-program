package com.designpatterns.exercise11;

public class DITest {
    public static void main(String[] args) {

        // Inject dependency via constructor
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        System.out.println("-- Finding Customers --");
        service.getCustomerDetails("C001");
        service.getCustomerDetails("C002");
        service.getCustomerDetails("C003");

        System.out.println("----------------------");

        System.out.println("-- Finding Non-existent Customer --");
        service.getCustomerDetails("C999");
    }
}
