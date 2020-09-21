package com.company.actions;

import com.company.Action;
import com.company.actions.ToUpperCaseAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseActionTest {

    @Test
    public void doAction_goodString_ToUpperCaseString(){
        String str="qweRTyuiIOPйё-.фыв";
        Action action=new ToUpperCaseAction();
        assertEquals("QWERTYUIIOPЙЁ-.ФЫВ", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str="";
        Action action=new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str=null;
        Action action=new ToUpperCaseAction();
        assertNull(action.doAction(str));
    }


}