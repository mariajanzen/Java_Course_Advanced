package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr=new int[]{5,6,3,8,2,7,45,3};
        print(arr);
        bubbleSort(arr);
        System.out.println("is Array sort: "+ isArraySort(arr));
        print(arr);

    }

    public static void bubbleSort(int[] arr) {
        boolean swapFlag = true;
        int j=0;
        while (swapFlag == true && j<arr.length) {
            swapFlag = false;
            for (int i = 1; i < arr.length-j; ++i) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];   //swap(i,i-1)
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapFlag=true;
                }
            }
            j++;
            print(arr);
        }
    }

    public static boolean isArraySort(int[] arr) {
        for(int i=1; i<arr.length;++i){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void print(int[] arr) {
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
