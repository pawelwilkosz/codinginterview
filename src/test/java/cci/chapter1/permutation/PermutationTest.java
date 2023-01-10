package cci.chapter1.permutation;

import cci.chapter1.stringuniqueness.IUniqueness;
import cci.chapter1.stringuniqueness.WithSupportedDataStructure;
import cci.chapter1.stringuniqueness.WithoutSupportedDataStructure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PermutationTest {
    @Test
    public void valueIsAPermutationOf(){
        Permutation permutation = new Permutation();

        Assertions.assertTrue(permutation.check("qwerty", "trewyq"));
    }

    @Test
    public void valueIsNotAPermutationOf(){
        Permutation permutation = new Permutation();

        Assertions.assertFalse(permutation.check("abc", "ghl"));
    }

    @Test
    public void hasEmptyString(){
        Permutation permutation = new Permutation();
        final String empty = "";
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    permutation.check(empty, empty);
                }
        );

        Assertions.assertEquals("String cannot be null or empty", exception.getMessage());
    }

    @Test
    public void hasNullableString(){
        Permutation permutation = new Permutation();
        final String nullable = null;
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> {
                    permutation.check(nullable, nullable);
                }
        );

        Assertions.assertEquals("String cannot be null or empty", exception.getMessage());
    }

    @Test
    public void hasADifferentLength(){
        Permutation permutation = new Permutation();

        Assertions.assertFalse(permutation.check("abc", "abcd"));
    }
}
