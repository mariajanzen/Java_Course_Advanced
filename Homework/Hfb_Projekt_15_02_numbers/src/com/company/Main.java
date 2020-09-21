package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getReverseNumber(345));
        System.out.println(getReverseNumber(832));
        System.out.println(getReverseNumber(1002));
        System.out.println(getReverseNumber(12));
        System.out.println(getReverseNumber(507));
        System.out.println("-----------------");
        System.out.println(checkEven(358));
        System.out.println(checkEven(222));
        System.out.println(checkEven(891));

    }

    public static int getReverseNumber(int xyz){
        int zyx=0;
        String err="";

        if (xyz>=100 && xyz<1000) {
            return zyx=(getDigitsFromOnes(xyz) +
                    getDigitsFromTens(xyz) + getDigitsFromHundreds(xyz));
        }else {
            return zyx=0;}
        //не смогла додуматься, как вернуть стрингом:-(
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

   public static boolean isEvenX(int xyz){

       return (getDigitsFromHundreds(xyz))%2==0;
    }

    public static boolean isEvenY(int xyz){

        return (getDigitsFromTens(xyz))%2==0;
    }

    public static boolean isEvenZ(int xyz){

        return (getDigitsFromOnes(xyz))%2==0;
    }

    public static String checkEven(int xyz){
        String rez=" ";
        String x=" ";
        String y=" ";
        String z=" ";
        x=(isEvenX(xyz)?"четное":"нечетное");
        y=(isEvenY(xyz)?"четное":"нечетное");
        z=(isEvenZ(xyz)?"четное":"нечетное");
        return rez=(getDigitsFromHundreds(xyz)+" - "+x)+
                "; "+ (getDigitsFromTens(xyz)+" - "+y)+
                "; "+getDigitsFromOnes(xyz)+" - "+z+";";
    }
}

