package Udemy;

import Udemy.Challenges.Bank.Transaction;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Transaction> transactions;

    public Customer(String name){
        this.name = name;
        this.transactions = null;
    }

    public Customer(String name, ArrayList<Transaction> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public void printTransactions(){
        System.out.println("-".repeat(10));
        System.out.println("Customer Name: "+ getName());
        System.out.println("-".repeat(10));
        for(Transaction tran : transactions){
            System.out.println(tran.toString());
        }
    }
}
