package com.practiceSet2;

public class Customer {
    private String custId;

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    private String custName;

    void print() {
        System.out.println("Customer Id: "+custId);
        System.out.println("Customer Name: "+custName);
    }

    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.setCustId("123");
        cust1.setCustName("Reejh Ghosh");

        cust1.print();
    }
}
