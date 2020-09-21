package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(checkDigits(123)); //true
        System.out.println(checkDigits(133)); //false
        System.out.println(checkDigits(223)); //false
        System.out.println(checkDigits(555)); //false
        System.out.println(checkDigits(55)); //error
    }

    public static boolean checkDigits(int xyz){
         System.out.println(getDigitFromHundreds(xyz) + " " +
              getDigitFromTens(xyz) + " " + getDigitFromOnes(xyz));
       // if(getDigitFromHundreds(xyz)!=getDigitFromTens(xyz) &&
     //           getDigitFromHundreds(xyz)!=getDigitFromOnes(xyz)&&
          //      getDigitFromTens(xyz)!=getDigitFromOnes(xyz)
     //   )  {
        return  true;
        }


    public static int getDigitFromHundreds(int xyz){
        return xyz/100;
    }
    public static int getDigitFromTens(int xyz){
        return (xyz%100)/10;
    }

    public static int getDigitFromOnes(int xyz){
        return xyz%10;
    }
}
