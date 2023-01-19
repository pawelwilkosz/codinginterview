package cci.chapter1.palindrome;

import cci.utils.Contract;

public class Palindrome {
    public boolean isPalindrome(String value){
        Contract.stringIsNotNullOrEmpty(value);

        int i = 0;
        int j = value.length() - 1;

        while(i<j){
            if(value.charAt(i) != value.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
