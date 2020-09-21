package com.company;

import java.util.function.Function;

public class ParserStringFunction implements Function<String, Account> {
    @Override
    public Account apply(String s) {
        if(checkString(s)){
            String[] ownerAndIBAN=s.split(" Iban:");
            String[] typeAndName=ownerAndIBAN[0].split(":");
            Owner owner=null;
            if(typeAndName[0].isEmpty()){
                //create Person
                String[] names=typeAndName[1].split(" ");
                owner=new Person(names[0], names[1]);
            }else{
                //create company

                owner=new Company(typeAndName[1], TypeOfOwnership.getTypeStringByString(typeAndName[0]));
            }
            return new Account(owner, ownerAndIBAN[1]);
        }
        return null;
    }

    private boolean checkString(String s) {
        return true;
    }
}
