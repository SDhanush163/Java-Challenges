package com.DataStructures.C46_BankingSystem;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>(100);
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) return false;
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        System.out.println("Customer details for branch " + branch.getName());

        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("Customer: %s[%d]%n", customers.get(i).getName(), i+1);
            if (printTransactions) {
            ArrayList<Double> transactions = customers.get(i).getTransactions();
                System.out.println("Transactions");
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.printf("[%d] Amount %.2f%n", j + 1, transactions.get(j));
                }
            }
        }
        return true;
    }

    private Branch findBranch(String name) {
        for (var branch : branches)
            if (branch.getName().equalsIgnoreCase(name))
                return branch;
        return null;
    }
}
