package com.company;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer(new CPU("cpu1", 16, 380.00), new RAM(32, 280), new HDD(2, 400));
        Computer computer2 = new Computer(new CPU("cpu2", 18, 360.00), new RAM(16, 200), new HDD(10, 800));
        Computer computer3 = new Computer(new CPU("cpu3", 16, 340.00), new RAM(64, 320), new HDD(6, 600));
        Computer computer4 = new Computer(new CPU("cpu4", 18, 400.00), new RAM(32, 300), new HDD(4, 500));

        Computer[] computers = {computer1, computer2, computer3, computer4};

        print(computers);
        System.out.println("---------");
        printThePriceOfComp(computers);

        System.out.println("\nThe cheapest computer is:\n"+getTheCheapestComp(computers)
                +"\nits price is: "+getTheCheapestPriceOfComp(computers)+" Euro.");

        System.out.println("\n=======The compare======");
        getTheCompareOfPrice(computer3, computer2);

        System.out.println("\n=======The compare of CPU======");
        computer1.compareTo2(computer2);

    }

    public static void print(Computer[] computers) {
        for (int i = 0; i < computers.length; ++i) {
            System.out.println(computers[i].toString());
        }
    }
    
    public static void printThePriceOfComp(Computer[] computers){
        for (int i = 0; i < computers.length; ++i) {
            System.out.println("The price of computer"+(i+1)+": "+computers[i].getPriceComputer()+" Euro.");
        } }

    public static void getTheCompareOfPrice(Computer firstComp, Computer secondComp) {
        int compare = firstComp.compareTo(secondComp);
        System.out.println("The computer\n"+firstComp);
        if (compare != 0) {
            System.out.println((compare > 0) ? "costs more than" : "is cheaper than");
        } else {
            System.out.println("costs equal to");
        }
        System.out.println(secondComp);
    }

    public static Computer getTheCheapestComp(Computer[] computers){
        double helpPrice=0.0;
        int index=0;
        for (int i=0; i<computers.length; ++i){
            if (computers[i].getPriceComputer()<helpPrice){
                helpPrice=computers[i].getPriceComputer();
                index=i;
            }
        }
        return computers[index];
    }

    public static double getTheCheapestPriceOfComp(Computer[] computers){
        double cheapestPrice=computers[0].getPriceComputer();
        for (int i=0; i<computers.length; ++i){
            if (computers[i].getPriceComputer()<cheapestPrice){
                cheapestPrice=computers[i].getPriceComputer();
            }
        }
        return cheapestPrice;
    }

}
