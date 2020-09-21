package com.company;

public class Main {

    public static void main(String[] args) {

        String[] strings={"14", "rtyuij", "zxcvbnm", "jk", "8907"};
        StringsArrayHandle s1=new StringsArrayHandle(strings,
                            new ReverseStringAction(),
                            new LengthMoreThanFourCondition());
        s1.stringsHandle();
        System.out.println(s1.toString());
        s1.stringsHandle();
        System.out.println(s1.toString());

    }
}
