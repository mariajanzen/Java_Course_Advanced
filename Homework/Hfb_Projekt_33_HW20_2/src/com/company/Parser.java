package com.company;

import java.util.Arrays;

public class Parser {
    private Word[] words;

    public Parser(int[] array) {
        this.words = parseIntArray(array);
    }

    private Word[] parseIntArray(int[] array) {
        if(array!=null){
            Word[] tempWords=new Word[countWordsIntArray(array)];
            int curArrayIndex=array.length-1;
            int curTempWordsIndex=tempWords.length-1;


            while(curTempWordsIndex>=0) {
                boolean isCorrect = true;
                int expectedLength = array[curArrayIndex--];
                int[] securedWord = new int[expectedLength];
                int expectedSum = array[curArrayIndex--];
                if (array[curArrayIndex--] > 0) {
                    isCorrect = false;
                    return null;
                }
                int realSum = 0;
                for (int i = expectedLength - 1; i >= 0; i--) {
                    securedWord[i] = array[curArrayIndex--];
                    realSum += securedWord[i];
                }
                if (realSum != expectedSum) {
                    isCorrect = false;

                }
                if (isCorrect) {
                    tempWords[curTempWordsIndex--] = new Word(securedWord, realSum);
                } else {
                    tempWords[curTempWordsIndex--] = null;
                    System.out.println("error in array");
                }
            }
            return tempWords;
        }
        return null;
    }

    @Override
    public String toString() {
        if(words!=null){
            return Arrays.toString(words);
        }else{
            return "error array";
        }

    }

    private int countWordsIntArray(int[] array) {
        int res=0;
        for (int i:array){
            if(i<0){
                res++;
            }
        }
        return res;
    }
}
