package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        // Checks for single instances of letter
        int counter = 0;
        if(input==null) {
            return counter;
        }
        counter += input.length();

        // Checks all substrings using StringBuilder
        for (int i = 0; i < input.length() ; i++) {
            for (int j = i+1; j < input.length(); j++) {
                StringBuilder string = new StringBuilder(input.substring(i, j+1));
                if(string.toString().equals(string.reverse().toString())) {
                    counter++;
                }
            }
        }

        return counter;

    }

}




