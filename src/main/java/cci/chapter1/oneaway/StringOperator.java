package cci.chapter1.oneaway;

import java.util.Enumeration;
import java.util.Hashtable;

public class StringOperator {
    private Hashtable<Character, Integer> convertToHashMap(String value){
       Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();

       for(char c : value.toCharArray()){
           if(map.containsKey(c)){
               int val = map.get(c);
               val++;
               map.put(c, val);
           }else{
               map.put(c, 1);
           }
       }

       return map;
    }

    public boolean isValidEdit(String first, String second){
        Hashtable<Character, Integer> map = convertToHashMap(first);

        for(char c : second.toCharArray()){
            if(map.containsKey(c)){
                int val = map.get(c);
                val--;

                if(val !=0){
                    map.put(c, val);
                }else{
                    map.remove(c);
                }
            }
        }

        return (map.size() <= 1)? true : false;
    }
}
