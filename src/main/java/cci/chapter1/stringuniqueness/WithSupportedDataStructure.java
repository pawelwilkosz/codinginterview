package cci.chapter1.stringuniqueness;

import cci.chapter1.stringuniqueness.IUniqueness;
import cci.utils.Contract;

import java.util.Hashtable;

public class WithSupportedDataStructure implements IUniqueness {
    @Override
    public boolean hasUniqueCharacters(String toCheck) {
        Contract.stringIsNotNullOrEmpty(toCheck);

        Hashtable<Character, Boolean> charMap = new Hashtable<Character, Boolean>();

        for(char c : toCheck.toCharArray()){
            if(charMap.containsKey(c)){
                return false;
            }else{
                charMap.put(c, true);
            }
        }

        return true;
    }
}
