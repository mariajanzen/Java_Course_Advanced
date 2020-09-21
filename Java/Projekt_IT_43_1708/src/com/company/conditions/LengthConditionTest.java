package com.company.conditions;

import com.company.Condition;
import com.company.conditions.LengthCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConditionTest {

    @Test
    public void test_LengthMoreThanFour_true(){
        String str="12345";
        Condition condition=new LengthCondition(4);
        assertTrue(condition.test(str));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String str="123";
        Condition condition=new LengthCondition(4);
        assertFalse(condition.test(str));
    }
    @Test
    public void test_LengthEqualFour_false(){
        String str="1234";
        Condition condition=new LengthCondition(4);
        assertFalse(condition.test(str));
    }

    @Test
    public void test_EmptyString_False(){
        String str="";
        Condition condition=new LengthCondition(4);
        assertFalse(condition.test(str));
    }

    @Test
    public void test_NullString_False(){
        String str=null;
        Condition condition=new LengthCondition(4);
        assertFalse(condition.test(str));
    }

    @Test
    public void test_LengthMoreThanZero_true(){
        Condition condition=new LengthCondition(0);
        boolean res= (condition.test("1")==true)&&
                (condition.test("123")==true)&&
                (condition.test("")==false)&&
                (condition.test(null)==false);
        assertTrue(res);
    }

}