package com.MeridianInfo;

public class EqualNums {
    public static void main(String[] args) {
        // Maximum value of an edge of a triangle given two sides of a triangle
        equalNumbers(5, 7);
    }

    private static void equalNumbers(int num1, int num2) {
        boolean equalnum;
        if (num1 == num2) {

            System.out.println(num1 + " and" + num2 + " are equal");
        } else {
            System.out.println(num1 + " and" + num2 + " are not equal");
        }
    }
}
