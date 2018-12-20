package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    @Test
    public void vowelTest1() throws Exception {
        //Arranga
        String expectedValue = "aVowel pConsonant pConsonant lConsonant eVowel ";
        VowelConsonant v = new VowelConsonant();

        //Act
        String actualValue = v.vowCons("apple");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void vowelTest2() throws Exception {
        //Arranga
        String expectedValue = "mConsonant aVowel nConsonant gConsonant oVowel ";
        VowelConsonant v = new VowelConsonant();

        //Act
        String actualValue = v.vowCons("mango");
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}