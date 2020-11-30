package com.company.validator;

import com.company.entity.Customer;
import com.company.exceptions.InvalidCustomerAgeException;
import com.company.exceptions.InvalidIbanLengthException;

import java.util.List;

public class Validator {

    public static void validate(List<Customer> customers) {
        for(Customer c:customers) {
                validateCustomer(c);
        }

    }

    private static void validateCustomer(Customer customer) {
        try {
            validateAge(customer);
        } catch (InvalidCustomerAgeException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            validateIbanLength(customer);
        } catch (InvalidIbanLengthException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void validateAge(Customer customer) throws InvalidCustomerAgeException {
        if(customer.getAge() < 17) {
            throw new InvalidCustomerAgeException("Invalid age "+
                    customer.getAge() +
                    " for customer " +
                    customer.getName());
        }
    }

    private static void validateIbanLength(Customer customer) throws InvalidIbanLengthException {
        if (customer.getBankAccount().getIban().length() != 8) {
            throw new InvalidIbanLengthException("Invalid iban length " + customer.getBankAccount().getIban().length());
        }
    }
}
