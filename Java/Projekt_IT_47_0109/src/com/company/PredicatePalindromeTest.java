package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {
    @Test
    public void test_isPalindrome_true() {
        String str="1234321";
        String str2="12321";
        PredicatePalindrome palindrome=new PredicatePalindrome();
        assertTrue(palindrome.test(str));
        assertTrue(palindrome.test(str2));
    }

    @org.junit.Test
    public void test_notPalindrome_false(){
        String str="5489";
        String str2="657483905";
        PredicatePalindrome palindrome=new PredicatePalindrome();
        assertFalse(palindrome.test(str));
        assertFalse(palindrome.test(str2));
    }

    @org.junit.Test
    public void test_nullString_false(){
        String str=null;
        PredicatePalindrome palindrome=new PredicatePalindrome();
        assertFalse(palindrome.test(str));
    }

    @org.junit.Test
    public void test_emptyString_false(){
        String str="";
        PredicatePalindrome palindrome=new PredicatePalindrome();
        assertFalse(palindrome.test(str));
    }


}