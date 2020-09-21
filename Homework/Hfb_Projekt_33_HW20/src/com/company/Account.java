package com.company;

public class Account {
    private Client client;
    private String iBAN;

    public Account(Client client, String iBAN) {
        this.client = client;
        this.iBAN = iBAN;
    }

    public Client getClient() {
        return client;
    }

    public String getIBAN() {
        return iBAN;
    }

    @Override
    public String toString() {
        return "Account: client " + client +
                ", iBAN='" + iBAN + '\'';
    }


}
