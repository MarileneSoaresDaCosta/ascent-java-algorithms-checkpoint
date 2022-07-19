package com.galvanize;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {
    // testing allEqual
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
    // testing letterCount
    @Test
    public void returnMapWithSinglePairForAA() {
        // set up
        Algorithm algorithm = new Algorithm();
        String twoAs = "aa";
        //execution
        Map<String,Long> expected = new HashMap<>();
        expected.put("a", 2L);
        Map<String,Long> actual = algorithm.letterCount(twoAs);
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void returnEmptyForEmptyString() {
        // set up
        Algorithm algorithm = new Algorithm();
        String empty = "";
        //execution
        Map<String,Long> expected = new HashMap<>();
        Map<String,Long> actual = algorithm.letterCount(empty);
        //assertion
        assertEquals(expected, actual);
    }


// interleave acceptance criteria
//Algorithm algorithm = new Algorithm();
//algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));  // => returns "adbecf"
//algorithm.interleave(Arrays.asList("a", "c", "e"), Arrays.asList("b", "d", "f"));  // => returns "abcdef"
//algorithm.interleave(Collections.emptyList(), Collections.emptyList());

    @Test
    public void interleavesRegularLists() {
        // set up
        Algorithm algorithm = new Algorithm();

        //execution
        String actual = algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));
        String expected = "adbecf";
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void interleavesEmptyLists() {
        // set up
        Algorithm algorithm = new Algorithm();

        //execution
        String actual = algorithm.interleave(Collections.emptyList(), Collections.emptyList());
        String expected = "";
        //assertion
        assertEquals(expected, actual);
    }
}
