package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] strArr=new String[]{"qwe", "werdfg", "fbdnsmfffs"};

	System.out.println(Arrays.toString(strArr));
    bubbleSort(strArr);
    System.out.println(Arrays.toString(strArr));
    }

    public static int strByLengthComparator(String str1, String str2){
        //return str1.length()-str2.length();
        return str1.compareTo(str2);
    }

    public static void bubbleSort(String[] arr){
        boolean swapFlag=true;
        int j=0;
        while(swapFlag==true && j<arr.length){
            swapFlag=false;
            for(int i=1; i<arr.length; ++i){
                if (strByLengthComparator(arr[i], arr[i-1])<0){
                    String temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swapFlag=true;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr){
        boolean swapFlag=true;
        int j=0;
        while(swapFlag==true && j<arr.length){
            swapFlag=false;
            for(int i=1; i<arr.length; ++i){
                if (strByLengthComparator(arr[i], arr[i-1])<0){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swapFlag=true;
                }
            }
        }
    }
}
