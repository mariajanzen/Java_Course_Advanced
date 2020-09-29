package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("------вернуть разницу между n и 21------");
        System.out.println(diff21(2));
        System.out.println(diff21(21));
        System.out.println(diff21(25));
        System.out.println(diff21(18));
        System.out.println("------вернуть строку, где последние 3 символа заглавные------");
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
        System.out.println("------вернуть наибольшее------");
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(1,3,2));
        System.out.println(intMax(3,2,1));
        System.out.println("------Вернуть true если у них одинаковый первый или последний элемент------");
        System.out.println(commonEnd(new int[]{1,2,3},new int[] {7,3} ));
        System.out.println(commonEnd(new int[]{1,2,3},new int[] {7,3,2} ));
        System.out.println(commonEnd(new int[]{1,2,3},new int[] {1,3} ));
        System.out.println("------Вернуть сумму двух первых элементов массива, иначе 0------");
        System.out.println(sum2(new int[]{1,2,3} ));
        System.out.println(sum2(new int[]{1,1} ));
        System.out.println(sum2(new int[]{1,1,1,1} ));
        System.out.println("------Вернуть количество четных чисел в массиве------");
        System.out.println(countEvens(new int[]{2,1,2,3,4} ));
        System.out.println(countEvens(new int[]{2,2,0} ));
        System.out.println(countEvens(new int[]{1,3,5} ));
        System.out.println("------Вернуть массив,где каждый 0 заменен макс нечетным значением справа от нуля------");
        int[] a={0, 5, 0, 3};
        int[] b={0, 4, 0, 3};
        int[] c={0, 1, 0};
        toPrint(zeroMax(a));
        toPrint(zeroMax(b));
        toPrint(zeroMax(c));
        System.out.println("------Вернуть массив, смещенный влево на один индекс------");
        int[] d={6, 2, 5, 3};
        int[] e={1,2};
        int[] f={1};
        toPrint(shiftLeft(d));
        toPrint(shiftLeft(e));
        toPrint(shiftLeft(f));
        System.out.println("------вернуть конкатенацию двух строк без первого символа в каждой------");
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
        System.out.println("------Вернуть строку из двух центральных символов исх строки----");
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));

    }

    public static int diff21(int n){
        if(n>21){
            return ((n-21)*2);
        }else{
            return (21-n);
        }
    }

    public static String endUp(String str) {
        if(str.length()<3){
            return str.toUpperCase();
        }else{
            char[] ch=str.toCharArray();
            String res= new String();
            String endUp=new String();
            for(int i=0; i<ch.length;++i){
                if(i<ch.length-3){
                    res+=ch[i];
                }else{
                    endUp+=ch[i];
                }
            }
            return res+endUp.toUpperCase();
        }
    }

    public static int intMax(int a, int b, int c) {
        int max=a;
        if(a<b){
            if(b<c){
                return c;
            }else{
                return b;
            }
        }else{
            if(a<c){
                return c;
            }else{
                return a;
            }
        }
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            if ((a[a.length - 1] == b[b.length - 1]) || (a[0] == b[0])) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public static int sum2(int[] nums) {
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            default:
                return (nums[0] + nums[1]);
        }
    }

    public static int countEvens(int[] nums){
        int evenNumCounter=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]%2==0){
                evenNumCounter++;
            }
        }
        return evenNumCounter;
    }

    public static int[] zeroMax(int[] nums) {
        int[] res=new int[nums.length];
        int notEvenMax=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]==0){
                for(int j=i; j<nums.length; ++j){
                    if((nums[j]%2!=0)&&nums[j]>notEvenMax){
                        notEvenMax=nums[j];
                    }
                }
                res[i]=notEvenMax;
                notEvenMax=0;
            }else{
                res[i]=nums[i];
            }
        }
        return res;
    }
    public static void toPrint(int[] nums){
        for(int i=0; i<nums.length; ++i){
            System.out.print(nums[i]+", ");
        }
        System.out.println("\t");
    }

    public static int[] shiftLeft(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0; i<nums.length-1; ++i){
            res[i]=nums[i+1];
        }
        res[nums.length-1]=nums[0];
        return res;
    }

    public static String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

    public static String middleTwo(String str) {
        if(str.length()>1){
            String res="";
            char[] ch=str.toCharArray();
            for(int i=ch.length/2-1; i<=ch.length/2; ++i){
                res+=ch[i];
            }
            return res;
        }else{
            return "not correct String";
        }
    }
}
