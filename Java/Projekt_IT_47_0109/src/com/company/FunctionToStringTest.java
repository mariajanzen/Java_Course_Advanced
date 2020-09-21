package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionToStringTest {

    @Test
    public void apply_nullList_emptyList() {
        
        FunctionToString function=new FunctionToString();
        List<String> str1=new ArrayList <>();
        assertEquals(function.apply(null, new PredicatePalindrome()), str1);
    }
    
    @Test
    public void apply_palindromeList_PalindromeList(){
        List<String> listIn=new ArrayList <>();
        listIn.add("poiuiop");
        listIn.add("qwertrewq");
        listIn.add("fgdhdsju");
        listIn.add("jeus,vkoi");
        
        List<String> listOut=new ArrayList <>();
        listOut.add("poiuiop");
        listOut.add("qwertrewq");

        FunctionToString function=new FunctionToString();

        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));
        
    }

    @Test
    public void apply_noPalindromeList_EmptyList(){
        List<String> listIn=new ArrayList <>();
        listIn.add("fgdhdsju");
        listIn.add("jeus,vkoi");

        List<String> listOut=new ArrayList <>();

        FunctionToString function=new FunctionToString();

        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));

    }
}