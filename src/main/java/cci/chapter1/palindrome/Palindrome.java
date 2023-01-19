package cci.chapter1.palindrome;

import cci.utils.Contract;

public class Palindrome implements IPalindrome{
    private int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    @Override
    public boolean isPalindromePermutation(String value){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')
                - Character.getNumericValue('a') + 1];

        for(char c : value.toCharArray()){
            int x = getCharNumber(c);

            if(x != -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }

        return countOdd <= 1;
    }

    @Override
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
