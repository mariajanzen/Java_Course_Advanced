package com.company.conditions;

import com.company.Condition;
import com.company.conditions.LengthMoreThanFourCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthMoreThanFourConditionTest {
    @Test
    public void test_LengthMoreThanFour_true(){
        String str="12345";
        Condition condition=new LengthMoreThanFourCondition();
        assertTrue(condition.test(str));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String str="123";
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }

    @Test
    public void test_LengthEqualFour_false(){
        String str="123";
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }

    @Test
    public void test_EmptyString_False(){
        String str="";
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }

    @Test
    public void test_NullString_False(){
        String str=null;
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }


}