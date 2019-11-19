package com.company;

public class Main {
    public static void main(String[] args) {
	    for (int i = 1; i <= 100; i++) {
	        System.out.println(fizzbuzz(i));
	    }
    }

    public static String fizzbuzz (int n) {
        String[] wordList = {"", "", "", "", ""};

        if (n % 3 == 0) {
            wordList[0] = "Fizz";
        }
        if (n % 5 == 0) {
            wordList[2] = "Buzz";
        }
        if (n % 7 == 0) {
            wordList[3] = "Bang";
        }
        if (n % 11 == 0) {
            wordList = clear(wordList);
            wordList[4] = "Bong";
        }
        if (n % 13 == 0) {
            wordList[1] = "Fezz";
        }
        if (n % 17 == 0) {
            wordList = reverse(wordList);
        }

        if (isEmpty(wordList)) {
           return Integer.toString(n);
        }
        else {
            return join(wordList);
        }
    }

    public static Boolean isEmpty (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                return false;
            }
        }
        return true;
    }

    public static String join (String[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i];
        }
        return output;
    }

    public static String[] clear (String[] arr) {
        for  (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        return arr;
    }

    public static String[] reverse (String[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            String a = arr[i];
            String b = arr[j];
            arr[i] = b;
            arr[j] = a;
        }
        return arr;
    }
};


