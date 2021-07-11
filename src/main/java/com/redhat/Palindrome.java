package com.redhat;


public class Palindrome
{
    private String processString(String word) {
        return word.replace(".","").replace(",","").toLowerCase();
    }

    private boolean checkLength(String word) {
        if(word.length()<2) {
            return false;
        }
        return true;

    }

    private boolean checkPalindrome(String word) {
        word = processString(word);
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseWord = stringBuilder.reverse().toString();
        if(checkLength(word)) {
            if(word.equals(reverseWord)) {
                return true;
            }
        }


        return false;

    }


    public boolean isPalindrome(String word) {
        return checkPalindrome(word);
    }
}
