package com.company;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer("cpu1", 1, 146, 1200.00);
        Computer computer2 = new Computer("cpu2", 4, 258, 1400.00);
        Computer computer3 = new Computer("cpu3", 2, 1046, 1300.00);

        Computer[] computers = {computer1, computer2, computer3};

        print(computers);
        System.out.println("\nThe cheapest computer is: "+getTheCheapestComp(computers));
        System.out.println("\n----the compare of comp2&comp1---");
        getResultOfCompare(computer2, computer1);

    }

        public static void print(Computer[] computers) {
            for (int i = 0; i < computers.length; ++i) {
                System.out.println(computers[i].toString());
            }
        }

        public static Computer getTheCheapestComp(Computer[] computers){
            double helpPrice=0.0;
            int index=0;
            for (int i=0; i<computers.length; ++i){
                if (computers[i].price<helpPrice){
                    helpPrice=computers[i].price;
                    index=i;
                }
            }
        return computers[index];
        }

        public static void getResultOfCompare(Computer firstComp, Computer secondComp ){
            int compare=firstComp.compareTo(secondComp);
            System.out.println("Стоимость компьютера\n"+firstComp);
            if(compare!=0) {
                System.out.println((compare<0)? "меньше, чем стоимость":"больше, чем стоимость" );
            } else {
                System.out.println("равна стоимости");
            }
            System.out.println(secondComp);
        }

}
