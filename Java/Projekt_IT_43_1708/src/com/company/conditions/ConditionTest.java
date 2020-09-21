package com.company.conditions;

import com.company.Condition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

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
    public void test_EmptyString_false(){
        String str="";
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }

    @Test
    public void test_NullString_false(){
        String str=null;
        Condition condition=new LengthMoreThanFourCondition();
        assertFalse(condition.test(str));
    }

}