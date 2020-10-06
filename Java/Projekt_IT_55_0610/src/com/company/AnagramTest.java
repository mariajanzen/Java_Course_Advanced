package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramTest {
    private List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "annna");
    private Anagram anagram;

    @Before
    public void setUp(){
        anagram = new Anagram(VOC);
    }

    @Test
    public void testAnagram(){

        String word = "anna";
        List<String> expected = Arrays.asList("anna", "naan");
        Anagram anagram = new Anagram(VOC);
        List<String> actual = anagram.getAnagram(word);

        assertEquals(expected, actual);

    }
}
