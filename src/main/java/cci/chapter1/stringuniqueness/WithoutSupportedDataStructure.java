package cci.chapter1.stringuniqueness;

import cci.chapter1.stringuniqueness.IUniqueness;
import cci.utils.Contract;

public class WithoutSupportedDataStructure implements IUniqueness {

    @Override
    public boolean hasUniqueCharacters(String toCheck) throws IllegalArgumentException {
        Contract.stringIsNotNullOrEmpty(toCheck);
        /* O(n2) */
        for(int i=0; i<toCheck.length(); i++){
            for(int j=1; j<toCheck.length(); j++){
                if(i == j){
                    continue;
                }
                int compare = Character.compare(toCheck.charAt(i), toCheck.charAt(j));
                if(compare == 0){
                    return false;
                }
            }
        }

        return true;
    }
}
