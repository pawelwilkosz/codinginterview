package cci.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WithoutSupprtedDataStructureTestSuites {
    @ParameterizedTest
    @ValueSource(strings = {"a", "ab", "123", "abc123", "!@#"})
    public void hasUniqueCharacters(String value){
        IUniqueness checker = new WithoutSupportedDataStructure();

        Assertions.assertTrue(checker.hasUniqueCharacters(value));
    }

    @Test
    public void toDebug(){
        String s = "ab";
        IUniqueness checker = new WithoutSupportedDataStructure();
        Assertions.assertTrue(checker.hasUniqueCharacters(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "abb", "123123",})
    public void hasNoniqueCharacters(String value){
        IUniqueness checker = new WithoutSupportedDataStructure();

        Assertions.assertFalse(checker.hasUniqueCharacters(value));
    }

    @Test
    public void hasEmptyString(){
        IUniqueness checker = new WithoutSupportedDataStructure();
        final String empty = "";
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    checker.hasUniqueCharacters(empty);
                }
        );

        Assertions.assertEquals("String cannot be null or empty", exception.getMessage());
    }

    @Test
    public void hasNullableString(){
        IUniqueness checker = new WithSupportedDataStructure();
        final String nullable = null;
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    checker.hasUniqueCharacters(nullable);
                }
        );

        Assertions.assertEquals("String cannot be null or empty", exception.getMessage());
    }
}
