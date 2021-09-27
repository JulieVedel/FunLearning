package com.company;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.print("The fibonacci value to n = " + n + " is " + fibonacci(n));
        
    }
    public static int fibonacci(int loops) {
        int first = 1;
        int second = 0;
        int sum = 0;
        System.out.println("n = 0 and nx = 0");
        for (int n = 1; n <= loops; n++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.println("n = " + n + " and nx = " + sum);
        }
        return sum;
    }
}
