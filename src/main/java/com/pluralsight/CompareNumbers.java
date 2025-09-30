package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println(isEven(5));
        System.out.println(isEven(4));

        System.out.println(isPositive(-2));


    }

    public static boolean isEven(int number) {

        //if number is even,return true
        if (number % 2 == 0) {
            return true;
        }
        //if number is not even, return false
        return false;

    }

    public static boolean isPositive(double number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }
}





