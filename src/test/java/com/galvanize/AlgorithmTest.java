package com.galvanize;


import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {
    @Test
    public void returnsTrueForAllAs() {
        //setup
        Algorithm algorithm = new Algorithm();
        String allAs = "aAa";
        //execution
        boolean expected = true;
        boolean actual = algorithm.allEqual(allAs);
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnFalseForAsAndBs() {
//        // set up
        Algorithm algorithm = new Algorithm();
        String asAndBs = "bbBbabbb";
//        //execution
        boolean expected = false;
        boolean actual = algorithm.allEqual(asAndBs);
//        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnFalseForEmptyString() {
//        // set up
        Algorithm algorithm = new Algorithm();
        String empty = "";
//        //execution
        boolean expected = false;
        boolean actual = algorithm.allEqual(empty);
//        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnTrueForSingleChar() {
//        // set up
        Algorithm algorithm = new Algorithm();
        String single = "a";
//        //execution
        boolean expected = true;
        boolean actual = algorithm.allEqual(single);
//        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnMapWithSinglePairForAA() {
        // set up
        Algorithm algorithm = new Algorithm();
        String twoAs = "aa";
        //execution
        HashMap<String,Long> expected = new HashMap<>();
        expected.put("a", 2L);
        HashMap<String,Long> actual = algorithm.letterCount(twoAs);
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnEmptyForEmptyString() {
        // set up
        Algorithm algorithm = new Algorithm();
        String empty = "";
        //execution
        HashMap<String,Long> expected = new HashMap<>();
        HashMap<String,Long> actual = algorithm.letterCount(empty);
        //assertion
        assertEquals(expected, actual);
    }


}
