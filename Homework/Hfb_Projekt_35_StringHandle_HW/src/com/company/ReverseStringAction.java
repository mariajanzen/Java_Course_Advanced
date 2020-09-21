package com.company;

public class ReverseStringAction implements Action{
    @Override
    public String doAction(String str) {
        if(str==null) return null;
        char[] chars=str.toCharArray();
        char[] res=new char[str.length()];
        for(int i=0, j=str.length()-1; i<str.length(); i++, j--){
            res[i]=chars[j];
        }
        return new String(res);
    }
}
