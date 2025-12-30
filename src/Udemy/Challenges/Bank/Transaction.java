package Udemy.Challenges.Bank;

import Udemy.Constants;

public class Transaction {
    Constants type;
    Double amount;

    public Transaction(Constants type, Double amount){
        this.type = type;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public Constants getType() {
        return type;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setType(Constants type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction Type: "+getType() +", Amount: $"+getAmount() + ", Constant Class Type: "+getType().getClass().getName();
    }
}
