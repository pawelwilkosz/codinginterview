package cci.chapter1.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"abba", "civic", "a"})
    public void valueIsAPalindrome(String value){
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome(value));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"test", "ab", "ab123"})
    public void valueIsNotAPalindrome(String value){
        Palindrome palindrome = new Palindrome();
        Assertions.assertFalse(palindrome.isPalindrome(value));
    }

    @Test
    public void valueIsEmpty(){
        String emptyValue = "";
        Palindrome palindrome = new Palindrome();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    palindrome.isPalindrome(emptyValue);
                }
        );
    }
}
