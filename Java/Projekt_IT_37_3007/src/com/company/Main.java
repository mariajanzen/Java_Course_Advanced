package com.company;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        byte[] numbers = new byte[]{1, 2, 3, -1, -4, 2, 1, 4, 1, 2, 1, -7, 1, -2, -2};

        System.out.println(getTheLengthOfArray(numbers));
        CodeWord[] words=getCodeWordArray(numbers);
        System.out.println(Arrays.toString(words));


    }

    public static CodeWord[] getCodeWordArray(byte[] numbers) {
        CodeWord[] codeWords = new CodeWord[getTheLengthOfArray(numbers)];
        int wordCounter=0;
        int sum=0;
        for(int i=0;i<numbers.length;++i){
            if(numbers[i]<0){
                if(sum>0){
                    codeWords[wordCounter]=new CodeWord(sum);
                    sum=0;
                    wordCounter++;
                }
            }else{
                sum+=numbers[i];
            }
        }
        if(sum>0){
            codeWords[wordCounter]=new CodeWord(sum);
            sum=0;
        }
        return codeWords;
    }

    public static void printWordsArray(CodeWord[] codewords){
        for(CodeWord word:codewords){
            System.out.println(codewords.toString());
        }
    }

    public static int getTheLengthOfArray(byte[] numbers) {
        int lengthOfWordsArray = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] < 0) {
                if (counter > 0) {
                    lengthOfWordsArray++;
                    counter = 0;
                }
            } else {
                counter++;
            }
        }
        if(counter>0){
            lengthOfWordsArray++;
            counter=0;
        }
        return lengthOfWordsArray;
    }
}
