package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*
	:Til Schweiger Iban:DE15971891
	AG:Macrosoft Iban:DE15978765
	GmbH:Pupkin SoftLab Iban:DE15954356
	e.V.:PupkinSoftLab Iban:DE15954356
	 */

        String[] strings = new String[]{
                ":Til Schweiger Iban:DE15971891",
                "AG:Macrosoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356",
                "e.V.:PupkinSoftLab Iban:DE15954356"
        };

        Account[] account = Parser.parserStringArrayToAccount(strings, new ParserStringFunction());
        System.out.println(Arrays.toString(account));
        System.out.println("------------");
        Account[] account2 = Parser.parserStringList(strings, new ParserStringFunction());
        System.out.println(Arrays.toString(account2));

    }

}
