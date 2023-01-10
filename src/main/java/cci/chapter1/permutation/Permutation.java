package cci.chapter1.permutation;

import cci.utils.Contract;

public class Permutation {
    public boolean check(String toCheck, String toCompare){
        Contract.stringIsNotNullOrEmpty(toCheck);
        Contract.stringIsNotNullOrEmpty(toCompare);
        
        toCheck = toCheck
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        toCompare = toCompare
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (toCheck.compareTo(toCompare) == 0)? true : false;
    }
}
