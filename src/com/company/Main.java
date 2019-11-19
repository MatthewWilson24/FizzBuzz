package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i <= 100; i++)
	    {
	        System.out.print(fizzbuzz (i));
	    }
    }
}


public static String fizzbuzz (int n) {
    if (n % 15 == 0) {
        return "FizzBuzz";
    }
    if (n % 3 == 0) {
        return "Fizz";
    }
    if (n % 5 == 0) {
        return "Buzz";
    }
    return Integer.toString(n);
}