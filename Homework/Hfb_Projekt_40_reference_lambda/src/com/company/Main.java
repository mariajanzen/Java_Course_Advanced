package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.function.*;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------1--------");

        Function<Integer, Integer> getPower = (a) -> a*a;
        System.out.println(getPower.apply(5));
        System.out.println("-------2--------");

        Function<String, Integer> getModuloTwo = (s) -> s.length()%2;
        System.out.println(getModuloTwo.apply("abcde"));

        System.out.println("-------3--------");

        Function<String, String> getUpperCase = (s) -> s.toUpperCase();
        System.out.println(getUpperCase.apply("ivan"));

        System.out.println("-------4--------");
        BiFunction<String, String, Integer> getSumOfLength = (s1, s2) -> s1.length()+s2.length();
        System.out.println(getSumOfLength.apply("abc", "de"));

        System.out.println("-------5--------");

        BiConsumer<String, String> printSumOfLength = (s1, s2) -> System.out.println(s1.length()+s2.length());
        printSumOfLength.accept("abc", "de");

        System.out.println("-------6--------");


        System.out.println("-------7--------");
        Function<String, String> getHalfedString = (s) -> s.length()%2==0?s.substring(0, s.length()/2):"empty";
        System.out.println(getHalfedString.apply("abcd"));
        System.out.println(getHalfedString.apply("abcde"));
        System.out.println(getHalfedString.apply("abcdef"));

        System.out.println("-------8--------");

        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());

        System.out.println("-------9--------");



        System.out.println("-------10--------");

        System.out.println("-------11--------");

        Predicate<Integer> isEvenInteger = (a) -> a%2==0;

        System.out.println(isEvenInteger.test(7));
        System.out.println(isEvenInteger.test(8));

        System.out.println("-------12--------");

        Predicate<String> isLengthMoreThanThree = (s) -> s.length()>=3;

        System.out.println(isLengthMoreThanThree.test("abc"));
        System.out.println(isLengthMoreThanThree.test("ab"));

        System.out.println("-------13--------");

        BiPredicate<String, Integer> isLengthMoreThanX = (s, x) -> s.length()>x;

        System.out.println(isLengthMoreThanX.test("ab", 2));
        System.out.println(isLengthMoreThanX.test("abcde", 2));

        System.out.println("-------Method references--------");

        System.out.println("-------1--------");




    }

}
