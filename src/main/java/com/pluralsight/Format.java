package com.pluralsight;

public class Format {

    //create a main method
    public static void main(String[] args) {

        String first="ALEX";
        String last="Johnson";

        String fullName=formatName(first,last);

        //print out full name
        System.out.println(fullName);

    }

    public static String formatName(String first, String last){
        return last + "," +first;


    }
}
