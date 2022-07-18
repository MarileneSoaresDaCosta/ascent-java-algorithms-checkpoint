package com.galvanize;


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
}
