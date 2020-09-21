package com.company;
/*
3_1. Дано целое трехзначное число. Написать метод, который возвращает число, записанное в
обратном порядке:
Например:   123 -> 321
            768 -> 867

3_2. Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого
числа:
Например:   123 -> 6 (1+2+3)
            768 -> 21 (7+6+8)

3_3. * Дано целое трехзначное число. Написать метод, который определит четность/ нечетность
разрядов этого числа:
Например:   123 -> 1 – нечет. 2- чет. 3-нечет.
            768 -> 1 – нечет. 2- чет. 3-чет.



 */
public class Main {

    public static void main(String[] args) {
        int num = 123;
        System.out.println((num+" revers is "+ reverseNum(num)));
        System.out.println((num+" sum of digits is "+ sumOfDigits(num)));

        System.out.println(checkEven(num));


    }

    public static int getDigitFromOnes(int num){
        return num%10;
    }
    public static int getDigitFromTens(int num){
        return (num%100)/10;
    }
    public static int getDigitFromHundreds(int num){
        return (num%1000)/100;
    }

    public static boolean isEven(int num){
        return num%2==0;
    }
    
    public static String isEvenToString(int num){
        return (isEven(num))?"четное":"не четное";
    }


    //3_1
    public static int reverseNum(int xyz){
        int x= getDigitFromHundreds(xyz);
        int y= getDigitFromTens(xyz);
        int z= getDigitFromOnes(xyz);

        return z*100+y*10+x;
    }


    //3_2
    public static int sumOfDigits(int xyz){
        int x= getDigitFromHundreds(xyz);
        int y= getDigitFromTens(xyz);
        int z= getDigitFromOnes(xyz);

        return x+y+z;
    }


    // 3_3
    public static String checkEven(int xyz){

        int x= getDigitFromHundreds(xyz);
        int y= getDigitFromTens(xyz);
        int z= getDigitFromOnes(xyz);

        return  x+" -"+isEvenToString(x) + "  " +
                y+" -"+isEvenToString(y) + "  " +
                z+" -"+isEvenToString(z);
    }

}
