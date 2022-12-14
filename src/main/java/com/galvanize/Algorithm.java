package com.galvanize;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithm {

    public boolean allEqual(String word) {
        // accumulator 
        boolean result = true;
        
        // empty case
        if(word.length() == 0 ) {
            return false;
        }

        // only for strings with more than 1 char
        if(word.length() == 1) {
            return result;
        }


        // get first char, to compare
        char firstChar = Character.toLowerCase(word.charAt(0));

        // first char
        for (int i = 1; i < word.length() ; i++) {
            if(Character.toLowerCase(word.charAt(i)) != firstChar) {
                return false;
            }
        }
        return result;
    }

    public Map<String,Long> letterCount(String word) {
        Map<String,Long> map = new HashMap<>();

        // empty case
        if(word.length() == 0) {
            return map;
        }

        // normal case
        String lowerWord = word.toLowerCase();
        // iterate
        for (int i = 0; i < lowerWord.length(); i++) {
            // if key is in map, add to value,
            String key = "" + lowerWord.charAt(i);
            if( map.containsKey(key) ) {
                map.put(key, map.get(key) + 1);
            }
            // otherwise, create pair with value 1
            else {
                map.put(key, 1L);
            }
        }

        return map;
    }


    public String interleave(List<String> arrayList1, List<String> arrayList2) {
        // accumulator
        StringBuilder result = new StringBuilder();

        // empty case
        if(arrayList1.size() == 0) {
            return result.toString();
        }
        // normal case
        for (int i = 0; i < arrayList1.size(); i++) {
            result.append(arrayList1.get(i)).append(arrayList2.get(i));
        }
        return result.toString();

    }
}
