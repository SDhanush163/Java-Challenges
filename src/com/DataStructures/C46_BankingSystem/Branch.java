package com.DataStructures.C46_BankingSystem;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>(1000);
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) return false;
        return customers.add(new Customer(name, initialTransaction));
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer == null) return false;
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (var customer : customers)
            if (customer.getName().equalsIgnoreCase(name))
                return customer;
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
