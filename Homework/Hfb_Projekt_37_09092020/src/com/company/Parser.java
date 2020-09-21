package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Parser {

    public static Account[] parserStringArrayToAccount(String[] names, Function <String, Account> function){
        Account[] temp=null; //логичнее использовать List
        Account[] result=null;
        if (names!= null && function!= null){
            temp=new Account[names.length];
            int index=0;
            for (String name:names) {
                Account account=function.apply(name);
                if(account!=null){
                    temp[index++]=account;
                }
            }
            result=new Account[index];
            System.arraycopy(temp, 0, result, 0, index); // если не все ячейки заполнились,
        }

        return result;
    }

    public static Account[] parserStringList(String[] array, Function <String, Account> function){
        List <Account> temp=new ArrayList <>();

        if (array!= null && function!= null){

            for (String name:array) {
                Account account=function.apply(name);
                if(account!=null){
                    temp.add(account);
                }
            }
            Account[] res=new Account[temp.size()];
            temp.toArray(res);
            return  res;
             }

        return null;
    }
}
