package cci.utils;

public class Contract {
    private static final String ILLEGAL_ARGUMENT_STRING_MESSAGE = "String cannot be null or empty";
    public static void stringIsNotNullOrEmpty(String value){
        if(value == null || value.isEmpty()){
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_STRING_MESSAGE );
        }
    }
}
