package com.company;

public class Account {

    private Owner owner;
    private String iBAN;

    public Account(Owner owner, String iBAN) {
        this.owner = owner;
        this.iBAN = iBAN;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner=" + owner +
                ", iban='" + iBAN + '\'' +
                '}';
    }
}
