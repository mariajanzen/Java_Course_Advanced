package com.company;
/*
5_7
Дано два целых положительных числа от 1 до 99. Реализовать метод, который для
каждого числа от a до b печатает строку вида “23 рубля”
Пример: printSumInRub(1,5) -> 1 рубль
2 рубля
3 рубля
4 рубля
5 рублей

Решение основано на том, что возможно всего три варианта написания:
"рубль" "рубля" "рублей". Выбор зависит от последнего разряда, или двух, если
это 11-14

 */
public class Main
{
    public static void main(String[] args)
    {
        int money=11131;
        System.out.println(moneyToString(money));

    }

    public static String moneyToString(int money){
        if(money<=0){
            return "incorrect value "+money;
        }
        String stringMoney= money+" ";
        int lastDigit=money%10;
        if (money%100>=11&&money%100<=14)
        {
            stringMoney=stringMoney+ "рублей";
        }
        else
        {
            switch (lastDigit)
            {
                case 1:
                    stringMoney=stringMoney+ "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    stringMoney=stringMoney+ "рубля";
                    break;
                default:
                    stringMoney=stringMoney+ "рублей";
            }
        }
        return stringMoney;
    }

}
