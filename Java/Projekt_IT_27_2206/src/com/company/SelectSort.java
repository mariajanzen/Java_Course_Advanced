package com.company;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr=new int[]{5,6,3,8,2,7,45,3};

        print(arr);
        selectSort(arr);
        System.out.println(test(arr));
        print(arr);
        
    }

    private static void selectSort(int[] arr) {
        for (int i=0; i<arr.length; ++i){
            int minIndex=getMinIndex(arr, i);
            if(minIndex!=i){
                swap(arr, i, minIndex);
            }
        }
    }

    private static int getMinIndex(int[] arr, int startIndex) {
        int min=arr[startIndex];
        int iMin=startIndex;
        for (int i=startIndex; i<arr.length; ++i){
            if(arr[i]<min){
                min=arr[i];
                iMin=i;
            }
        }
        return iMin;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static boolean test(int[] arr){
        for(int i=1; i<arr.length; ++i){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
