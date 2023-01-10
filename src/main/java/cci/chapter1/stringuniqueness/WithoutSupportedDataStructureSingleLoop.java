package cci.chapter1.stringuniqueness;

import com.sun.jdi.event.ExceptionEvent;

public class WithoutSupportedDataStructureSingleLoop implements IUniqueness{
    @Override
    public boolean hasUniqueCharacters(String toCheck) throws IllegalArgumentException {
        toCheck = toCheck.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        for(int i=0; i<toCheck.length()-1; i++){
            int val = Character.compare(toCheck.charAt(i), toCheck.charAt(i+1));
            if(val == 0){
                return false;
            }
        }

        return true;
    }
}
