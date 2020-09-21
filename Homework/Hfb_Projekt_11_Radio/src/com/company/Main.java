package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       keyHandler(1);
       keyHandler(3);
       keyHandler(4);
       keyHandler(5);
       keyHandler(10);
       keyHandler(-8);
    }

    public static double keyHandler(int key){
        double frequency=0;
        switch (key){
            case 1:
                frequency=101.2;
                System.out.println("приемник работает на частоте 101.2");
                break;
            case 2:
                frequency=102.3;
                System.out.println("приемник работает на частоте 102.3");
                break;
            case 3:
                frequency=103.6;
                System.out.println("приемник работает на частоте 103.6");
                break;
            case 4:
                frequency=104.2;
                System.out.println("приемник работает на частоте 104.2");
                break;
            case 5:
                frequency=105.5;
                System.out.println("приемник работает на частоте 105.5");
                break;
            default:
                frequency=0;
                System.out.println("настройте радиоприемник");
                break;
        }
        return frequency;

    }


}
