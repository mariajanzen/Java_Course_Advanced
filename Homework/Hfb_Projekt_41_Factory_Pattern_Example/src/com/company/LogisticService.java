package com.company;

public class LogisticService {

    public static void main(String[] args) {
        LogisticsFactory logistics = new LogisticsFactory();
        Transports transportChoice = logistics.chooseATransport("SHIP");
        transportChoice.delivery();

    }
}
