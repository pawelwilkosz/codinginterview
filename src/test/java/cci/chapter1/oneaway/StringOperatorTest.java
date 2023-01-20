package cci.chapter1.oneaway;

import cci.chapter1.palindrome.IPalindrome;
import cci.chapter1.palindrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringOperatorTest {
    @ParameterizedTest
    @CsvSource({ "pale, ple", "pales, pale", "pale, bale" })
    public void positiveOperation(String first, String second){
        StringOperator stringOperator = new StringOperator();
        Assertions.assertTrue(stringOperator.isValidEdit(first, second));
    }

    @ParameterizedTest
    @CsvSource({ "pale, bake", "pales, ssss" })
    public void negativeOperation(String first, String second){
        StringOperator stringOperator = new StringOperator();
        Assertions.assertFalse(stringOperator.isValidEdit(first, second));
    }
}
