package com.company;

import java.util.Scanner;


public class KeyBoardInput implements NumberInput{
private  Scanner scanner= new Scanner(System.in);

    @Override
    public int getNextNumber() {
        return scanner.nextInt();
    }
}
