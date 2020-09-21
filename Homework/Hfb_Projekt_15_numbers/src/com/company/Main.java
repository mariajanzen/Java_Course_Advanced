package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getReverseNumber(345));
        System.out.println(getReverseNumber(832));
        System.out.println(getReverseNumber(1002));
        System.out.println(getReverseNumber(12));
        System.out.println(getReverseNumber(507));
    }

    public static String getReverseNumber(int xyz){
        String zyx="";

        if (xyz>=100 && xyz<1000) {
            return zyx=(getDigitsFromOnes(xyz) + " "
                    + getDigitsFromTens(xyz) + " " + getDigitsFromHundreds(xyz));

        }else {
            return zyx = "error";}
    }

    public static int getDigitsFromHundreds(int xyz){
        return xyz=xyz/100;
    }

    public static int getDigitsFromTens(int xyz){
        return xyz=(xyz%100)/10;
    }

    public static int getDigitsFromOnes(int xyz){
        return xyz=xyz%10;
    }
}
