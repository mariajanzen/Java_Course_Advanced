package com.company;

import java.util.Arrays;

public class Count {

    public static void main(String[] args){
        int[] arr=getArray(10, 1, 5);

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArray(int size, int min, int max){
        int[] arr=new int[size];
        for(int i=0; i<arr.length; ++i){
            arr[i]= (int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }

    public static void sort(int[] arr){
        int[] tempArray=new int[6];
        for (int i:arr){
            tempArray[i]++;
        }

        for (int i=0, j=1; i<arr.length;++i){
            if(tempArray[j]<1){
                j++;
            }
            arr[i]=j;
            tempArray[j]--;
        }
    }
}
