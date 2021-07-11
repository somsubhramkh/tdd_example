package com.redhat;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeTest
{

    static Palindrome palindrome;

    @BeforeAll
    public static void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void test_is_true_if_word_is_palindrome()
    {
        assertTrue(palindrome.isPalindrome("racecar"));
    }

    @Test
    public void test_is_false_if_word_is_not_palindrome()
    {
        assertFalse(palindrome.isPalindrome("penguin"));
    }

    @Test
    public void test_can_identify_numeric_palindromes()
    {
        assertTrue(palindrome.isPalindrome("9009"));
    }

    @Test
    public void test_single_character_string_is_not_a_palindrome()
    {
        assertFalse(palindrome.isPalindrome("a"));
    }

    @Test
    public void test_numerical_palindromes_ignore_decimal_point()
    {
        assertTrue(palindrome.isPalindrome("900.9"));
    }

    @Test
    public void test_case_is_ignored()
    {
        assertTrue(palindrome.isPalindrome("RaceCar"));
    }

}
