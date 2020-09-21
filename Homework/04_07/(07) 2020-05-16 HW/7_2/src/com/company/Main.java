package com.company;

/*
7_2. Дано выражение в виде строки, например “20*((876/8)+19)” , написать
метод который проверит правильность расстановки скобок. Считаем, что скобки
расставлены правильно если:
 если каждой “(“ соответствует “)” т.е. количество открывающих скобок ‘(’,
соответствует количеству закрывающих скобок‘)’
 если нет ситуации, когда закрывающая скобка идет ранее соответствующей
открывающей скобки т.е. “)2+3(“ это ошибка
“9*(8+3)-( (9+1)*5)” -> true
“9*(8+3)- (9+1)*5)” -> false
“9*8+3)-( (9+1)*5” -> false
 */
public class Main {

    public static void main(String[] args) {
        String str="9*(8+3)-( (9+1)*5)"; //true
        System.out.println(str + "parentheses is " + checkParentheses(str));

        str="9*8+3)-( (9+1)*5"; //false
        System.out.println(str + "parentheses is " + checkParentheses(str));

    }

    // 6_2
    public static boolean checkParentheses(String str) {
        int parenthesesCounter=0;
        for (int i =0; parenthesesCounter>=0&&i<str.length(); i++) {
            if(str.charAt(i)=='(') parenthesesCounter++;
            if(str.charAt(i)==')') parenthesesCounter--;
        }
    return parenthesesCounter==0;
    }
}
