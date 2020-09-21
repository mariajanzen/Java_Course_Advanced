package com.company;

import java.util.*;
import java.util.function.Predicate;

public class BracketsChecker implements Predicate<String> {
    private char[][] brackets={
            {'(',')'},
            {'[',']'},
            {'{','}'}
    };


    @Override
    public boolean test(String s) {
        if(s==null) return false;
        Stack <Character> stack=new Stack <>();
        for (char ch:s.trim().toCharArray()){
            if(isOpenBracket(ch)){
                stack.push(ch);
            }else{
                char oppositeCh= getOppositeBracket(ch);
                if((oppositeCh!=' ')
                        && (stack.size()==0)
                        || (!stack.pop().equals(oppositeCh))){
                    return false;
                }
            }
        }
        return (stack.size()==0);
    }

    private char getOppositeBracket(char ch) {
        for(char[] bracket:brackets){
            if(ch==bracket[1]){
                return bracket[0];
            }
        }
        return ' ';
    }

    private boolean isOpenBracket(char ch) {
        for(char[] bracket:brackets){
            if(ch==bracket[0]){
                return true;
            }
        }
        return false;
    }

}
