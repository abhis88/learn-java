package Udemy.Challenges.Bank;

import Udemy.Customer;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String name){
        for(Customer c: customers){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }

    public void setCustomer(Customer customer) {
        this.customers.add(customer);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void printTransactions(){

    }
}
