package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array;
        array=getArray(20);
        print(array);
        System.out.println("------");
        int max=getMaxInArray(array, 0, 5);
        int maxIndex=getIndexMaxInArray(array, 0, 10);
        System.out.println("0..10  max= "+max+" index= "+maxIndex);
    }

    public static int[] getArray(int size){
        int[] arr=new int[size];
        for(int i=0; i<arr.length; ++i){
            arr[i]=getRandomInt(-1000, 1000);
        }
        return arr;
    }

    public static int getMaxInArray(int[] arr, int indexStart, int indexFinish){

        return arr[getIndexMaxInArray(arr, indexStart, indexFinish)];

    }

    public static int getIndexMaxInArray(int[] arr, int indexStart, int indexFinish){
        indexStart=Math.max(indexStart, 0);
        indexStart=Math.min(indexStart, arr.length);
        int max=arr[indexStart];
        int maxIndex=indexStart;
        for (int i=indexStart; i<(Math.min(indexFinish, arr.length)); ++i ){
            if (max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;

    }


    public static int getRandomInt(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public static void print(int[] arr){
        for (int i=0; i<arr.length; ++i){
            System.out.println("["+i+"]"+": "+arr[i]);

        }
    }
}
