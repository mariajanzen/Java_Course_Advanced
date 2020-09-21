package com.company.actions;

import com.company.Action;
import com.company.actions.ReverseStringAction2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringAction2Test {

    @Test
    public void doAction_goodString_reverseString(){
        String str="1234";
        Action action=new ReverseStringAction2();
        assertEquals("4321", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str="";
        Action action=new ReverseStringAction2();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str=null;
        Action action=new ReverseStringAction2();
        assertNull(action.doAction(str));
    }



}