package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringActionTest {
    @Test
    public void doAction_GoodString_ReverseString(){
        String str="0987";
        Action action=new ReverseStringAction();
        assertEquals("7890", action.doAction(str));
    }

    @Test
    public void doAction_EmptyString_EmptyString(){
        String str="";
        Action action=new ReverseStringAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doAction_NullShouldReturnNull(){
        String str=null;
        Action action=new ReverseStringAction();
        assertNull(action.doAction(str));
    }





}