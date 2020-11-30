package com.company;

import com.company.entity.BankAccount;
import com.company.entity.Customer;
import com.company.validator.Validator;

import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        BankAccount ba1 = new BankAccount("DE123456");
        BankAccount ba2 = new BankAccount("NL123456");
        BankAccount ba3 = new BankAccount("DE111");

        Customer c1 = new Customer("Ivan", 35, ba1);
        Customer c2 = new Customer("Piotr", 15, ba2);
        Customer c3 = new Customer("Anna", 25, ba3);

        List<Customer> customers = new LinkedList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);


        Validator.validate(customers);
    }
}
