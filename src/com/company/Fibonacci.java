package com.company;

public class Fibonacci {

    public static void main(String[] args) {
        int first = 1;
        int second = 0;
        int sum;
        System.out.println("n = 0 and nx = 0");
        for (int n = 1; n <= 10; n++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.println("n = " + n + " and nx = " + sum);
        }
    }
}
