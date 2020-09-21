package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr=new int[]{6, 89, 1, 55, 56, 43, 23, 2};
        print(arr);
        //sortBubbleArray(arr);
       // print(arr);
        System.out.println("-------------");
        System.out.println(getMinIndex(arr, 2, 7));


    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] sortBubbleArray(int[] arr){
      //13_2+Bubble
        //  int j=arr.length;
       // while (j>0){
            for (int i=1; i<arr.length; ++i){
                if (arr[i]<arr[i-1]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
       //     }
       //     --j;
        }
        return arr;
    }

    public static int getMinIndex(int[] arr, int index1, int index2){
        //13_3
        int min=arr[index1];
        int minIndex=index1;
        for (int i=index1+1; i<=index2; ++i){
            if(min>arr[i]){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;

    }

}
