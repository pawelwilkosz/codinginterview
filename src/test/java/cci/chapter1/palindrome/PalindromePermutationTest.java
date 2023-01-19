package cci.chapter1.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromePermutationTest {
    @ParameterizedTest
    @ValueSource(strings = {"Tact Coa"})
    public void stringIsAPalindromePermutationTest(String value){
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindromePermutation(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Tact test"})
    public void stringIsNotAPalindromePermutationTest(String value){
        Palindrome palindrome = new Palindrome();
        Assertions.assertFalse(palindrome.isPalindromePermutation(value));
    }
}
