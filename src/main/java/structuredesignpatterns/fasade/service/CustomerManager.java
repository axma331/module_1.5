package structuredesignpatterns.fasade.service;

import structuredesignpatterns.fasade.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private static int count = 0;
    private static List<Customer> customerList = new ArrayList<>();
    private final List<Customer> customers;

    public CustomerManager() {
        customers = new ArrayList<>();
    }

    public int registerCustomer(String firstName, String lastName, String phoneNumber) {
        if (!checkingUniquenessClient(phoneNumber)) {
            customers.add(new Customer(firstName, lastName, phoneNumber, ++count));
            return count;
        } else {
            System.out.println("Польшователь с таким номером телефона уже зарегистрирован! Регистрация провалена!");
        }
        return -1;
    }

    public Customer getCustomer(String phoneNumber) {
        return customers.stream()
                .filter(customer -> customer.getPhoneNumber().equals(phoneNumber))
                .findFirst().orElse(null);
    }

    private boolean checkingUniquenessClient(String phoneNumber) {
        return customers.stream()
                .anyMatch(customer -> phoneNumber.equals(customer.getPhoneNumber()));
    }

    @Override
    public String toString() {
        return "CustomerManager{" +
                "customers=" + customers +
                '}';
    }
}
