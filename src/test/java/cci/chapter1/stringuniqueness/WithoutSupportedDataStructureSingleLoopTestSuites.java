package cci.chapter1.stringuniqueness;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WithoutSupportedDataStructureSingleLoopTestSuites {
    @ParameterizedTest
    @ValueSource(strings = {"a", "ab", "123", "abc123", "!@#"})
    public void hasUnitueCharacters(String value){
        IUniqueness checker = new WithoutSupportedDataStructureSingleLoop();

        Assertions.assertTrue(checker.hasUniqueCharacters(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaaa", "abb", "123123", "abc123c", "!@#!"})
    public void hasNonUnitueCharacters(String value){
        IUniqueness checker = new WithoutSupportedDataStructureSingleLoop();

        Assertions.assertFalse(checker.hasUniqueCharacters(value));
    }
}
