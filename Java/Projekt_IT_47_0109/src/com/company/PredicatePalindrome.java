package com.company;

import javax.sql.RowSet;
import java.sql.SQLException;
import java.util.function.Predicate;


public class PredicatePalindrome implements Predicate <String>{
    @Override
    public boolean test(String s) {
        if(s==null) return false;
        return new StringBuffer(s).reverse().toString().replace(" ","").equalsIgnoreCase(s);
    }

}
