package com.company;

import com.company.actions.ReverseStringAction;
import com.company.actions.ToUpperCaseAction;
import com.company.conditions.LengthCondition;
import com.company.conditions.LengthMoreThanFourCondition;

public class Main {

    public static void main(String[] args) {

        String[] strings={"12", "qwerty", "123456", "14", ""};
        StringArrayHandler stringArrayHandler=new StringArrayHandler(strings,
                new ReverseStringAction(),new LengthMoreThanFourCondition());
        //stringArrayHandler.stringsHandle();
        //System.out.println(stringArrayHandler.toString());

        StringArrayHandler stringArrayHandler2=new StringArrayHandler(strings,
                new ReverseStringAction(),new LengthCondition(1));
        stringArrayHandler2.stringsHandle();
        //System.out.println(stringArrayHandler2.toString());

        StringArrayHandler stringArrayHandler3=new StringArrayHandler(strings,
                new ToUpperCaseAction(),new LengthCondition(1));
        stringArrayHandler3.stringsHandle();
        System.out.println(stringArrayHandler3.toString());


    }


}
