package Udemy.Challenges.Bank;

import Udemy.Constants;
import Udemy.Customer;

import java.util.ArrayList;

public class BankCustomerTransaction {
    static void main() {

        Bank bank = new Bank("BOFA");

        //Customer with only Name
        Customer abhishek = new Customer("Abhishek");
        bank.setCustomer(abhishek);

        //Customer with Name and transactions
        Transaction transaction1 = new Transaction(Constants.CREDIT, 1000.0);
        Transaction transaction2 = new Transaction(Constants.DEBIT, 2000.0);
        ArrayList<Transaction> allTrans = new ArrayList<>();
        allTrans.add(transaction1);
        allTrans.add(transaction2);
        Customer atharv = new Customer("Atharv", allTrans);
        bank.setCustomer(atharv);

        System.out.println(bank.getCustomer("Atharv"));
        System.out.println(bank.getCustomer("Abhishek"));
        System.out.println(bank.getCustomer("Amit"));

        bank.getCustomer("Atharv").printTransactions();

        int i=0;

        switch (i){
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            default:
                System.out.println("Zero");
        }
    }
}
