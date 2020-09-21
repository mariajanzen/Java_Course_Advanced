package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] bankData=new String[]{"123456789101 Jack", "134567890121 Robert", "125678901234 Maria", "136789012345 Julia"};
        Card[] cards=getCardClient(bankData);
        System.out.println(Arrays.toString(cards));
        System.out.println("-----+-----+-----");
        printCardArray(getCardClient(bankData));


    }

    public static Card[] getCardClient(String[] bankData){
        Card[] cardArray=new Card[bankData.length];
        for(int i=0; i<bankData.length; ++i){
            String[] rez=bankData[i].split(" ");
            switch (getCardType(rez[0])){
                case 1:
                    cardArray[i]=new MasterCard(new Person(rez[1]), rez[0]);
                    break;
                case 2:
                    cardArray[i]=new Visa(new Person(rez[1]), rez[0]);
                    break;
                default:
                    System.out.println("error");
            }

        }
        return cardArray;
    }

    public static int getCardType(String cardNumber){
        if(cardNumber.startsWith("12")) return 1;
        if(cardNumber.startsWith("13")) return 2;
        return 0;
    }

    public static void printCardArray(Card[] cards){
        for (Card card:cards){
            System.out.println(card.toSecureString());
        }
    }
}
